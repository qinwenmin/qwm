package com.example.demo.Service.Export;

import com.example.demo.Entity.UserInformationVo;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.util.List;

@Service
public class ExportService {
    public void export(List<UserInformationVo> list, String[] titles , ServletOutputStream out) throws Exception {
        try{
            // 第一步，创建一个workbook，对应一个Excel文件
            HSSFWorkbook workbook = new HSSFWorkbook();

            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet hssfSheet = workbook.createSheet("sheet1");

            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short

            HSSFRow row = hssfSheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle hssfCellStyle = workbook.createCellStyle();

            //居中样式
            hssfCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

            HSSFCell hssfCell = null;

            for (int i = 0; i < titles.length; i++) {
                hssfCell = row.createCell(i);//列索引从0开始
                hssfCell.setCellValue(titles[i]);//列名1
                hssfCell.setCellStyle(hssfCellStyle);//列居中显示
            }

            for (int i = 0; i < list.size(); i++) {
                row = hssfSheet.createRow(i+1);
                UserInformationVo userInformationVo = list.get(i);

                // 第五步，创建单元格，并设置值
                String  userName = null;
                if(userInformationVo.getUserName() != null){
                    userName = userInformationVo.getUserName();
                }
                row.createCell(0).setCellValue(userName);

                String userClass = null;
                if(userInformationVo.getUserClass() != null){
                    userClass = userInformationVo.getUserClass();
                }
                row.createCell(1).setCellValue(userClass);
                String userAddress = "";
                if(userInformationVo.getUserAddress() != null){
                    userAddress = userInformationVo.getUserAddress();
                }
                row.createCell(2).setCellValue(userAddress);
            }

            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write(out);
                out.flush();
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("导出信息失败！");

        }
    }
}

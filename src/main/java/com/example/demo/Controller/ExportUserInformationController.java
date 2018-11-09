package com.example.demo.Controller;

import com.example.demo.Dao.IUserInformationDao;
import com.example.demo.Export.ExportService;
import com.example.demo.Vo.UserInformationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.List;

@RestController
@RequestMapping("/user/export")
public class ExportUserInformationController {
   // @Autowired
    //private ExportService exportService;
    @Autowired
    private IUserInformationDao iUserInformationDao;
    @RequestMapping("/export")
    public String export(HttpServletResponse response){
        try{

            ServletOutputStream out=response.getOutputStream();
            try {
                //设置文件头：最后一个参数是设置下载文件名(这里我们叫：张三.pdf)
                response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode("TEST.xls", "UTF-8"));
            } catch (Exception e1) {
                System.out.println("111111111111111111111");
                System.out.println(e1.getMessage());
            }
            List<UserInformationVo> list = iUserInformationDao.findUser();
            String[] titles = { "用户姓名", "班级","住址" };
            //exportService.export(list,titles, out);
            new ExportService().export(list,titles, out);
            return "success";
        } catch(Exception e){
            System.out.println("222222222222222222");
            System.out.println(e.getMessage());
            return "导出信息失败";
        }
    }
}

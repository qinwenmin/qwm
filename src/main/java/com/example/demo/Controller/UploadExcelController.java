package com.example.demo.Controller;

import com.example.demo.Common.service.UploadExcelUtil;
import com.example.demo.Common.Entity.ReturnResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/upload")
public class UploadExcelController {
    @Autowired
    private UploadExcelUtil uploadExcelUtil;
    @RequestMapping("/excel")
    public ReturnResultVo upload(){
        ReturnResultVo returnResultVo = new ReturnResultVo();
        List<List<Object>> list = new ArrayList<>();
        try{
            File file = new File("C:\\Users\\qinwe\\Desktop\\TEST (1).xls");
            InputStream inputStream = new FileInputStream(file);
            list = uploadExcelUtil.getBankListByExcel(inputStream,"TEST (1).xls");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        returnResultVo.setData(list);
        return returnResultVo;
    }
}

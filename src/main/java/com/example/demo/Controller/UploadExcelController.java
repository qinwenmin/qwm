package com.example.demo.Controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.example.demo.common.service.UploadExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/upload")
public class UploadExcelController {
    @Autowired
    private UploadExcelUtil uploadExcelUtil;
    @RequestMapping("/excel")
    public List<List<Object>> upload(){
        List<List<Object>> list = new ArrayList<>();
        try{
            File file = new File("C:\\Users\\qinwe\\Desktop\\TEST (1).xls");
            InputStream inputStream = new FileInputStream(file);
            list = uploadExcelUtil.getBankListByExcel(inputStream,"TEST (1).xls");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}

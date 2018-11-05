package com.example.demo.Controller;

import com.example.demo.Service.CallableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@RequestMapping("/getClass")
public class GetClassController {
    @RequestMapping("/test1")
    public String test1(){
        Class aClass = null;
        try {
            aClass = Class.forName("com.example.demo.Service.CallableService");
            CallableService searchCodeService = (CallableService) aClass.newInstance();
            Method method = aClass.getMethod("allableService");
            Object object = method.invoke(searchCodeService);
            System.out.println(object);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "ok";
    }
    
}

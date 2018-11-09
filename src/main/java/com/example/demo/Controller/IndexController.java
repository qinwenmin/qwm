package com.example.demo.Controller;

import com.example.demo.Service.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        Test.getInstance();
        String a = "index";
        return a;
    }
}

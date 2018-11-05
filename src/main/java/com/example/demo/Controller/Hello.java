package com.example.demo.Controller;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public int hello() {
        try{
            FileReader fileReader = new FileReader("D:\\a.txt");
            System.out.println(fileReader);
            System.out.println(fileReader.read());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        String Str = "asgashdasdednfncxhwiedmas";
        int a = StringUtils.countOccurrencesOf(Str,"as");
        int count = 0;
        while(Str.length()-1>0){

        //for(int i = 0;i<Str.length();i++){
            int num = Str.indexOf("as");
            if(num!=-1){
                Str = Str.substring(num+1,Str.length());
                System.out.println(Str);
                count++;
            }else{
                break;
            }

        }
        System.out.println(count);
        int ab = Str.indexOf("as");
        System.out.println(ab);
        return a;
    }
}

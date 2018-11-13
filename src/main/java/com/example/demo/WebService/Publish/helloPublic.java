package com.example.demo.WebService.Publish;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class helloPublic {
    @Bean
    public static void main(String[] agrs){
        System.out.println("cxf service start..");
    }
}

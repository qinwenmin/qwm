package com.example.demo.WebService.Impl;
import com.example.demo.WebService.helloService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.demo.WebService.helloService",
        targetNamespace = "http://webservice.demo.example.com/",
        serviceName = "helloService")

//@Component
//@WebService
public class HelloServiceImp implements helloService {
    @Override
    public String sayHello(Long text) {
        System.out.println("param text is :" + text);
        return "hello " + text;
    }
}

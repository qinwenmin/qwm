package com.example.demo.WebService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class webServiceTest {
    public String sayHello( String intsmaze){
        System.out.println("sayHello()...");
        return  "hello " + intsmaze;
    }
    public String sayHello2(String intsmaze){
        return "hello " + intsmaze;
    }
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/hello ",new webServiceTest());
        //这个地方其实就是进行了封装，里面根据指定参数启动了一个servicesocket，并且生成了一个WSDL文档。
        System.out.println("Server ready...");
    }
}

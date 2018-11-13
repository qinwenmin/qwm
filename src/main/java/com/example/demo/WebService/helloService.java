package com.example.demo.WebService;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "helloService",// 暴露服务名称
        targetNamespace = "http://webservice.demo.example.com/" // 命名空间,一般是接口的包名倒序
)
//@WebService
public interface helloService {
    //@WebMethod
    //@WebResult(name = "String", targetNamespace = "")
    public String sayHello(@WebParam(name = "userId") Long userId);
    //public String sayHelloToUser(UserInformationVo userInformationVo);
}

package com.example.demo.Controller;

import com.example.demo.Service.CallableService;
import com.example.demo.Service.TestService;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RunnableTestController {
    @Autowired
    private TestService testService;
    private CallableService callableService;
    @RequestMapping("/value")
    public String get(){
        return testService.test();
    }

    @RequestMapping("/callable")
    public Object callable(){
        System.out.println("TT");
        System.out.println(callableService.allableService());
        return callableService.allableService();
    }
}

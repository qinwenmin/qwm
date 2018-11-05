package com.example.demo.Service;

import com.example.demo.Thread.ThreadCallableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class CallableService {
    @Autowired
    private ThreadCallableService threadCallableService;

    private static int a = 3;
    public Object allableService(){
        System.out.println("TEST1");
        ExecutorService executorService = Executors.newFixedThreadPool(600);
        System.out.println("TEST2");
        Object obj  = executorService.submit(threadCallableService);
        return obj;
    }
}

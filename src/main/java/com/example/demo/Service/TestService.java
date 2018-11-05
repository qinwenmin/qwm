package com.example.demo.Service;

import com.example.demo.Thread.ImpRunnableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private ImpRunnableService impRunnableService;
    public String test(){
        Thread thread = new Thread(impRunnableService);
        thread.start();
        return "ok";
    }
}

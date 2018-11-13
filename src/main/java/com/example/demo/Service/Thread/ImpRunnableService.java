package com.example.demo.Service.Thread;

import org.springframework.stereotype.Service;

@Service
public class ImpRunnableService implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
             System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    private void  consume(String value){
        System.out.println("Thread:" + value);
    }

}

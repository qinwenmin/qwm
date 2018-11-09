package com.example.demo.Service;


import com.example.demo.Thread.TimerTaskTest01;
import org.springframework.stereotype.Service;

import java.util.Timer;
@Service
public class TimerTest01 {

    Timer timer;

    public  TimerTest01(){
        timer = new Timer();
        //timer.schedule(new TimerTaskTest01(), 1000,3000);
        timer.schedule(new TimerTaskTest01(), 1000);
    }

    public static void main(String[] args) {
        System.out.println("begin!!!!");
        new TimerTest01();
    }
}

package com.example.demo.Service.Thread;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.TimerTask;
@Service
public class TimerTaskTest01 extends TimerTask {
    public void run() {
        Date date = new Date(this.scheduledExecutionTime());
        System.out.println("本次执行该线程的时间为：" + date);
    }
}

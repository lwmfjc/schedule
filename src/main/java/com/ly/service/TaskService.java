package com.ly.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskService {
    @Scheduled(fixedDelay = 1000)
    public void scheduleTest(){
        System.out.println("我在执行任务~");
    }
}

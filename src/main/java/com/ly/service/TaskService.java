package com.ly.service;

import org.springframework.stereotype.Component;

@Component
public class TaskService {
    public void scheduleTest(){
        System.out.println("我在执行任务~");
    }
}

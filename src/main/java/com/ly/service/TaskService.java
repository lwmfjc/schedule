package com.ly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskService {
    Logger logger=  LoggerFactory.getLogger(TaskService.class);
    @Scheduled(fixedDelay = 1000)
    public void scheduleTest(){
        logger.info("我在执行任务~");
    }
}

package com.ly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class TaskService {
    Logger logger=  LoggerFactory.getLogger(TaskService.class);
    @Scheduled(fixedDelay = 1000)
    public void scheduleTest(){
        taskExecutor.execute(() -> {
            logger.info("我在执行任务");
        });
        //logger.info("我在执行任务~");
    }
    @Async
    public void asyncOnly(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("休眠了一秒后打印日志");
    }
    @Async
    public Future<String> asyncWithResult(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("休眠了3秒后获取到结果");
        return new AsyncResult<>("LyStr--[世间安得两全法 不负如来不负卿]");
    }
    @Autowired
    private TaskExecutor taskExecutor;


}

package com.ly.main;

import com.ly.config.ConfigLy;
import com.ly.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MainLy {
    static Logger logger= LoggerFactory.getLogger(MainLy.class);
    public static void main(String[] args) throws IOException {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigLy.class);
       // System.in.read();
        TaskService taskService = ctx.getBean(TaskService.class);
        Future<String> future= taskService.asyncWithResult();
        try {
            logger.info(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        logger.info("最是人间留不住 朱颜辞镜花辞树");
        ctx.close();
    }
}

package com.ly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@ComponentScan(value = "com.ly.service")
@ImportResource(value = "classpath:context/ly-context.xml")
@EnableScheduling
public class ConfigLy {
    /**
     * 使用自定义的taskScheduler
     * @return
     */
    @Bean
    TaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler scheduler=new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(10);
        return scheduler;
    }
}

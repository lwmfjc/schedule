package com.ly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(value = "com.ly.service")
@ImportResource(value = "classpath:context/ly-context.xml")
@EnableScheduling
public class ConfigLy {

}

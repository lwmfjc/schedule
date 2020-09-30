package com.ly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(value = "com.ly.service")
@ImportResource(value = "classpath:context/ly-context.xml")
public class ConfigLy {

}

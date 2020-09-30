package com.ly.main;

import com.ly.config.ConfigLy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;

public class MainLy {
    public static void main(String[] args) throws IOException {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigLy.class);
        System.in.read();
        ctx.close();
    }
}

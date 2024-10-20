package com.spring.springcourse.lec01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan
public class MessageMainAppn {

    public static void main(String[] args) {

        ApplicationContext context =  new AnnotationConfigApplicationContext(MessageMainAppn.class); // IOC container

        MessageRenderer messageRenderer = context.getBean(MessageRenderer.class);
        messageRenderer.render();


    }
}

package com.spring.springcourse.lec01;

import org.springframework.stereotype.Component;

@Component
public class MessageRenderer {

    MessageProvider provider;


    public MessageRenderer(MessageProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println("I am rendering message: " + provider.getMessage());
    }
}

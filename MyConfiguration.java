package com.spring.springcourse.lec01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MessageProvider provider() {
        return new XmlMessageProvider();
    }

    @Bean
    public MessageRenderer messageRenderer(MessageProvider provider) {
        return new MessageRenderer(provider);
    }
}

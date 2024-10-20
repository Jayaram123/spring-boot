package com.spring.springcourse.lec01;

public class YamlMessageProvider implements MessageProvider{

    public String getMessage() {
        return """
                name: Prasanna
                age: 10
                
                """;
    }
}

package com.spring.springcourse.lec01;

import org.springframework.stereotype.Component;

@Component
public class XmlMessageProvider  implements MessageProvider {

    public String getMessage() {
        return """
                <name>Prasanna</name>
                <age>10</age>
                """;
    }
}

package com.hamburg.spring.model;

import com.hamburg.spring.repository.Formatter;
import org.springframework.stereotype.Component;

@Component
public class SimpleFormatter implements Formatter {

    @Override
    public String format(String message) {
        return "Simple"+ message;
    }
}

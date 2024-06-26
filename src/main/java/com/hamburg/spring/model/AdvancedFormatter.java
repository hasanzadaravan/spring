package com.hamburg.spring.model;

import com.hamburg.spring.repository.Formatter;
import org.springframework.stereotype.Component;

@Component
public class AdvancedFormatter implements Formatter {
    @Override
    public String format(String message) {
        return "Advanced Formatter"+ message;
    }
}

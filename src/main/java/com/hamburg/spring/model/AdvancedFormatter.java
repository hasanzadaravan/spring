package com.hamburg.spring.model;

import com.hamburg.spring.repository.Formatter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AdvancedFormatter implements Formatter {
    @Override
    public String format(String message) {
        return "Advanced Formatter"+ message;
    }
}

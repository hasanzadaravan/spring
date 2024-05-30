package com.hamburg.spring.service;

import com.hamburg.spring.repository.Formatter;
import org.springframework.stereotype.Service;

@Service
public class FormatterService {
    private final Formatter formatter;


    public FormatterService(Formatter formatter) {
        this.formatter = formatter;
    }

    public void printMessage(String message){
        formatter.format(message);
    }
}

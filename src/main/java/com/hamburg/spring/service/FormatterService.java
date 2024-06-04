package com.hamburg.spring.service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class FormatterService {


    @PostConstruct
   public void init() {
    System.out.println("MyBean is going through init.");
     }

    @PreDestroy
    public void destroy() {
        System.out.println("MyBean will be destroyed.");
    }

    public String sayHello() {
        return "hello World";
    }
}

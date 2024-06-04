package com.hamburg.spring.controller;

import com.hamburg.spring.service.FormatterService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HelloController {
    //1 Lazy anotasiyasi

    private final FormatterService formatterService;

    public HelloController(FormatterService formatterService) {
        this.formatterService = formatterService;
    }

    @GetMapping("/hello")
    public String getHelloWorld() {
        return formatterService.sayHello();
    }


}

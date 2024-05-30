package com.hamburg.spring.controller;

import com.hamburg.spring.repository.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // bean nedir
    // anotasiya nedir
    // injwction nedir
    // application contewxt nedir
    //qulaifeirs
    // primary

    private final Vehicle vehicle;

    public HelloController( @Qualifier("pashapay") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @GetMapping("/drive")
    public String getDrive(@RequestBody String type) {
        return vehicle.drive();
    }

}

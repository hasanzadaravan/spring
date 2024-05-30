package com.hamburg.spring.model;

import com.hamburg.spring.repository.Vehicle;
import org.springframework.stereotype.Component;

@Component("pashapay")
public class Bike implements Vehicle {
    @Override
    public String drive() {
        return "Bike Drive";
    }
}

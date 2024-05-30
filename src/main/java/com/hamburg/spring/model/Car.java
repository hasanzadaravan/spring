package com.hamburg.spring.model;

import com.hamburg.spring.repository.Vehicle;
import org.springframework.stereotype.Component;

@Component("milloen")
public class Car implements Vehicle {
    @Override
    public String drive() {
        return "Car Drive";
    }
}

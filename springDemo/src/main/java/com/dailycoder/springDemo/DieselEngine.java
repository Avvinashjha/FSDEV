package com.dailycoder.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DieselEngine extends Engine{
    public DieselEngine(@Value("${engine.diesel.horsepower}") int horsepower, @Value("${engine.diesel.type}") String type) {
        super(horsepower, type);
    }

    @Override
    public void startEngine() {
        System.out.println("Diesel engine started with horsepower: " + getHorsepower() + " and type: " + getType());
    }
}

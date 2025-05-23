package com.dailycoder.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PetrolEngine extends Engine{
    public PetrolEngine(@Value("${engine.petrol.horsepower}") int horsepower, @Value("${engine.petrol.type}") String type) {
        super(horsepower, type);
    }

    @Override
    public void startEngine() {
        System.out.println("Petrol engine started with horsepower: " + getHorsepower() + " and type: " + getType());
    }
}

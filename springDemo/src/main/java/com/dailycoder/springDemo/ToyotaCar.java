package com.dailycoder.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ToyotaCar extends Car{
    @Autowired
    PetrolEngine engine1;

    public ToyotaCar(@Value("${car.toyota.name}") String name, @Value("${car.toyota.speed}") int speed) {
        super(name, speed);
    }

    @Override
    public void startCar() {
        engine1.startEngine();
        System.out.println("Toyota Car " + getName() + " is running at speed " + getSpeed() + " km/h");
    }

}

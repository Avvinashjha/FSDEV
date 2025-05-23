package com.dailycoder.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MarutiCar extends Car {
    @Autowired
    DieselEngine engine;
    public MarutiCar(@Value("${car.maruti.name}") String name, @Value("${car.maruti.speed}") int speed) {
        super(name, speed);
    }

    @Override
    public void startCar() {
        engine.startEngine();
        System.out.println("Maruti Car " + getName() + " is running at speed " + getSpeed() + " km/h");
    }
}

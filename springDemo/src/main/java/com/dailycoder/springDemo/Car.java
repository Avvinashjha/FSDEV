package com.dailycoder.springDemo;

public class Car {
    private String name;
//    private Engine engine;

    public Car(String name ) {
        this.name = name;
//        this.engine = engine;
    }

    public void startCar() {
//        engine.startEngine();
        System.out.println("Car " + name + " is starting...");
    }
}

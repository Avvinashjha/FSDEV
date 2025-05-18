package com.dailycoder.lab_abstract;

public class ElectricCar extends Car{
    public ElectricCar(int speed, String color) {
        super(speed, color);
    }

    void createEngine() {
        System.out.println("Creating electric engine");
    }
}

package com.dailycoder.class_04;

public class WowCar implements Vehicle, Flyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("WowCar is flying");
    }

    @Override
    public void swim() {
        System.out.println("WowCar is swimming");
    }

    @Override
    public void start() {
        System.out.println("WowCar is starting");
    }

    @Override
    public void stop() {
        System.out.println("WowCar is stopping");
    }
}

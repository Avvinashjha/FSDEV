package com.dailycoder.class_04;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    // we can override the default method
    @Override
    public void honk() {
        System.out.println("Car honk! Honk!");
    }
}

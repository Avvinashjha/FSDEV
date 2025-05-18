package com.dailycoder.lab_interface;

public class Sukhoi implements Flyable{

    @Override
    public void fly() {
        System.out.println("Sukhoi is flying");
    }

    @Override
    public void start(int speed) {
        System.out.println("Sukhoi is starting at speed: " + speed);
    }

    @Override
    public void start() {
        System.out.println("Sukhoi is starting");
    }

    @Override
    public void stop() {
        System.out.println("Sukhoi is stopping");
    }
}

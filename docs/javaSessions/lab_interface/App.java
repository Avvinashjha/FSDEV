package com.dailycoder.lab_interface;

public class App {
    public static void main(String[] args) {
        Flyable sukhoi = new Sukhoi();
        sukhoi.start(100);
        sukhoi.start();
        sukhoi.fly();
        sukhoi.stop();
        Swimmable vikrant = new Vikrant();
        vikrant.start();
        vikrant.swim();
        vikrant.stop();
        Flyable.flyInfo();

    }
}

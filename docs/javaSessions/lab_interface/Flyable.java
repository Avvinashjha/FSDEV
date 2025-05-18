package com.dailycoder.lab_interface;

public interface Flyable extends Vehicle {
    void fly();
    void start(int speed);
    default void takeOff() {
        System.out.println("Taking off");
    }

    default void land() {
        System.out.println("Landing");
    }

    static void flyInfo() {
        System.out.println("Flying is a mode of transportation");
    }
}

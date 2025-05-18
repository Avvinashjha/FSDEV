package com.dailycoder.class_04;

public interface Flyable {
    void fly();

    default void takeOff() {
        System.out.println("Taking off");
    }

    default void land() {
        System.out.println("Landing");
    }

    static void hover() {
        System.out.println("Hovering");
    }
}

package com.dailycoder.class_04;

public interface Vehicle {
    // Constant ( by default it's public static final)
    String Type = "Transport";

    // abstract methods
    void start();
    void stop();

    // default method
    default void honk() {
        System.out.println("Honk! Honk!");
    }

    // static method
    static void printInfo() {
        System.out.println("This is a vehicle interface.");
    }

    // private method
    default void privateMethod() {
        System.out.println("This is a private method.");
    }

}

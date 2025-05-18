package com.dailycoder.lab_interface;

public interface Vehicle {
    void start();

    void stop();

    default void honk() {
        System.out.println("Honking");
    }

    static void vehicleInfo() {
        System.out.println("This is a vehicle");
    }
}

package com.dailycoder.lab_interface;

public interface Swimmable extends Vehicle{
    void swim();

    default void dive() {
        System.out.println("Diving");
    }

    default void surface() {
        System.out.println("Surfacing");
    }

    static void swimInfo() {
        System.out.println("Swimming is a mode of transportation");
    }
}

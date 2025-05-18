package com.dailycoder.class_04;

public interface Swimmable {
    void swim();

    default void floatOnWater() {
        System.out.println("Floating on water");
    }

    static void dive() {
        System.out.println("Diving into the water");
    }
}

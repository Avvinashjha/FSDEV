package com.dailycoder.class_05;

public interface Swimamable {
    public abstract void swim();

    default void floatOnWater() {
        System.out.println("Floating on water");
    }

    static void dive() {
        System.out.println("Diving into the water");
    }
}

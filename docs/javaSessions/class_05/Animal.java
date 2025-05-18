package com.dailycoder.class_05;

abstract class Animal {
    // instance variables
    protected String name;
    protected int age;

    // constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void makeSound();

    public String getName() {
        return name;
    }

    // concrete method
    public void eat() {
        System.out.println(name + " is eating.");
        logActivity();
    }

    // static method
    public static void animalInfo() {
        System.out.println("Animals are living beings.");
    }

    // can have private methods
    private void logActivity() {
        System.out.println("Logging activity for " + name);
    }


}

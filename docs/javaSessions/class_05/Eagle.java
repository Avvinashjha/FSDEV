package com.dailycoder.class_05;

public class Eagle extends Bird{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Screech");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating small animals.");
    }
}

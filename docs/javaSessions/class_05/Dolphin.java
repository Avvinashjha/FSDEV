package com.dailycoder.class_05;

public class Dolphin extends AquaticAnimal{
    public Dolphin(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Splash Splash");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating fish.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming gracefully.");
    }
}

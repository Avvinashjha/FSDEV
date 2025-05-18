package com.dailycoder.class_05;

public class AquaticAnimal extends Animal implements Swimamable{
    public AquaticAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Aquatic animal sound");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating aquatic food.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

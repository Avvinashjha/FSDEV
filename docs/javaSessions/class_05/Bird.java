package com.dailycoder.class_05;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating bird food.");
    }
}

package com.dailycoder.class_05;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating dog food.");
    }

}

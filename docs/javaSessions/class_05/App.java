package com.dailycoder.class_05;

public class App {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
        myDog.makeSound();
        myDog.eat();
        System.out.println("Dog's name: " + myDog.getName());
        Swimamable.dive();
        Swimamable swimamable = new Dolphin("Flipper", 5);
        swimamable.swim();
        swimamable.floatOnWater();
        // Calling static method
        Animal.animalInfo(); // All animals are multicellular organisms

    }
}

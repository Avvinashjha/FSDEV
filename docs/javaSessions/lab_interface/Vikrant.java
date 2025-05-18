package com.dailycoder.lab_interface;

public class Vikrant implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Vikrant is swimming");
    }

    @Override
    public void start() {
        System.out.println("Vikrant is starting");
    }

    @Override
    public void stop() {
        System.out.println("Vikrant is stopping");
    }
}

package com.dailycoder.springDemo;

public class Engine {
    private int horsepower;
    private String type;

    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public void startEngine(){
        System.out.println("Engine started with " + horsepower + " horsepower and type " + type);
    }
}

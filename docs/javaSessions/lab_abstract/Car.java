package com.dailycoder.lab_abstract;

abstract class Car {
    private int speed;
    private String color;

    abstract void createEngine();

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void whereAreWe(){
        System.out.println("We are in the car");
    }
}

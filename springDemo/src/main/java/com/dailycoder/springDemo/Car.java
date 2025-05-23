package com.dailycoder.springDemo;

abstract class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void startCar() {
        System.out.println("Car " + name + " is running at speed " + speed + " km/h");
    }
}

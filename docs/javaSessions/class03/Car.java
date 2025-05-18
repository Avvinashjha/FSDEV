package com.dailycoder.class03;

public class Car {
    public String name;
    public String model;
    public int year;
    public String color;
    public double speed;

    // default constructor
//    public Car() {}

    // constructor with parameters
    public Car(String name, String model, int year, String color, double speed) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    // 2 parameters constructor
    // contractor chaining
    public Car(String name, String model) {
        this(name, model, 2000, "red", 10);
    }

    // passing the reference of the current object
    public void displayCarDetails() {
        getCarDetails(this);
    }

    // printing the car details
    public void getCarDetails(Car car) {
        System.out.println("Name: " + car.name);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Color: " + car.color);
        System.out.println("Price: " + car.speed);
    }

    // methods
    public void start() {
        System.out.println("Car is starting");
    }
    public void stop() {
        System.out.println("Car is stopping");
    }
    public void accelerate() {
        speed += 10;
        System.out.println("Car is accelerating and Current Speed is " + speed);
    }
    public void decelerate() {
        speed -= 10;
        System.out.println("Car is decelerating and Current Speed is " + speed);
    }
}

package com.dailycoder.class02;


// Car Class -> blueprint of car
public class Car {
    // Static Variables
    private static int count;
    // Fields
    public static void addTwoNumbers(int a, int b) {
        System.out.println( a+ b);
    }
    public int numberOfWheels;
    private String name;
    private String color;
    private int speed;
    private double uniqueCode;

    // Default constructor
    // No Args constructor
    public Car(){
        this(0);
    }
    public Car(int numberOfWheels){
        count++;
        this.numberOfWheels = numberOfWheels;
    }
    // all arg constructor
    private Car(int numberOfWheels, String name, String color, int speed, int uniqueCode){
        count++;
        this.numberOfWheels = numberOfWheels;
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.uniqueCode = uniqueCode;

    }

    // constructor chaining
    public Car(String providedName, String providedColor){
        this(4, providedName, providedColor, 0,  1);
    }

    public Car(String providedName, String providedColor, int providedSpeed){
        this(4, providedName, providedColor, providedSpeed, 0);
    }

    // getter and setter
    public void setNumberOfWheels(int providedNumberOfWheels) {
        numberOfWheels = providedNumberOfWheels;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getUniqueCode() {
        return uniqueCode;
    }

    public static int getCount(){
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    // behaviors
    public void start() {
        System.out.println("Car is starting");
    }
    public void stop() {
        System.out.println("Car is stopping");
    }
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
    public void carDetails() {
        System.out.println("Car name: " + name);
        System.out.println("Car color: " + color);
        System.out.println("Car speed: " + speed);
        System.out.println("Number of wheels: " + numberOfWheels);
    }

}

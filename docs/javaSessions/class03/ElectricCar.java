package com.dailycoder.class03;

public class ElectricCar extends Car{
    private int batteryCapacity;
    private int range;

    public ElectricCar(String name, String model,String color,  int year, int speed, int batteryCapacity, int range) {
        super(name, model, year, color, speed);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge() {
        System.out.println("Charging the electric car...");
    }

    // We are overriding the parent method so it's called method overriding
    public void displayCarDetails(){
        super.displayCarDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range: " + range + " miles");
    }
}

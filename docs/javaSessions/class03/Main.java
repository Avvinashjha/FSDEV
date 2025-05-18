package com.dailycoder.class03;

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Camry",  2020,"Blue", 150);
        car.displayCarDetails();
        System.out.println("================================================");
        // Create an ElectricCar object
        // runtime polymorphism
        // Dynamic Method Dispatch
        Car electricCar = new ElectricCar("Tesla", "Model S", "Red", 2022, 200, 100, 300);
        electricCar.displayCarDetails();
    }

}

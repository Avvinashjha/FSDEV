package com.dailycoder.lab_interface;

public class ElectricCar implements Car{
    public ElectricCar(String name, String engine) {

    }

    @Override
    public void getNumberOfWheels() {
        System.out.println("Electric car has 4 wheels");
    }
    public void startAutomatically() {
        System.out.println("Electric car starting automatically");
    }

    @Override
    public void getCarType() {

    }
}

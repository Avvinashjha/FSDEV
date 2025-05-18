package com.dailycoder.lab_interface;

public class DieselCar implements Car{


    public DieselCar(String name, String engine) {

    }

    @Override
    public void getNumberOfWheels() {
        System.out.println("Diesel car has 6 wheels");
    }

    public void startAutomatically() {
        System.out.println("Diesel car starting automatically");
    }

    @Override
    public void getCarType() {
        System.out.println("Diesel car");
    }


}

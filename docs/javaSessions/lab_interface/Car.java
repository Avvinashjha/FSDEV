package com.dailycoder.lab_interface;

public interface Car {
    // constants
    double id = Math.random();

    public abstract void startAutomatically();
    public abstract void getCarType();


    default void getNumberOfWheels() {
        System.out.println("4 wheels");
    }

    default void createEngine() {
        someLogic();
        System.out.println("Creating engine");
    }
    default void createBody(){
        someLogic();
        System.out.println("Creating body");
    }

    static void carInfo() {
        System.out.println("This is a car");
    }

    default void someLogic(){
        System.out.println("Some logic");
    }



}

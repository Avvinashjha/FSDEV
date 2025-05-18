package com.dailycoder.lab;

public class Car {
    private String name;
    private Engine engine;
    private HeadLight headLight;
    public Car(Engine engine,String name, HeadLight headLight) {
        this.name = name;
        this.engine = engine;
        this.headLight = headLight;
    }
}

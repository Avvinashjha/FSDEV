package com.dailycoder.springDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

abstract class   Engine {
    private int horsepower;
    private String type;
    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }
    public int getHorsepower() {
        return horsepower;
    }
    public String getType() {
        return type;
    }
    abstract public void startEngine();
}

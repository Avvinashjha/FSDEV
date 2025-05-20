package com.dailycoder;

public class Engine {
    private int horsepower;
    private String type;
    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }
    public int getHorsepower() {
        return horsepower;
    }
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void startEngine() {
        System.out.println("Engine started with " + horsepower + " horsepower and type " + type);
    }
}

package com.dailycoder.lab_polymorf;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2,3));
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(2.0,2.0));
    }
}

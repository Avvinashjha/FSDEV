package com.dailycoder.class_04;

public class App {
    public static void main(String[] args) {
        LuxuryCar luxuryCar = new LuxuryCar();
        luxuryCar.start();
        System.out.println(LuxuryCar.Type);
        Calculator adder = (a,b) -> a + b;
        Calculator multiplier = (a,b) -> a * b;
        System.out.println(adder.calculate(5, 3));

    }
}

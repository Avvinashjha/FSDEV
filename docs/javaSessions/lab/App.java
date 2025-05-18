package com.dailycoder.lab;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine(200);
        Car car = new Car(engine, "Toyota", null);

        Heart heart = new Heart(70);
        Human human = new Human(heart);
    }
}

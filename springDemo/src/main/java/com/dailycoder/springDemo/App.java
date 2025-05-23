package com.dailycoder.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) {
        // Using XML configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
//        Car toyota = (Car) context.getBean("toyota, expensiveCar");
//        toyota.startCar();
        // Using Java configuration
//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//       Car toyota = (Car) context.getBean("car1");
//       toyota.startCar();
        //Annotation configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Engine engine = context.getBean("dieselEngine", Engine.class);
        engine.startEngine();

        Car car = context.getBean("toyotaCar", Car.class);
        car.startCar();

        Car maruti = context.getBean("marutiCar", Car.class);
        maruti.startCar();
    }
}

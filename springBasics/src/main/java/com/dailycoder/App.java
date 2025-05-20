package com.dailycoder;

import com.dailycoder.utils.annotations.DCInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        Car car = new Car("Toyota");
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        @DCInfo(value = "hello", printHashCode = true)
//        Car car = (Car) context.getBean("setterCar", Car.class);
//        Car car1 = (Car) context.getBean("constructorCar");
//        Car car2 = (Car) context.getBean("setterCar");
//        Car car3 = (Car) context.getBean("idCar");
//        Car car4 = (Car) context.getBean("lol");
//        Engine engine = (Engine) context.getBean("engine1");
//        engine.startEngine();
//        car4.startCar();
//        car.startCar();
//        car1.startCar();
//        car2.startCar();
//        car3.startCar();
//        System.out.println(car.hashCode());
//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());
        Car car1 = context.getBean("car1", Car.class);
        car1.startCar();
        String s = "nv-delphi-01";
        System.out.println(s.toUpperCase());

    }
}

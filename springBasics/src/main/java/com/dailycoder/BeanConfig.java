package com.dailycoder;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public Car car1 (){
        return new Car("Toyota");
    }

    @Bean
    public Car car2 (){
        return new Car("Honda");
    }
}

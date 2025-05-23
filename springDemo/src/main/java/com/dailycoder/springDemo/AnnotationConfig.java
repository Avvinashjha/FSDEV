package com.dailycoder.springDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.dailycoder.springDemo")
@PropertySource("classpath:application.properties")

public class AnnotationConfig {
}

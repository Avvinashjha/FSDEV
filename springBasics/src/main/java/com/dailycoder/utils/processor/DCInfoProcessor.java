package com.dailycoder.utils.processor;

import com.dailycoder.utils.annotations.DCInfo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import java.lang.reflect.*;
import java.util.*;

public class DCInfoProcessor {
    public static void process(Object obj) {
        // Get the stack trace to find the calling method
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 3) return;

        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();

        try {
            Class<?> clazz = Class.forName(className);
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    processMethodAnnotations(method, obj);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void processMethodAnnotations(Method method, Object obj) {
        // Check method-level annotation
        if (method.isAnnotationPresent(DCInfo.class)) {
            DCInfo annotation = method.getAnnotation(DCInfo.class);
            printInfo(obj, annotation);
        }

        // Check parameter annotations
        for (Parameter param : method.getParameters()) {
            if (param.isAnnotationPresent(DCInfo.class)) {
                DCInfo annotation = param.getAnnotation(DCInfo.class);
                printInfo(obj, annotation);
            }
        }
    }

    private static void printInfo(Object obj, DCInfo annotation) {
        if (annotation.printHashCode()) {
            System.out.println("HashCode: " + obj.hashCode());
        }
        if (!annotation.value().isEmpty()) {
            System.out.println("Info: " + annotation.value());
        }
    }
}
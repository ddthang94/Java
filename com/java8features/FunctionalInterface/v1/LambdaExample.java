package com.java8features.FunctionalInterface.v1;

interface Shape {
    void draw();
}

/* traditional way to implement an interface */
//class Rectangle implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Rectangle draw() method...");
//    }
//}

public class LambdaExample {
    public static void main(String[] args) {
        /* using lambda expression to implement functional interface */
        Shape rectangle = () -> System.out.println("Rectangle draw() method");
        rectangle.draw();
    }
}

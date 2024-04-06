package com.java8features.LambdaExpression.v3;

/* Functional interface */
interface Shape {
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {
        /* Converting OOP - polymorphism concept to Functional programming */
//        Using lambda expression to reduce boilerplate code (codes are repeated in multiple places)
//        Shape rectangle = () -> {
//            System.out.println("Rectangle class: draw() method");
//        };
//        rectangle.draw();

//        Shape square = () -> System.out.println("Square class: draw() method");
//        square.draw();

//        Shape circle = () -> System.out.println("Circle class: draw() method");
//        circle.draw();

//        Here we pass the lambda expression as a method parameter
        print(() -> System.out.println("Rectangle class: draw() method"));
        print(() -> System.out.println("Square class: draw() method"));
        print(() -> System.out.println("Circle class: draw() method"));
    }

    /* Pass a lambda expression as a method parameter */
    private static void print(Shape shape) {
        shape.draw();
    }
}

/* OOP - Polymorphism */
//class Rectangle implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Rectangle class: draw() method");
//    }
//}
//
//class Square implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Square class: draw() method");
//    }
//}
//
//class Circle implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Circle class: draw() method");
//    }
//}


package com.java8features.FunctionalInterface.v1;

/* Mark functional interface using annotation */
@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);

//    void display();
//    error because we marked as Functional interface

//    we can have more than 1 default or static method inside Functional Interface
    default void m1() {
        System.out.println("Default method");
    }

    static void m2() {
        System.out.println("Static method");
    }
}

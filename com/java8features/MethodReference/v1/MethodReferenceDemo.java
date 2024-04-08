package com.java8features.MethodReference.v1;

import java.util.function.Function;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        /* lambda expression to implement Functional interface */
//        Function<Integer, Double> function = (input) -> Math.sqrt(input);
//        System.out.println(function.apply(4));

        /* 1. Method reference to a static method */
        Function<Integer, Double> function = Math::sqrt;
        System.out.println(function.apply(4));
    }
}

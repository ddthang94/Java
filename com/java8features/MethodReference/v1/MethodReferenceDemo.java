package com.java8features.MethodReference.v1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {
    public static int addition(int a, int b) {
        return (a+b);
    }

    public static void main(String[] args) {

        /* lambda expression to implement Functional interface */
        Function<Integer, Double> functionLambda = (input) -> Math.sqrt(input);
        System.out.println(functionLambda.apply(4));

        /* 1. Method reference to a static method */
        Function<Integer, Double> function = Math::sqrt;
        System.out.println(function.apply(4));

        /* lambda expression to implement addition method */
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceDemo.addition(a,b);
        System.out.println(biFunctionLambda.apply(1,2));

        /* 1. Method reference to a static method */
        BiFunction<Integer, Integer, Integer> biFunction = MethodReferenceDemo::addition;
        System.out.println(biFunction.apply(1,2));

    }
}

package com.java8features.FunctionalInterface.v2;

import java.util.function.Function;

/* use function - functional interface in traditional way */
//class FunctionImpl implements Function<String, Integer> {
//    @Override
//    public Integer apply(String s) {
//        return s.length();
//    }
//}

public class FunctionDemo {
    public static void main(String[] args) {
//        Function<String, Integer> function = new FunctionImpl();
//        System.out.println(function.apply("Thang"));

        /* use lambda expression to implement Function - functional interface */
        Function<String, Integer> function = (String s) -> s.length();
        System.out.println(function.apply("Thang"));
    }
}
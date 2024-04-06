package com.java8features.LambdaExpression.v2;

import java.util.ArrayList;
import java.util.function.Consumer;

public class UseInterfaceToStoreLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
//        Use Java's Consumer interface to store a lambda expression
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}

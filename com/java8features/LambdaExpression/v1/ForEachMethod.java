package com.java8features.LambdaExpression.v1;

import java.util.ArrayList;

public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        /* use Lambda expression in the ArrayList's forEach() method
        to print all elements inside arrayList */
        numbers.forEach((n) -> {
            System.out.println(n);
        });
    }
}

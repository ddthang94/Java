package com.java8features.MethodReference.v4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceDemo4 {
    public static void main(String[] args) {
        /* 4. Reference to a Constructor */
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");

//        Lambda Expression
        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

//        Method Reference
        Function<List<String>, Set<String>> setFunctionMR = HashSet::new;
        System.out.println(setFunctionMR.apply(fruits));
    }
}
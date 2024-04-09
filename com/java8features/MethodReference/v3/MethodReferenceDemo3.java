package com.java8features.MethodReference.v3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.function.Function;

public class MethodReferenceDemo3 {
    public static void main(String[] args) {
        /* 3. Reference to the instance Method of an arbitrary object */
//        Sometimes, we call a Method of argument in the lambda expression
//        In that case, we can use a Method reference to call an instance
//        Method of an arbitrary object of a specific type

//        Lambda expression
        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("HeLLO WORLD!"));
//        Method reference
        Function<String, String> stringStringFunctionMR = String::toLowerCase;
        System.out.println(stringStringFunctionMR.apply("JAVA guides"));

        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

//        Lambda Expression
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(strArray));

//        Method Reference
        Arrays.sort(strArray, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strArray));

    }
}

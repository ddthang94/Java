package com.java8features.StreamAPI.v5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,2,3,2,1);

        /* findFirst() and findAny() methods */
        Optional<Integer> element = list.stream().findFirst();
        if(element.isPresent()) {
            System.out.println(element.get());
        } else {
            System.out.println("List is empty");
        }

        Optional<Integer> element2 = list.stream().findAny();
        if(element2.isPresent()) {
            System.out.println(element2.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
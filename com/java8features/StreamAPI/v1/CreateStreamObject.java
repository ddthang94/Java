package com.java8features.StreamAPI.v1;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObject {
    public static void main(String[] args) {
        /* Create Stream object */
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);
        System.out.println("=======================");

        /* Create Stream object from Collection */
        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);
        System.out.println("=======================");

        /* Create stream object from a List */
        List<String> list = Arrays.asList("Java", "J2EE", "Spring", "Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);
        System.out.println("=======================");

        /* Create stream object from a Set */
        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);
        System.out.println("=======================");

        /* Create Stream object from an Array */
        String[] arr = {"a", "b", "c", "d"};
        Stream<String> stream5 = Arrays.stream(arr);
        stream5.forEach(System.out::println);

    }
}

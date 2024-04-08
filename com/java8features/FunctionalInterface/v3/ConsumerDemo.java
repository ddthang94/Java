package com.java8features.FunctionalInterface.v3;

import java.util.function.Consumer;

/* Consumer predefined interface following the traditional way */
//class ConsumerImpl implements Consumer<String> {
//    @Override
//    public void accept(String input) {
//        System.out.println("The the String: "+input);
//    }
//}

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer = new ConsumerImpl();
//        consumer.accept("Hello world!");
        /* using Lambda expression to implement Consumer functional interface */
        Consumer<String> consumer = (input) -> System.out.println("The the String: "+input);
        consumer.accept("Hello world!");
    }
}

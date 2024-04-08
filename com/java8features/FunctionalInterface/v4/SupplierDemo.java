package com.java8features.FunctionalInterface.v4;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/* traditional way to implement Supplier as predefined Functional interface */
//class SupplierImpl implements Supplier<LocalDateTime> {
//    @Override
//    public LocalDateTime get() {
//        return LocalDateTime.now();
//    }
//}

public class SupplierDemo {
    public static void main(String[] args) {
//        Supplier<LocalDateTime> supplier = new SupplierImpl();
//        System.out.println("Current time is "+supplier.get());
        /* using Lambda expression to implement Supplier */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println("Current time is "+supplier.get());
    }
}

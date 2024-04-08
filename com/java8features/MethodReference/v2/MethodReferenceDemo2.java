package com.java8features.MethodReference.v2;

import com.java8features.MethodReference.v1.MethodReferenceDemo;

@FunctionalInterface
interface Printable {
    void print(String msg);
}

public class MethodReferenceDemo2 {

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {

        MethodReferenceDemo2 methodReferenceDemo = new MethodReferenceDemo2();

        /* 2. Method reference to an instance method of an object */
        Printable printableMethodRef = methodReferenceDemo::display;
        printableMethodRef.print("method Reference to an insTance method of an Object");

        /* lambda expression to implement the functional interface Printable */
        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.print("hello WorlD!");


    }
}

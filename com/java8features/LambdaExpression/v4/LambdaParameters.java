package com.java8features.LambdaExpression.v4;

/* Functional interface */
interface Addable {
    int addition(int a, int b);
}

//class AddableImpl implements Addable {
//
//    @Override
//    public int addition(int a, int b) {
//        return (a+b);
//    }
//}

public class LambdaParameters {
    public static void main(String[] args) {
//        type of variables from parameter list are referred from functional interface
        Addable addition = (a, b) -> (a+b);
        int result = addition.addition(10,20);
        System.out.println(result);

        /* Multiple statements */
//        Addable abc = (a,b) -> {
//            int c = (a+b);
//            return c;
//        };
    }
}

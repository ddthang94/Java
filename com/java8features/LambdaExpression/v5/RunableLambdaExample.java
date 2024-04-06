package com.java8features.LambdaExpression.v5;

class ThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Run method is called");
    }
}
public class RunableLambdaExample {
    public static void main(String[] args) {
        /* Create thread in traditional way */
//        Thread thread = new Thread(new ThreadDemo());
//        thread.start();

//        Runnable runnable = () -> System.out.println("Run method is called by lambda...");
//        Pass lambda expression as a parameter to the constructor
        Thread threadLambda = new Thread(() -> System.out.println("Run method is called by lambda..."));
        threadLambda.start();
    }
}

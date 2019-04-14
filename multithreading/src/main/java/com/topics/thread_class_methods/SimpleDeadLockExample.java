package com.topics.thread_class_methods;

public class SimpleDeadLockExample {

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
        System.out.println("Inside main");
    }
}

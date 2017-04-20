package com.topics.multi_threading.thread_class_methods;

public class YieldExample {
    public static void main(String[] args) {
        MyYieldThread myYieldThread = new MyYieldThread();
        myYieldThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Parent Thread");
            Thread.yield();
        }
    }
}

class MyYieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

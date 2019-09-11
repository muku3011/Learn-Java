package com.topics.thread_class_methods;

public class InterruptThreadExample {

    public static void main(String[] args) {
        MyInterruptThread interruptThread = new MyInterruptThread();
        interruptThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent Thread");
            if (i == 4) {
                interruptThread.interrupt();
                System.out.println(interruptThread.isInterrupted());
            }
        }
    }
}

class MyInterruptThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println("Child Thread interrupted");
            }
            System.out.println("Child Thread");
        }
    }
}
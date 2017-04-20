package com.topics.multi_threading.thread_class_methods;

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

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Child Thread interrupted");
            }
            System.out.println("Child Thread");
        }
    }
}
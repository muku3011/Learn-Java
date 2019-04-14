package com.topics.thread_class_methods;

public class ThreadPriorityExample {

    public static void main(String[] args) throws InterruptedException {
        MyPriorityThread myPriorityThread = new MyPriorityThread();
        Thread thread = new Thread(myPriorityThread, "CHILD THREAD");
        thread.start();

        Thread.sleep(1000, 100);

        System.out.println("Parent Thread :");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setName("UPDATED PARENT THREAD");
        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println("Parent");
        }
    }
}

class MyPriorityThread implements Runnable {

    public void run() {
        System.out.println("\nChild Thread :");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setName("UPDATED CHILD THREAD");
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println("Child");
        }
    }

}

package com.ocp.topics.multi_threading.thread_class_methods;

public class JoinExample2 {

    public static void main(String[] args) throws InterruptedException {
        MyJoinThread2.mainThread = Thread.currentThread();

        MyJoinThread2 myJoinThread2 = new MyJoinThread2();
        myJoinThread2.start();
        //myJoinThread2.join(); //Deadlock if uncommented, both thread will wait for each other.

        for (int i = 0; i < 10; i++) {
            System.out.println("Parent Thread");
        }
    }
}

class MyJoinThread2 extends Thread {
    static Thread mainThread;

    public void run() {
        try {
            mainThread.join();

            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
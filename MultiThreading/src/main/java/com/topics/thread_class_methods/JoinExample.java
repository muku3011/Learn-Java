package com.topics.thread_class_methods;

public class JoinExample {

    public static void main(String[] args) throws InterruptedException {
        MyJoinThread myJoinThread = new MyJoinThread();
        myJoinThread.start();

        myJoinThread.join();
        //myJoinThread.join(15000);
        //myJoinThread.join(15000, 100);

        System.out.println("Parent Thread");
    }
}

class MyJoinThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
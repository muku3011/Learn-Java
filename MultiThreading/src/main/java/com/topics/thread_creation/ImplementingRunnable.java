package com.topics.thread_creation;

public class ImplementingRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value in runnable (" + Thread.currentThread().getName() + ") : " + i);
            if (i == 4) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ImplementingRunnable runnable = new ImplementingRunnable();
        Thread thread = new Thread(runnable, "Implementing runnable");

        System.out.println(thread.getState());
        //thread.setName("Implementing runnable");
        thread.start();
        //thread.join(0) or thread.join() are same;
        System.out.println(thread.getState());

        Thread.sleep(2000);

        System.out.println(thread.getState());

        Thread.sleep(4000);
        System.out.println(thread.getState());

        Thread.yield();
    }
}

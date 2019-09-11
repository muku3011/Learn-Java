package com.topics.thread_creation;

/**
 * Thread()
 * Thread(Runnable target)
 * Thread(Runnable target, String name)
 * Thread(String name)
 */
public class ExtendingThread extends Thread {

    private ExtendingThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value in thread (" + this.getName() + ") : " + i);
            if (i == 4) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        ExtendingThread thread = new ExtendingThread("Extending thread");
        //thread.setName("Extending thread");
        thread.start();
    }
}

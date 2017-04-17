package com.ocp.topics.multi_threading.synchronization;

class DisplayStaticGreeting {
    // Try removing static synchronized from method datatypes, order of the output will become un-ordered
    static synchronized void wishBirthday(String wishTo) {           //Static Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.print("Very Happy Birthday : ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
            System.out.print(wishTo + "\n");
        }
    }
}

class MyNewThread extends Thread {
    private DisplayStaticGreeting displayGreeting;
    private String wishTo;

    MyNewThread(DisplayStaticGreeting displayGreeting, String wishTo) {
        this.displayGreeting = displayGreeting;
        this.wishTo = wishTo;
    }

    public void run() {
        displayGreeting.wishBirthday(wishTo);
    }
}

public class StaticSynchronizedMethodExample {
    public static void main(String args[]) {
        DisplayStaticGreeting displayGreeting1 = new DisplayStaticGreeting();
        DisplayStaticGreeting displayGreeting2 = new DisplayStaticGreeting();
        MyNewThread t1 = new MyNewThread(displayGreeting1, "Mukesh");
        MyNewThread t2 = new MyNewThread(displayGreeting2, "Prateek");
        t1.start();
        t2.start();
    }
}

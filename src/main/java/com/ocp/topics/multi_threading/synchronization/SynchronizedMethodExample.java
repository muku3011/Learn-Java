package com.ocp.topics.multi_threading.synchronization;

class DisplayGreeting {
    // Try removing synchronized from method a_declaration, order of the output will become un-ordered
    synchronized void wishBirthday(String wishTo) {           //Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.print("Happy Birthday : ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
            System.out.print(wishTo + "\n");
        }
    }
}

class MyThread extends Thread {
    private DisplayGreeting displayGreeting;
    private String wishTo;

    MyThread(DisplayGreeting displayGreeting, String wishTo) {
        this.displayGreeting = displayGreeting;
        this.wishTo = wishTo;
    }

    public void run() {
        displayGreeting.wishBirthday(wishTo);
    }
}

public class SynchronizedMethodExample {
    public static void main(String args[]) {
        DisplayGreeting displayGreeting = new DisplayGreeting();//only one object
        MyThread t1 = new MyThread(displayGreeting, "Mukesh");
        MyThread t2 = new MyThread(displayGreeting, "Prateek");
        t1.start();
        t2.start();
    }
}

/*
class SynchronizedUsingAnonymousClass {
    public static void main(String args[]) {
        final DisplayGreeting displayGreeting = new DisplayGreeting();//only one object

        Thread t1 = new Thread() {
            public void run() {
                displayGreeting.wishBirthday("Dhoni");
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                displayGreeting.wishBirthday("Yuvraaj");
            }
        };

        t1.start();
        t2.start();
    }
}*/

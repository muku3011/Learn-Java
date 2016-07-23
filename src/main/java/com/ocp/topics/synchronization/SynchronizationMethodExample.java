package com.ocp.topics.synchronization;

class SynchronizationExample {
    // Try removing synchronized from method declaration, order of the output will become un-ordered
    synchronized void printTable(int n) {           //Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}

class MyThreadOne extends Thread {
    private SynchronizationExample example;

    MyThreadOne(SynchronizationExample example) {
        this.example = example;
    }

    public void run() {
        example.printTable(5);
    }

}

class MyThreadTwo extends Thread {
    private SynchronizationExample example;

    MyThreadTwo(SynchronizationExample example) {
        this.example = example;
    }

    public void run() {
        example.printTable(100);
    }
}

public class SynchronizationMethodExample {
    public static void main(String args[]) {
        SynchronizationExample example = new SynchronizationExample();//only one object
        MyThreadOne t1 = new MyThreadOne(example);
        MyThreadTwo t2 = new MyThreadTwo(example);
        t1.start();
        t2.start();
    }
}

class SynchronizationUsingAnonymousClass {
    public static void main(String args[]) {
        final SynchronizationExample obj = new SynchronizationExample();//only one object

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
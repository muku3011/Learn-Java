package com.ocp.programs;

class ThreadOne extends Thread {

    //Print even number
    public void run() {
        synchronized (this) {
            if (!ThreadTest.isOdd) {
                System.out.println("Even No : " + ThreadTest.number);
                ThreadTest.number = ThreadTest.number + 1;
            } else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ThreadTwo extends Thread {

    //Print even number
    public void run() {
        synchronized (this) {
            if (ThreadTest.number % 2 != 0) {
                System.out.println("Even No : " + ThreadTest.number);
                ThreadTest.number = ThreadTest.number + 1;
            } else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


public class ThreadTest {
    public static int number = 1;
    public static boolean isOdd = true;

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
    }


}

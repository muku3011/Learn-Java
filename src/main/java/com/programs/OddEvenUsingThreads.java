package com.programs;

public class OddEvenUsingThreads {
    //public static final int max = 10;
    public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, true));
        t1.start();
        t2.start();
    }
}

class TaskEvenOdd implements Runnable {

    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, boolean isEvenNumber) {
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {

        //System.out.println("Run method");
        int number = isEvenNumber ? 2 : 1;
        while (number <= 10) {
            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
                print.printEven(number);
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
                print.printOdd(number);
                // number+=2;
            }
            number = number + 2;
        }
    }
}

class Printer {
    private boolean isOdd = false;
    synchronized void printEven(int number) {

        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:" + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:" + number);
        isOdd = true;
        notifyAll();
    }
}

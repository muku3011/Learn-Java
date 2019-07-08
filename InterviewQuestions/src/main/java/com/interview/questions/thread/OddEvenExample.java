package com.interview.questions.thread;

import java.util.ArrayList;
import java.util.List;

class OddEvenExample {

    private boolean isOdd = false;
    List<Integer> oddEvenList = new ArrayList<>();

    void printOddEvenUsingThreads() {
        Thread tt1 = new Thread(() -> evenOdd(true));
        tt1.start();
        Thread tt2 = new Thread(() -> evenOdd(false));
        tt2.start();
    }

    private void evenOdd(boolean isEvenNumber) {
        int number = isEvenNumber ? 2 : 1;
        while (number <= 10) {
            if (isEvenNumber) {
                printEven(number);
            } else {
                printOdd(number);
            }
            oddEvenList.add(number);
            number = number + 2;
        }
    }

    private synchronized void printEven(int number) {
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

    private synchronized void printOdd(int number) {
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
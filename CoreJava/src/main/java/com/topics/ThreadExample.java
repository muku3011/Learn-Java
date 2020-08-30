package com.topics;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ThreadExample {

    static Vector<String> names = new Vector<>();

    static class ThreadOne extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                names.add(String.valueOf(i));
            }
            System.out.println("Within thread one");
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                names.add(String.valueOf(i));
            }
            System.out.println("Within thread two");
        }
    }

    public static void main(String[] args) throws InterruptedException {
/*        ThreadOne threadOne = new ThreadOne();
        Thread threadTwo = new Thread(new ThreadTwo());

        threadOne.start();
        threadTwo.start();

        Thread.sleep(3000);
        System.out.println(names.size());*/

        LinkedList<String> strings = new LinkedList<>();
        strings.add("Mukesh");
        strings.add("Kusum");
        strings.add("Kusum");
        strings.add("Kusum");

        ListIterator<String> itr = strings.listIterator();

        while(itr.hasNext()) {
            try {
                System.out.println(itr.previous() + itr.next());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
        }


    }
}

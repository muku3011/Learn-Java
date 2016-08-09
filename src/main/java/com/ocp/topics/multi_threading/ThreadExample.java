package com.ocp.topics.multi_threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class ExtendingThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value in thread (" + this.getName() + ") : " + i);
            if (i == 4) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ImplementingRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value in runnable (" + Thread.currentThread().getName() + ") : " + i);
            if (i == 4) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ImplementingCallable implements Callable<Integer> {

    private Integer number;

    ImplementingCallable(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
        System.out.println("Result for number - " + number + " -> " + result);
        return result;
    }
}

public class ThreadExample {

    public static void main(String[] args) {
        ExtendingThread thread = new ExtendingThread();
        thread.setName("Extending thread :)");
        thread.start();


        Thread thread1 = new Thread(new ImplementingRunnable());
        thread1.setName("Implementing runnable");
        //thread1.start();

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        List<Future<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            ImplementingCallable calculator = new ImplementingCallable(i);
            Future<Integer> result = executor.submit(calculator);
            resultList.add(result);
        }
        for (Future<Integer> future : resultList) {
            try {
                System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
    }
}
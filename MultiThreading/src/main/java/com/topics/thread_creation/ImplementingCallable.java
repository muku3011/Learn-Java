package com.topics.thread_creation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ImplementingCallable implements Callable<Integer> {

    private Integer number;

    private ImplementingCallable(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if ((number != 0) && (number != 1)) {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
        System.out.println("Result for number - " + number + " -> " + result);
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        List<Future<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            ImplementingCallable calculator = new ImplementingCallable(i);
            Future<Integer> result = executor.submit(calculator);
            resultList.add(result);
        }
        for (Future<Integer> future : resultList) {
                System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
        }
        // Shut down the executor service now
        executor.shutdown();
    }
}

package com.frameworks.scheduler.quartz;

import org.quartz.*;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class TestJob implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Quartz job started!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Quartz job finished!");
    }
}

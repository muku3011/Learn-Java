package com.xtra.scheduler.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.sql.SQLException;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

public class QuartzJobExample {

    public static void main(String[] args) throws InterruptedException, SQLException {
        try {
            // Grab the Scheduler instance from the Factory
            SchedulerFactory schedulerFactory = new StdSchedulerFactory("quartz/quartz.properties");
            Scheduler scheduler = schedulerFactory.getScheduler();

            // Start it off
            scheduler.start();

            // Run job
            scheduleJobAndTrigger(scheduler);

            // Completed now shutdown
            scheduler.shutdown();

        } catch (SchedulerException se) {
            se.printStackTrace();
        }
    }

    private static void scheduleJobAndTrigger(Scheduler scheduler) throws SchedulerException {
        // Define the job and tie it to our TestJob class
        JobDetail job = newJob(TestJob.class)
                .withIdentity("TestJob", "GroupOne")
                .build();


        // Trigger the job to run now, and then repeat every 40 seconds
        Trigger trigger = newTrigger()
                .withIdentity("TriggerOne", "GroupOne")
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(40)
                        .repeatForever())
                .build();

        // CronTrigger the job to run now, and then repeat every 40 seconds
        CronTrigger cronTrigger = newTrigger()
                .withIdentity("TriggerTwo", "GroupOne")
                .withSchedule(cronSchedule("0/20 * * * * ?"))
                .build();

        // Tell quartz to schedule the job using our trigger
        scheduler.scheduleJob(job, cronTrigger);
    }
}

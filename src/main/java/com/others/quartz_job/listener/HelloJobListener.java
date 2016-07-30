package com.others.quartz_job.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class HelloJobListener implements JobListener {
	 
	public static final String LISTENER_NAME = "dummyJobListenerName";
 
	public String getName() {
		return LISTENER_NAME; //must return a name
	}
 
	// Run this if job is about to be executed.
	public void jobToBeExecuted(JobExecutionContext context) {
 
		String jobName = context.getJobDetail().getKey().toString();
		System.out.println("jobToBeExecuted");
		System.out.println("Job : " + jobName + " is going to start...");
 
	}
 
	// No idea when will run this?
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.out.println("jobExecutionVetoed");
	}
 
	//Run this after job has been executed
	public void jobWasExecuted(JobExecutionContext context,
			JobExecutionException jobException) {
		System.out.println("jobWasExecuted");
 
		String jobName = context.getJobDetail().getKey().toString();
		System.out.println("Job : " + jobName + " is finished...");
 
		if (!jobException.getMessage().equals("")) {
			System.out.println("Exception thrown by: " + jobName
				+ " Exception: " + jobException.getMessage());
		}
 
	}
 
}
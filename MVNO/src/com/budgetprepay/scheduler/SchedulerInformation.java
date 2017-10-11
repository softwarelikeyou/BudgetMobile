package com.budgetprepay.scheduler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jxl.common.Logger;

import org.quartz.Trigger;

public class SchedulerInformation implements Serializable {

	static final long serialVersionUID = 1L;
		
	private static Logger logger = Logger.getLogger(SchedulerInformation.class);
	
	public SchedulerInformation() { 
		
	}
	
	public class JobInformation implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private String name;
		private String time;
		
		public String getName() {
			return name;
		}
		
		public void setName(final String name) {
			this.name = name;
		}
		
		public String getTime() {
			return time;
		}
		
		public void setTime(final String time) {
			this.time = time;
		}
	}
	
	public List<JobInformation> getScheduledJobs() {
		List<JobInformation> list = new ArrayList<JobInformation>();
		
		try {
			for (Trigger trigger : CommitScheduler.getScheduledJobs()) {
				JobInformation jobInformation = new JobInformation();
				jobInformation.setName(trigger.getJobName());
				jobInformation.setTime(trigger.getNextFireTime().toString());
				list.add(jobInformation);
			}
		}
		catch (Exception e) {
			logger.error(e);
		}
		return list;
	}
}

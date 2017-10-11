package com.budgetprepay.scheduler;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import java.util.List;

import com.budgetprepay.model.entity.PlintronAsyncResponse;
import com.budgetprepay.model.facade.PlintronFacade;

public class PlintronPortCSRFeedbackWorker implements StatefulJob {

	public static Logger logger = Logger.getLogger(PlintronPortCSRFeedbackWorker.class);
	
	private PlintronAsyncResponse response = null;
	
	@SuppressWarnings("unchecked")
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
      
		    for (JobExecutionContext job : (List<JobExecutionContext>) context.getScheduler().getCurrentlyExecutingJobs()) {
				if (job.getJobDetail().getName().equals(context.getJobDetail().getName()) && !job.getJobInstance().equals(this)) {
					logger.info("Plintron Port Feedback Job " + context.getJobDetail().getName() + " is running");
					return;
				}
			}
			
		    response  = (PlintronAsyncResponse) context.getJobDetail().getJobDataMap().get("response");
		    
			if (response == null) {
				logger.error("Response cannot be null");
				return;
			}
			
			PlintronFacade.sendPortCSRFeedback(response);
		}
		catch (Exception e) {
			logger.error(e);
		}
	}
}

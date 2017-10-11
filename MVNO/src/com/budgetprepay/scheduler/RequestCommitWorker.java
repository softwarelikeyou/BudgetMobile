package com.budgetprepay.scheduler;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import java.util.Date;
import java.util.List;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.facade.TopupFacade;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.viewcontroller.util.ResourceUtil;

public class RequestCommitWorker implements StatefulJob {

	public static Logger logger = Logger.getLogger(RequestCommitWorker.class);
	
	private Request request = null;
	
	@SuppressWarnings("unchecked")
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
      
		    for (JobExecutionContext job : (List<JobExecutionContext>) context.getScheduler().getCurrentlyExecutingJobs()) {
				if (job.getJobDetail().getName().equals(context.getJobDetail().getName()) && !job.getJobInstance().equals(this)) {
					logger.info("Job " + context.getJobDetail().getName() + " is running");
					throw new JobExecutionException("Request Commit Job " + context.getJobDetail().getName() + " is already running");
				}
			}
			
			request  = (Request) context.getJobDetail().getJobDataMap().get("request");

			if (request == null) {
				logger.error("Request cannot be null");
				throw new JobExecutionException("Request cannot be null");
			}
			
			// Get the latest data
			request = RequestFacade.retrieveByClientReference(request.getClientReference());
			
			if (request == null) {
				logger.error("Request cannot be null");
				throw new JobExecutionException("Request cannot be null");
			}
			
			if (request.getCancel() == true)
				return;
			
			TopupFacade.commitOrder(request);
			request.setCommited(new Date());
			RequestFacade.update(request);
			logger.info("Commiting request " + request.getReferenceNumber() + " / " + request.getClientReference());
		}
		catch (Exception e) {
			try {
			    CommitScheduler.reScheduleJob(request, Long.valueOf(ResourceUtil.get("commit.scheduler.retry.seconds")));
			}
			catch (Exception xe) {
				logger.error(xe.getCause(), xe);
			}
			logger.error(e.getCause(), e);
		}
	}
}

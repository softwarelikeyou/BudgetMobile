package com.budgetprepay.scheduler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import com.budgetprepay.model.entity.PlintronAsyncResponse;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.util.TopupUtil;

public class CommitScheduler {

	private static Logger logger = Logger.getLogger(CommitScheduler.class);
	
	private static CommitScheduler instance = null;

	private static SchedulerFactory factory;
	private static Scheduler scheduler;
		
	public static Long second = 1000L;
	
	private CommitScheduler() { }
	
	public static CommitScheduler getInstance() {
	  	if (instance == null && doStart() == true) {
	  		instance = new CommitScheduler();
	  		start();
	  	}
	  	return instance;
	}
	
	public static Scheduler getScheduler() {
		return scheduler;
	}
	
	public static Boolean isStarted() throws Exception {
		return scheduler.isStarted();
	}
	
	public static void shutdown() throws Exception {
		if (isStarted())
			scheduler.shutdown();
	}
	
	public static void start() {
		try {
            Properties properties = new Properties();
            properties.setProperty(StdSchedulerFactory.PROP_SCHED_INSTANCE_NAME, ResourceUtil.get("commit.scheduler.instance.name"));
            properties.setProperty(StdSchedulerFactory.DEFAULT_INSTANCE_ID, ResourceUtil.get("commit.scheduler.instance.id"));
            properties.setProperty(StdSchedulerFactory.PROP_THREAD_POOL_CLASS, "org.quartz.simpl.SimpleThreadPool");
            properties.setProperty("org.quartz.threadPool.threadCount", ResourceUtil.get("commit.scheduler.thread.count"));
            properties.setProperty(StdSchedulerFactory.PROP_JOB_STORE_CLASS, "org.quartz.impl.jdbcjobstore.JobStoreTX");
            properties.setProperty("org.quartz.jobStore.driverDelegateClass", "org.quartz.impl.jdbcjobstore.MSSQLDelegate");
            properties.setProperty("org.quartz.jobStore.tablePrefix", "QRTZ_");
            properties.setProperty("org.quartz.jobStore.dataSource", "epay");
            properties.setProperty("org.quartz.dataSource.epay.driver", ResourceUtil.get("hibernate.connection.driver_class"));
            properties.setProperty("org.quartz.dataSource.epay.URL", ResourceUtil.get("hibernate.connection.url"));
            properties.setProperty("org.quartz.dataSource.epay.user", ResourceUtil.get("hibernate.connection.username"));
            properties.setProperty("org.quartz.dataSource.epay.password", ResourceUtil.get("hibernate.connection.password"));
         
            factory = new StdSchedulerFactory(properties);
            scheduler = factory.getScheduler();
            scheduler.start();
		}
		catch (Exception e) {
		    logger.error("Unable to start commit sheduler due to " + e.getCause().getLocalizedMessage(), e);
		    throw new RuntimeException(e);
		}
	}
	
	public static boolean doStart() {
		boolean result = false;
		try {
		    result = Boolean.valueOf(ResourceUtil.get("commit.scheduler.start"));
		}
		catch (Exception e) {
			logger.error(e);
		}
		return result;
	}
	
	public static void scheduleJob(final Request request) throws Exception {
        try {
		    JobDetail jobDetail = new JobDetail();
            JobDataMap jobDataMap = new JobDataMap();
            jobDataMap.put("request", request);
            jobDetail.setJobDataMap(jobDataMap);
		    jobDetail.setName(request.getClientReference());
		    jobDetail.setGroup(ResourceUtil.get("commit.scheduler.instance.name"));
		    jobDetail.setJobClass(com.budgetprepay.scheduler.RequestCommitWorker.class);
		    long startTime = System.currentTimeMillis() + (second * Long.valueOf(ResourceUtil.get("commit.scheduler.seconds")));
		    SimpleTrigger trigger = new SimpleTrigger();
		    trigger.setName(jobDetail.getName());
		    trigger.setJobGroup(jobDetail.getGroup());
		    trigger.setStartTime(new Date(startTime));
		    trigger.setEndTime(null);
		    trigger.setRepeatCount(0);
		    trigger.setRepeatInterval(0L);
            scheduler.scheduleJob(jobDetail, trigger);
            logger.info("Scheduling commit request " + request.getClientReference() + " for " + trigger.getStartTime());
        }
        catch (Exception e) {
			throw new Exception("Unable to schedule request commit " + request.getClientReference(), e);
        }
	}
	
	public static void reScheduleJob(final Request request, final long seconds) throws Exception {
        try {
		    JobDetail jobDetail = new JobDetail();
            JobDataMap jobDataMap = new JobDataMap();
            jobDataMap.put("request", request);
            jobDetail.setJobDataMap(jobDataMap);
		    jobDetail.setName(request.getClientReference()  + "-" + TopupUtil.getRandom());
		    jobDetail.setGroup(ResourceUtil.get("commit.scheduler.instance.name"));
		    jobDetail.setJobClass(com.budgetprepay.scheduler.RequestCommitWorker.class);
		    long startTime = System.currentTimeMillis() + (second * seconds);
		    SimpleTrigger trigger = new SimpleTrigger();
		    trigger.setName(jobDetail.getName());
		    trigger.setJobGroup(jobDetail.getGroup());
		    trigger.setStartTime(new Date(startTime));
		    trigger.setEndTime(null);
		    trigger.setRepeatCount(0);
		    trigger.setRepeatInterval(0L);
            scheduler.scheduleJob(jobDetail, trigger);
            logger.info("Rescheduling commit request " + request.getClientReference() + " for " + trigger.getStartTime());
        }
        catch (Exception e) {
			throw new Exception("Unable to reschedule request commit " + request.getClientReference(), e);
        }
	}
	
	public static void unScheduleJob(final Request request) throws Exception {
		unScheduleJob(request.getClientReference());
	}
	
	public static void unScheduleJob(final String id) throws Exception {
		Boolean results = null;
        try {
        	results = scheduler.deleteJob(id, ResourceUtil.get("commit.scheduler.instance.name"));
            logger.info("Unscheduling job " + id + " - " + results);
        }
        catch (Exception e) {
        	logger.error("Unscheduling job " + id, e);
			throw new Exception("Unscheduling job " + id, e);
        }
	}
	
	public static void stopJob(final String id) throws Exception {
		Boolean results = null;
		try {
			results = scheduler.interrupt(id, ResourceUtil.get("commit.scheduler.instance.name"));
			logger.info("Stopping job " + id + " - " + results);
		}
		catch (Exception e) {
			logger.error("Unable to stop job " + id, e);
			throw new Exception ("Unable to stop job " + id, e);
		}
	}
	
	public static void scheduleSendBulkMessageJob(final Request request) throws Exception {
        try {
		    JobDetail jobDetail = new JobDetail();
            JobDataMap jobDataMap = new JobDataMap();
            jobDataMap.put("request", request);
            jobDetail.setJobDataMap(jobDataMap);
		    jobDetail.setName(request.getReferenceNumber());
		    jobDetail.setGroup(ResourceUtil.get("commit.scheduler.instance.name"));
		    jobDetail.setJobClass(com.budgetprepay.scheduler.SendBulkMessageWorker.class);
		    long startTime = System.currentTimeMillis() + (second * Long.valueOf(ResourceUtil.get("commit.scheduler.seconds")));
		    SimpleTrigger trigger = new SimpleTrigger();
		    trigger.setName(jobDetail.getName());
		    trigger.setJobGroup(jobDetail.getGroup());
		    trigger.setStartTime(new Date(startTime));
		    trigger.setEndTime(null);
		    trigger.setRepeatCount(0);
		    trigger.setRepeatInterval(0L);
            scheduler.scheduleJob(jobDetail, trigger);
            logger.info("Scheduling send bulk message request " + request.getReferenceNumber() + " for " + trigger.getStartTime());
        }
        catch (Exception e) {
			throw new Exception("Unable to schedule request send bulk message " + request.getReferenceNumber(), e);
        }
	}
	
	public static void schedulePlintronPortCSRFeedbackJob(final PlintronAsyncResponse plintronAsyncResponse) {
        try {
        	
		    JobDetail jobDetail = new JobDetail();
            JobDataMap jobDataMap = new JobDataMap();
            jobDataMap.put("response", plintronAsyncResponse);
            jobDataMap.put("count", 0);
            jobDetail.setJobDataMap(jobDataMap);
		    jobDetail.setName(plintronAsyncResponse.getReferenceNumber());
		    jobDetail.setGroup(ResourceUtil.get("commit.scheduler.instance.name"));
		    jobDetail.setJobClass(com.budgetprepay.scheduler.PlintronPortCSRFeedbackWorker.class);
		    long startTime = System.currentTimeMillis() + (second * 10L);
		    SimpleTrigger trigger = new SimpleTrigger();
		    trigger.setName(jobDetail.getName());
		    trigger.setJobGroup(jobDetail.getGroup());
		    trigger.setStartTime(new Date(startTime));
		    trigger.setEndTime(null);
		    trigger.setRepeatCount(0);
		    trigger.setRepeatInterval(0L);
            scheduler.scheduleJob(jobDetail, trigger);
            logger.info("Scheduling Plintron Port Feedback " + plintronAsyncResponse.getReferenceNumber() + " for " + trigger.getStartTime());
        }
        catch (Exception e) {
			logger.error("Unable to schedule Plintron Port Feedback " + plintronAsyncResponse.getReferenceNumber(), e);
        }
	}
	
	@SuppressWarnings("unchecked")
	public static List<JobExecutionContext> getCurrentlyExecutingJobs() throws Exception {
		try {
			return scheduler.getCurrentlyExecutingJobs();
		}
		catch (Exception e) {
			logger.error("Unable to determine currently executing jobs", e);
			throw new Exception("Unable to determine currently executing jobs", e);
		}
	}
	
	public static List<Trigger> getScheduledJobs() throws Exception {
		List<Trigger> list = new ArrayList<Trigger>();
		try {
			for (String group: scheduler.getJobGroupNames()) {
				for (String job : scheduler.getJobNames(group)) {
					list.addAll(Arrays.asList(scheduler.getTriggersOfJob(job, group)));
				}
			}
		}
		catch (Exception e) {
			logger.error("Unable to determine scheduled jobs", e);
			throw new Exception("Unable to determine scheduled jobs", e);
		}
		return list;
	}
	
	public static String getJobStatus(final String transactionId) throws Exception {
		String results = "Job " + transactionId + " is not running";
		try {
			for (Trigger scheduled : getScheduledJobs()) {
				if (scheduled.getName().equals(transactionId)) {
					results = "Job " + transactionId + " is scheduled";
					break;
				}
 			}
			
			for (JobExecutionContext running : getCurrentlyExecutingJobs()) {
				if (running.getJobDetail().getName().equals(transactionId)) {
					results = "Job " + transactionId + " is running";
					break;
				}
			}
		}
		catch (Exception e) {
			logger.error("Unable to determine currently executing/scheduled job for " + transactionId, e);
			throw new Exception("Unable to determine currently executing/scheduled job for " + transactionId, e);
		}
		return results;
	}
}

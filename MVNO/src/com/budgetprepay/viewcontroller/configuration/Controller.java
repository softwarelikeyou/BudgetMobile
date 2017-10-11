package com.budgetprepay.viewcontroller.configuration;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Center; 

import com.budgetprepay.scheduler.CommitScheduler;
import com.budgetprepay.scheduler.SchedulerInformation.JobInformation;
import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.WebUtil;

public class Controller extends BaseController {
	private static final long serialVersionUID = 1L;

	protected ServerInfoWindow serverInfoWindow;
	protected SchedulerInfoWindow schedulerInfoWindow;
	
	public void onServerInfoSetup(Event event) {
		Desktop desktop = Executions.getCurrent().getDesktop();
		Component parent = WebUtil.getComponentById(desktop, "centerPanel");

		if( parent == null )
			throw new IllegalArgumentException("Could not identify map panel");

		Center center = (Center) parent;
		center.getChildren().clear();
		
		serverInfoWindow = (ServerInfoWindow) Executions.createComponents("/Configuration/server-info.zul", center, null);
	}
	
	public void onShowSchedulerSetup(Event event) {
		Desktop desktop = Executions.getCurrent().getDesktop();
		Component parent = WebUtil.getComponentById(desktop, "centerPanel");

		if( parent == null )
			throw new IllegalArgumentException("Could not identify map panel");

		Center center = (Center) parent;
		center.getChildren().clear();
		
		schedulerInfoWindow = (SchedulerInfoWindow) Executions.createComponents("/Configuration/scheduler-info.zul", center, null);
	}
	
	public void onUnscheduleAnchorSetup(Event event) {
		JobInformation job = (JobInformation) event.getData();
		try {
			CommitScheduler.stopJob(job.getName());
			CommitScheduler.unScheduleJob(job.getName());
			schedulerInfoWindow.refresh();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

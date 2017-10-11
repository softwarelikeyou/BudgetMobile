package com.budgetprepay.viewcontroller.configuration;

import java.util.ArrayList;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zkplus.databind.BindingListModelList;
import org.zkoss.zul.ListModelList;

import com.budgetprepay.scheduler.SchedulerInformation;
import com.budgetprepay.scheduler.SchedulerInformation.JobInformation;
import com.budgetprepay.viewcontroller.BaseWindow;
import com.budgetprepay.viewcontroller.WebUtil;

public class SchedulerInfoWindow extends BaseWindow implements AfterCompose {
	static final long serialVersionUID = 1L;
	
	protected AnnotateDataBinder binder;
	protected SchedulerInfoWindow local;
	private SchedulerInformation schedulerInformation;
	
	private BindingListModelList scheduledJobsListModel = new BindingListModelList(new ArrayList<JobInformation>(), false);

	public ListModelList getScheduledJobsModel() {
		return scheduledJobsListModel;
	}
	
	public void afterCompose() {
		
		schedulerInformation = new SchedulerInformation();
		
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		local = this;
		
		updateScheduledJobListModel();
	
		AnnotateDataBinder binder = getBinder();
	
	    binder.loadAll();
	}
	
	protected void updateScheduledJobListModel() {
		scheduledJobsListModel.clear();
		scheduledJobsListModel.addAll(schedulerInformation.getScheduledJobs());
	}
	
	protected AnnotateDataBinder getBinder() { 
		
		if( binder == null ) { 
			binder = (AnnotateDataBinder) getAttributeOrFellow("binder", false);
			if( binder == null ) binder = new AnnotateDataBinder(this);
		}
		
		return binder;
	}
	
	public void onClick$unscheduleAnchor(Event event) {
		Events.postEvent(new Event("onUnscheduleAnchorSetup", null, (JobInformation) WebUtil.getRowBindingData(event)));
	}
	
	public void refresh() {
		updateScheduledJobListModel();
		binder.loadAll();	
	}

}

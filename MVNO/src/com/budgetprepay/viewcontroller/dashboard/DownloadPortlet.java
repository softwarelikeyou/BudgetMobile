package com.budgetprepay.viewcontroller.dashboard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Filedownload;
import org.zkoss.zul.Messagebox;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.Labels;
import com.budgetprepay.viewcontroller.SessionUtil;

public class DownloadPortlet extends DashboardPortlet {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private static DateFormat DASH_LONG_DATE = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss aa");
	private static DateFormat DASH_SHORT_DATE = new SimpleDateFormat("MM-dd-yyyy");
	
	protected Datebox startDatebox;
	protected Datebox endDatebox;
	
	protected AnnotateDataBinder binder;
	
	@Override
	protected String getPanelTitleI18NKey() {
		return Labels.DOWNLOAD_REQUESTS;
	}

	@Override
	public void onCreate() {
	    super.onCreate();
	    
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
	    binder = new AnnotateDataBinder(this);
	    binder.loadAll();
	}
	
	public void onClick$download(Event event) {	

	    String name = SessionUtil.getCurrentUser().getGroup().getName();
	    
		String fileName = name + DASH_SHORT_DATE.format(startDatebox.getValue()) + "to" + DASH_SHORT_DATE.format(endDatebox.getValue()) + ".csv";
		
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(startDatebox.getValue());

		Calendar endCal = Calendar.getInstance();
		endCal.setTime(endDatebox.getValue());

		startCal.set(Calendar.HOUR_OF_DAY, 0);
		startCal.set(Calendar.MINUTE, 0);
		startCal.set(Calendar.SECOND, 0);
    	
		endCal.set(Calendar.HOUR_OF_DAY, 23);
		endCal.set(Calendar.MINUTE, 59);
		endCal.set(Calendar.SECOND, 59);

		StringBuffer rows = null;
		
		try {
			List<Request> requests = RequestFacade.retrieveByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), startCal.getTime(), endCal.getTime());
			if (requests != null) {
				rows = writeRequests(requests);
			}
		}
		catch (Exception e) {
			try {
				Messagebox.show("Could not retrieve requests", "Error", Messagebox.OK, Messagebox.NONE);
			}
			catch( InterruptedException ex ) {
				ex.printStackTrace();
			}
		}
		
		if (rows == null) {
		    try {
				Messagebox.show("No request data was found", "Info", Messagebox.OK, Messagebox.NONE);
			}
			catch( InterruptedException ex ) {
				ex.printStackTrace();
			}
		    return;
		}
		
		try {
		    FileOutputStream fOut = new FileOutputStream(fileName);
		    fOut.write(rows.toString().getBytes());
		    fOut.flush();
		    fOut.close();
		    File file = new File(fileName);
	    	Filedownload.save(file, fileName);
		}
		catch (IOException e) {
		    try {
				Messagebox.show("Unable to download file", "Error", Messagebox.OK, Messagebox.NONE);
			}
			catch( InterruptedException ex ) {
				ex.printStackTrace();
			}
		    return;
		}	    
	}

	private StringBuffer writeRequests(final List<Request> list) {
		if (list == null)
			return null;
		
		StringBuffer rows = new StringBuffer();
		rows.append("id, mdn, created, user, clientReference, type, clientRequestXML" + "\n");
		
		for (Request request : list) {
		    rows.append(request.getId() + ",");
		    rows.append(request.getMdn() + ",");
			rows.append(request.getCreated() + ",");
			rows.append(request.getUser().getUsername() + ",");
			rows.append(request.getClientReference() + ",");
			rows.append(request.getType() + ",");
			rows.append(request.getClientRequestXML());
			rows.append("\n");
		}
		return rows;
	}

}

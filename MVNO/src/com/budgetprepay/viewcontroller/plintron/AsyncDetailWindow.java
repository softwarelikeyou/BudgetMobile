package com.budgetprepay.viewcontroller.plintron;

import org.zkoss.util.media.AMedia;
import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Iframe;
import org.zkoss.zul.Tab;

import com.budgetprepay.model.entity.PlintronAsyncResponse;
import com.budgetprepay.viewcontroller.BaseWindow;

public class AsyncDetailWindow extends BaseWindow implements AfterCompose {
	private static final long serialVersionUID = 1L;
	
	protected AnnotateDataBinder binder;

	Tab bodyTab;
	Tab responseTab;
	
	Iframe bodyiFrame;
	Iframe responseiFrame;
	
	private PlintronAsyncResponse request;
	
	public PlintronAsyncResponse getRequest() {
		return request;
	}
	
	public void setRequest(final PlintronAsyncResponse request) {
		this.request = request;
		

		if (request.getBody() != null) {
		    AMedia body = new AMedia(null, "text", "text/plain", request.getBody());
		    bodyiFrame.setContent(body);
		}
		
		if (request.getResponse() != null) {
		    AMedia response = new AMedia(null, "text", "text/plain", request.getResponse());
		    responseiFrame.setContent(response);
		}
	
		if( binder == null ) binder = new AnnotateDataBinder(this);
		binder.bindBean("request", request);
		binder.loadAll();
	}
	
	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}
}

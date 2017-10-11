package com.budgetprepay.viewcontroller.request;

import org.zkoss.util.media.AMedia;
import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Iframe;
import org.zkoss.zul.Tab;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.viewcontroller.BaseWindow;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Labels;

public class DetailWindow extends BaseWindow implements AfterCompose {
	private static final long serialVersionUID = 1L;
	
	protected AnnotateDataBinder binder;

	Tab clientRequestTab;
	Tab verizonSynchronousRequestTab;
	Tab verizonSynchronousResponseTab;
	Tab clientSynchronousResponseTab;
	Tab verizonAsynchronousResponseTab;
	Tab clientAsynchronousResponseTab;
	
	Iframe clientRequestiFrame;
	Iframe verizonSynchronousRequestiFrame;
	Iframe verizonSynchronousResponseiFrame;
	Iframe clientSynchronousResponseiFrame;
	Iframe verizonAsynchronousResponseiFrame;
	Iframe clientAsynchronousResponseiFrame;
	
	private Request request;
	
	public Request getRequest() {
		return request;
	}
	
	private String getPackageName(final Request request) {
		try {
		    if (Class.forName(request.getClientRequestClass()).getPackage().getName().endsWith("plintron"))
		        return "plintron";
		    if (Class.forName(request.getClientRequestClass()).getPackage().getName().endsWith("topup"))
		        return "topup";
		    if (Class.forName(request.getClientRequestClass()).getPackage().getName().endsWith("verizon"))
		        return "verizon";
		}
		catch (Exception e) {
			;
		}
		return "verizon";
	}
	
	private String getTabLabel(final String name, final Request request) {
		String result = "";
			
		switch (name) {
		    case "clientRequestTab":
		    	result = Labels.CLIENT_REQUEST;
		    	break;
		    case "verizonSynchronousRequestTab":
		    	switch (getPackageName(request)) {
    	    	    case "plintron":
    	    		    result = Labels.PLINTRON_SYNCHRONOUS_REQUEST;
    	    		    break;
	    	    	case "topup":
	    	    		result = Labels.TOPUP_SYNCHRONOUS_REQUEST;
	    	    		break;
	    	    	case "verizon":
	    	    		result = Labels.VERIZON_SYNCHRONOUS_REQUEST;
	    	    		break;
		    	}
		    	break;
		    case "verizonSynchronousResponseTab":
		    	switch (getPackageName(request)) {
    	    	    case "plintron":
    	    		    result = Labels.PLINTRON_SYNCHRONOUS_RESPONSE;
    	    		    break;		    	
	    	    	case "topup":
	    	    		result = Labels.TOPUP_SYNCHRONOUS_RESPONSE;
	    	    		break;
	    	    	case "verizon":
	    	    		result = Labels.VERIZON_SYNCHRONOUS_RESPONSE;
	    	    		break;
		    	}
		    	break;
		    case "clientSynchronousResponseTab":
		    	result = Labels.CLIENT_SYNCHRONOUS_RESPONSE;
		    	break;
		    case "verizonAsynchronousResponseTab":
		    	switch (getPackageName(request)) {
    	    	    case "plintron":
    	    		    result = Labels.PLINTRON_ASYNCHRONOUS_RESPONSE;
    	    		    break;
	    	    	case "topup":
	    	    		result = Labels.TOPUP_COMMIT_REQUEST;
	    	    		break;
	    	    	case "verizon":
	    	    		result = Labels.VERIZON_ASYNCHRONOUS_RESPONSE;
	    	    		break;
		    	}
		    	break;
		    case "clientAsynchronousResponseTab":
		    	switch (getPackageName(request)) {
	    		    case "plintron":
	    			    result = Labels.CLIENT_ASYNCHRONOUS_RESPONSE;
	    			    break;
    	    		case "topup":
    	    			result = Labels.TOPUP_COMMIT_RESPONSE;
    	    			break;
    	    		case "verizon":
    	    			result = Labels.CLIENT_ASYNCHRONOUS_RESPONSE;
    	    			break;
		    	}
		    	break;
				
		}
		
		return ELFunctions.getLabel(result);
	}
	
	public void setRequest(final Request request) {
		this.request = request;
		

		if (request.getClientRequestXML() != null) {
		    AMedia clientRequestXML = new AMedia(null, "text", "text/plain", request.getClientRequestXML());
		    clientRequestiFrame.setContent(clientRequestXML);
		}
		
		if (request.getVerizonSynchronousRequestXML() != null) {
		    AMedia verizonSynchronousRequestXML = new AMedia(null, "text", "text/plain", request.getVerizonSynchronousRequestXML());
		    verizonSynchronousRequestiFrame.setContent(verizonSynchronousRequestXML);
		}
		
		if (request.getVerizonSynchronousResponseXML() != null) {
		    AMedia verizonSynchronousResponseXML = new AMedia(null, "text", "text/plain", request.getVerizonSynchronousResponseXML());
		    verizonSynchronousResponseiFrame.setContent(verizonSynchronousResponseXML);
		}
		
		if (request.getClientSynchronousResponseXML() != null) {
		    AMedia clientSynchronousResponseXML = new AMedia(null, "text", "text/plain", request.getClientSynchronousResponseXML());
		    clientSynchronousResponseiFrame.setContent(clientSynchronousResponseXML);
		}
		
		if (request.getVerizonAsynchronousResponseXML() != null) {
		    AMedia verizonAsynchronousResponseXML = new AMedia(null, "text", "text/plain", request.getVerizonAsynchronousResponseXML());
		    verizonAsynchronousResponseiFrame.setContent(verizonAsynchronousResponseXML);
		}
		
		if (request.getClientAsynchronousResponseXML() != null) {
		    AMedia clientAsynchronousResponseXML = new AMedia(null, "text", "text/plain", request.getClientAsynchronousResponseXML());
		    clientAsynchronousResponseiFrame.setContent(clientAsynchronousResponseXML);
		}
		
		clientRequestTab.setLabel(getTabLabel("clientRequestTab", request));
		clientRequestTab.setTooltiptext(clientRequestTab.getLabel());
		
		verizonSynchronousRequestTab.setLabel(getTabLabel("verizonSynchronousRequestTab", request));
		verizonSynchronousRequestTab.setTooltiptext(verizonSynchronousRequestTab.getLabel());
		
		verizonSynchronousResponseTab.setLabel(getTabLabel("verizonSynchronousResponseTab", request));
		verizonSynchronousResponseTab.setTooltiptext(verizonSynchronousResponseTab.getLabel());
		
		clientSynchronousResponseTab.setLabel(getTabLabel("clientSynchronousResponseTab", request));
		clientSynchronousResponseTab.setTooltiptext(clientSynchronousResponseTab.getLabel());
		
		verizonAsynchronousResponseTab.setLabel(getTabLabel("verizonAsynchronousResponseTab", request));
		verizonAsynchronousResponseTab.setTooltiptext(verizonAsynchronousResponseTab.getLabel());
		
		clientAsynchronousResponseTab.setLabel(getTabLabel("clientAsynchronousResponseTab", request));
		clientAsynchronousResponseTab.setTooltiptext(clientAsynchronousResponseTab.getLabel());
	
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

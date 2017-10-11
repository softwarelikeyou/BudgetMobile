package com.budgetprepay.viewcontroller.plintron;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.WrongValuesException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;

public class ChangeMSISDNWindow extends Window implements AfterCompose {

	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	protected Textbox mdn;
	    
	protected Textbox newMdn;
	
	protected Textbox imsi;
	
	protected Textbox iccid;
	
	protected Textbox portInFlag;
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}
	
	public String getMdn() {
		return mdn.getValue();
	}

	public String getImsi() {
		return imsi.getValue();
	}
	
	public String getIccid() {
		return iccid.getValue();
	}
	
	public String getPortInFlag() {
		return portInFlag.getValue();
	}
	
	public String getNewMdn() {
		return newMdn.getValue();
	}
	
	public void validate() throws WrongValuesException {			
		
		List<WrongValueException> exs = new ArrayList<WrongValueException>();
			
		try { 
			newMdn.getValue();
			newMdn.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(newMdn, ELFunctions.getMessage(Messages.NEW_MDN_CANNOT_BE_EMPTY)));
		}
		
		try { 
			imsi.getValue();
			imsi.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(imsi, ELFunctions.getMessage(Messages.IMSI_CANNOT_BE_EMPTY)));
		}
		
		try { 
			portInFlag.getValue();
			portInFlag.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(portInFlag, ELFunctions.getMessage(Messages.PORTINFLAG_CANNOT_BE_EMPTY)));
		}
		
	    if( !exs.isEmpty() ) throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));
	}
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}

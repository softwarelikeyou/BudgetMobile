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

public class ReplaceMSISDNWindow extends Window implements AfterCompose {

	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	protected Textbox mdn;
	    
	protected Textbox imsi;
	
	protected Textbox iccid;
	
	protected Textbox zipCode;
	
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
	
	public String getZipCode() {
		return zipCode.getValue();
	}
	
	public void validate() throws WrongValuesException {			
		
		List<WrongValueException> exs = new ArrayList<WrongValueException>();
			
		try { 
			mdn.getValue();
			mdn.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(mdn, ELFunctions.getMessage(Messages.MDN_CANNOT_BE_EMPTY)));
		}
		
		if (imsi.getValue().isEmpty() == true && iccid.getValue().isEmpty() == true)
			exs.add(new WrongValueException(imsi, ELFunctions.getMessage(Messages.BOTH_IMSI_AND_ICCID_CANNOT_BE_EMPTY)));
		
		try { 
			zipCode.getValue();
			zipCode.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(zipCode, ELFunctions.getMessage(Messages.ZIPCODE_CANNOT_BE_EMPTY)));
		}
		
	    if( !exs.isEmpty() ) throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));
	}
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}
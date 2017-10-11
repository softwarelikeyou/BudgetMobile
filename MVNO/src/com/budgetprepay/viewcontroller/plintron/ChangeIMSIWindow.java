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

public class ChangeIMSIWindow extends Window implements AfterCompose {

	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	protected Textbox mdn;
	    
	protected Textbox newImsi;
	
	protected Textbox oldImsi;
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}
	
	public String getMdn() {
		return mdn.getValue();
	}

	public String getNewImsi() {
		return newImsi.getValue();
	}
	
	public String getOldImsi() {
		return oldImsi.getValue();
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
		
		try { 
			newImsi.getValue();
			newImsi.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(newImsi, ELFunctions.getMessage(Messages.NEW_IMSI_CANNOT_BE_EMPTY)));
		}
		
		try { 
			oldImsi.getValue();
			oldImsi.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(oldImsi, ELFunctions.getMessage(Messages.OLD_IMSI_CANNOT_BE_EMPTY)));
		}
		
	    if( !exs.isEmpty() ) throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));
	}
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}

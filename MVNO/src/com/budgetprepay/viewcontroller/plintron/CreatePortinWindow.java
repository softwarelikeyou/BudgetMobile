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

public class CreatePortinWindow extends Window implements AfterCompose {

	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	 protected Textbox mdn;
	 protected Textbox name;
	 protected Textbox address1;
	 protected Textbox city;
	 protected Textbox state;
	 protected Textbox zip;
	 protected Textbox sim;
	 protected Textbox accountNumber;
	 protected Textbox accountPin;
	    
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}
	
	public String getMdn() {
		return mdn.getValue();
	}
	
	public String getName() {
		return name.getValue();
	}
	
	public String getAddress1() {
		return address1.getValue();
	}
	
	public String getCity() {
		return city.getValue();
	}
	
	public String getState() {
		return state.getValue();
	}
	public String getZip() {
		return zip.getValue();
	}
	
	public String getSim() {
		return sim.getValue();
	}
	
	public String getAccountNumber() {
		return accountNumber.getValue();
	}
	public String getAccountPin() {
		return accountPin.getValue();
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
			sim.getValue();
			sim.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(sim, ELFunctions.getMessage(Messages.SIM_CANNOT_BE_EMPTY)));
		}
		
		try { 
			name.getValue();
			name.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(name, ELFunctions.getMessage(Messages.NAME_CANNOT_BE_EMPTY)));
		}
		
	    if( !exs.isEmpty() ) throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));
	}
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}

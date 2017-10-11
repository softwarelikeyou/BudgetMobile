package com.budgetprepay.viewcontroller.plintron;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.WrongValuesException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;

public class BlockUnblockSIMWindow extends Window implements AfterCompose {

	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	protected Textbox mdn;
	
	protected Combobox setFlag;
	
	protected Combobox operationCode;
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}
	
	public String getMdn() {
		return mdn.getValue();
	}
	
	public String getSetFlag() {
		return setFlag.getSelectedItem().getValue().toString();
	}
	
	public String getOperationCode() {
		return operationCode.getValue().toString();
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
		    setFlag.getSelectedItem().getValue();
		}
		catch (Exception e) {
			exs.add(new WrongValueException(setFlag, ELFunctions.getMessage(Messages.SET_FLAG_CANNOT_BE_EMPTY)));
		}
		
		try {
		    operationCode.getSelectedItem().getValue();
		}
		catch (Exception e) {
			exs.add(new WrongValueException(operationCode, ELFunctions.getMessage(Messages.OPERATION_CODE_CANNOT_BE_EMPTY)));
		}
		
	    if( !exs.isEmpty() ) throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));
	}
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}

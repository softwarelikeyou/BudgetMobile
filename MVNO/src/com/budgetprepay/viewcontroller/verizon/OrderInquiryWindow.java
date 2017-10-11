package com.budgetprepay.viewcontroller.verizon;

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

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;

public class OrderInquiryWindow extends Window implements AfterCompose {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	protected Combobox classOfService;
	
	protected Textbox referenceNumber;
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}
	
	public ClassOfService getClassOfService() {
		return (ClassOfService) classOfService.getSelectedItem().getValue();
	}
	
	public String getReferenceNumber() {
		return referenceNumber.getValue();
	}
	
	public void validate() throws WrongValuesException { 
		
		List<WrongValueException> exs = new ArrayList<WrongValueException>();
	
		try {
		    classOfService.getSelectedItem().getValue();
		}
		catch (Exception e) {
			exs.add(new WrongValueException(classOfService, ELFunctions.getMessage(Messages.CLASS_OF_SERVICE_CANNOT_BE_EMPTY)));
		}
			
		try { 
			referenceNumber.getValue();
			referenceNumber.getValue().isEmpty();
		}
		catch(WrongValueException ex) { 
			exs.add(new WrongValueException(referenceNumber, ELFunctions.getMessage(Messages.REFERENCE_NUMBER_CANNOT_BE_EMPTY)));
		}
		
		if( !exs.isEmpty() ) throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));
	}
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}

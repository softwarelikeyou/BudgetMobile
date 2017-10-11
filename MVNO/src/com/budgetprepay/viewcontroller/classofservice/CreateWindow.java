package com.budgetprepay.viewcontroller.classofservice;

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

public class CreateWindow extends Window implements AfterCompose {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	private Textbox name;
	private Textbox ratePlan;
	
	public String getName() { 
		return name.getValue();
	}
	
	public String getRatePlan() { 
		return ratePlan.getValue();
	}
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}
	
	public void validate() throws WrongValuesException { 
		
		List<WrongValueException> exs = new ArrayList<WrongValueException>();
	
		try { 
			name.getValue();
		}
		catch(WrongValueException ex) { 
			exs.add(ex);
		}
		
		try {
			 ratePlan.getValue();
		}
		catch(WrongValueException ex) {
			exs.add(ex);
		}
		
		if( !exs.isEmpty() ) throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));
	}
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}

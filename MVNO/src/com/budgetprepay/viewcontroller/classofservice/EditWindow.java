package com.budgetprepay.viewcontroller.classofservice;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.WrongValuesException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Caption;
import org.zkoss.zul.Textbox;

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.viewcontroller.BaseWindow;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Labels;

public class EditWindow extends BaseWindow implements AfterCompose {
	private static final long serialVersionUID = 1L;

	private Textbox name;
	private Textbox ratePlan;
	private Caption caption;
	private ClassOfService classOfService;
	
	protected AnnotateDataBinder binder;
	
	public void setClassOfService(final ClassOfService classOfService) {
		this.classOfService = classOfService;
		caption.setLabel(ELFunctions.getLabel(Labels.EDIT_CLASSOFSERVICE) + ": " + classOfService.getName());
		name.setValue(classOfService.getName());
		ratePlan.setValue(classOfService.getRatePlan());
	}
	
	public ClassOfService getClassOfService() {
		classOfService.setName(name.getValue());
		classOfService.setRatePlan(ratePlan.getValue());
		return classOfService;
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
	
	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}		
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}
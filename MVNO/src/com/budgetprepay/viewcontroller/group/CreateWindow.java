package com.budgetprepay.viewcontroller.group;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.WrongValuesException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zkplus.databind.BindingListModelList;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.entity.Group;
import com.budgetprepay.viewcontroller.WebUtil;

public class CreateWindow extends Window implements AfterCompose {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	private Group group = new Group();
	
	private Textbox name;
	private Textbox display;
	private Textbox accountNumber;
	private Combobox classOfServices;
	private Intbox resellerId;
	private Grid classOfServicesGrid;
	private ListModelList classOfServicesModel = new BindingListModelList(new ArrayList<ClassOfService>(), true); 
	
	public String getName() { 
		return name.getValue();
	}
	
	public String getDisplay() { 
		return display.getValue();
	}
	
	public String getAccountNumber() {
		return accountNumber.getValue();
	}
	
	public Integer getResellerId() {
		return resellerId.getValue();
	}
	
	@SuppressWarnings("unchecked")
	public List<ClassOfService> getClassOfServices() {
        return (List<ClassOfService>) ((ListModelList) classOfServicesGrid.getModel()).getInnerList();
	}
	
	public ListModelList getClassOfServicesModel() {
		return classOfServicesModel;
	}

	public void setClassOfServicesModel(ListModelList classOfServicesModel) {
		this.classOfServicesModel = classOfServicesModel;
	}
	
	public void onOK$classOfServices(Event event) {
		addClassOfService(event);
	}

	@SuppressWarnings("unchecked")
	public void onClick$addClassOfServiceButton(Event event) {
		addClassOfService(event);
		group.getClassOfServices().clear();
		group.setClassOfServices(new HashSet<ClassOfService>(classOfServicesModel.getInnerList()));
	}

	protected void addClassOfService(Event event) {
		if(classOfServices.getSelectedItem() == null ) return;
		ClassOfService classOfService = (ClassOfService) classOfServices.getSelectedItem().getValue();
		if (!classOfServicesModel.contains(classOfService)) 
			classOfServicesModel.add(classOfService);
		binder.loadComponent(classOfServicesGrid);
	}

	public void onClick$removeClassOfServiceButton(Event event) {
		ClassOfService classOfService = (ClassOfService) WebUtil.getRowBindingData(event);
		if (classOfServicesModel.contains(classOfService)) 
			classOfServicesModel.remove(classOfService);
		binder.loadComponent(classOfServicesGrid);
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
			 display.getValue();
		}
		catch(WrongValueException ex) {
			exs.add(ex);
		}
		
		try {
			 accountNumber.getValue();
		}
		catch(WrongValueException ex) {
			exs.add(ex);
		}
		
		try {
			 resellerId.getValue();
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

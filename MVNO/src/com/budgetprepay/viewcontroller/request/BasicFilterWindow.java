package com.budgetprepay.viewcontroller.request;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.WrongValuesException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.viewcontroller.filter.StringFilter;
import com.budgetprepay.viewcontroller.filter.StringFilterType;

public class BasicFilterWindow extends Window implements AfterCompose {

	static final long serialVersionUID = 1L;

	protected Checkbox mdnCheckbox;
	protected Combobox mdnType;
	protected Textbox mdn;

	protected Checkbox clientReferenceCheckbox;
	protected Combobox clientReferenceType;
	protected Textbox clientReference;
	
	protected AnnotateDataBinder binder;

	public void afterCompose() {

		Components.wireVariables(this, this);
		Components.addForwards(this, this);

		binder = new AnnotateDataBinder(this);
		binder.loadAll();

	}

	public void onClick$cancelButton(Event event) {
		this.detach();
	}

	public void validate() throws WrongValuesException {

	}

	public void onCreate$mdnType(Event event) {
		mdnType.setSelectedIndex(0);
	}

	public void onCheck$mdnCheckbox(Event event) {
		if (mdnCheckbox.isChecked() ) mdn.setFocus(true);
	}

	public void onCreate$clientReferenceType(Event event) {
		clientReferenceType.setSelectedIndex(0);
	}

	public void onCheck$clientReferenceCheckbox(Event event) {
		if (clientReferenceCheckbox.isChecked() ) clientReference.setFocus(true);
	}
	
	public RequestListFilter getListFilter() {

		RequestListFilter filter = new RequestListFilter();

		if (mdnCheckbox.isChecked()) {
			StringFilter mdnFilter = new StringFilter();
			mdnFilter.setFilterType((StringFilterType) mdnType.getSelectedItem().getValue());
			mdnFilter.setValue(mdn.getValue().trim());
			filter.addPropertyFilter(Request.MDN_PARAM, mdnFilter);
		}
		
		if (clientReferenceCheckbox.isChecked()) {
			StringFilter clientReferenceFilter = new StringFilter();
			clientReferenceFilter.setFilterType((StringFilterType) clientReferenceType.getSelectedItem().getValue());
			clientReferenceFilter.setValue(clientReference.getValue().trim());
			filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
		}
		
		return filter;
	}

}

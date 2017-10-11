package com.budgetprepay.viewcontroller.user;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.WrongValuesException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zkplus.databind.BindingListModelList;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.entity.User.UserType;
import com.budgetprepay.model.facade.GroupFacade;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.WebUtil;

public class CreateWindow extends Window implements AfterCompose {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	private Textbox username;
	private Textbox display;
	private Textbox email;
	private Textbox password;
	private Textbox confirmPassword;
	private boolean passFocused;
	private boolean confirmFocused;
	private Radiogroup userType;
	private Combobox groups;
	
	protected ListModelList groupsModel = new BindingListModelList(new ArrayList<Group>(), true);
	
	@SuppressWarnings("unchecked")
	public List<Group> getGroups() {
		return (List<Group>) groupsModel.getInnerList();
	}
	
	public ListModelList getGroupsModel() {
		return groupsModel;
	}

	public void setGroupsModel(ListModelList groupsModel) {
		this.groupsModel = groupsModel;
	}
	
	protected void updateGroupsListModel() {
		groupsModel.clear();
	    groupsModel.addAll(getFullGroupsList());
	}
	
	public String getUsername() { 
		return username.getValue();
	}
	
	public String getDisplay() { 
		return display.getValue();
	}
	
	public String getEmail() { 
		return email.getValue();
	}
	
	public String getPassword() { 
		return password.getValue();
	}
	
	public UserType getUserType() {
		return UserType.valueOf((String) userType.getSelectedItem().getValue());
	}
	
	public Group getGroup() {
		return (Group) groups.getSelectedItem().getValue();
	}
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
		
		updateGroupsListModel();
	}

	public void onFocus$password(Event event) {
		passFocused = true;
	}
	
	public void onFocus$confirmPassword(Event event) {
		confirmFocused = true;
	}
	
	protected List<Group> getFullGroupsList() {
		List<Group> groups = null;
		try {
		    groups = GroupFacade.retrieveAll();
		}
		catch (Exception e) {
			;
		}
		return groups;
	}
	
	public void validate() throws WrongValuesException { 
		
		List<WrongValueException> exs = new ArrayList<WrongValueException>();
	
		try { 
			username.getValue();
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
			validatePasswordFields();
		}
		catch(WrongValuesException ex) {
			for( WrongValueException e : ex.getWrongValueExceptions() ) { 
				exs.add(e);
			}
		}
		
		if( !exs.isEmpty() ) throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));
	}
	
	private void validatePasswordFields() throws WrongValuesException { 
		
		WebUtil.clearWrongValue(password);
		WebUtil.clearWrongValue(confirmPassword);
		
		String pass = password.getRawText();
		String confirm = confirmPassword.getRawText();
		
		List<WrongValueException> exs = new ArrayList<WrongValueException>();
		
		if( passFocused && (pass == null || pass.trim().equals("")) ) { 
			exs.add(new WrongValueException(password, ELFunctions.getMessage(Messages.PASSWORD_CANNOT_BE_EMPTY)));
		}
		
		if( confirmFocused && (confirm == null || confirm.trim().equals("")) ) { 
			exs.add(new WrongValueException(confirmPassword, ELFunctions.getMessage(Messages.PASSWORD_CANNOT_BE_EMPTY)));
		}
		
		if( passFocused && confirmFocused && exs.isEmpty() && !pass.trim().equals(confirm.trim()) ) { 
			exs.add(new WrongValueException(password, ELFunctions.getMessage(Messages.PASSWORDS_DONT_MATCH)));
			exs.add(new WrongValueException(confirmPassword, ELFunctions.getMessage(Messages.PASSWORDS_DONT_MATCH)));
		}

		if( !exs.isEmpty() )
			throw new WrongValuesException(exs.toArray(new WrongValueException[]{}));	
	}
	
	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}

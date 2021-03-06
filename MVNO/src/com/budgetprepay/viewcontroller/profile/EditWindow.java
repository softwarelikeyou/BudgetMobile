package com.budgetprepay.viewcontroller.profile;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.WrongValuesException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.SessionUtil;
import com.budgetprepay.viewcontroller.WebUtil;

public class EditWindow extends Window implements AfterCompose {
	private static final long serialVersionUID = 1L;

	private Textbox display;
	private Textbox password;
	private Textbox confirmPassword;
	private boolean passFocused;
	private boolean confirmFocused;
	
	public String getUsername() { 
		return SessionUtil.getCurrentUsername();
	}
	
	public String getDisplay() { 
		return display.getValue();
	}
	
	public String getPassword() { 
		return password.getValue();
	}
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
	}
	
	public void onFocus$password(Event event) {
		passFocused = true;
	}
	
	public void onFocus$confirmPassword(Event event) {
		confirmFocused = true;
	}
	
	public void validate() throws WrongValuesException { 
		
		List<WrongValueException> exs = new ArrayList<WrongValueException>();
		
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
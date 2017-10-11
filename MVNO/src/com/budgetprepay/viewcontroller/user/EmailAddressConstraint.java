package com.budgetprepay.viewcontroller.user;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.Constraint;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.WebConstants;

public class EmailAddressConstraint implements Constraint {
	
	public void validate(Component comp, Object value) throws WrongValueException {
		if( value == null || ((String) value).trim().isEmpty() )
			throw new WrongValueException(comp, "Email can not be empty");
		
		String string = ((String) value).trim();
		if( !WebConstants.EMAIL_ADDRESS_PATTERN.matcher(string).matches() )
			throw new WrongValueException(comp, "Invalid email address");
	
		User user = null;
		try {
			user = UserFacade.retrieveByEmail(value.toString());
		}
		catch (Exception e) {
			throw new WrongValueException(comp, "Invalid email address");
		}
		
		if( user != null ) { 
		    throw new WrongValueException(comp, "Email address in use");	
		}
	}
}

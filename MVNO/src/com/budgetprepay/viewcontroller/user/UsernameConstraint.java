package com.budgetprepay.viewcontroller.user;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.Constraint;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;

public class UsernameConstraint implements Constraint {
	
	public void validate(Component comp, Object value) throws WrongValueException {
		if( value == null || ((String) value).trim().isEmpty() )
			throw new WrongValueException(comp, ELFunctions.getMessage(Messages.NAME_CANNOT_BE_EMPTY));
		
		try {
		     User user = UserFacade.retrieveByUsername(value.toString());
		
		    if( user != null ) { 
		        throw new WrongValueException(comp, ELFunctions.getMessage(Messages.NAME_IS_IN_USE));	
		    }
		}
		catch (Exception e) {
			;
		}
	}
}

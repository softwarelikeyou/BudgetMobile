package com.budgetprepay.viewcontroller.classofservice;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.Constraint;

import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;

public class PlanCodeConstraint implements Constraint {

	public void validate(Component comp, Object value) throws WrongValueException {
		if( value == null || ((String) value).trim().isEmpty() )
			throw new WrongValueException(comp, ELFunctions.getMessage(Messages.PLAN_CODE_CANNOT_BE_EMPTY));
	}
}

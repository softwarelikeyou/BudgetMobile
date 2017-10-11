package com.budgetprepay.viewcontroller.user;

import org.zkoss.zk.ui.Component;
import org.zkoss.zkplus.databind.TypeConverter;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Labels;

public class UserTypeConverter implements TypeConverter {

	public static String getString(User user) { 
		if (user.isAdministrator()) 
			return ELFunctions.getLabel(Labels.ADMINISTRATOR) ;
			
		if (user.isSales()) 
			return ELFunctions.getLabel(Labels.SALES);
		
		return ELFunctions.getLabel(Labels.READ_ONLY);
	}
	
	public Object coerceToBean(Object arg0, Component arg1) {
		return null;
	}

	public Object coerceToUi(Object value, Component comp) {
		if( value == null ) return "";
		
		if( value instanceof User ) 
			return getString((User) value);			
		
		throw new IllegalArgumentException("object:" + value + " of type:" + value.getClass().getName() + "; expected type: " + User.class.getName() + " or " + User.class.getName());
	}

}

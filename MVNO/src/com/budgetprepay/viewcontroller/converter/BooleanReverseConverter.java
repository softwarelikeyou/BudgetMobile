package com.budgetprepay.viewcontroller.converter;

import java.io.Serializable;

import org.zkoss.zk.ui.Component;
import org.zkoss.zkplus.databind.TypeConverter;

public class BooleanReverseConverter implements TypeConverter, Serializable {

	private static final long serialVersionUID = 1L;

	public BooleanReverseConverter() {
    	
    }
    public Object coerceToBean(Object arg0, Component arg1) {
		if (arg0 == null) return null;
		return ((Boolean) arg0) ? false : true;
    }

    public Object coerceToUi(Object arg0, Component arg1) {
		if (arg0 == null) return true;
		return ((Boolean) arg0) ? false : true;
    } 

}

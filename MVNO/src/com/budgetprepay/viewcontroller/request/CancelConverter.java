package com.budgetprepay.viewcontroller.request;

import org.zkoss.zk.ui.Component;
import org.zkoss.zkplus.databind.TypeConverter;

public class CancelConverter implements TypeConverter {

    public CancelConverter() {
    	
    }
    public Object coerceToBean(Object object, Component component) {
		if (object == null) return null;
		return ((Boolean) object) ? false : true;
    }

    public Object coerceToUi(Object object, Component component) {
		if (object == null) return true;
		return ((Boolean) object) ? false : true;
    } 

}

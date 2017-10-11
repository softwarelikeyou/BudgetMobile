package com.budgetprepay.viewcontroller.request;

import org.zkoss.zk.ui.Component;
import org.zkoss.zkplus.databind.TypeConverter;

import com.budgetprepay.model.entity.Request.RequestType;

public class TypeNameConverter implements TypeConverter {

    public TypeNameConverter() {
    	
    }
    public Object coerceToBean(Object object, Component component) {
		if( object == null ) return "";
		
		if( object instanceof RequestType ) { 
			RequestType type = (RequestType) object;
			return type.name();
		}

		throw new IllegalArgumentException("object:" + object + " of type:" + object.getClass().getName() + "; expected type: " + RequestType.class.getName());        
	}

    public Object coerceToUi(Object object, Component component) {
		if( object == null ) return "";
		
		if( object instanceof RequestType ) { 
			RequestType type = (RequestType) object;
			return type.name();
		}

		throw new IllegalArgumentException("object:" + object + " of type:" + object.getClass().getName() + "; expected type: " + RequestType.class.getName());        
	}

}

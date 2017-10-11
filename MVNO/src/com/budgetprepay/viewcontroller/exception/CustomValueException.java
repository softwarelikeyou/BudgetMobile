package com.budgetprepay.viewcontroller.exception;

import java.io.Serializable;

public class CustomValueException extends LocalizedException { 
	private static final long	serialVersionUID	= 1L;

	public CustomValueException() {
		super();
	}
	
	public CustomValueException(String msg) {
		super(msg);
	}
	
	public CustomValueException(String msgKey, Serializable... varargs) {
		super(msgKey, varargs);
	}
	
	public CustomValueException(Throwable t, String msgKey) {
		super(t, msgKey);
	}

	public CustomValueException(Throwable t, String msgKey, Serializable... varargs) {
		super(t, msgKey, varargs);
	}	
	
	public CustomValueException(Throwable t) {
		super(t);
	}		
	
}

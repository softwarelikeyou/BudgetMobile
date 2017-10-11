package com.budgetprepay.webservice;

import org.apache.ws.security.WSConstants;
import org.apache.ws.security.WSSConfig;
import org.apache.ws.security.WSSecurityEngine;
import org.springframework.stereotype.Component;

@Component("myWssConfig")
public class MyWssConfig extends WSSConfig {
	public MyWssConfig() {
		setValidator(WSSecurityEngine.USERNAME_TOKEN, new MyUsernameTokenValidator());
		setRequiredPasswordType(WSConstants.PASSWORD_TEXT);
	}
}
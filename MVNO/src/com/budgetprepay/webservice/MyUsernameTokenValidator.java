package com.budgetprepay.webservice;

import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.handler.RequestData;
import org.apache.ws.security.message.token.UsernameToken;
import org.apache.ws.security.validate.UsernameTokenValidator;

import com.budgetprepay.model.entity.PasswordEncoder;

public class MyUsernameTokenValidator extends UsernameTokenValidator  {
	@Override
	protected void verifyPlaintextPassword(UsernameToken usernameToken, RequestData data) throws WSSecurityException {
		if (usernameToken != null && usernameToken.getPassword() != null) {
			try {
				usernameToken.setPassword(new PasswordEncoder().encodePassword(usernameToken.getPassword(), null));
			} 
			catch (Exception e) {
				throw new WSSecurityException(e.getMessage());
			}
		}
		super.verifyDigestPassword(usernameToken, data);
	}
}

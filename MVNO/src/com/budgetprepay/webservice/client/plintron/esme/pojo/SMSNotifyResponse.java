package com.budgetprepay.webservice.client.plintron.esme.pojo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SMSNotifyResponse {

	private String TRANSACTIONID;
	
	private String Code;
	
	public String getTRANSACTIONID() {
		return TRANSACTIONID;
	}
	
	public void setTRANSACTIONID(String tRANSACTIONID) {
		TRANSACTIONID = tRANSACTIONID;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}


	public static SMSNotifyResponse parse(final String response) throws Exception {
		SMSNotifyResponse results = new SMSNotifyResponse();
		results.setCode(parseCode(response));
		results.setTRANSACTIONID(parseTransactionId(response));
		return results;
	}
	
	public static String parseCode(final String response) throws Exception {
		Pattern regex = Pattern.compile("<Code>(\\d+)</Code>");
		Matcher matcher = regex.matcher(response);
		if (matcher.find()) {
			String match = matcher.group(0);
			match = match.replaceAll("<Code>", "");
			return match.replaceAll("</Code>", "");
		}
		else
			return null;
	}
	
	public static String parseTransactionId(final String response) throws Exception {
		Pattern regex = Pattern.compile("<TRANSACTIONID>(.*)</TRANSACTIONID>");
		Matcher matcher = regex.matcher(response);
		if (matcher.find()) {
			String match = matcher.group(0);
			match = match.replaceAll("<TRANSACTIONID>", "");
			return match.replaceAll("</TRANSACTIONID>", "");
		}
		else
			return null;
	}
}

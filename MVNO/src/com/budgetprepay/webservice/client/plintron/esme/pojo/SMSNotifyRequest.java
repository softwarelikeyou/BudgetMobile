package com.budgetprepay.webservice.client.plintron.esme.pojo;

public class SMSNotifyRequest {

	private String DestAddr;
	private String TRANSACTIONID;
	private String DataCoding;
	private String ValidityPeriod;
	private String ScheduledDelivery;
	private String ServiceType;
	private String SenderTON;
	private String Sender;
	private String Text;

	public String getDestAddr() {
		return DestAddr;
	}

	public void setDestAddr(String destAddr) {
		DestAddr = destAddr;
	}

	public String getTRANSACTIONID() {
		return TRANSACTIONID;
	}

	public void setTRANSACTIONID(String tRANSACTIONID) {
		TRANSACTIONID = tRANSACTIONID;
	}

	public String getDataCoding() {
		return DataCoding;
	}

	public void setDataCoding(String dataCoding) {
		DataCoding = dataCoding;
	}

	public String getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		ValidityPeriod = validityPeriod;
	}

	public String getScheduledDelivery() {
		return ScheduledDelivery;
	}

	public void setScheduledDelivery(String scheduledDelivery) {
		ScheduledDelivery = scheduledDelivery;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}

	public String getSenderTON() {
		return SenderTON;
	}

	public void setSenderTON(String senderTON) {
		SenderTON = senderTON;
	}

	public String getSender() {
		return Sender;
	}

	public void setSender(String sender) {
		Sender = sender;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<SMSNotifyRequest>");
		if (DestAddr != null)
		    buffer.append("<DestAddr>" + DestAddr + "</DestAddr>");
		if (TRANSACTIONID != null)
	        buffer.append("<TRANSACTIONID>" + TRANSACTIONID + "</TRANSACTIONID>");
		if (DataCoding != null)
		    buffer.append("<DataCoding>" + DataCoding + "</DataCoding>");
		if (ValidityPeriod != null)
		    buffer.append("<ValidityPeriod>" + ValidityPeriod + "</ValidityPeriod>");
		if (ScheduledDelivery != null)
		    buffer.append("<ScheduledDelivery>" + ScheduledDelivery + "</ScheduledDelivery>");
		if (ServiceType != null)
		    buffer.append("<ServiceType>" + ServiceType + "</ServiceType>");
		if (SenderTON != null)
		    buffer.append("<SenderTON>" + SenderTON + "</SenderTON>");
		if (Sender != null)
		    buffer.append("<Sender>" + Sender + "</Sender>");
		if (Text != null)
		    buffer.append("<Text>" + Text + "</Text>");
		buffer.append("</SMSNotifyRequest>");
		return buffer.toString();
	}
}

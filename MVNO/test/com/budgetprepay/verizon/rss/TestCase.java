package com.budgetprepay.verizon.rss;

import org.junit.Before;
import org.junit.Test;

import com.budgetprepay.verizon.rss.pojos.MessageHeaderType;
import com.budgetprepay.verizon.rss.pojos.OrderInquiry;
import com.budgetprepay.verizon.rss.pojos.ResellerDeviceInquiryType;
import com.budgetprepay.verizon.rss.pojos.ResellerLineInquiryType;
import com.budgetprepay.verizon.rss.pojos.ResellerOrder;
import com.budgetprepay.verizon.rss.pojos.ResellerOrderType;
import com.budgetprepay.verizon.rss.pojos.ResellerPRLInquiryType;
import com.budgetprepay.verizon.rss.pojos.ResellerSubOrderType;
import com.budgetprepay.webservice.util.VerizonUtil;

public class TestCase {

	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void deviceInquiry() throws Exception {

		/*
		ResellerDeviceInquiryType resellerDeviceInquiry = new ResellerDeviceInquiryType();
		resellerDeviceInquiry.setDeviceId(value);
		resellerDeviceInquiry.setEsn(value);
		resellerDeviceInquiry.setIccid(value);
		resellerDeviceInquiry.setMeid(value);
		resellerDeviceInquiry.setMin(value);
		resellerDeviceInquiry.setServiceZipCode(value);
		resellerDeviceInquiry.setSubReferenceNumber(value);
		resellerDeviceInquiry.setSystemData(value);
		
		ResellerSubOrderType subOrder = new ResellerSubOrderType();
		subOrder.setResellerDeviceInquiry(resellerDeviceInquiry);
		
		ResellerOrderType order = new ResellerOrderType();
		order.setAccountNumber(value);
		order.setOrderTimeStamp(value);
		order.setSubOrder(subOrder);
		
		MessageHeaderType messageHeader = new MessageHeaderType();
		messageHeader.setAsyncErrorURL(value);
		messageHeader.setChannelId(value);
		messageHeader.setChannelType(value);
		messageHeader.setFutureDateTime(value);
		messageHeader.setOrderType(value);
		messageHeader.setReferenceNumber(value);
		messageHeader.setRequestType(value);
		messageHeader.setResend(value);
		messageHeader.setReturnURL(value);
		messageHeader.setUserID(value);
		messageHeader.setVendorId(value);
		messageHeader.setVersionNumber(value);
		
		ResellerOrder resellerOrder = new ResellerOrder();
		resellerOrder.setMessageHeader(messageHeader);
		resellerOrder.setOrder(order);
		
		System.out.println(VerizonUtil.JAXB2XML(resellerOrder));
		*/
	}
	
	@Test
	public void orderInquiry() throws Exception {
		OrderInquiry orderInquiry = new OrderInquiry();
		/*
		MessageHeaderType messageHeader = new MessageHeaderType();
		messageHeader.setAsyncErrorURL(value);
		messageHeader.setChannelId(value);
		messageHeader.setChannelType(value);
		messageHeader.setFutureDateTime(value);
		messageHeader.setOrderType(value);
		messageHeader.setReferenceNumber(value);
		messageHeader.setRequestType(value);
		messageHeader.setResend(value);
		messageHeader.setReturnURL(value);
		messageHeader.setUserID(value);
		messageHeader.setVendorId(value);
		messageHeader.setVersionNumber(value);
		
		orderInquiry.setMessageHeader(messageHeader);
		
		orderInquiry.setSecurity(value);
		
		System.out.println(VerizonUtil.JAXB2XML(orderInquiry));
		*/
	}
	
	@Test
	public void lineInquiry() throws Exception {
		/*
		ResellerLineInquiryType resellerLineInquiry = new ResellerLineInquiryType();
		resellerLineInquiry.setMdn(value);
		resellerLineInquiry.setMin(value);
		resellerLineInquiry.setServiceZipCode(value);
		resellerLineInquiry.setSubReferenceNumber(value);
		resellerLineInquiry.setSystemData(value);
		
		ResellerSubOrderType subOrder = new ResellerSubOrderType();
		subOrder.setResellerLineInquiry(resellerLineInquiry);
		
		ResellerOrderType order = new ResellerOrderType();
		order.setAccountNumber(value);
		order.setOrderTimeStamp(value);
		order.setSubOrder(subOrder);
		
		MessageHeaderType messageHeader = new MessageHeaderType();
		messageHeader.setAsyncErrorURL(value);
		messageHeader.setChannelId(value);
		messageHeader.setChannelType(value);
		messageHeader.setFutureDateTime(value);
		messageHeader.setOrderType(value);
		messageHeader.setReferenceNumber(value);
		messageHeader.setRequestType(value);
		messageHeader.setResend(value);
		messageHeader.setReturnURL(value);
		messageHeader.setUserID(value);
		messageHeader.setVendorId(value);
		messageHeader.setVersionNumber(value);
		
		ResellerOrder resellerOrder = new ResellerOrder();
		resellerOrder.setMessageHeader(messageHeader);
		resellerOrder.setOrder(order);
		
		System.out.println(VerizonUtil.JAXB2XML(resellerOrder));
		*/
	}
	
	@Test
	public void prlInquiry() throws Exception {
		/*
		ResellerPRLInquiryType resellerPRLInquiryType = new ResellerPRLInquiryType();
		resellerPRLInquiryType.setEsn(value);
		resellerPRLInquiryType.setMdn(value);
		resellerPRLInquiryType.setMeid(value);
		resellerPRLInquiryType.setMin(value);
		resellerPRLInquiryType.setServiceZipCode(value);
		resellerPRLInquiryType.setSubReferenceNumber(value);
		resellerPRLInquiryType.setSystemData(value);
		
		ResellerSubOrderType subOrder = new ResellerSubOrderType();
		subOrder.setResellerLineInquiry(resellerPRLInquiryType);
		
		ResellerOrderType order = new ResellerOrderType();
		order.setAccountNumber(value);
		order.setOrderTimeStamp(value);
		order.setSubOrder(subOrder);
		
		MessageHeaderType messageHeader = new MessageHeaderType();
		messageHeader.setAsyncErrorURL(value);
		messageHeader.setChannelId(value);
		messageHeader.setChannelType(value);
		messageHeader.setFutureDateTime(value);
		messageHeader.setOrderType(value);
		messageHeader.setReferenceNumber(value);
		messageHeader.setRequestType(value);
		messageHeader.setResend(value);
		messageHeader.setReturnURL(value);
		messageHeader.setUserID(value);
		messageHeader.setVendorId(value);
		messageHeader.setVersionNumber(value);
		
		ResellerOrder resellerOrder = new ResellerOrder();
		resellerOrder.setMessageHeader(messageHeader);
		resellerOrder.setOrder(order);
		
		System.out.println(VerizonUtil.JAXB2XML(resellerOrder));
		*/
	}
}

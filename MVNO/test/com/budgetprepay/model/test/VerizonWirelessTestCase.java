package com.budgetprepay.model.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jfree.data.time.Quarter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.budgetprepay.util.ServerProperties;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.pojos.verizon.AddDeleteType;
import com.budgetprepay.webservice.pojos.verizon.DeviceInquiryRequest;
import com.budgetprepay.webservice.util.VerizonUtil;
import com.verizonwireless.oas.FeatureType;
import com.verizonwireless.oas.ResellerAddSubscriberPortInType;
import com.verizonwireless.oas.ResellerDeviceInquiryType;
import com.verizonwireless.oas.ResellerOrderDocument;
import com.verizonwireless.oas.ResellerOrderType;
import com.verizonwireless.oas.ResellerSubOrderType;
import com.verizonwireless.oas.ResellerOrderDocument.ResellerOrder;

public class VerizonWirelessTestCase {

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testReadServerProperties() throws Exception {
		ServerProperties.getInstance();
		
		System.out.println(ServerProperties.getProperty(ServerProperties.VERIZON_CCT_USERNAME));
	}
	
	@Test
	public void testSetandSaveServerProperties() throws Exception {
		ServerProperties.getInstance();
		ServerProperties.setProperty(ServerProperties.VERIZON_CCT_USERNAME, "dinky01");
		ServerProperties.saveProperties();
	}
	
	@Test
	public void testQuarterDate() throws Exception {
    	DateFormat yearFormat = new SimpleDateFormat("YYYY");
    	String year = yearFormat.format(new Date());
    	Quarter Q1 = new Quarter(1, Integer.valueOf(year));
    	
    	System.out.println(Q1.getStart());
    	System.out.println(Q1.getEnd());

	}
	
	@Test
	public void testDeviceInquiry() throws Exception {		
		ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
		resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(), 
				                                                    VerizonUtil.getDefaultVendorId(), 
				                                                    VerizonUtil.RequestType.ORDER, 
				                                                    VerizonUtil.OrderType.MNTMLND));
		
		ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
		resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
		resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType("1223"));
		
		ResellerSubOrderType resellerSubOrder = ResellerSubOrderType.Factory.newInstance();
		
		ResellerDeviceInquiryType resellerDeviceInquiry = ResellerDeviceInquiryType.Factory.newInstance();
		resellerDeviceInquiry.setMeid("A100001BBBA7DB");
		
		resellerSubOrder.setResellerDeviceInquiry(resellerDeviceInquiry);
		
		resellerOrderType.setSubOrder(resellerSubOrder);
		
		resellerOrder.setOrder(resellerOrderType);
		
		ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
		document.setResellerOrder(resellerOrder);
		
		String xml = VerizonUtil.pojo2XML(document);
		
		xml = VerizonUtil.fixRootAttributes(xml);
		System.out.println(xml);
		
		VerizonUtil util = new VerizonUtil();
		assertEquals(200, util.postXml(xml, ResourceUtil.get("verizon.rss.endpoint.url")));
	}

	/*
	@Test
	public void testJAXB2XML() throws Exception {	
		ResellerAddSubscriberPortInType request = new ResellerAddSubscriberPortInType();
		OasStringType mpnPoolName = new OasStringType();
		mpnPoolName.setValue("GlobalPoolName");
		request.setMPNPoolName(mpnPoolName);
		OasStringType mobileIPAddress = new OasStringType();
		mobileIPAddress.setValue("127.0.0.1");
		request.setMobileIPAddress(mobileIPAddress);
		System.out.println(VerizonUtil.JAXB2XML(request, "http://www.verizonwireless.com/oas"));
	}
	*/
	
	@Test
	public void testPortIn() throws Exception {
		ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
		ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
		ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
		ResellerAddSubscriberPortInType resellerAddSubscriberPortInType = ResellerAddSubscriberPortInType.Factory.newInstance();
		
		resellerAddSubscriberPortInType.setMdn(VerizonUtil.getMdnType("7134443489"));
		resellerAddSubscriberPortInType.setEsn("05403672917");
		List<com.budgetprepay.webservice.pojos.verizon.FeatureType> features = new ArrayList<com.budgetprepay.webservice.pojos.verizon.FeatureType>();
		com.budgetprepay.webservice.pojos.verizon.FeatureType feature = new com.budgetprepay.webservice.pojos.verizon.FeatureType();
		feature.setFeatureCode("VM");
		feature.setSubscribe(AddDeleteType.A);
		resellerAddSubscriberPortInType.setFeatureArray(VerizonUtil.addFeatures(features));
		resellerAddSubscriberPortInType.setMobileIPAddress(VerizonUtil.getOasStringType(null));
		resellerAddSubscriberPortInType.setPlan(VerizonUtil.getPlanType("BUDGETPREPAY"));
        resellerSubOrderType.setResellerAddSubscriberPortIn(resellerAddSubscriberPortInType);
        
		resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(), 
                "admin", 
                VerizonUtil.RequestType.ORDER, 
                VerizonUtil.OrderType.MNTMLND));

		ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
		resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
		resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType("1223"));
		
		resellerOrderType.setSubOrder(resellerSubOrderType);
		
		resellerOrder.setOrder(resellerOrderType);
		
		document.setResellerOrder(resellerOrder);
		
		System.out.println(VerizonUtil.pojo2XML(document));
	}
	
	@Test
	public void testXMLJAXB() throws Exception {	
		DeviceInquiryRequest request = new DeviceInquiryRequest();
		request.setEsn("7134443489");
	    DeviceInquiryRequest request1 = (DeviceInquiryRequest) VerizonUtil.XML2JAXB(DeviceInquiryRequest.class, VerizonUtil.JAXB2XML(request));
	    System.out.println(request1.getEsn());
	}
	

}

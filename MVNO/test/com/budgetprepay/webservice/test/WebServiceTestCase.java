package com.budgetprepay.webservice.test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.facade.BeQuickFacade;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.ReturnMessage;
import com.budgetprepay.webservice.client.bequick.pojo.GetCoverageResponse;
import com.budgetprepay.webservice.pojos.topup.EnterOrderDetailsRequest;
import com.budgetprepay.webservice.pojos.verizon.DeviceAsyncResponse;
import com.budgetprepay.webservice.pojos.verizon.DeviceInquiryRequest;
import com.budgetprepay.webservice.pojos.verizon.ObjectFactory;
import com.budgetprepay.webservice.util.CommonUtil;
import com.verizonwireless.oas.OasOrderResponseDocument;

public class WebServiceTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMdn() throws Exception {
		System.out.println("123457890".matches("\\d{10}"));
	}
	
	@Test
	public void testRequest() throws Exception {

		ObjectFactory of = new ObjectFactory();
		DeviceInquiryRequest request = of.createDeviceInquiryRequest();
		request.setMeid("1010101101");
		request.setMessageHeader(of.createMessageHeaderType());
		request.getMessageHeader().setReferenceNumber("101010");
		request.getMessageHeader().setAnsynchronousReturnUrl("www.yahoo.com");
		request.getMessageHeader().setUserId("adin");
		
		JAXBContext context = JAXBContext.newInstance(DeviceInquiryRequest.class); 
	    Marshaller marshaller = context.createMarshaller();
	    StringWriter writer = new StringWriter();
	    QName qname = new QName("http://www.budgetprepay.com/MVNO/Verizon", "DeviceInquiry3GMEIDRequest");
	    JAXBElement<DeviceInquiryRequest> rootElement = new JAXBElement<DeviceInquiryRequest>(qname, DeviceInquiryRequest.class,request);
	    marshaller.marshal(rootElement, writer);
	    String xml = writer.toString();
	    System.out.println(xml);
	   
        Source source = new StreamSource(new ByteArrayInputStream(xml.getBytes()));
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    JAXBElement<DeviceInquiryRequest> userElement = (JAXBElement<DeviceInquiryRequest>) unmarshaller.unmarshal(source, DeviceInquiryRequest.class);
	    DeviceInquiryRequest user = userElement.getValue();
	    System.out.println(user.getEsn());     
        
	}
	
	@Test
	public void testResponse() throws Exception {

		ObjectFactory of = new ObjectFactory();
		DeviceAsyncResponse response = of.createDeviceAsyncResponse();
		response.setMessageHeader(of.createMessageHeaderType());
		response.getMessageHeader().setAnsynchronousReturnUrl("yahoo.com");
		response.getMessageHeader().setReferenceNumber("10101010");
		response.getMessageHeader().setUserId("admin");
		
		
		JAXBContext context = JAXBContext.newInstance(DeviceAsyncResponse.class); 
	    Marshaller marshaller = context.createMarshaller();
	    StringWriter writer = new StringWriter();
	    QName qname = new QName("http://www.budgetprepay.com/MVNO/Verizon", "DeviceAsyncResponse");
	    JAXBElement<DeviceAsyncResponse> rootElement = new JAXBElement<DeviceAsyncResponse>(qname, DeviceAsyncResponse.class, response);
	    marshaller.marshal(rootElement, writer);
	    String xml = writer.toString();
	    System.out.println(xml);
	   
        Source source = new StreamSource(new ByteArrayInputStream(xml.getBytes()));
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    JAXBElement<DeviceAsyncResponse> userElement = (JAXBElement<DeviceAsyncResponse>) unmarshaller.unmarshal(source, DeviceAsyncResponse.class);
	    DeviceAsyncResponse user = userElement.getValue();
	    System.out.println(user.getMessageHeader().getAnsynchronousReturnUrl());     
        
	}
	
	@Test
	public void testOrderInquiry() throws Exception {
		String xml = "<oasOrderResponse>" +
                      "<messageHeader>" +
                       "<vendorId>BUDGETPREPAY</vendorId>" +
                       "<requestType>STATUS</requestType>" +
                       "<orderType>INQSLND</orderType>" +
                       "<referenceNumber>FTEBULKTIER_BUDGET_80493304954</referenceNumber>" +
                       "<returnURL>http://10.253.114.113:80/MVNO/VerizonHandler</returnURL>" +
                       "<asyncErrorURL>http://10.253.114.113:80/MVNO/VerizonHandler</asyncErrorURL>" +
                      "</messageHeader>" +
                      "<orderResponse>" +
                       "<errorCode>00</errorCode>" +
                       "<errorMessage>SUCCESSFULLY PROCESSED THE REQUEST</errorMessage>" +
                       "<orderTimeStamp>11/02/2013 03:19:09</orderTimeStamp>" +
                       "<orderStatus>COMP</orderStatus>" +
                       "<message> </message>" +
                       "<mdn>3186584480</mdn>" +
                       "<noOfLines>1</noOfLines>" +
                      "</orderResponse>" +
                     "</oasOrderResponse> ";
		
	    XmlObject xmlObject = XmlObject.Factory.parse(xml.replaceAll("<oasOrderResponse>", "<oasOrderResponse xmlns=\"http://www.verizonwireless.com/oas\">"));
	    OasOrderResponseDocument document = (OasOrderResponseDocument) xmlObject;
	    System.out.println(document.getOasOrderResponse().getOrderResponse().getErrorMessage());
	}
	
	@Test
	public void testBeQuick() throws Exception {
		String requestString = "<BeQuick product=\"\"><session><clec><id>213</id><agentUser><username>budgetprepay</username><token>F7MY6JVMDRTUB8E</token></agentUser></clec></session><request type=\"GetCoverage\"><carrier>T-Mobile</carrier><zip>77057</zip></request></BeQuick>";
		
        postXml(requestString, "https://xml.telcoprovider.com/perl/xml/gateway.cgi");
	}
	
	@Test
	public void testGet() throws Exception {
        String url = ResourceUtil.get("plintron.budget.updateportstatus.url").replaceFirst("###", "5628229853");
		System.out.println(url);
        ReturnMessage results = new ReturnMessage(); //CommonUtil.get("http://www.budgetmobile.com/com/budget-rest/updateportstatus.cfm?mdn=5628229853&status=complete");
		results = CommonUtil.get(url);
		System.out.println(results.getText());
		if (results.getText().startsWith("{\"ERRORCODE\":0")) { //{"ERRORCODE":0,"ERRORMESSAGE":""})
			System.out.println("TRUE");
		}
	}
	
	private void postXml(final String xml, final String urlString) throws Exception {
		URL url = null;
		HttpsURLConnection connection = null;
		String parameters = "clecID=213&request=" + URLEncoder.encode(xml, "UTF-8");
		
		try {
			url = new URL(urlString);
			connection = (HttpsURLConnection ) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setReadTimeout(5000);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/xml");
			connection.setRequestProperty("Content-Length", "" + Integer.toString(parameters.getBytes().length));
			connection.setUseCaches (false);
			OutputStream os = connection.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			osw.write(parameters);
			osw.flush();
			osw.close();
			
			System.out.println(connection.getResponseCode());
			testGetCoverageResponse(read(connection.getInputStream()));
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(404);
			System.out.println("Unable to post xml to :" + urlString);
		}
		finally {
			if (connection != null)
			    connection.disconnect();
		}
	}
	
	private String read(final InputStream inputStream) throws Exception {
		if (inputStream == null)
			throw new Exception("Input stream cannot be null");
		
	    StringBuilder stringBuilder = new StringBuilder();
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	    char[] charBuffer = new char[128];
	    int bytesRead = -1;
	    while ((bytesRead = bufferedReader.read(charBuffer)) > 0)
	        stringBuilder.append(charBuffer, 0, bytesRead);
	    bufferedReader.close();
	    return stringBuilder.toString();
	}
	
	private GetCoverageResponse testGetCoverageResponse(final String xml) throws Exception {
		System.out.println(xml);
		
		GetCoverageResponse response = (GetCoverageResponse) CommonUtil.XML2JAXB(GetCoverageResponse.class, xml);
		
		System.out.println(response.getResponse().getStatus());
	 
		for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
			System.out.println(error.getMessage());
		}
		
		return response;
	}
	
	@Test
	public void testBeQuickFacade() throws Exception {
		BeQuickFacade.getCoverageInfomration(new Request());
	}
}

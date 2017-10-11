package com.budgetprepay.model.test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.budgetprepay.model.facade.PlintronFacade;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.client.plintron.billing.pojo.ChangeVMPinRequest;
import com.budgetprepay.webservice.client.plintron.billing.pojo.LoginRequest;
import com.budgetprepay.webservice.client.plintron.billing.pojo.LoginResponse;
import com.budgetprepay.webservice.client.plintron.esme.pojo.SMSNotifyRequest;
import com.budgetprepay.webservice.client.plintron.esme.pojo.SMSNotifyResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.RegistrationRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleAsyncResponseInput;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleCreatePortInRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesalePartnerPortoutValidationInput;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleQueryPortInStatusRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleValidatePortInEligibilityRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleValidatePortInEligibilityResponse;
import com.budgetprepay.webservice.util.CommonUtil;
import com.budgetprepay.webservice.util.VerizonUtil;

public class PlintronTestCase {

	private static String BILLING_HOST = "192.30.220.145";
	private static int BILLING_PORT = 3051;
	private static String BILLING_USERNAME = "budgettes";
	private static String BILLING_PASSWORD = "budget123";
	
	private static String PROVISIONING_HOST = "192.30.220.155";
	private static int PROVISIONING_PORT = 2222;

	private static String ESME_HOST = "192.30.216.145";
	private static int ESME_PORT = 3151;
	
	@Before
	public void setUp() throws Exception {	
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void parseGetSubscriberInfoResponse() throws Exception {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<RESPONSE>" + "\n");
		buffer.append(" <HEADER>" + "\n");
		buffer.append("  <TRANSACTION_ID>5MX2ikBJ10041485159</TRANSACTION_ID>" + "\n");
		buffer.append("  <REQUEST_TYPE>GET_SUBSCRIBER_INFO</REQUEST_TYPE>" + "\n");
	    buffer.append("  <ERROR_CODE>0</ERROR_CODE>" + "\n");
	    buffer.append("  <ERROR_DESC>Success</ERROR_DESC>" + "\n");
	    buffer.append(" </HEADER>" + "\n");
	    buffer.append(" <BODY>" + "\n");
	    buffer.append("  <SYSTEM>2</SYSTEM>" + "\n");
	    buffer.append("  <TP_ICC_ID>8901260730000312205</TP_ICC_ID>" + "\n");
	    buffer.append("  <TMO_RESP>" + "\n");
	    buffer.append("   <RESULT>SUCCESS</RESULT>" + "\n");
	    buffer.append("   <WholesaleHLRResponse>" + "\n");
	    buffer.append("    <WholesaleOutput>" + "\n");
	    buffer.append("     <WholesaleSubscriber>" + "\n");
	    buffer.append("      <msisdn>4042502553</msisdn>" + "\n");
	    buffer.append("      <sim>8901260730000312205</sim>" + "\n");
	    buffer.append("      <imei/>" + "\n");
	    buffer.append("     </WholesaleSubscriber>" + "\n");
	    buffer.append("     <Results>" + "\n");
	    buffer.append("      <result>SUCCESS</result>" + "\n");
	    buffer.append("      <description>HLR Query completed successfully</description>" + "\n");
	    buffer.append("     </Results>" + "\n");
	    buffer.append("    </WholesaleOutput>" + "\n");
	    buffer.append("    <imsi>310260730031220</imsi>" + "\n");
	    buffer.append("    <SIMStatus>WI</SIMStatus>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>BARCCF</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>CFC</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>CLIP</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>CLIR</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>CLW</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>HOLD</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>ISP</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>NOROAM</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>MVNO</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <socs>" + "\n");
	    buffer.append("     <soc>LTE</soc>" + "\n");
	    buffer.append("    </socs>" + "\n");
	    buffer.append("    <apn>" + "\n");
	    buffer.append("     <name>APN1</name>" + "\n");
	    buffer.append("     <value>data.lycamobile.com</value>" + "\n");
	    buffer.append("    </apn>" + "\n");
	    buffer.append("    <MS_Status>NOT_REGISTERED</MS_Status>" + "\n");
	    buffer.append("    <CrossReference>" + "\n");
	    buffer.append("     <clientId>79</clientId>" + "\n");
	    buffer.append("     <transactionId>5MX2ikBJ10041485159</transactionId>" + "\n");
	    buffer.append("    </CrossReference>" + "\n");
	    buffer.append("    <Security>" + "\n");
	    buffer.append("     <userId>tracfone</userId>" + "\n");
	    buffer.append("     <password>Tr@cfon3</password>" + "\n");
	    buffer.append("    </Security>" + "\n");
	    buffer.append("   </WholesaleHLRResponse>" + "\n");
	    buffer.append("  </TMO_RESP>" + "\n");
	    buffer.append(" </BODY>" + "\n");
	    buffer.append("</RESPONSE>" + "\n");
	    
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(buffer.toString().getBytes()));

		/*
		NodeList nList = doc.getElementsByTagName("HEADER");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("TRANSACTION_ID").item(0) != null)
					System.out.println(eElement.getElementsByTagName("TRANSACTION_ID").item(0).getTextContent());
				if (eElement.getElementsByTagName("ERROR_CODE").item(0) != null)
					System.out.println(eElement.getElementsByTagName("ERROR_CODE").item(0).getTextContent());
				if (eElement.getElementsByTagName("ERROR_DESC").item(0) != null)
					System.out.println(eElement.getElementsByTagName("ERROR_DESC").item(0).getTextContent());
			}
		}
		*/
		
		/*
		NodeList nList = doc.getElementsByTagName("socs");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("soc").item(0) != null)
					System.out.println(eElement.getElementsByTagName("soc").item(0).getTextContent());
			}
		}
		*/
		
		
	}
	@Test
	public void testRegex() {
		String xml = "<SMSNotifyResponse><TRANSACTIONID></TRANSACTIONID><Code>1</Code></SMSNotifyResponse><SMSNotifyResponse><TRANSACTIONID></TRANSACTIONID><Code>1</Code></SMSNotifyResponse>";
		Pattern code = Pattern.compile("<Code>(\\d+)</Code>");
		Pattern trans = Pattern.compile("<TRANSACTIONID>(.*)</TRANSACTIONID>");
		Matcher codeMatcher = code.matcher(xml.substring(0, xml.lastIndexOf("<SMSNotifyResponse>")));
		if (codeMatcher.find()) {
			for (int i = 0; i < codeMatcher.groupCount(); i++)
				System.out.println(i + "=" + codeMatcher.group(i));
		}
		Matcher transMatcher = trans.matcher(xml.substring(0, xml.lastIndexOf("<SMSNotifyResponse>")));
		if (transMatcher.find()) {
			for (int i = 0; i < transMatcher.groupCount(); i++)
				System.out.println(i + "=" + transMatcher.group(i));
		}
	}
	
	@Test
	public void testPortIn() throws Exception {
		WholesaleCreatePortInRequest request = new WholesaleCreatePortInRequest();
		request.setAddressLine1("123 Main St.");
		request.setCity("Houston");
		request.setMsisdn("5551212");
		request.setName("Steve Thomas");;
		request.setOspAccountNumber("123");
		request.setSim("ABC");;
		request.setState("TX");
		request.setTransactionId("123");
		request.setZip("77057");
		System.out.println(request.toString());
	}
	
	private String getWholesaleValidatePortInEligibilityRequest() throws Exception {
		WholesaleValidatePortInEligibilityRequest request = new WholesaleValidatePortInEligibilityRequest();
		request.setMsisdn("7132311443");
		request.setTransactionId(CommonUtil.getRandom());
		return request.toString();		
	}
	
	@Test
	public void testESME() throws Exception {
		String message = "<SMSNotifyRequest><DestAddr>7134443489</DestAddr><TRANSACTIONID>P20140924-0000000</TRANSACTIONID><DataCoding>1</DataCoding><Sender>7025</Sender><ServiceType>SMS</ServiceType><SenderTON>2</SenderTON><Text>test 1</Text></SMSNotifyRequest>";
		System.out.println(message);
		String response = PlintronFacade.send2ESME(ESME_HOST, ESME_PORT, message);
		System.out.println(response);
		
		//SMSNotifyResponse res = SMSNotifyResponse.parse(response); //SMSNotifyResponse.parse(response.substring(0, endIndex));
		//System.out.println("Code = " + res.getCode());
		//System.out.println("Tran = " + res.getTRANSACTIONID());
	}
	
	private String getESME() throws Exception {		
		SMSNotifyRequest request = new SMSNotifyRequest();
		request.setTRANSACTIONID("123");
		request.setDestAddr("9734896256");
		request.setDataCoding("1");
		request.setServiceType("RN");
		request.setSender("7025");
		request.setText("Transaction Id is " + request.getTRANSACTIONID());
		return request.toString();		
	}
	
	@Test
	public void testBilling() throws Exception {
		String message = getLogin();
		String response = PlintronFacade.send2Billing(BILLING_HOST, BILLING_PORT, message).substring(9);
		System.out.println(response);
		LoginResponse resp = LoginResponse.parse(response);
		System.out.println(resp.getSESSIONID());
	}
	
	@Test
	public void testChangeVMPin() throws Exception {
		String loginRequest = getLogin();
		String loginResponse = PlintronFacade.send2Billing(BILLING_HOST, BILLING_PORT, loginRequest).substring(9);
		System.out.println(loginResponse);
		LoginResponse resp = LoginResponse.parse(loginResponse);
		
		ChangeVMPinRequest changePinRequest = new ChangeVMPinRequest();
		changePinRequest.setDialogID(CommonUtil.getRandom());
		changePinRequest.setMdn("6192439595");
		changePinRequest.setNewPin("1234");
		changePinRequest.setOldPin("0000");
		changePinRequest.setSessionId(resp.getSESSIONID());
		
		String changePinResponse = PlintronFacade.send2Billing(BILLING_HOST, BILLING_PORT, changePinRequest.toString()).substring(9);
		System.out.println(changePinResponse);
		
		
	}
	
	
	private String getWholesaleCreatePortInRequest() throws Exception {
		WholesaleCreatePortInRequest request = new WholesaleCreatePortInRequest();
		request.setMsisdn("3186581993");
		request.setName("Greg Hough");
		request.setAddressLine1("1325 Barksdale");
		request.setCity("Bossier City");
		request.setState("LA");
		request.setZip("71111");
		request.setSim("8901160500010512800");
		request.setOspAccountNumber("987456");
		request.setTransactionId(CommonUtil.getRandom());
		return request.toString();		
	}
	
	@Test
	public void testWholesaleCreatePortInRequest() throws Exception {

		Socket  socket = new Socket("192.30.216.156", 3333);
		
		String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
		
		ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
		out.order(ByteOrder.LITTLE_ENDIAN);
		out.put(new String(length(register) + register).getBytes());
        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
        System.out.println(length(register) + register);
        outToServer.write(out.array());
		
        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
        
        Thread.sleep(1000 * 2);
    	
        if (inFromServer.available() > 0) {
        	byte[] buffer = new byte[inFromServer.available()];
        	inFromServer.readFully(buffer);
        	System.out.println(new String(buffer));
        }
        
        String message = getWholesaleCreatePortInRequest();
        
		out = ByteBuffer.allocate(new String(length(message) + message).length());
		out.order(ByteOrder.LITTLE_ENDIAN);
		out.put(new String(length(message) + message).getBytes());
        outToServer = new DataOutputStream(socket.getOutputStream());
        System.out.println(length(message) + message);
        outToServer.write(out.array());
		
        inFromServer = new DataInputStream(socket.getInputStream());
        
        Thread.sleep(1000 * 2);
    	
        if (inFromServer.available() > 0) {
        	byte[] buffer = new byte[inFromServer.available()];
        	inFromServer.readFully(buffer);
        	System.out.println(new String(buffer));
        }
        
        socket.close();
	}
	
	private String getWholesaleQueryPortInStatusRequest() throws Exception {
		WholesaleQueryPortInStatusRequest request = new WholesaleQueryPortInStatusRequest();
		request.setMsisdn("3186581993");
		request.setTransactionId(CommonUtil.getRandom());
		return request.toString();		
	}
	
	@Test
	public void testWholesaleQueryPortInStatusRequest() throws Exception {

		Socket  socket = new Socket("192.30.216.156", 3333);
		
		String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
		
		ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
		out.order(ByteOrder.LITTLE_ENDIAN);
		out.put(new String(length(register) + register).getBytes());
        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
        System.out.println(length(register) + register);
        outToServer.write(out.array());
		
        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
        
        Thread.sleep(1000 * 2);
    	
        if (inFromServer.available() > 0) {
        	byte[] buffer = new byte[inFromServer.available()];
        	inFromServer.readFully(buffer);
        	System.out.println(new String(buffer));
        }
        
        String message = getWholesaleQueryPortInStatusRequest();
        
		out = ByteBuffer.allocate(new String(length(message) + message).length());
		out.order(ByteOrder.LITTLE_ENDIAN);
		out.put(new String(length(message) + message).getBytes());
        outToServer = new DataOutputStream(socket.getOutputStream());
        System.out.println(length(message) + message);
        outToServer.write(out.array());
		
        inFromServer = new DataInputStream(socket.getInputStream());
        
        Thread.sleep(1000 * 2);
    	
        if (inFromServer.available() > 0) {
        	byte[] buffer = new byte[inFromServer.available()];
        	inFromServer.readFully(buffer);
        	System.out.println(new String(buffer));
        }
        
        socket.close();
	}
	
	@Test
	public void testSocketChannel() throws Exception {

		Socket  socket = new Socket("192.30.216.156", 3333);
		
		String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
		
		ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
		out.order(ByteOrder.LITTLE_ENDIAN);
		out.put(new String(length(register) + register).getBytes());
        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
        System.out.println(length(register) + register);
        outToServer.write(out.array());
		
        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
        
        Thread.sleep(1000 * 2);
    	
        if (inFromServer.available() > 0) {
        	byte[] buffer = new byte[inFromServer.available()];
        	inFromServer.readFully(buffer);
        	System.out.println(new String(buffer));
        }
        
        String message = getWholesaleValidatePortInEligibilityRequest();
        
		out = ByteBuffer.allocate(new String(length(message) + message).length());
		out.order(ByteOrder.LITTLE_ENDIAN);
		out.put(new String(length(message) + message).getBytes());
        outToServer = new DataOutputStream(socket.getOutputStream());
        System.out.println(length(message) + message);
        outToServer.write(out.array());
		
        inFromServer = new DataInputStream(socket.getInputStream());
        
        Thread.sleep(1000 * 2);
    	
        if (inFromServer.available() > 0) {
        	byte[] buffer = new byte[inFromServer.available()];
        	inFromServer.readFully(buffer);
        	//System.out.println(new String(buffer));
        	parse(new String(buffer));
        }
        
        socket.close();
	}
	
	@Test
	public void testProvisioning() throws Exception {
		try {
		    String message = getRegistration(InetAddress.getLocalHost().getHostAddress());
		    //send(PROVISIONING_HOST, PROVISIONING_PORT, message);
		    send("192.30.216.156", 3333, message);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String getLogin() throws Exception {		
		LoginRequest request = new LoginRequest();
		request.setDialogID(CommonUtil.getRandom());
		request.setUserID(BILLING_USERNAME);
		request.setPassword(BILLING_PASSWORD);
		return request.toString();		
	}

	private String getRegistration(final String entityName) throws Exception {
		return new RegistrationRequest(entityName).toString();
	}
	
	private String send(final String hostname, final int port, final String message) throws Exception {
		StringBuffer results = new StringBuffer();
		Socket socket = null;
		try {
			socket = new Socket(hostname, port); 
	        
	        if (!socket.isConnected())
	    	    System.out.println("Unable to establish a socket to " + hostname + " " + port);
	        else {
		        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
		        System.out.println(length(message) + message);
		        outToServer.writeBytes(length(message) + message);
		        
		        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
		        
		        Thread.sleep(1000 * 2);
	        	
		        if (inFromServer.available() > 0) {
		        	byte[] buffer = new byte[inFromServer.available()];
		        	inFromServer.readFully(buffer);
		        	System.out.println(new String(buffer));
		        }
	        }
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (socket != null)
			   socket.close();	
	    }
	    return results.toString();
	}
	
	private String length(final String value) {
		return String.format("%09d", value.length());
	}
	
	public void parse(final String response) throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(response.substring(9).getBytes()));
		
		NodeList nList = doc.getElementsByTagName("HEADER");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				System.out.println(eElement.getElementsByTagName("TRANSACTION_ID").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("REQUEST_TYPE").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("ERROR_CODE").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("ERROR_DESC").item(0).getTextContent());
			}
		}

		nList = doc.getElementsByTagName("Results");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				System.out.println(eElement.getElementsByTagName("result").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("description").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("messageCode").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("status").item(0).getTextContent());
			}
		}
	}
	
	@Test
	public void testPortInPostBack() throws Exception {
		System.out.println(VerizonUtil.post(wholesaleAsyncResponseInput(), "http://localhost/MVNO/PlintronHandler").getText());
		
	}
	
	private String portValidateResponse() {
		return "000002002" +
		"<RESPONSE>" +
		" <HEADER>" +
		"  <TRANSACTION_ID>MNP_4959390093949867</TRANSACTION_ID>" +
		"  <REQUEST_TYPE>INITIATE_THIRD_PARTY_API</REQUEST_TYPE>" +
		"  <ERROR_CODE>0</ERROR_CODE>" +
		"  <ERROR_DESC>Success</ERROR_DESC>" +
		" </HEADER>" +
		" <BODY>" +
		"  <SYSTEM>2</SYSTEM>" +
		"  <TP_ICC_ID>8901260842140691925</TP_ICC_ID>" +
		"  <TMO_RESP>" +
		"   <SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
		"    <SOAP-ENV:Body>" +
		"     <WholesaleValidatePortInEligibilityResponse>" +
		"      <WholesaleValidatePortInEligibilityOutput>" +
		"       <WholesaleOutput>" +
		"        <WholesaleSubscriber xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" " +
		"                             xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"                 " +             
		"                             xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
		"         <msisdn>7132311443</msisdn>" +
		"         <sim/>" +
		"         <imei>310260844069192</imei>" +
		"        </WholesaleSubscriber>" +
		"        <Results>" +
		"         <result>SUCCESS</result>" +
		"         <description>Eligible. Inter-Carrier request for MSISDN 7132311443</description>" +
		"         <messageCode>INTER</messageCode>" +
		"         <status>ELIGIBLE</status>" +
		"        </Results>" +
		"       </WholesaleOutput>" +
		"      </WholesaleValidatePortInEligibilityOutput>" +
		"      <CrossReference xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" " +
		"                      xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" " +
		"                      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
		"       <clientId>82</clientId>" +
		"       <transactionId>MNP_4959390093949867</transactionId>" +
		"       <callbackLocation>https://192.30.216.109:3336/PlintronProvGateway/responseValidator.htm</callbackLocation>" +
		"      </CrossReference>" +
		"      <ServiceTarget>" +
		"       <serviceName>ValidatePortInEligibility</serviceName>" +
		"      </ServiceTarget>" +
		"     </WholesaleValidatePortInEligibilityResponse>" +
		"    </SOAP-ENV:Body>" +
		"   </SOAP-ENV:Envelope>" +
		"  </TMO_RESP>" +
		" </BODY>" +
		"</RESPONSE>";

	}
	
	@Test public void testGET_SUBSRIBERINFOResponseParsing() throws Exception {
		String response = "<RESPONSE><HEADER><TRANSACTION_ID>310260844069605</TRANSACTION_ID><REQUEST_TYPE>GET_SUBSCRIBER_INFO</REQUEST_TYPE><ERROR_CODE>0</ERROR_CODE><ERROR_DESC>Success</ERROR_DESC></HEADER><BODY><SYSTEM>2</SYSTEM><TP_ICC_ID>8901260842140696056</TP_ICC_ID><TMO_RESP><RESULT>SUCCESS</RESULT>         <WholesaleSubscriberResponse>             <WholesaleOutput>                 <WholesaleSubscriber>                     <msisdn>3185296435</msisdn>                     <sim>8901260842140696056</sim>                     <imei/>                 </WholesaleSubscriber>                 <Results>                     <result>SUCCESS</result>                     <description>Successful Subscriber Inquiry</description>                     <status>ACTIVE</status>                 </Results>             </WholesaleOutput>             <CrossReference xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">                 <clientId>82</clientId>                 <transactionId>IMG00000694_310260844069605</transactionId>             </CrossReference>             <imsi>310260844069605</imsi>             <serviceStartDate>2014-10-13</serviceStartDate>             <package>                 <name>Plintron Subscriber Package - USF</name>                 <effectiveDate>2014-10-13</effectiveDate>             </package>             <plan>                 <plan>Plintron Services</plan>                 <effectiveDate>2014-10-13</effectiveDate>             </plan>             <socs>                 <soc>CLW</soc>                 <effectiveDate>2014-10-13</effectiveDate>             </socs>             <socs>                 <soc>CLIP</soc>                 <effectiveDate>2014-10-13</effectiveDate>             </socs>             <socs>                 <soc>CLIR</soc>                 <effectiveDate>2014-10-13</effectiveDate>             </socs>             <socs>                 <soc>MVNO</soc>                 <effectiveDate>2014-10-13</effectiveDate>             </socs>             <socs>                 <soc>HOLD</soc>                 <effectiveDate>2014-10-13</effectiveDate>             </socs>             <socs>                 <soc>SMSO</soc>                 <effectiveDate>2014-10-13</effectiveDate>             </socs>             <socs>                 <soc>VM</soc>                 <effectiveDate>2014-10-13</effectiveDate>             </socs>             <billCycleDay>13</billCycleDay>         </WholesaleSubscriberResponse>     </TMO_RESP></BODY></RESPONSE>";
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(response.getBytes()));

		NodeList nList = doc.getElementsByTagName("HEADER");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("TRANSACTION_ID").item(0) != null)
					System.out.println(eElement.getElementsByTagName("TRANSACTION_ID").item(0).getTextContent());
				if (eElement.getElementsByTagName("ERROR_CODE").item(0) != null)
					System.out.println(eElement.getElementsByTagName("ERROR_CODE").item(0).getTextContent());
				if (eElement.getElementsByTagName("ERROR_DESC").item(0) != null)
					System.out.println(eElement.getElementsByTagName("ERROR_DESC").item(0).getTextContent());
			}
		}
	
	}
	
	@Test
	public void testAsyncPortInParsing() throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(wholesaleAsyncResponseInput().getBytes()));

		if (doc.getElementsByTagName("ns0:WholesaleAsyncResponseInput").getLength() > 0) {
			System.out.println("WholesaleAsyncResponseInput");
			WholesaleAsyncResponseInput wholesaleAsyncResponseInput = WholesaleAsyncResponseInput.parse(doc);
			System.out.println(wholesaleAsyncResponseInput.getMsisdn());
		}
		if (doc.getElementsByTagName("ns0:WholesalePartnerPortoutValidationInput").getLength() > 0) {
			System.out.println("WholesalePartnerPortoutValidationInput");
		}
		
		doc = dBuilder.parse(new ByteArrayInputStream(wholesalePartnerPortoutValidationInput().getBytes()));

		if (doc.getElementsByTagName("ns0:WholesaleAsyncResponseInput").getLength() > 0) {
			System.out.println("WholesaleAsyncResponseInput");
		}
		if (doc.getElementsByTagName("ns0:WholesalePartnerPortoutValidationInput").getLength() > 0) {
			System.out.println("WholesalePartnerPortoutValidationInput");
			WholesalePartnerPortoutValidationInput wholesalePartnerPortoutValidationInput = WholesalePartnerPortoutValidationInput.parse(doc);
			System.out.println(wholesalePartnerPortoutValidationInput.getMsisdn());
		}
	}
			
	private String wholesaleAsyncResponseInput() throws Exception {
		StringBuffer buffer = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		buffer.append("<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">");
		buffer.append(" <SOAP-ENV:Body>");
		buffer.append("  <ns0:WholesaleAsyncResponseInput xmlns:ns0=\"http://www.tmobile.com/Applications/WholesaleExt/ApplicationServiceInterfaces/WholesaleAsyncResponse\">");
		buffer.append("   <ns0:WholesaleOutput>");
		buffer.append("    <ns0:WholesaleSubscriber>");
		buffer.append("     <ns0:msisdn>5628229853</ns0:msisdn>");
		buffer.append("     <ns0:sim>8901260842140691925</ns0:sim>");
		buffer.append("     <ns0:imei>310260844069192</ns0:imei>");
		buffer.append("    </ns0:WholesaleSubscriber>");
		buffer.append("    <ns0:Results>");
		buffer.append("     <ns0:result>SUCCESS</ns0:result>");
		buffer.append("     <ns0:description>CreatePortInRequest Successfully Complete</ns0:description>");
		//buffer.append("     <ns0:description>CreatePortInRequest Successfully CompleteSubscriber has reached the data threshold limit and is being WARNEDSubscriber has reached the data threshold limit and is being WARNEDSubscriber has reached the data threshold limit and is being WARNEDSubscriber has reached the data threshold limit and is being WARNEDSubscriber has reached the data threshold limit and is being WARNED</ns0:description>");
		buffer.append("    </ns0:Results>");
		buffer.append("   </ns0:WholesaleOutput>");
		buffer.append("   <ns0:CrossReference>");
		buffer.append("    <ns0:clientId>82</ns0:clientId>");
		buffer.append("    <ns0:transactionId>MNP_63263820314691856358</ns0:transactionId>");
		buffer.append("    <ns0:callbackLocation>https://192.30.216.109:3336/PlintronProvGateway/responseValidator.htm</ns0:callbackLocation>");
		buffer.append("   </ns0:CrossReference>");
	    buffer.append("  </ns0:WholesaleAsyncResponseInput>");
	    buffer.append(" </SOAP-ENV:Body>");
	    buffer.append("</SOAP-ENV:Envelope>");
	    return buffer.toString();
	}
	
	private String wholesalePartnerPortoutValidationInput() throws Exception {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	    buffer.append("<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">");
	    buffer.append("<SOAP-ENV:Body>");
	    buffer.append(" <ns0:WholesalePartnerPortoutValidationInput xmlns:ns0=\"http://www.tmobile.com/Applications/WholesaleExt/ApplicationServiceInterfaces/WholesalePartnerPortoutValidation\">");
	    buffer.append("  <ns0:Subscriber>");
	    buffer.append("   <ns0:msisdn>3185071767</ns0:msisdn>");
	    buffer.append("  </ns0:Subscriber>");
	    buffer.append("  <ns0:PortInfo>");
	    buffer.append("   <ns0:ospAccountNumber>1223</ns0:ospAccountNumber>");
	    buffer.append("   <ns0:ssn>1234567890</ns0:ssn>");
	    buffer.append("    <ns0:WholesaleBilling>");
	    buffer.append("     <ns0:addressLine1>CEDAR LAKE</ns0:addressLine1>");
	    buffer.append("     <ns0:city>BATON ROUGE</ns0:city>");
	    buffer.append("     <ns0:zip>70808</ns0:zip>");
	    buffer.append("     <ns0:type> </ns0:type>");
	    buffer.append("     <ns0:firstName>NICOLE</ns0:firstName>");
	    buffer.append("     <ns0:lastName>VARISTE</ns0:lastName>");
	    buffer.append("   </ns0:WholesaleBilling>");
	    buffer.append("  </ns0:PortInfo>");
	    buffer.append("  <ns0:CrossReference>");
	    buffer.append("   <ns0:clientId>82</ns0:clientId>");
	    buffer.append("   <ns0:transactionId>5919418</ns0:transactionId>");
	    buffer.append("  </ns0:CrossReference>");
	    buffer.append(" </ns0:WholesalePartnerPortoutValidationInput>");
	    buffer.append("</SOAP-ENV:Body></SOAP-ENV:Envelope>");
	    return buffer.toString();
	    
	    
	}
	
	@Test 
	public void testResponse() throws Exception {
		System.out.println(WholesalePartnerPortoutValidationInput.response("7134443489", "SUCCESS", "ValidatePortout Completed Sucessfully", "7A", "MDN_OK"));	

	}
	
	/*
	 * 		String URI = "jdbc:sqlserver://devserver2\\SQLEXPRESS:1433;databaseName=mvno;user=sa;password=Dinky*01";
		connection = DriverManager.getConnection (URI, "sa", "Dinky*01");
				String SPsql = "EXEC PLINTRON_RESPONSE ?";

	 */
	@Test
	public void testStoredProc() throws Exception {
		Connection connection = null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		String URI = "jdbc:sqlserver://SQL02\\MSSQLSERVER:1433;databaseName=BPIUA;user=JavaApp;password=7rtxckpb";
		connection = DriverManager.getConnection (URI, "JavaApp", "7rtxckpb");
        String SPsql = "SET NOCOUNT ON; EXEC BudgetMobile_PortOut_Validation ?,?,?";
		PreparedStatement ps = connection.prepareStatement(SPsql);
		ps.setString(1, "5015081305");
		ps.setString(2, "3062331");
		ps.setString(3, "1111");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			//System.out.println(rsmd.getColumnName(i));
		}

		if (rsmd.getColumnCount() == 3) {
            while (rs.next()) {
            	System.out.println(rs.getString("IMSI"));
			    System.out.println(rs.getString("Response_Code"));
			    System.out.println(rs.getString("Error_Message"));
		    }
		}
		else {
            while (rs.next()) {
			    System.out.println(rs.getString("Response_Code"));
			    System.out.println(rs.getString("Error_Message"));
		    }
		}
	}
}

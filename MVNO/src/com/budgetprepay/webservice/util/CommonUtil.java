package com.budgetprepay.webservice.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.webservice.ReturnMessage;

public class CommonUtil {

	public static String SUCCESS_CODE = "00";
	public static String SUCCESS_TEXT = "Success";
	
	public static String LONG_DATE_FORMAT = "MM/dd/yyyy hh:mm:ss";
			
	public static String SHORT_DATE_FORMAT = "MM/dd/yyyy";
	
	public static String getErrorRequestURL(final long id) throws Exception {
		return "http://" + "mvno-api01.budgetprepay.com" + "/MVNO/reqreserr?request=" + id;
	}
	
	public static String getErrorResponseURL(final long id) throws Exception {
		return "http://" + "mvno-api01.budgetprepay.com" + "/MVNO/reqreserr?response=" + id;
	}
	
	public static User retrieveByUsername(final String username) throws Exception {
		if (username == null)
			throw new Exception("ERROR: username " + username + " not found");
		User user = null;
	    user = UserFacade.retrieveByUsername(username);
		if (user == null)
			throw new Exception("ERROR: username " + username + " not found");
		return user;
	}
	
	public static void validateClientReference(final User user, final String reference) throws Exception {
		if (user == null)
			throw new Exception("ERROR: user is null");
		if (reference == null)
			throw new Exception("ERROR: reference is null");
		if (RequestFacade.retrieveByClientReference(user, reference) != null)
			throw new Exception("ERROR-Reference number must be unique");
	}
	
	public static void validateMDN(final String mdn) throws Exception {
		if (mdn == null)
			throw new Exception("ERROR: mdn is null");
		if (!mdn.matches("\\d{10}"))
			throw new Exception("ERROR: mdn format invalid");
	}
	
	public static String getRandom() throws Exception {
		Random random = new Random();
		Date date = new Date();
		random.setSeed(date.getTime());
		return String.valueOf(Math.abs(random.nextLong()));
	}
	
	@SuppressWarnings("rawtypes")
	public static String JAXB2XML(final Object object, final String nameSpace) throws Exception {
		JAXBContext context = JAXBContext.newInstance(object.getClass()); 
	    Marshaller marshaller = context.createMarshaller();
	    StringWriter writer = new StringWriter();
	    QName qname = new QName(nameSpace, object.getClass().getSimpleName());
	    @SuppressWarnings("unchecked")
		JAXBElement<?> rootElement = new JAXBElement(qname, object.getClass(), object);
	    marshaller.marshal(rootElement, writer);
	    return writer.toString();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object XML2JAXB(final Class clazz, final String xml) throws Exception {
		JAXBContext context = JAXBContext.newInstance(clazz); 
	    Source source = new StreamSource(new ByteArrayInputStream(xml.getBytes()));
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    JAXBElement<?> userElement = (JAXBElement<?>) unmarshaller.unmarshal(source, clazz);
	    return userElement.getValue();
	}
	
	public static ReturnMessage get(final String urlString) throws Exception {
		ReturnMessage returnMessage = new ReturnMessage();
		URL url = null;
		HttpURLConnection connection = null;
		
		try {
			url = new URL(urlString);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			returnMessage.setCode(connection.getResponseCode());
			returnMessage.setText(read(connection.getInputStream()));
		}
		catch (Exception e) {
			returnMessage.setCode(404);
			returnMessage.setText("Unable to GET from :" + urlString);
		}
		finally {
			if (connection != null)
			    connection.disconnect();
		}
		return returnMessage;
	}
	
	public static ReturnMessage post(final String xml, final String urlString) throws Exception {
		ReturnMessage returnMessage = new ReturnMessage();
		URL url = null;
		HttpURLConnection connection = null;
		
		try {
			url = new URL(urlString);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setReadTimeout(5000);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/xml");
			connection.setRequestProperty("Content-Length", "" + Integer.toString(xml.getBytes().length));
			OutputStream os = connection.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			osw.write(xml);
			osw.flush();
			osw.close();
			
			returnMessage.setCode(connection.getResponseCode());
			returnMessage.setText(read(connection.getInputStream()));
		}
		catch (Exception e) {
			returnMessage.setCode(404);
			returnMessage.setText("Unable to post xml to :" + urlString);
		}
		finally {
			if (connection != null)
			    connection.disconnect();
		}
		return returnMessage;
	}
	
	public static String read(final InputStream inputStream) throws Exception {
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
}

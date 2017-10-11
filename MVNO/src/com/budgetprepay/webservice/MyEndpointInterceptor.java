package com.budgetprepay.webservice;

import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.server.SoapEndpointInterceptor;

public class MyEndpointInterceptor implements SoapEndpointInterceptor, EndpointInterceptor, InitializingBean {
	
	private Logger logger = Logger.getLogger(MyEndpointInterceptor.class);
	
	private Transformer transformer;
	
	@Override
	public void afterCompletion(MessageContext messageContext, Object endpoint, Exception exception)throws Exception {
		logger.debug(getPayLoadMessage(messageContext.getRequest()));
		logger.debug(getPayLoadMessage(messageContext.getResponse()));
	}

	@Override
	public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
		logger.debug(getPayLoadMessage(messageContext.getResponse()));
		return true;
	}

	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint)throws Exception {
		logger.debug(getPayLoadMessage(messageContext.getRequest()));
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext, Object endpoint)throws Exception {
		logger.debug(getPayLoadMessage(messageContext.getResponse()));
		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.INDENT, "no");
	}

	@Override
	public boolean understands(SoapHeaderElement arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
    private String getPayLoadMessage(WebServiceMessage message) throws TransformerException {
        Source source = message.getPayloadSource();
        if (source != null) {
            StringWriter writer = new StringWriter();
            transformer.transform(source, new StreamResult(writer));
            return writer.toString();
        }
        return "";
    }
}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.16 at 09:29:06 PM CST 
//


package com.budgetprepay.webservice.pojos.topup;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.budgetprepay.webservice.pojos.topup package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnterOrderDetailsRequest_QNAME = new QName("http://www.budgetprepay.com/MVNO/Topup", "EnterOrderDetailsRequest");
    private final static QName _CancelOrderRequest_QNAME = new QName("http://www.budgetprepay.com/MVNO/Topup", "CancelOrderRequest");
    private final static QName _EnterOrderDetailsResponse_QNAME = new QName("http://www.budgetprepay.com/MVNO/Topup", "EnterOrderDetailsResponse");
    private final static QName _CancelOrderResponse_QNAME = new QName("http://www.budgetprepay.com/MVNO/Topup", "CancelOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.budgetprepay.webservice.pojos.topup
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelOrderRequest }
     * 
     */
    public CancelOrderRequest createCancelOrderRequest() {
        return new CancelOrderRequest();
    }

    /**
     * Create an instance of {@link CancelOrderResponse }
     * 
     */
    public CancelOrderResponse createCancelOrderResponse() {
        return new CancelOrderResponse();
    }

    /**
     * Create an instance of {@link EnterOrderDetailsResponse }
     * 
     */
    public EnterOrderDetailsResponse createEnterOrderDetailsResponse() {
        return new EnterOrderDetailsResponse();
    }

    /**
     * Create an instance of {@link EnterOrderDetailsRequest }
     * 
     */
    public EnterOrderDetailsRequest createEnterOrderDetailsRequest() {
        return new EnterOrderDetailsRequest();
    }

    /**
     * Create an instance of {@link ReturnMessageType }
     * 
     */
    public ReturnMessageType createReturnMessageType() {
        return new ReturnMessageType();
    }

    /**
     * Create an instance of {@link MessageHeaderType }
     * 
     */
    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterOrderDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.budgetprepay.com/MVNO/Topup", name = "EnterOrderDetailsRequest")
    public JAXBElement<EnterOrderDetailsRequest> createEnterOrderDetailsRequest(EnterOrderDetailsRequest value) {
        return new JAXBElement<EnterOrderDetailsRequest>(_EnterOrderDetailsRequest_QNAME, EnterOrderDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.budgetprepay.com/MVNO/Topup", name = "CancelOrderRequest")
    public JAXBElement<CancelOrderRequest> createCancelOrderRequest(CancelOrderRequest value) {
        return new JAXBElement<CancelOrderRequest>(_CancelOrderRequest_QNAME, CancelOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterOrderDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.budgetprepay.com/MVNO/Topup", name = "EnterOrderDetailsResponse")
    public JAXBElement<EnterOrderDetailsResponse> createEnterOrderDetailsResponse(EnterOrderDetailsResponse value) {
        return new JAXBElement<EnterOrderDetailsResponse>(_EnterOrderDetailsResponse_QNAME, EnterOrderDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.budgetprepay.com/MVNO/Topup", name = "CancelOrderResponse")
    public JAXBElement<CancelOrderResponse> createCancelOrderResponse(CancelOrderResponse value) {
        return new JAXBElement<CancelOrderResponse>(_CancelOrderResponse_QNAME, CancelOrderResponse.class, null, value);
    }

}
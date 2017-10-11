//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:13:08 PM CDT 
//


package com.budgetprepay.webservice.client.verizon.rss.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHeader" type="{http://www.verizonwireless.com/oas}messageHeaderType"/>
 *         &lt;element name="orderResponse" type="{http://www.verizonwireless.com/oas}resellerOrderResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageHeader",
    "orderResponse"
})
@XmlRootElement(name = "resellerOrderResponse")
public class ResellerOrderResponse {

    @XmlElement(required = true)
    protected MessageHeaderType messageHeader;
    @XmlElement(required = true)
    protected ResellerOrderResponseType orderResponse;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderType }
     *     
     */
    public MessageHeaderType getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderType }
     *     
     */
    public void setMessageHeader(MessageHeaderType value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the orderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResellerOrderResponseType }
     *     
     */
    public ResellerOrderResponseType getOrderResponse() {
        return orderResponse;
    }

    /**
     * Sets the value of the orderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellerOrderResponseType }
     *     
     */
    public void setOrderResponse(ResellerOrderResponseType value) {
        this.orderResponse = value;
    }

}

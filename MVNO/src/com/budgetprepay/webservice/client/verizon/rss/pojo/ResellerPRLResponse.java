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
 *         &lt;element name="PRLResponse" type="{http://www.verizonwireless.com/oas}resellerPRLResponseType"/>
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
    "prlResponse"
})
@XmlRootElement(name = "resellerPRLResponse")
public class ResellerPRLResponse {

    @XmlElement(required = true)
    protected MessageHeaderType messageHeader;
    @XmlElement(name = "PRLResponse", required = true)
    protected ResellerPRLResponseType prlResponse;

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
     * Gets the value of the prlResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResellerPRLResponseType }
     *     
     */
    public ResellerPRLResponseType getPRLResponse() {
        return prlResponse;
    }

    /**
     * Sets the value of the prlResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellerPRLResponseType }
     *     
     */
    public void setPRLResponse(ResellerPRLResponseType value) {
        this.prlResponse = value;
    }

}

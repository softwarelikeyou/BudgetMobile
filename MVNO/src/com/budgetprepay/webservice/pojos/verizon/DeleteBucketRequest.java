//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:23:41 PM CDT 
//


package com.budgetprepay.webservice.pojos.verizon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteBucketRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteBucketRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHeader" type="{http://www.budgetprepay.com/MVNO/Verizon}messageHeaderType"/>
 *         &lt;element name="mdn" type="{http://www.budgetprepay.com/MVNO/Verizon}phoneType"/>
 *         &lt;element name="bucketId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteBucketRequest", propOrder = {
    "messageHeader",
    "mdn",
    "bucketId"
})
public class DeleteBucketRequest {

    @XmlElement(required = true)
    protected MessageHeaderType messageHeader;
    @XmlElement(required = true)
    protected String mdn;
    @XmlElement(required = true)
    protected String bucketId;

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
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdn(String value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the bucketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketId() {
        return bucketId;
    }

    /**
     * Sets the value of the bucketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketId(String value) {
        this.bucketId = value;
    }

}

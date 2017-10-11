//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 06:47:32 PM CST 
//


package com.budgetprepay.verizon.rss.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qualificationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualificationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputAddress" type="{http://www.verizonwireless.com/oas}inputAddressType"/>
 *         &lt;element name="addressInfoList" type="{http://www.verizonwireless.com/oas}addressInfoListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualificationResponseType", propOrder = {
    "returnCode",
    "returnMessage",
    "inputAddress",
    "addressInfoList"
})
public class QualificationResponseType {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnMessage;
    @XmlElement(required = true)
    protected InputAddressType inputAddress;
    @XmlElement(required = true)
    protected AddressInfoListType addressInfoList;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the returnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMessage() {
        return returnMessage;
    }

    /**
     * Sets the value of the returnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMessage(String value) {
        this.returnMessage = value;
    }

    /**
     * Gets the value of the inputAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InputAddressType }
     *     
     */
    public InputAddressType getInputAddress() {
        return inputAddress;
    }

    /**
     * Sets the value of the inputAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputAddressType }
     *     
     */
    public void setInputAddress(InputAddressType value) {
        this.inputAddress = value;
    }

    /**
     * Gets the value of the addressInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoListType }
     *     
     */
    public AddressInfoListType getAddressInfoList() {
        return addressInfoList;
    }

    /**
     * Sets the value of the addressInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoListType }
     *     
     */
    public void setAddressInfoList(AddressInfoListType value) {
        this.addressInfoList = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 03:17:53 PM CST 
//


package com.budgetprepay.webservice.pojos.bequick;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceId" type="{http://www.budgetprepay.com/MVNO/Bequick}referenceIdType"/>
 *         &lt;element name="returnMessage" type="{http://www.budgetprepay.com/MVNO/Bequick}returnMessageType"/>
 *         &lt;element name="mdn" type="{http://www.budgetprepay.com/MVNO/Bequick}mdnType" minOccurs="0"/>
 *         &lt;element name="msid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esn" type="{http://www.budgetprepay.com/MVNO/Bequick}esnType" minOccurs="0"/>
 *         &lt;element name="msl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivateResponse", propOrder = {
    "referenceId",
    "returnMessage",
    "mdn",
    "msid",
    "esn",
    "msl"
})
public class ActivateResponse {

    @XmlElement(required = true)
    protected String referenceId;
    @XmlElement(required = true)
    protected ReturnMessageType returnMessage;
    protected String mdn;
    protected String msid;
    protected String esn;
    protected String msl;

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the returnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessageType }
     *     
     */
    public ReturnMessageType getReturnMessage() {
        return returnMessage;
    }

    /**
     * Sets the value of the returnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessageType }
     *     
     */
    public void setReturnMessage(ReturnMessageType value) {
        this.returnMessage = value;
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
     * Gets the value of the msid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsid() {
        return msid;
    }

    /**
     * Sets the value of the msid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsid(String value) {
        this.msid = value;
    }

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Gets the value of the msl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsl() {
        return msl;
    }

    /**
     * Sets the value of the msl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsl(String value) {
        this.msl = value;
    }

}

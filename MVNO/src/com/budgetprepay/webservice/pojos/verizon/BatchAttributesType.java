//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:23:41 PM CDT 
//


package com.budgetprepay.webservice.pojos.verizon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for batchAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="batchAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availablePINCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activatedPINCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retiredPINCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batchAttributesType", propOrder = {
    "batch",
    "batchStatus",
    "batchValue",
    "availablePINCount",
    "activatedPINCount",
    "retiredPINCount",
    "providerCode"
})
public class BatchAttributesType {

    protected String batch;
    protected String batchStatus;
    protected String batchValue;
    protected String availablePINCount;
    protected String activatedPINCount;
    protected String retiredPINCount;
    protected String providerCode;

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch(String value) {
        this.batch = value;
    }

    /**
     * Gets the value of the batchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchStatus() {
        return batchStatus;
    }

    /**
     * Sets the value of the batchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchStatus(String value) {
        this.batchStatus = value;
    }

    /**
     * Gets the value of the batchValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchValue() {
        return batchValue;
    }

    /**
     * Sets the value of the batchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchValue(String value) {
        this.batchValue = value;
    }

    /**
     * Gets the value of the availablePINCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailablePINCount() {
        return availablePINCount;
    }

    /**
     * Sets the value of the availablePINCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailablePINCount(String value) {
        this.availablePINCount = value;
    }

    /**
     * Gets the value of the activatedPINCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivatedPINCount() {
        return activatedPINCount;
    }

    /**
     * Sets the value of the activatedPINCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivatedPINCount(String value) {
        this.activatedPINCount = value;
    }

    /**
     * Gets the value of the retiredPINCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetiredPINCount() {
        return retiredPINCount;
    }

    /**
     * Sets the value of the retiredPINCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetiredPINCount(String value) {
        this.retiredPINCount = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

}

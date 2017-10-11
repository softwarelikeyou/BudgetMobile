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
 * <p>Java class for UpdatePINGroupInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePINGroupInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnMessage" type="{http://www.budgetprepay.com/MVNO/Verizon}returnMessageType"/>
 *         &lt;element name="transactionContext" type="{http://www.budgetprepay.com/MVNO/Verizon}transactionContextType" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateRows" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availablePINCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activatedPINCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retiredPINCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePINGroupInfoResponse", propOrder = {
    "returnMessage",
    "transactionContext",
    "group",
    "level",
    "denomination",
    "expirationDate",
    "updateRows",
    "availablePINCount",
    "activatedPINCount",
    "retiredPINCount"
})
public class UpdatePINGroupInfoResponse {

    @XmlElement(required = true)
    protected ReturnMessageType returnMessage;
    protected TransactionContextType transactionContext;
    protected String group;
    protected String level;
    protected String denomination;
    protected String expirationDate;
    protected String updateRows;
    protected String availablePINCount;
    protected String activatedPINCount;
    protected String retiredPINCount;

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
     * Gets the value of the transactionContext property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContextType }
     *     
     */
    public TransactionContextType getTransactionContext() {
        return transactionContext;
    }

    /**
     * Sets the value of the transactionContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContextType }
     *     
     */
    public void setTransactionContext(TransactionContextType value) {
        this.transactionContext = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the denomination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * Sets the value of the denomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomination(String value) {
        this.denomination = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the updateRows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateRows() {
        return updateRows;
    }

    /**
     * Sets the value of the updateRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateRows(String value) {
        this.updateRows = value;
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

}

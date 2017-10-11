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
 * <p>Java class for resellerOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderTimeStamp" type="{http://www.verizonwireless.com/oas}oasStringType"/>
 *         &lt;element name="accountNumber" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="subOrder" type="{http://www.verizonwireless.com/oas}resellerSubOrderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerOrderType", propOrder = {
    "orderTimeStamp",
    "accountNumber",
    "subOrder"
})
public class ResellerOrderType {

    @XmlElement(required = true)
    protected OasStringType orderTimeStamp;
    protected OasStringType accountNumber;
    @XmlElement(required = true)
    protected ResellerSubOrderType subOrder;

    /**
     * Gets the value of the orderTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getOrderTimeStamp() {
        return orderTimeStamp;
    }

    /**
     * Sets the value of the orderTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setOrderTimeStamp(OasStringType value) {
        this.orderTimeStamp = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setAccountNumber(OasStringType value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the subOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ResellerSubOrderType }
     *     
     */
    public ResellerSubOrderType getSubOrder() {
        return subOrder;
    }

    /**
     * Sets the value of the subOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellerSubOrderType }
     *     
     */
    public void setSubOrder(ResellerSubOrderType value) {
        this.subOrder = value;
    }

}

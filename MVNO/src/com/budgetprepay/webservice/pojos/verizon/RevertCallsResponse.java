//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:23:41 PM CDT 
//


package com.budgetprepay.webservice.pojos.verizon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevertCallsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevertCallsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnMessage" type="{http://www.budgetprepay.com/MVNO/Verizon}returnMessageType"/>
 *         &lt;element name="transactionContext" type="{http://www.budgetprepay.com/MVNO/Verizon}transactionContextType" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputCallList" type="{http://www.budgetprepay.com/MVNO/Verizon}outputCallListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevertCallsResponse", propOrder = {
    "returnMessage",
    "transactionContext",
    "balance",
    "outputCallList"
})
public class RevertCallsResponse {

    @XmlElement(required = true)
    protected ReturnMessageType returnMessage;
    protected TransactionContextType transactionContext;
    protected String balance;
    protected List<OutputCallListType> outputCallList;

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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the outputCallList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputCallList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputCallList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputCallListType }
     * 
     * 
     */
    public List<OutputCallListType> getOutputCallList() {
        if (outputCallList == null) {
            outputCallList = new ArrayList<OutputCallListType>();
        }
        return this.outputCallList;
    }

}

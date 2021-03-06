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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resellerPortInInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerPortInInquiryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mdn" type="{http://www.verizonwireless.com/oas}mdnType"/>
 *         &lt;element name="lnpStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lnpResponseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onsp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lnp" type="{http://www.verizonwireless.com/oas}lnpType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerPortInInquiryResponseType", propOrder = {
    "returnCode",
    "returnMessage",
    "mdn",
    "lnpStatusCode",
    "lnpResponseType",
    "onsp",
    "reasonCode",
    "reasonDetail",
    "lnp"
})
public class ResellerPortInInquiryResponseType {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnMessage;
    @XmlElement(required = true)
    protected MdnType mdn;
    @XmlElement(required = true)
    protected String lnpStatusCode;
    @XmlElement(required = true)
    protected String lnpResponseType;
    @XmlElement(required = true)
    protected String onsp;
    @XmlElement(required = true)
    protected String reasonCode;
    @XmlElement(required = true)
    protected String reasonDetail;
    @XmlElement(required = true)
    protected LnpType lnp;

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
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link MdnType }
     *     
     */
    public MdnType getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MdnType }
     *     
     */
    public void setMdn(MdnType value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the lnpStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnpStatusCode() {
        return lnpStatusCode;
    }

    /**
     * Sets the value of the lnpStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnpStatusCode(String value) {
        this.lnpStatusCode = value;
    }

    /**
     * Gets the value of the lnpResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnpResponseType() {
        return lnpResponseType;
    }

    /**
     * Sets the value of the lnpResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnpResponseType(String value) {
        this.lnpResponseType = value;
    }

    /**
     * Gets the value of the onsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnsp() {
        return onsp;
    }

    /**
     * Sets the value of the onsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnsp(String value) {
        this.onsp = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reasonDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDetail() {
        return reasonDetail;
    }

    /**
     * Sets the value of the reasonDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDetail(String value) {
        this.reasonDetail = value;
    }

    /**
     * Gets the value of the lnp property.
     * 
     * @return
     *     possible object is
     *     {@link LnpType }
     *     
     */
    public LnpType getLnp() {
        return lnp;
    }

    /**
     * Sets the value of the lnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnpType }
     *     
     */
    public void setLnp(LnpType value) {
        this.lnp = value;
    }

}

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
 * 
 * 				reseller Change SIM transaction is applicable to 4G-LTE 
 * 			
 * 
 * <p>Java class for resellerChangeSIMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerChangeSIMType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verizonwireless.com/oas}resellerSubOrderBaseType">
 *       &lt;sequence>
 *         &lt;element name="mdn" type="{http://www.verizonwireless.com/oas}mdnType"/>
 *         &lt;element name="iccid" type="{http://www.verizonwireless.com/oas}SIMCardWithOldSIMCardType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerChangeSIMType", propOrder = {
    "mdn",
    "iccid"
})
public class ResellerChangeSIMType
    extends ResellerSubOrderBaseType
{

    @XmlElement(required = true)
    protected MdnType mdn;
    @XmlElement(required = true)
    protected SIMCardWithOldSIMCardType iccid;

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
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link SIMCardWithOldSIMCardType }
     *     
     */
    public SIMCardWithOldSIMCardType getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIMCardWithOldSIMCardType }
     *     
     */
    public void setIccid(SIMCardWithOldSIMCardType value) {
        this.iccid = value;
    }

}

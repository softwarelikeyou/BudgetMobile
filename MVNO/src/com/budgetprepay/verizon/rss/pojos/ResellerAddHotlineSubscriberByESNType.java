//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 06:47:32 PM CST 
//


package com.budgetprepay.verizon.rss.pojos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				MPNPoolName added in release 2045:
 * 				If the MPNPoolName tag is given in the xml, the feature element
 * 			for MPN static IP or MPN dynamic IP (MPNSIP or MPNDIP) should
 * 			be included in the  features section.
 * 			
 * 
 * <p>Java class for resellerAddHotlineSubscriberByESNType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerAddHotlineSubscriberByESNType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verizonwireless.com/oas}resellerSubOrderBaseType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="esn" type="{http://www.verizonwireless.com/oas}esnType"/>
 *           &lt;element name="meid" type="{http://www.verizonwireless.com/oas}meidType"/>
 *         &lt;/choice>
 *         &lt;element name="mobileIPAddress" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="MPNPoolName" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="SubOrgID" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="FUSFExemptFlag" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="iec" type="{http://www.verizonwireless.com/oas}ldcOrIecType" minOccurs="0"/>
 *         &lt;element name="ldc" type="{http://www.verizonwireless.com/oas}ldcOrIecType" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://www.verizonwireless.com/oas}featureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://www.verizonwireless.com/oas}planType"/>
 *         &lt;element name="reasonCode" type="{http://www.verizonwireless.com/oas}reasonCodeType" minOccurs="0"/>
 *         &lt;element name="competitorCode" type="{http://www.verizonwireless.com/oas}competitorCodeType" minOccurs="0"/>
 *         &lt;element name="hotlineType" type="{http://www.verizonwireless.com/oas}oasStringType"/>
 *         &lt;choice>
 *           &lt;element name="hotline" type="{http://www.verizonwireless.com/oas}phoneType"/>
 *           &lt;element name="hotlineNumber" type="{http://www.verizonwireless.com/oas}phoneType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerAddHotlineSubscriberByESNType", propOrder = {
    "esn",
    "meid",
    "mobileIPAddress",
    "mpnPoolName",
    "subOrgID",
    "fusfExemptFlag",
    "iec",
    "ldc",
    "feature",
    "plan",
    "reasonCode",
    "competitorCode",
    "hotlineType",
    "hotline",
    "hotlineNumber"
})
public class ResellerAddHotlineSubscriberByESNType
    extends ResellerSubOrderBaseType
{

    protected String esn;
    protected String meid;
    protected OasStringType mobileIPAddress;
    @XmlElement(name = "MPNPoolName")
    protected OasStringType mpnPoolName;
    @XmlElement(name = "SubOrgID")
    protected OasStringType subOrgID;
    @XmlElement(name = "FUSFExemptFlag")
    protected YesNoType fusfExemptFlag;
    protected LdcOrIecType iec;
    protected LdcOrIecType ldc;
    protected List<FeatureType> feature;
    @XmlElement(required = true)
    protected PlanType plan;
    protected ReasonCodeType reasonCode;
    protected CompetitorCodeType competitorCode;
    @XmlElement(required = true)
    protected OasStringType hotlineType;
    protected PhoneType hotline;
    protected PhoneType hotlineNumber;

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
     * Gets the value of the meid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeid() {
        return meid;
    }

    /**
     * Sets the value of the meid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeid(String value) {
        this.meid = value;
    }

    /**
     * Gets the value of the mobileIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getMobileIPAddress() {
        return mobileIPAddress;
    }

    /**
     * Sets the value of the mobileIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setMobileIPAddress(OasStringType value) {
        this.mobileIPAddress = value;
    }

    /**
     * Gets the value of the mpnPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getMPNPoolName() {
        return mpnPoolName;
    }

    /**
     * Sets the value of the mpnPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setMPNPoolName(OasStringType value) {
        this.mpnPoolName = value;
    }

    /**
     * Gets the value of the subOrgID property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getSubOrgID() {
        return subOrgID;
    }

    /**
     * Sets the value of the subOrgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setSubOrgID(OasStringType value) {
        this.subOrgID = value;
    }

    /**
     * Gets the value of the fusfExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getFUSFExemptFlag() {
        return fusfExemptFlag;
    }

    /**
     * Sets the value of the fusfExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setFUSFExemptFlag(YesNoType value) {
        this.fusfExemptFlag = value;
    }

    /**
     * Gets the value of the iec property.
     * 
     * @return
     *     possible object is
     *     {@link LdcOrIecType }
     *     
     */
    public LdcOrIecType getIec() {
        return iec;
    }

    /**
     * Sets the value of the iec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdcOrIecType }
     *     
     */
    public void setIec(LdcOrIecType value) {
        this.iec = value;
    }

    /**
     * Gets the value of the ldc property.
     * 
     * @return
     *     possible object is
     *     {@link LdcOrIecType }
     *     
     */
    public LdcOrIecType getLdc() {
        return ldc;
    }

    /**
     * Sets the value of the ldc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdcOrIecType }
     *     
     */
    public void setLdc(LdcOrIecType value) {
        this.ldc = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureType }
     * 
     * 
     */
    public List<FeatureType> getFeature() {
        if (feature == null) {
            feature = new ArrayList<FeatureType>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link PlanType }
     *     
     */
    public PlanType getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanType }
     *     
     */
    public void setPlan(PlanType value) {
        this.plan = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCodeType }
     *     
     */
    public ReasonCodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCodeType }
     *     
     */
    public void setReasonCode(ReasonCodeType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the competitorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitorCodeType }
     *     
     */
    public CompetitorCodeType getCompetitorCode() {
        return competitorCode;
    }

    /**
     * Sets the value of the competitorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitorCodeType }
     *     
     */
    public void setCompetitorCode(CompetitorCodeType value) {
        this.competitorCode = value;
    }

    /**
     * Gets the value of the hotlineType property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getHotlineType() {
        return hotlineType;
    }

    /**
     * Sets the value of the hotlineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setHotlineType(OasStringType value) {
        this.hotlineType = value;
    }

    /**
     * Gets the value of the hotline property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getHotline() {
        return hotline;
    }

    /**
     * Sets the value of the hotline property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setHotline(PhoneType value) {
        this.hotline = value;
    }

    /**
     * Gets the value of the hotlineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getHotlineNumber() {
        return hotlineNumber;
    }

    /**
     * Sets the value of the hotlineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setHotlineNumber(PhoneType value) {
        this.hotlineNumber = value;
    }

}
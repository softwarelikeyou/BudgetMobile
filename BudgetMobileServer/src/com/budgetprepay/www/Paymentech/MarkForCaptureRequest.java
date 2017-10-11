/**
 * MarkForCaptureRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class MarkForCaptureRequest  implements java.io.Serializable {
    private java.lang.String endppoint;

    private java.lang.String bin;

    private java.lang.String merchantID;

    private java.lang.String orbitalConnectionPassword;

    private java.lang.String orbitalConnectionUsername;

    private java.lang.String terminalID;

    private java.lang.String amount;

    private java.lang.String orderID;

    private java.lang.String txRefNum;

    private java.lang.String PCard3AltTaxAmt;

    private java.lang.String PCard3AltTaxInd;

    private java.lang.String PCard3DestCountryCd;

    private java.lang.String PCard3DiscAmt;

    private java.lang.String PCard3DutyAmt;

    private java.lang.String PCard3FreightAmt;

    private java.lang.String PCard3LineItemCount;

    private com.budgetprepay.www.Paymentech.PCard3LineItems[] PCard3LineItems;

    private java.lang.String PCard3ShipFromZip;

    private java.lang.String PCard3VATtaxAmt;

    private java.lang.String PCard3VATtaxRate;

    private java.lang.String PCardDestAddress;

    private java.lang.String PCardDestAddress2;

    private java.lang.String PCardDestCity;

    private java.lang.String PCardDestName;

    private java.lang.String PCardDestStateCd;

    private java.lang.String PCardDestZip;

    private java.lang.String PCardOrderID;

    private java.lang.String amexTranAdvAddn1;

    private java.lang.String amexTranAdvAddn2;

    private java.lang.String amexTranAdvAddn3;

    private java.lang.String amexTranAdvAddn4;

    private java.lang.String retryTrace;

    private java.lang.String taxAmount;

    private java.lang.String taxInd;

    public MarkForCaptureRequest() {
    }

    public MarkForCaptureRequest(
           java.lang.String endppoint,
           java.lang.String bin,
           java.lang.String merchantID,
           java.lang.String orbitalConnectionPassword,
           java.lang.String orbitalConnectionUsername,
           java.lang.String terminalID,
           java.lang.String amount,
           java.lang.String orderID,
           java.lang.String txRefNum,
           java.lang.String PCard3AltTaxAmt,
           java.lang.String PCard3AltTaxInd,
           java.lang.String PCard3DestCountryCd,
           java.lang.String PCard3DiscAmt,
           java.lang.String PCard3DutyAmt,
           java.lang.String PCard3FreightAmt,
           java.lang.String PCard3LineItemCount,
           com.budgetprepay.www.Paymentech.PCard3LineItems[] PCard3LineItems,
           java.lang.String PCard3ShipFromZip,
           java.lang.String PCard3VATtaxAmt,
           java.lang.String PCard3VATtaxRate,
           java.lang.String PCardDestAddress,
           java.lang.String PCardDestAddress2,
           java.lang.String PCardDestCity,
           java.lang.String PCardDestName,
           java.lang.String PCardDestStateCd,
           java.lang.String PCardDestZip,
           java.lang.String PCardOrderID,
           java.lang.String amexTranAdvAddn1,
           java.lang.String amexTranAdvAddn2,
           java.lang.String amexTranAdvAddn3,
           java.lang.String amexTranAdvAddn4,
           java.lang.String retryTrace,
           java.lang.String taxAmount,
           java.lang.String taxInd) {
           this.endppoint = endppoint;
           this.bin = bin;
           this.merchantID = merchantID;
           this.orbitalConnectionPassword = orbitalConnectionPassword;
           this.orbitalConnectionUsername = orbitalConnectionUsername;
           this.terminalID = terminalID;
           this.amount = amount;
           this.orderID = orderID;
           this.txRefNum = txRefNum;
           this.PCard3AltTaxAmt = PCard3AltTaxAmt;
           this.PCard3AltTaxInd = PCard3AltTaxInd;
           this.PCard3DestCountryCd = PCard3DestCountryCd;
           this.PCard3DiscAmt = PCard3DiscAmt;
           this.PCard3DutyAmt = PCard3DutyAmt;
           this.PCard3FreightAmt = PCard3FreightAmt;
           this.PCard3LineItemCount = PCard3LineItemCount;
           this.PCard3LineItems = PCard3LineItems;
           this.PCard3ShipFromZip = PCard3ShipFromZip;
           this.PCard3VATtaxAmt = PCard3VATtaxAmt;
           this.PCard3VATtaxRate = PCard3VATtaxRate;
           this.PCardDestAddress = PCardDestAddress;
           this.PCardDestAddress2 = PCardDestAddress2;
           this.PCardDestCity = PCardDestCity;
           this.PCardDestName = PCardDestName;
           this.PCardDestStateCd = PCardDestStateCd;
           this.PCardDestZip = PCardDestZip;
           this.PCardOrderID = PCardOrderID;
           this.amexTranAdvAddn1 = amexTranAdvAddn1;
           this.amexTranAdvAddn2 = amexTranAdvAddn2;
           this.amexTranAdvAddn3 = amexTranAdvAddn3;
           this.amexTranAdvAddn4 = amexTranAdvAddn4;
           this.retryTrace = retryTrace;
           this.taxAmount = taxAmount;
           this.taxInd = taxInd;
    }


    /**
     * Gets the endppoint value for this MarkForCaptureRequest.
     * 
     * @return endppoint
     */
    public java.lang.String getEndppoint() {
        return endppoint;
    }


    /**
     * Sets the endppoint value for this MarkForCaptureRequest.
     * 
     * @param endppoint
     */
    public void setEndppoint(java.lang.String endppoint) {
        this.endppoint = endppoint;
    }


    /**
     * Gets the bin value for this MarkForCaptureRequest.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this MarkForCaptureRequest.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the merchantID value for this MarkForCaptureRequest.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this MarkForCaptureRequest.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orbitalConnectionPassword value for this MarkForCaptureRequest.
     * 
     * @return orbitalConnectionPassword
     */
    public java.lang.String getOrbitalConnectionPassword() {
        return orbitalConnectionPassword;
    }


    /**
     * Sets the orbitalConnectionPassword value for this MarkForCaptureRequest.
     * 
     * @param orbitalConnectionPassword
     */
    public void setOrbitalConnectionPassword(java.lang.String orbitalConnectionPassword) {
        this.orbitalConnectionPassword = orbitalConnectionPassword;
    }


    /**
     * Gets the orbitalConnectionUsername value for this MarkForCaptureRequest.
     * 
     * @return orbitalConnectionUsername
     */
    public java.lang.String getOrbitalConnectionUsername() {
        return orbitalConnectionUsername;
    }


    /**
     * Sets the orbitalConnectionUsername value for this MarkForCaptureRequest.
     * 
     * @param orbitalConnectionUsername
     */
    public void setOrbitalConnectionUsername(java.lang.String orbitalConnectionUsername) {
        this.orbitalConnectionUsername = orbitalConnectionUsername;
    }


    /**
     * Gets the terminalID value for this MarkForCaptureRequest.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this MarkForCaptureRequest.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the amount value for this MarkForCaptureRequest.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this MarkForCaptureRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the orderID value for this MarkForCaptureRequest.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this MarkForCaptureRequest.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the txRefNum value for this MarkForCaptureRequest.
     * 
     * @return txRefNum
     */
    public java.lang.String getTxRefNum() {
        return txRefNum;
    }


    /**
     * Sets the txRefNum value for this MarkForCaptureRequest.
     * 
     * @param txRefNum
     */
    public void setTxRefNum(java.lang.String txRefNum) {
        this.txRefNum = txRefNum;
    }


    /**
     * Gets the PCard3AltTaxAmt value for this MarkForCaptureRequest.
     * 
     * @return PCard3AltTaxAmt
     */
    public java.lang.String getPCard3AltTaxAmt() {
        return PCard3AltTaxAmt;
    }


    /**
     * Sets the PCard3AltTaxAmt value for this MarkForCaptureRequest.
     * 
     * @param PCard3AltTaxAmt
     */
    public void setPCard3AltTaxAmt(java.lang.String PCard3AltTaxAmt) {
        this.PCard3AltTaxAmt = PCard3AltTaxAmt;
    }


    /**
     * Gets the PCard3AltTaxInd value for this MarkForCaptureRequest.
     * 
     * @return PCard3AltTaxInd
     */
    public java.lang.String getPCard3AltTaxInd() {
        return PCard3AltTaxInd;
    }


    /**
     * Sets the PCard3AltTaxInd value for this MarkForCaptureRequest.
     * 
     * @param PCard3AltTaxInd
     */
    public void setPCard3AltTaxInd(java.lang.String PCard3AltTaxInd) {
        this.PCard3AltTaxInd = PCard3AltTaxInd;
    }


    /**
     * Gets the PCard3DestCountryCd value for this MarkForCaptureRequest.
     * 
     * @return PCard3DestCountryCd
     */
    public java.lang.String getPCard3DestCountryCd() {
        return PCard3DestCountryCd;
    }


    /**
     * Sets the PCard3DestCountryCd value for this MarkForCaptureRequest.
     * 
     * @param PCard3DestCountryCd
     */
    public void setPCard3DestCountryCd(java.lang.String PCard3DestCountryCd) {
        this.PCard3DestCountryCd = PCard3DestCountryCd;
    }


    /**
     * Gets the PCard3DiscAmt value for this MarkForCaptureRequest.
     * 
     * @return PCard3DiscAmt
     */
    public java.lang.String getPCard3DiscAmt() {
        return PCard3DiscAmt;
    }


    /**
     * Sets the PCard3DiscAmt value for this MarkForCaptureRequest.
     * 
     * @param PCard3DiscAmt
     */
    public void setPCard3DiscAmt(java.lang.String PCard3DiscAmt) {
        this.PCard3DiscAmt = PCard3DiscAmt;
    }


    /**
     * Gets the PCard3DutyAmt value for this MarkForCaptureRequest.
     * 
     * @return PCard3DutyAmt
     */
    public java.lang.String getPCard3DutyAmt() {
        return PCard3DutyAmt;
    }


    /**
     * Sets the PCard3DutyAmt value for this MarkForCaptureRequest.
     * 
     * @param PCard3DutyAmt
     */
    public void setPCard3DutyAmt(java.lang.String PCard3DutyAmt) {
        this.PCard3DutyAmt = PCard3DutyAmt;
    }


    /**
     * Gets the PCard3FreightAmt value for this MarkForCaptureRequest.
     * 
     * @return PCard3FreightAmt
     */
    public java.lang.String getPCard3FreightAmt() {
        return PCard3FreightAmt;
    }


    /**
     * Sets the PCard3FreightAmt value for this MarkForCaptureRequest.
     * 
     * @param PCard3FreightAmt
     */
    public void setPCard3FreightAmt(java.lang.String PCard3FreightAmt) {
        this.PCard3FreightAmt = PCard3FreightAmt;
    }


    /**
     * Gets the PCard3LineItemCount value for this MarkForCaptureRequest.
     * 
     * @return PCard3LineItemCount
     */
    public java.lang.String getPCard3LineItemCount() {
        return PCard3LineItemCount;
    }


    /**
     * Sets the PCard3LineItemCount value for this MarkForCaptureRequest.
     * 
     * @param PCard3LineItemCount
     */
    public void setPCard3LineItemCount(java.lang.String PCard3LineItemCount) {
        this.PCard3LineItemCount = PCard3LineItemCount;
    }


    /**
     * Gets the PCard3LineItems value for this MarkForCaptureRequest.
     * 
     * @return PCard3LineItems
     */
    public com.budgetprepay.www.Paymentech.PCard3LineItems[] getPCard3LineItems() {
        return PCard3LineItems;
    }


    /**
     * Sets the PCard3LineItems value for this MarkForCaptureRequest.
     * 
     * @param PCard3LineItems
     */
    public void setPCard3LineItems(com.budgetprepay.www.Paymentech.PCard3LineItems[] PCard3LineItems) {
        this.PCard3LineItems = PCard3LineItems;
    }

    public com.budgetprepay.www.Paymentech.PCard3LineItems getPCard3LineItems(int i) {
        return this.PCard3LineItems[i];
    }

    public void setPCard3LineItems(int i, com.budgetprepay.www.Paymentech.PCard3LineItems _value) {
        this.PCard3LineItems[i] = _value;
    }


    /**
     * Gets the PCard3ShipFromZip value for this MarkForCaptureRequest.
     * 
     * @return PCard3ShipFromZip
     */
    public java.lang.String getPCard3ShipFromZip() {
        return PCard3ShipFromZip;
    }


    /**
     * Sets the PCard3ShipFromZip value for this MarkForCaptureRequest.
     * 
     * @param PCard3ShipFromZip
     */
    public void setPCard3ShipFromZip(java.lang.String PCard3ShipFromZip) {
        this.PCard3ShipFromZip = PCard3ShipFromZip;
    }


    /**
     * Gets the PCard3VATtaxAmt value for this MarkForCaptureRequest.
     * 
     * @return PCard3VATtaxAmt
     */
    public java.lang.String getPCard3VATtaxAmt() {
        return PCard3VATtaxAmt;
    }


    /**
     * Sets the PCard3VATtaxAmt value for this MarkForCaptureRequest.
     * 
     * @param PCard3VATtaxAmt
     */
    public void setPCard3VATtaxAmt(java.lang.String PCard3VATtaxAmt) {
        this.PCard3VATtaxAmt = PCard3VATtaxAmt;
    }


    /**
     * Gets the PCard3VATtaxRate value for this MarkForCaptureRequest.
     * 
     * @return PCard3VATtaxRate
     */
    public java.lang.String getPCard3VATtaxRate() {
        return PCard3VATtaxRate;
    }


    /**
     * Sets the PCard3VATtaxRate value for this MarkForCaptureRequest.
     * 
     * @param PCard3VATtaxRate
     */
    public void setPCard3VATtaxRate(java.lang.String PCard3VATtaxRate) {
        this.PCard3VATtaxRate = PCard3VATtaxRate;
    }


    /**
     * Gets the PCardDestAddress value for this MarkForCaptureRequest.
     * 
     * @return PCardDestAddress
     */
    public java.lang.String getPCardDestAddress() {
        return PCardDestAddress;
    }


    /**
     * Sets the PCardDestAddress value for this MarkForCaptureRequest.
     * 
     * @param PCardDestAddress
     */
    public void setPCardDestAddress(java.lang.String PCardDestAddress) {
        this.PCardDestAddress = PCardDestAddress;
    }


    /**
     * Gets the PCardDestAddress2 value for this MarkForCaptureRequest.
     * 
     * @return PCardDestAddress2
     */
    public java.lang.String getPCardDestAddress2() {
        return PCardDestAddress2;
    }


    /**
     * Sets the PCardDestAddress2 value for this MarkForCaptureRequest.
     * 
     * @param PCardDestAddress2
     */
    public void setPCardDestAddress2(java.lang.String PCardDestAddress2) {
        this.PCardDestAddress2 = PCardDestAddress2;
    }


    /**
     * Gets the PCardDestCity value for this MarkForCaptureRequest.
     * 
     * @return PCardDestCity
     */
    public java.lang.String getPCardDestCity() {
        return PCardDestCity;
    }


    /**
     * Sets the PCardDestCity value for this MarkForCaptureRequest.
     * 
     * @param PCardDestCity
     */
    public void setPCardDestCity(java.lang.String PCardDestCity) {
        this.PCardDestCity = PCardDestCity;
    }


    /**
     * Gets the PCardDestName value for this MarkForCaptureRequest.
     * 
     * @return PCardDestName
     */
    public java.lang.String getPCardDestName() {
        return PCardDestName;
    }


    /**
     * Sets the PCardDestName value for this MarkForCaptureRequest.
     * 
     * @param PCardDestName
     */
    public void setPCardDestName(java.lang.String PCardDestName) {
        this.PCardDestName = PCardDestName;
    }


    /**
     * Gets the PCardDestStateCd value for this MarkForCaptureRequest.
     * 
     * @return PCardDestStateCd
     */
    public java.lang.String getPCardDestStateCd() {
        return PCardDestStateCd;
    }


    /**
     * Sets the PCardDestStateCd value for this MarkForCaptureRequest.
     * 
     * @param PCardDestStateCd
     */
    public void setPCardDestStateCd(java.lang.String PCardDestStateCd) {
        this.PCardDestStateCd = PCardDestStateCd;
    }


    /**
     * Gets the PCardDestZip value for this MarkForCaptureRequest.
     * 
     * @return PCardDestZip
     */
    public java.lang.String getPCardDestZip() {
        return PCardDestZip;
    }


    /**
     * Sets the PCardDestZip value for this MarkForCaptureRequest.
     * 
     * @param PCardDestZip
     */
    public void setPCardDestZip(java.lang.String PCardDestZip) {
        this.PCardDestZip = PCardDestZip;
    }


    /**
     * Gets the PCardOrderID value for this MarkForCaptureRequest.
     * 
     * @return PCardOrderID
     */
    public java.lang.String getPCardOrderID() {
        return PCardOrderID;
    }


    /**
     * Sets the PCardOrderID value for this MarkForCaptureRequest.
     * 
     * @param PCardOrderID
     */
    public void setPCardOrderID(java.lang.String PCardOrderID) {
        this.PCardOrderID = PCardOrderID;
    }


    /**
     * Gets the amexTranAdvAddn1 value for this MarkForCaptureRequest.
     * 
     * @return amexTranAdvAddn1
     */
    public java.lang.String getAmexTranAdvAddn1() {
        return amexTranAdvAddn1;
    }


    /**
     * Sets the amexTranAdvAddn1 value for this MarkForCaptureRequest.
     * 
     * @param amexTranAdvAddn1
     */
    public void setAmexTranAdvAddn1(java.lang.String amexTranAdvAddn1) {
        this.amexTranAdvAddn1 = amexTranAdvAddn1;
    }


    /**
     * Gets the amexTranAdvAddn2 value for this MarkForCaptureRequest.
     * 
     * @return amexTranAdvAddn2
     */
    public java.lang.String getAmexTranAdvAddn2() {
        return amexTranAdvAddn2;
    }


    /**
     * Sets the amexTranAdvAddn2 value for this MarkForCaptureRequest.
     * 
     * @param amexTranAdvAddn2
     */
    public void setAmexTranAdvAddn2(java.lang.String amexTranAdvAddn2) {
        this.amexTranAdvAddn2 = amexTranAdvAddn2;
    }


    /**
     * Gets the amexTranAdvAddn3 value for this MarkForCaptureRequest.
     * 
     * @return amexTranAdvAddn3
     */
    public java.lang.String getAmexTranAdvAddn3() {
        return amexTranAdvAddn3;
    }


    /**
     * Sets the amexTranAdvAddn3 value for this MarkForCaptureRequest.
     * 
     * @param amexTranAdvAddn3
     */
    public void setAmexTranAdvAddn3(java.lang.String amexTranAdvAddn3) {
        this.amexTranAdvAddn3 = amexTranAdvAddn3;
    }


    /**
     * Gets the amexTranAdvAddn4 value for this MarkForCaptureRequest.
     * 
     * @return amexTranAdvAddn4
     */
    public java.lang.String getAmexTranAdvAddn4() {
        return amexTranAdvAddn4;
    }


    /**
     * Sets the amexTranAdvAddn4 value for this MarkForCaptureRequest.
     * 
     * @param amexTranAdvAddn4
     */
    public void setAmexTranAdvAddn4(java.lang.String amexTranAdvAddn4) {
        this.amexTranAdvAddn4 = amexTranAdvAddn4;
    }


    /**
     * Gets the retryTrace value for this MarkForCaptureRequest.
     * 
     * @return retryTrace
     */
    public java.lang.String getRetryTrace() {
        return retryTrace;
    }


    /**
     * Sets the retryTrace value for this MarkForCaptureRequest.
     * 
     * @param retryTrace
     */
    public void setRetryTrace(java.lang.String retryTrace) {
        this.retryTrace = retryTrace;
    }


    /**
     * Gets the taxAmount value for this MarkForCaptureRequest.
     * 
     * @return taxAmount
     */
    public java.lang.String getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this MarkForCaptureRequest.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.String taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxInd value for this MarkForCaptureRequest.
     * 
     * @return taxInd
     */
    public java.lang.String getTaxInd() {
        return taxInd;
    }


    /**
     * Sets the taxInd value for this MarkForCaptureRequest.
     * 
     * @param taxInd
     */
    public void setTaxInd(java.lang.String taxInd) {
        this.taxInd = taxInd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarkForCaptureRequest)) return false;
        MarkForCaptureRequest other = (MarkForCaptureRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endppoint==null && other.getEndppoint()==null) || 
             (this.endppoint!=null &&
              this.endppoint.equals(other.getEndppoint()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orbitalConnectionPassword==null && other.getOrbitalConnectionPassword()==null) || 
             (this.orbitalConnectionPassword!=null &&
              this.orbitalConnectionPassword.equals(other.getOrbitalConnectionPassword()))) &&
            ((this.orbitalConnectionUsername==null && other.getOrbitalConnectionUsername()==null) || 
             (this.orbitalConnectionUsername!=null &&
              this.orbitalConnectionUsername.equals(other.getOrbitalConnectionUsername()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.txRefNum==null && other.getTxRefNum()==null) || 
             (this.txRefNum!=null &&
              this.txRefNum.equals(other.getTxRefNum()))) &&
            ((this.PCard3AltTaxAmt==null && other.getPCard3AltTaxAmt()==null) || 
             (this.PCard3AltTaxAmt!=null &&
              this.PCard3AltTaxAmt.equals(other.getPCard3AltTaxAmt()))) &&
            ((this.PCard3AltTaxInd==null && other.getPCard3AltTaxInd()==null) || 
             (this.PCard3AltTaxInd!=null &&
              this.PCard3AltTaxInd.equals(other.getPCard3AltTaxInd()))) &&
            ((this.PCard3DestCountryCd==null && other.getPCard3DestCountryCd()==null) || 
             (this.PCard3DestCountryCd!=null &&
              this.PCard3DestCountryCd.equals(other.getPCard3DestCountryCd()))) &&
            ((this.PCard3DiscAmt==null && other.getPCard3DiscAmt()==null) || 
             (this.PCard3DiscAmt!=null &&
              this.PCard3DiscAmt.equals(other.getPCard3DiscAmt()))) &&
            ((this.PCard3DutyAmt==null && other.getPCard3DutyAmt()==null) || 
             (this.PCard3DutyAmt!=null &&
              this.PCard3DutyAmt.equals(other.getPCard3DutyAmt()))) &&
            ((this.PCard3FreightAmt==null && other.getPCard3FreightAmt()==null) || 
             (this.PCard3FreightAmt!=null &&
              this.PCard3FreightAmt.equals(other.getPCard3FreightAmt()))) &&
            ((this.PCard3LineItemCount==null && other.getPCard3LineItemCount()==null) || 
             (this.PCard3LineItemCount!=null &&
              this.PCard3LineItemCount.equals(other.getPCard3LineItemCount()))) &&
            ((this.PCard3LineItems==null && other.getPCard3LineItems()==null) || 
             (this.PCard3LineItems!=null &&
              java.util.Arrays.equals(this.PCard3LineItems, other.getPCard3LineItems()))) &&
            ((this.PCard3ShipFromZip==null && other.getPCard3ShipFromZip()==null) || 
             (this.PCard3ShipFromZip!=null &&
              this.PCard3ShipFromZip.equals(other.getPCard3ShipFromZip()))) &&
            ((this.PCard3VATtaxAmt==null && other.getPCard3VATtaxAmt()==null) || 
             (this.PCard3VATtaxAmt!=null &&
              this.PCard3VATtaxAmt.equals(other.getPCard3VATtaxAmt()))) &&
            ((this.PCard3VATtaxRate==null && other.getPCard3VATtaxRate()==null) || 
             (this.PCard3VATtaxRate!=null &&
              this.PCard3VATtaxRate.equals(other.getPCard3VATtaxRate()))) &&
            ((this.PCardDestAddress==null && other.getPCardDestAddress()==null) || 
             (this.PCardDestAddress!=null &&
              this.PCardDestAddress.equals(other.getPCardDestAddress()))) &&
            ((this.PCardDestAddress2==null && other.getPCardDestAddress2()==null) || 
             (this.PCardDestAddress2!=null &&
              this.PCardDestAddress2.equals(other.getPCardDestAddress2()))) &&
            ((this.PCardDestCity==null && other.getPCardDestCity()==null) || 
             (this.PCardDestCity!=null &&
              this.PCardDestCity.equals(other.getPCardDestCity()))) &&
            ((this.PCardDestName==null && other.getPCardDestName()==null) || 
             (this.PCardDestName!=null &&
              this.PCardDestName.equals(other.getPCardDestName()))) &&
            ((this.PCardDestStateCd==null && other.getPCardDestStateCd()==null) || 
             (this.PCardDestStateCd!=null &&
              this.PCardDestStateCd.equals(other.getPCardDestStateCd()))) &&
            ((this.PCardDestZip==null && other.getPCardDestZip()==null) || 
             (this.PCardDestZip!=null &&
              this.PCardDestZip.equals(other.getPCardDestZip()))) &&
            ((this.PCardOrderID==null && other.getPCardOrderID()==null) || 
             (this.PCardOrderID!=null &&
              this.PCardOrderID.equals(other.getPCardOrderID()))) &&
            ((this.amexTranAdvAddn1==null && other.getAmexTranAdvAddn1()==null) || 
             (this.amexTranAdvAddn1!=null &&
              this.amexTranAdvAddn1.equals(other.getAmexTranAdvAddn1()))) &&
            ((this.amexTranAdvAddn2==null && other.getAmexTranAdvAddn2()==null) || 
             (this.amexTranAdvAddn2!=null &&
              this.amexTranAdvAddn2.equals(other.getAmexTranAdvAddn2()))) &&
            ((this.amexTranAdvAddn3==null && other.getAmexTranAdvAddn3()==null) || 
             (this.amexTranAdvAddn3!=null &&
              this.amexTranAdvAddn3.equals(other.getAmexTranAdvAddn3()))) &&
            ((this.amexTranAdvAddn4==null && other.getAmexTranAdvAddn4()==null) || 
             (this.amexTranAdvAddn4!=null &&
              this.amexTranAdvAddn4.equals(other.getAmexTranAdvAddn4()))) &&
            ((this.retryTrace==null && other.getRetryTrace()==null) || 
             (this.retryTrace!=null &&
              this.retryTrace.equals(other.getRetryTrace()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxInd==null && other.getTaxInd()==null) || 
             (this.taxInd!=null &&
              this.taxInd.equals(other.getTaxInd())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEndppoint() != null) {
            _hashCode += getEndppoint().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getOrbitalConnectionPassword() != null) {
            _hashCode += getOrbitalConnectionPassword().hashCode();
        }
        if (getOrbitalConnectionUsername() != null) {
            _hashCode += getOrbitalConnectionUsername().hashCode();
        }
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getTxRefNum() != null) {
            _hashCode += getTxRefNum().hashCode();
        }
        if (getPCard3AltTaxAmt() != null) {
            _hashCode += getPCard3AltTaxAmt().hashCode();
        }
        if (getPCard3AltTaxInd() != null) {
            _hashCode += getPCard3AltTaxInd().hashCode();
        }
        if (getPCard3DestCountryCd() != null) {
            _hashCode += getPCard3DestCountryCd().hashCode();
        }
        if (getPCard3DiscAmt() != null) {
            _hashCode += getPCard3DiscAmt().hashCode();
        }
        if (getPCard3DutyAmt() != null) {
            _hashCode += getPCard3DutyAmt().hashCode();
        }
        if (getPCard3FreightAmt() != null) {
            _hashCode += getPCard3FreightAmt().hashCode();
        }
        if (getPCard3LineItemCount() != null) {
            _hashCode += getPCard3LineItemCount().hashCode();
        }
        if (getPCard3LineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCard3LineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCard3LineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPCard3ShipFromZip() != null) {
            _hashCode += getPCard3ShipFromZip().hashCode();
        }
        if (getPCard3VATtaxAmt() != null) {
            _hashCode += getPCard3VATtaxAmt().hashCode();
        }
        if (getPCard3VATtaxRate() != null) {
            _hashCode += getPCard3VATtaxRate().hashCode();
        }
        if (getPCardDestAddress() != null) {
            _hashCode += getPCardDestAddress().hashCode();
        }
        if (getPCardDestAddress2() != null) {
            _hashCode += getPCardDestAddress2().hashCode();
        }
        if (getPCardDestCity() != null) {
            _hashCode += getPCardDestCity().hashCode();
        }
        if (getPCardDestName() != null) {
            _hashCode += getPCardDestName().hashCode();
        }
        if (getPCardDestStateCd() != null) {
            _hashCode += getPCardDestStateCd().hashCode();
        }
        if (getPCardDestZip() != null) {
            _hashCode += getPCardDestZip().hashCode();
        }
        if (getPCardOrderID() != null) {
            _hashCode += getPCardOrderID().hashCode();
        }
        if (getAmexTranAdvAddn1() != null) {
            _hashCode += getAmexTranAdvAddn1().hashCode();
        }
        if (getAmexTranAdvAddn2() != null) {
            _hashCode += getAmexTranAdvAddn2().hashCode();
        }
        if (getAmexTranAdvAddn3() != null) {
            _hashCode += getAmexTranAdvAddn3().hashCode();
        }
        if (getAmexTranAdvAddn4() != null) {
            _hashCode += getAmexTranAdvAddn4().hashCode();
        }
        if (getRetryTrace() != null) {
            _hashCode += getRetryTrace().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxInd() != null) {
            _hashCode += getTaxInd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarkForCaptureRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "MarkForCaptureRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endppoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "endppoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "merchantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orbitalConnectionPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orbitalConnectionPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orbitalConnectionUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orbitalConnectionUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "terminalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "txRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3AltTaxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3AltTaxAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3AltTaxInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3AltTaxInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3DestCountryCd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3DestCountryCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3DiscAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3DiscAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3DutyAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3DutyAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3FreightAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3FreightAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3LineItemCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3LineItemCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3LineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3LineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3LineItems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3ShipFromZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3ShipFromZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3VATtaxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3VATtaxAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3VATtaxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3VATtaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestStateCd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestStateCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardOrderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardOrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexTranAdvAddn1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amexTranAdvAddn1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexTranAdvAddn2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amexTranAdvAddn2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexTranAdvAddn3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amexTranAdvAddn3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexTranAdvAddn4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amexTranAdvAddn4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "retryTrace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "taxInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

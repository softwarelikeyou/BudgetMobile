/**
 * TopUpResellerSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.webservice.client.topup;

public interface TopUpResellerSoap extends java.rmi.Remote {
    public java.lang.String helloWorld() throws java.rmi.RemoteException;
    public void enterOrderDetail(java.lang.String clientRefID, java.lang.String MDN, java.lang.String productID, short resellerID, javax.xml.rpc.holders.StringHolder referenceID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException;
    public void commitOrder(java.lang.String referenceID, javax.xml.rpc.holders.LongHolder topUpID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException;
    public void cancelOrder(java.lang.String referenceID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException;
}

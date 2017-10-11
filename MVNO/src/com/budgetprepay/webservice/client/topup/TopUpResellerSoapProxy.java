package com.budgetprepay.webservice.client.topup;

public class TopUpResellerSoapProxy implements com.budgetprepay.webservice.client.topup.TopUpResellerSoap {
  private String _endpoint = null;
  private com.budgetprepay.webservice.client.topup.TopUpResellerSoap topUpResellerSoap = null;
  
  public TopUpResellerSoapProxy() {
    _initTopUpResellerSoapProxy();
  }
  
  public TopUpResellerSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTopUpResellerSoapProxy();
  }
  
  private void _initTopUpResellerSoapProxy() {
    try {
      topUpResellerSoap = (new com.budgetprepay.webservice.client.topup.TopUpResellerLocator()).getTopUpResellerSoap();
      if (topUpResellerSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)topUpResellerSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)topUpResellerSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (topUpResellerSoap != null)
      ((javax.xml.rpc.Stub)topUpResellerSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.budgetprepay.webservice.client.topup.TopUpResellerSoap getTopUpResellerSoap() {
    if (topUpResellerSoap == null)
      _initTopUpResellerSoapProxy();
    return topUpResellerSoap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (topUpResellerSoap == null)
      _initTopUpResellerSoapProxy();
    return topUpResellerSoap.helloWorld();
  }
  
  public void enterOrderDetail(java.lang.String clientRefID, java.lang.String MDN, java.lang.String productID, short resellerID, javax.xml.rpc.holders.StringHolder referenceID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException{
    if (topUpResellerSoap == null)
      _initTopUpResellerSoapProxy();
    topUpResellerSoap.enterOrderDetail(clientRefID, MDN, productID, resellerID, referenceID, errorCode, errorMessage);
  }
  
  public void commitOrder(java.lang.String referenceID, javax.xml.rpc.holders.LongHolder topUpID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException{
    if (topUpResellerSoap == null)
      _initTopUpResellerSoapProxy();
    topUpResellerSoap.commitOrder(referenceID, topUpID, errorCode, errorMessage);
  }
  
  public void cancelOrder(java.lang.String referenceID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException{
    if (topUpResellerSoap == null)
      _initTopUpResellerSoapProxy();
    topUpResellerSoap.cancelOrder(referenceID, errorCode, errorMessage);
  }
  
  
}
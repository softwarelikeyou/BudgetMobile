package com.budgetprepay.www.Paymentech;

public class PaymentechProxy implements com.budgetprepay.www.Paymentech.Paymentech {
  private String _endpoint = null;
  private com.budgetprepay.www.Paymentech.Paymentech paymentech = null;
  
  public PaymentechProxy() {
    _initPaymentechProxy();
  }
  
  public PaymentechProxy(String endpoint) {
    _endpoint = endpoint;
    _initPaymentechProxy();
  }
  
  private void _initPaymentechProxy() {
    try {
      paymentech = (new com.budgetprepay.www.Paymentech.PaymentechServiceLocator()).getPaymentechSoap11();
      if (paymentech != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)paymentech)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)paymentech)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (paymentech != null)
      ((javax.xml.rpc.Stub)paymentech)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.budgetprepay.www.Paymentech.Paymentech getPaymentech() {
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech;
  }
  
  public com.budgetprepay.www.Paymentech.ProfileDeleteResponse profileDelete(com.budgetprepay.www.Paymentech.ProfileDeleteRequest profileDeleteRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.profileDelete(profileDeleteRequest);
  }
  
  public com.budgetprepay.www.Paymentech.InquiryResponse inquiry(com.budgetprepay.www.Paymentech.InquiryRequest inquiryRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.inquiry(inquiryRequest);
  }
  
  public com.budgetprepay.www.Paymentech.MarkForCaptureResponse markForCapture(com.budgetprepay.www.Paymentech.MarkForCaptureRequest markForCaptureRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.markForCapture(markForCaptureRequest);
  }
  
  public com.budgetprepay.www.Paymentech.NewOrderResponse newOrder(com.budgetprepay.www.Paymentech.NewOrderRequest newOrderRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.newOrder(newOrderRequest);
  }
  
  public com.budgetprepay.www.Paymentech.FlexCacheResponse flexCache(com.budgetprepay.www.Paymentech.FlexCacheRequest flexCacheRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.flexCache(flexCacheRequest);
  }
  
  public com.budgetprepay.www.Paymentech.ProfileUpdateResponse profileUpdate(com.budgetprepay.www.Paymentech.ProfileUpdateRequest profileUpdateRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.profileUpdate(profileUpdateRequest);
  }
  
  public com.budgetprepay.www.Paymentech.AccountUpdaterResponse accountUpdater(com.budgetprepay.www.Paymentech.AccountUpdaterRequest accountUpdaterRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.accountUpdater(accountUpdaterRequest);
  }
  
  public com.budgetprepay.www.Paymentech.UnMarkResponse unMark(com.budgetprepay.www.Paymentech.UnMarkRequest unMarkRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.unMark(unMarkRequest);
  }
  
  public com.budgetprepay.www.Paymentech.LogMessageResponse logMessage(com.budgetprepay.www.Paymentech.LogMessageRequest logMessageRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.logMessage(logMessageRequest);
  }
  
  public com.budgetprepay.www.Paymentech.ProfileRetrievalResponse profileRetrieval(com.budgetprepay.www.Paymentech.ProfileRetrievalRequest profileRetrievalRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.profileRetrieval(profileRetrievalRequest);
  }
  
  public com.budgetprepay.www.Paymentech.ReversalResponse reversal(com.budgetprepay.www.Paymentech.ReversalRequest reversalRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.reversal(reversalRequest);
  }
  
  public com.budgetprepay.www.Paymentech.EndOfDayResponse endOfDay(com.budgetprepay.www.Paymentech.EndOfDayRequest endOfDayRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.endOfDay(endOfDayRequest);
  }
  
  public com.budgetprepay.www.Paymentech.SafetechFraudAnalysisResponse safetechFraudAnalysis(com.budgetprepay.www.Paymentech.SafetechFraudAnalysisRequest safetechFraudAnalysisRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.safetechFraudAnalysis(safetechFraudAnalysisRequest);
  }
  
  public com.budgetprepay.www.Paymentech.ProfileAddResponse profileAdd(com.budgetprepay.www.Paymentech.ProfileAddRequest profileAddRequest) throws java.rmi.RemoteException{
    if (paymentech == null)
      _initPaymentechProxy();
    return paymentech.profileAdd(profileAddRequest);
  }
  
  
}
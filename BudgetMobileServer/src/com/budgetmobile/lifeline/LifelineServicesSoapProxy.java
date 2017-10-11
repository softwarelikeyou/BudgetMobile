package com.budgetmobile.lifeline;

public class LifelineServicesSoapProxy implements com.budgetmobile.lifeline.LifelineServicesSoap {
  private String _endpoint = null;
  private com.budgetmobile.lifeline.LifelineServicesSoap lifelineServicesSoap = null;
  
  public LifelineServicesSoapProxy() {
    _initLifelineServicesSoapProxy();
  }
  
  public LifelineServicesSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initLifelineServicesSoapProxy();
  }
  
  private void _initLifelineServicesSoapProxy() {
    try {
      lifelineServicesSoap = (new com.budgetmobile.lifeline.LifelineServicesLocator()).getLifelineServicesSoap();
      if (lifelineServicesSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lifelineServicesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lifelineServicesSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lifelineServicesSoap != null)
      ((javax.xml.rpc.Stub)lifelineServicesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.budgetmobile.lifeline.LifelineServicesSoap getLifelineServicesSoap() {
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.helloWorld();
  }
  
  public com.budgetmobile.lifeline.Address_Standardize address_Standardize(com.budgetmobile.lifeline.Credentials_Address_Standardize myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.address_Standardize(myCreds);
  }
  
  public com.budgetmobile.lifeline.Order_Enter order_Enter(com.budgetmobile.lifeline.Credentials_Order_Enter myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.order_Enter(myCreds);
  }
  
  public com.budgetmobile.lifeline.Order_Commit order_Commit(com.budgetmobile.lifeline.Credentials_Order_Commit myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.order_Commit(myCreds);
  }
  
  public com.budgetmobile.lifeline.Devices devices(com.budgetmobile.lifeline.Credentials_Devices myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.devices(myCreds);
  }
  
  public com.budgetmobile.lifeline.Zip_Coverage zip_Coverage(com.budgetmobile.lifeline.Credentials_Zip_Coverage myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.zip_Coverage(myCreds);
  }
  
  public com.budgetmobile.lifeline.Address_VerifyLifeline address_VerifyLifeline(com.budgetmobile.lifeline.Credentials_Address_VerifyLifeline myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.address_VerifyLifeline(myCreds);
  }
  
  public com.budgetmobile.lifeline.Handset_Commit handset_Commit(com.budgetmobile.lifeline.Credentials_Handset_Commit myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.handset_Commit(myCreds);
  }
  
  public com.budgetmobile.lifeline.Handset_Enter handset_Enter(com.budgetmobile.lifeline.Credentials_Handset_Enter myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.handset_Enter(myCreds);
  }
  
  public com.budgetmobile.lifeline.ActivateVerizonDevice activateVerizonDevice(com.budgetmobile.lifeline.Credentials_ActivateVerizonDevice myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.activateVerizonDevice(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupVerizonActivationStatus lookupVerizonActivationStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonActivationStatus myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupVerizonActivationStatus(myCreds);
  }
  
  public com.budgetmobile.lifeline.ActivateSprintDevice activateSprintDevice(com.budgetmobile.lifeline.Credentials_ActivateSprintDevice myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.activateSprintDevice(myCreds);
  }
  
  public com.budgetmobile.lifeline.ActivateTmobileDevice activateTmobileDevice(com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.activateTmobileDevice(myCreds);
  }
  
  public com.budgetmobile.lifeline.TMobile_RetrPreactivatedHandsetByDeviceID TMobile_RetrPreactivatedHandsetByDeviceID(com.budgetmobile.lifeline.Credentials_TMobile_RetrPreactivatedHandsetByDeviceID myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.TMobile_RetrPreactivatedHandsetByDeviceID(myCreds);
  }
  
  public com.budgetmobile.lifeline.Sprint_RetrSingleDeviceActivationDetails sprint_RetrSingleDeviceActivationDetails(com.budgetmobile.lifeline.Credentials_Sprint_RetrSingleDeviceActivationDetails myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.sprint_RetrSingleDeviceActivationDetails(myCreds);
  }
  
  public com.budgetmobile.lifeline.Verizon_RetrSingleDeviceActivationDetails verizon_RetrSingleDeviceActivationDetails(com.budgetmobile.lifeline.Credentials_Verizon_RetrSingleDeviceActivationDetails myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.verizon_RetrSingleDeviceActivationDetails(myCreds);
  }
  
  public com.budgetmobile.lifeline.RetrPreactivatedHandsetByDeviceID retrPreactivatedHandsetByDeviceID(com.budgetmobile.lifeline.Credentials_RetrPreactivatedHandsetByDeviceID myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.retrPreactivatedHandsetByDeviceID(myCreds);
  }
  
  public com.budgetmobile.lifeline.BudgetMobile_CompleteFulfillment budgetMobile_CompleteFulfillment(com.budgetmobile.lifeline.Credentials_BudgetMobile_CompleteFulfillment myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.budgetMobile_CompleteFulfillment(myCreds);
  }
  
  public com.budgetmobile.lifeline.TMobile_SwapIMSI TMobile_SwapIMSI(com.budgetmobile.lifeline.Credentials_TMobile_SwapIMSI myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.TMobile_SwapIMSI(myCreds);
  }
  
  public com.budgetmobile.lifeline.ChangeESN_Verizon changeESN_Verizon(com.budgetmobile.lifeline.Credentials_ChangeESN_Verizon myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.changeESN_Verizon(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupVerizonChangeESNStatus lookupVerizonChangeESNStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonChangeESNStatus myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupVerizonChangeESNStatus(myCreds);
  }
  
  public com.budgetmobile.lifeline.Verizon_Discrete_DeviceInquiry verizon_Discrete_DeviceInquiry(com.budgetmobile.lifeline.Credentials_Verizon_Discrete_DeviceInquiry myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.verizon_Discrete_DeviceInquiry(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookUpVerizonDiscreteDeviceInquiryStatus lookUpVerizonDiscreteDeviceInquiryStatus(com.budgetmobile.lifeline.Credentials_LookUpVerizonDiscreteDeviceInquiryStatus myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookUpVerizonDiscreteDeviceInquiryStatus(myCreds);
  }
  
  public com.budgetmobile.lifeline.DeactivateVerizonDevice deactivateVerizonDevice(com.budgetmobile.lifeline.Credentials_DeactivateVerizonDevice myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.deactivateVerizonDevice(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupVerizonDeactivateDeviceStatus lookupVerizonDeactivateDeviceStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonDeactivateDeviceStatus myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupVerizonDeactivateDeviceStatus(myCreds);
  }
  
  public com.budgetmobile.lifeline.DeactivateSprintDevice deactivateSprintDevice(com.budgetmobile.lifeline.Credentials_DeactivateSprintDevice myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.deactivateSprintDevice(myCreds);
  }
  
  public com.budgetmobile.lifeline.CheckTmobileBalance checkTmobileBalance(com.budgetmobile.lifeline.Credentials_CheckTmobileBalance myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.checkTmobileBalance(myCreds);
  }
  
  public com.budgetmobile.lifeline.CheckVerizonBalance checkVerizonBalance(com.budgetmobile.lifeline.Credentials_CheckVerizonBalance myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.checkVerizonBalance(myCreds);
  }
  
  public com.budgetmobile.lifeline.RetrVoiceandTextBalance retrVoiceandTextBalance(com.budgetmobile.lifeline.Credentials_RetrVoiceandTextBalance myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.retrVoiceandTextBalance(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupAvailableTopUp_Existing lookupAvailableTopUp_Existing(com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_Existing myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupAvailableTopUp_Existing(myCreds);
  }
  
  public com.budgetmobile.lifeline.TopUp_Enter topUp_Enter(com.budgetmobile.lifeline.Credentials_TopUp_Enter myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.topUp_Enter(myCreds);
  }
  
  public com.budgetmobile.lifeline.TopUp_Commit topUp_Commit(com.budgetmobile.lifeline.Credentials_TopUp_Commit myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.topUp_Commit(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupAccountByMDN lookupAccountByMDN(com.budgetmobile.lifeline.Credentials_LookupAccountByMDN myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupAccountByMDN(myCreds);
  }
  
  public com.budgetmobile.lifeline.UpdateDeviceID updateDeviceID(com.budgetmobile.lifeline.Credentials_UpdateDeviceID myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.updateDeviceID(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupCustomerDetails lookupCustomerDetails(com.budgetmobile.lifeline.Credentials_LookupCustomerDetails myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupCustomerDetails(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupTopUpDetails lookupTopUpDetails(com.budgetmobile.lifeline.Credentials_LookupTopUpDetails myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupTopUpDetails(myCreds);
  }
  
  public com.budgetmobile.lifeline.Recertify_BudgetMobile recertify_BudgetMobile(com.budgetmobile.lifeline.Credentials_Recertify_BudgetMobile myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.recertify_BudgetMobile(myCreds);
  }
  
  public com.budgetmobile.lifeline.DiscreteRestoreTMobileDevice discreteRestoreTMobileDevice(com.budgetmobile.lifeline.Credentials_DiscreteRestoreTMobileDevice myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.discreteRestoreTMobileDevice(myCreds);
  }
  
  public com.budgetmobile.lifeline.VerifyDevice verifyDevice(com.budgetmobile.lifeline.Credentials_VerifyDevice myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.verifyDevice(myCreds);
  }
  
  public com.budgetmobile.lifeline.UpdateProviderDeviceID updateProviderDeviceID(com.budgetmobile.lifeline.Credentials_UpdateProviderDeviceID myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.updateProviderDeviceID(myCreds);
  }
  
  public com.budgetmobile.lifeline.TMobile_PortInActivateDevice TMobile_PortInActivateDevice(com.budgetmobile.lifeline.Credentials_TMobile_PortInActivateDevice myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.TMobile_PortInActivateDevice(myCreds);
  }
  
  public com.budgetmobile.lifeline.ActivateTmobileDevice_ITG activateTmobileDevice_ITG(com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice_ITG myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.activateTmobileDevice_ITG(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupTopUpTotalDue lookupTopUpTotalDue(com.budgetmobile.lifeline.Credentials_LookupTopUpTotalDue myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupTopUpTotalDue(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookUpBasePlan lookupBasePlan(com.budgetmobile.lifeline.Credentials_LookUpBasePlan myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupBasePlan(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookupAvailableTopUp_New lookupAvailableTopUp_New(com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_New myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupAvailableTopUp_New(myCreds);
  }
  
  public com.budgetmobile.lifeline.LookUpCustomer lookupCustomer(com.budgetmobile.lifeline.Credentials_LookUpCustomer myCreds) throws java.rmi.RemoteException{
    if (lifelineServicesSoap == null)
      _initLifelineServicesSoapProxy();
    return lifelineServicesSoap.lookupCustomer(myCreds);
  }
  
  
}
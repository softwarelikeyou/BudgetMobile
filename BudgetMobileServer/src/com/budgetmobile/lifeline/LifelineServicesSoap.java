/**
 * LifelineServicesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public interface LifelineServicesSoap extends java.rmi.Remote {
    public java.lang.String helloWorld() throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Address_Standardize address_Standardize(com.budgetmobile.lifeline.Credentials_Address_Standardize myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Order_Enter order_Enter(com.budgetmobile.lifeline.Credentials_Order_Enter myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Order_Commit order_Commit(com.budgetmobile.lifeline.Credentials_Order_Commit myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Devices devices(com.budgetmobile.lifeline.Credentials_Devices myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Zip_Coverage zip_Coverage(com.budgetmobile.lifeline.Credentials_Zip_Coverage myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Address_VerifyLifeline address_VerifyLifeline(com.budgetmobile.lifeline.Credentials_Address_VerifyLifeline myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Handset_Commit handset_Commit(com.budgetmobile.lifeline.Credentials_Handset_Commit myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Handset_Enter handset_Enter(com.budgetmobile.lifeline.Credentials_Handset_Enter myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.ActivateVerizonDevice activateVerizonDevice(com.budgetmobile.lifeline.Credentials_ActivateVerizonDevice myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupVerizonActivationStatus lookupVerizonActivationStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonActivationStatus myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.ActivateSprintDevice activateSprintDevice(com.budgetmobile.lifeline.Credentials_ActivateSprintDevice myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.ActivateTmobileDevice activateTmobileDevice(com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.TMobile_RetrPreactivatedHandsetByDeviceID TMobile_RetrPreactivatedHandsetByDeviceID(com.budgetmobile.lifeline.Credentials_TMobile_RetrPreactivatedHandsetByDeviceID myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Sprint_RetrSingleDeviceActivationDetails sprint_RetrSingleDeviceActivationDetails(com.budgetmobile.lifeline.Credentials_Sprint_RetrSingleDeviceActivationDetails myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Verizon_RetrSingleDeviceActivationDetails verizon_RetrSingleDeviceActivationDetails(com.budgetmobile.lifeline.Credentials_Verizon_RetrSingleDeviceActivationDetails myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.RetrPreactivatedHandsetByDeviceID retrPreactivatedHandsetByDeviceID(com.budgetmobile.lifeline.Credentials_RetrPreactivatedHandsetByDeviceID myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.BudgetMobile_CompleteFulfillment budgetMobile_CompleteFulfillment(com.budgetmobile.lifeline.Credentials_BudgetMobile_CompleteFulfillment myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.TMobile_SwapIMSI TMobile_SwapIMSI(com.budgetmobile.lifeline.Credentials_TMobile_SwapIMSI myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.ChangeESN_Verizon changeESN_Verizon(com.budgetmobile.lifeline.Credentials_ChangeESN_Verizon myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupVerizonChangeESNStatus lookupVerizonChangeESNStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonChangeESNStatus myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Verizon_Discrete_DeviceInquiry verizon_Discrete_DeviceInquiry(com.budgetmobile.lifeline.Credentials_Verizon_Discrete_DeviceInquiry myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookUpVerizonDiscreteDeviceInquiryStatus lookUpVerizonDiscreteDeviceInquiryStatus(com.budgetmobile.lifeline.Credentials_LookUpVerizonDiscreteDeviceInquiryStatus myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.DeactivateVerizonDevice deactivateVerizonDevice(com.budgetmobile.lifeline.Credentials_DeactivateVerizonDevice myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupVerizonDeactivateDeviceStatus lookupVerizonDeactivateDeviceStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonDeactivateDeviceStatus myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.DeactivateSprintDevice deactivateSprintDevice(com.budgetmobile.lifeline.Credentials_DeactivateSprintDevice myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.CheckTmobileBalance checkTmobileBalance(com.budgetmobile.lifeline.Credentials_CheckTmobileBalance myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.CheckVerizonBalance checkVerizonBalance(com.budgetmobile.lifeline.Credentials_CheckVerizonBalance myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.RetrVoiceandTextBalance retrVoiceandTextBalance(com.budgetmobile.lifeline.Credentials_RetrVoiceandTextBalance myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupAvailableTopUp_Existing lookupAvailableTopUp_Existing(com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_Existing myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.TopUp_Enter topUp_Enter(com.budgetmobile.lifeline.Credentials_TopUp_Enter myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.TopUp_Commit topUp_Commit(com.budgetmobile.lifeline.Credentials_TopUp_Commit myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupAccountByMDN lookupAccountByMDN(com.budgetmobile.lifeline.Credentials_LookupAccountByMDN myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.UpdateDeviceID updateDeviceID(com.budgetmobile.lifeline.Credentials_UpdateDeviceID myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupCustomerDetails lookupCustomerDetails(com.budgetmobile.lifeline.Credentials_LookupCustomerDetails myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupTopUpDetails lookupTopUpDetails(com.budgetmobile.lifeline.Credentials_LookupTopUpDetails myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.Recertify_BudgetMobile recertify_BudgetMobile(com.budgetmobile.lifeline.Credentials_Recertify_BudgetMobile myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.DiscreteRestoreTMobileDevice discreteRestoreTMobileDevice(com.budgetmobile.lifeline.Credentials_DiscreteRestoreTMobileDevice myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.VerifyDevice verifyDevice(com.budgetmobile.lifeline.Credentials_VerifyDevice myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.UpdateProviderDeviceID updateProviderDeviceID(com.budgetmobile.lifeline.Credentials_UpdateProviderDeviceID myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.TMobile_PortInActivateDevice TMobile_PortInActivateDevice(com.budgetmobile.lifeline.Credentials_TMobile_PortInActivateDevice myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.ActivateTmobileDevice_ITG activateTmobileDevice_ITG(com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice_ITG myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupTopUpTotalDue lookupTopUpTotalDue(com.budgetmobile.lifeline.Credentials_LookupTopUpTotalDue myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookUpBasePlan lookupBasePlan(com.budgetmobile.lifeline.Credentials_LookUpBasePlan myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookupAvailableTopUp_New lookupAvailableTopUp_New(com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_New myCreds) throws java.rmi.RemoteException;
    public com.budgetmobile.lifeline.LookUpCustomer lookupCustomer(com.budgetmobile.lifeline.Credentials_LookUpCustomer myCreds) throws java.rmi.RemoteException;
}

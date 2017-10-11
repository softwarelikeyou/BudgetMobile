/**
 * LifelineServicesSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class LifelineServicesSoapStub extends org.apache.axis.client.Stub implements com.budgetmobile.lifeline.LifelineServicesSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[46];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HelloWorld");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "HelloWorldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Address_Standardize");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Address_Standardize"), com.budgetmobile.lifeline.Credentials_Address_Standardize.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Address_Standardize"));
        oper.setReturnClass(com.budgetmobile.lifeline.Address_Standardize.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Address_StandardizeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Order_Enter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Order_Enter"), com.budgetmobile.lifeline.Credentials_Order_Enter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Order_Enter"));
        oper.setReturnClass(com.budgetmobile.lifeline.Order_Enter.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_EnterResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Order_Commit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Order_Commit"), com.budgetmobile.lifeline.Credentials_Order_Commit.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Order_Commit"));
        oper.setReturnClass(com.budgetmobile.lifeline.Order_Commit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_CommitResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Devices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Devices"), com.budgetmobile.lifeline.Credentials_Devices.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Devices"));
        oper.setReturnClass(com.budgetmobile.lifeline.Devices.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "DevicesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Zip_Coverage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Zip_Coverage"), com.budgetmobile.lifeline.Credentials_Zip_Coverage.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Zip_Coverage"));
        oper.setReturnClass(com.budgetmobile.lifeline.Zip_Coverage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Zip_CoverageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Address_VerifyLifeline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Address_VerifyLifeline"), com.budgetmobile.lifeline.Credentials_Address_VerifyLifeline.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Address_VerifyLifeline"));
        oper.setReturnClass(com.budgetmobile.lifeline.Address_VerifyLifeline.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Address_VerifyLifelineResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Handset_Commit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Handset_Commit"), com.budgetmobile.lifeline.Credentials_Handset_Commit.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Handset_Commit"));
        oper.setReturnClass(com.budgetmobile.lifeline.Handset_Commit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Handset_CommitResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Handset_Enter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Handset_Enter"), com.budgetmobile.lifeline.Credentials_Handset_Enter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Handset_Enter"));
        oper.setReturnClass(com.budgetmobile.lifeline.Handset_Enter.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Handset_EnterResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateVerizonDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateVerizonDevice"), com.budgetmobile.lifeline.Credentials_ActivateVerizonDevice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateVerizonDevice"));
        oper.setReturnClass(com.budgetmobile.lifeline.ActivateVerizonDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateVerizonDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupVerizonActivationStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupVerizonActivationStatus"), com.budgetmobile.lifeline.Credentials_LookupVerizonActivationStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonActivationStatus"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupVerizonActivationStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonActivationStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateSprintDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateSprintDevice"), com.budgetmobile.lifeline.Credentials_ActivateSprintDevice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateSprintDevice"));
        oper.setReturnClass(com.budgetmobile.lifeline.ActivateSprintDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateSprintDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateTmobileDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateTmobileDevice"), com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateTmobileDevice"));
        oper.setReturnClass(com.budgetmobile.lifeline.ActivateTmobileDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateTmobileDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TMobile_RetrPreactivatedHandsetByDeviceID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TMobile_RetrPreactivatedHandsetByDeviceID"), com.budgetmobile.lifeline.Credentials_TMobile_RetrPreactivatedHandsetByDeviceID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_RetrPreactivatedHandsetByDeviceID"));
        oper.setReturnClass(com.budgetmobile.lifeline.TMobile_RetrPreactivatedHandsetByDeviceID.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_RetrPreactivatedHandsetByDeviceIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Sprint_RetrSingleDeviceActivationDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Sprint_RetrSingleDeviceActivationDetails"), com.budgetmobile.lifeline.Credentials_Sprint_RetrSingleDeviceActivationDetails.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Sprint_RetrSingleDeviceActivationDetails"));
        oper.setReturnClass(com.budgetmobile.lifeline.Sprint_RetrSingleDeviceActivationDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Sprint_RetrSingleDeviceActivationDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Verizon_RetrSingleDeviceActivationDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Verizon_RetrSingleDeviceActivationDetails"), com.budgetmobile.lifeline.Credentials_Verizon_RetrSingleDeviceActivationDetails.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_RetrSingleDeviceActivationDetails"));
        oper.setReturnClass(com.budgetmobile.lifeline.Verizon_RetrSingleDeviceActivationDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_RetrSingleDeviceActivationDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrPreactivatedHandsetByDeviceID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_RetrPreactivatedHandsetByDeviceID"), com.budgetmobile.lifeline.Credentials_RetrPreactivatedHandsetByDeviceID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "RetrPreactivatedHandsetByDeviceID"));
        oper.setReturnClass(com.budgetmobile.lifeline.RetrPreactivatedHandsetByDeviceID.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "RetrPreactivatedHandsetByDeviceIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BudgetMobile_CompleteFulfillment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_BudgetMobile_CompleteFulfillment"), com.budgetmobile.lifeline.Credentials_BudgetMobile_CompleteFulfillment.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobile_CompleteFulfillment"));
        oper.setReturnClass(com.budgetmobile.lifeline.BudgetMobile_CompleteFulfillment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobile_CompleteFulfillmentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TMobile_SwapIMSI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TMobile_SwapIMSI"), com.budgetmobile.lifeline.Credentials_TMobile_SwapIMSI.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_SwapIMSI"));
        oper.setReturnClass(com.budgetmobile.lifeline.TMobile_SwapIMSI.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_SwapIMSIResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeESN_Verizon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ChangeESN_Verizon"), com.budgetmobile.lifeline.Credentials_ChangeESN_Verizon.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ChangeESN_Verizon"));
        oper.setReturnClass(com.budgetmobile.lifeline.ChangeESN_Verizon.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ChangeESN_VerizonResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupVerizonChangeESNStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupVerizonChangeESNStatus"), com.budgetmobile.lifeline.Credentials_LookupVerizonChangeESNStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonChangeESNStatus"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupVerizonChangeESNStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonChangeESNStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Verizon_Discrete_DeviceInquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Verizon_Discrete_DeviceInquiry"), com.budgetmobile.lifeline.Credentials_Verizon_Discrete_DeviceInquiry.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_Discrete_DeviceInquiry"));
        oper.setReturnClass(com.budgetmobile.lifeline.Verizon_Discrete_DeviceInquiry.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_Discrete_DeviceInquiryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookUpVerizonDiscreteDeviceInquiryStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookUpVerizonDiscreteDeviceInquiryStatus"), com.budgetmobile.lifeline.Credentials_LookUpVerizonDiscreteDeviceInquiryStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookUpVerizonDiscreteDeviceInquiryStatus"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookUpVerizonDiscreteDeviceInquiryStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookUpVerizonDiscreteDeviceInquiryStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeactivateVerizonDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_DeactivateVerizonDevice"), com.budgetmobile.lifeline.Credentials_DeactivateVerizonDevice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateVerizonDevice"));
        oper.setReturnClass(com.budgetmobile.lifeline.DeactivateVerizonDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateVerizonDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupVerizonDeactivateDeviceStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupVerizonDeactivateDeviceStatus"), com.budgetmobile.lifeline.Credentials_LookupVerizonDeactivateDeviceStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonDeactivateDeviceStatus"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupVerizonDeactivateDeviceStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonDeactivateDeviceStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeactivateSprintDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_DeactivateSprintDevice"), com.budgetmobile.lifeline.Credentials_DeactivateSprintDevice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateSprintDevice"));
        oper.setReturnClass(com.budgetmobile.lifeline.DeactivateSprintDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateSprintDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckTmobileBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_CheckTmobileBalance"), com.budgetmobile.lifeline.Credentials_CheckTmobileBalance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "CheckTmobileBalance"));
        oper.setReturnClass(com.budgetmobile.lifeline.CheckTmobileBalance.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckTmobileBalanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckVerizonBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_CheckVerizonBalance"), com.budgetmobile.lifeline.Credentials_CheckVerizonBalance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "CheckVerizonBalance"));
        oper.setReturnClass(com.budgetmobile.lifeline.CheckVerizonBalance.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckVerizonBalanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrVoiceandTextBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_RetrVoiceandTextBalance"), com.budgetmobile.lifeline.Credentials_RetrVoiceandTextBalance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "RetrVoiceandTextBalance"));
        oper.setReturnClass(com.budgetmobile.lifeline.RetrVoiceandTextBalance.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "RetrVoiceandTextBalanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupAvailableTopUp_Existing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupAvailableTopUp_Existing"), com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_Existing.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_Existing"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupAvailableTopUp_Existing.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_ExistingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TopUp_Enter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TopUp_Enter"), com.budgetmobile.lifeline.Credentials_TopUp_Enter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_Enter"));
        oper.setReturnClass(com.budgetmobile.lifeline.TopUp_Enter.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_EnterResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TopUp_Commit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TopUp_Commit"), com.budgetmobile.lifeline.Credentials_TopUp_Commit.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_Commit"));
        oper.setReturnClass(com.budgetmobile.lifeline.TopUp_Commit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_CommitResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupAccountByMDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupAccountByMDN"), com.budgetmobile.lifeline.Credentials_LookupAccountByMDN.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAccountByMDN"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupAccountByMDN.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAccountByMDNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateDeviceID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_UpdateDeviceID"), com.budgetmobile.lifeline.Credentials_UpdateDeviceID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateDeviceID"));
        oper.setReturnClass(com.budgetmobile.lifeline.UpdateDeviceID.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateDeviceIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupCustomerDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupCustomerDetails"), com.budgetmobile.lifeline.Credentials_LookupCustomerDetails.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupCustomerDetails"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupCustomerDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupCustomerDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupTopUpDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupTopUpDetails"), com.budgetmobile.lifeline.Credentials_LookupTopUpDetails.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupTopUpDetails"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupTopUpDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupTopUpDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Recertify_BudgetMobile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Recertify_BudgetMobile"), com.budgetmobile.lifeline.Credentials_Recertify_BudgetMobile.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "Recertify_BudgetMobile"));
        oper.setReturnClass(com.budgetmobile.lifeline.Recertify_BudgetMobile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Recertify_BudgetMobileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DiscreteRestoreTMobileDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_DiscreteRestoreTMobileDevice"), com.budgetmobile.lifeline.Credentials_DiscreteRestoreTMobileDevice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "DiscreteRestoreTMobileDevice"));
        oper.setReturnClass(com.budgetmobile.lifeline.DiscreteRestoreTMobileDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "DiscreteRestoreTMobileDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_VerifyDevice"), com.budgetmobile.lifeline.Credentials_VerifyDevice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "VerifyDevice"));
        oper.setReturnClass(com.budgetmobile.lifeline.VerifyDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "VerifyDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateProviderDeviceID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_UpdateProviderDeviceID"), com.budgetmobile.lifeline.Credentials_UpdateProviderDeviceID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateProviderDeviceID"));
        oper.setReturnClass(com.budgetmobile.lifeline.UpdateProviderDeviceID.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateProviderDeviceIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TMobile_PortInActivateDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TMobile_PortInActivateDevice"), com.budgetmobile.lifeline.Credentials_TMobile_PortInActivateDevice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_PortInActivateDevice"));
        oper.setReturnClass(com.budgetmobile.lifeline.TMobile_PortInActivateDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_PortInActivateDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateTmobileDevice_ITG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateTmobileDevice_ITG"), com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice_ITG.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateTmobileDevice_ITG"));
        oper.setReturnClass(com.budgetmobile.lifeline.ActivateTmobileDevice_ITG.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateTmobileDevice_ITGResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupTopUpTotalDue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupTopUpTotalDue"), com.budgetmobile.lifeline.Credentials_LookupTopUpTotalDue.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupTopUpTotalDue"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupTopUpTotalDue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupTopUpTotalDueResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupBasePlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookUpBasePlan"), com.budgetmobile.lifeline.Credentials_LookUpBasePlan.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookUpBasePlan"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookUpBasePlan.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupBasePlanResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupAvailableTopUp_New");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupAvailableTopUp_New"), com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_New.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_New"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookupAvailableTopUp_New.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_NewResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MyCreds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookUpCustomer"), com.budgetmobile.lifeline.Credentials_LookUpCustomer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "LookUpCustomer"));
        oper.setReturnClass(com.budgetmobile.lifeline.LookUpCustomer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupCustomerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

    }

    public LifelineServicesSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LifelineServicesSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LifelineServicesSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ActivateSprintDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.ActivateSprintDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ActivateTmobileDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.ActivateTmobileDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ActivateTmobileDevice_ITG");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.ActivateTmobileDevice_ITG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ActivateVerizonDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.ActivateVerizonDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalCharge");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.AdditionalCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Address_Standardize");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Address_Standardize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Address_VerifyLifeline");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Address_VerifyLifeline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfAdditionalCharge");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.AdditionalCharge[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalCharge");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalCharge");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfCustomerDetail");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.CustomerDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/", "CustomerDetail");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/", "CustomerDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfHandset");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Handset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Handset");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/", "Handset");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfHandsetOrderItem");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.HandsetOrderItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/", "HandsetOrderItem");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/", "HandsetOrderItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfTaxItem");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TaxItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TaxItem");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/", "TaxItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfTopUpProduct");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TopUpProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProduct");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobile_CompleteFulfillment");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.BudgetMobile_CompleteFulfillment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ChangeESN_Verizon");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.ChangeESN_Verizon.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "CheckTmobileBalance");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.CheckTmobileBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "CheckVerizonBalance");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.CheckVerizonBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ClientInput");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.ClientInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateSprintDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_ActivateSprintDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateTmobileDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateTmobileDevice_ITG");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice_ITG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateVerizonDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_ActivateVerizonDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Address_Standardize");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Address_Standardize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Address_VerifyLifeline");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Address_VerifyLifeline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_BudgetMobile_CompleteFulfillment");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_BudgetMobile_CompleteFulfillment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ChangeESN_Verizon");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_ChangeESN_Verizon.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_CheckTmobileBalance");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_CheckTmobileBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_CheckVerizonBalance");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_CheckVerizonBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_DeactivateSprintDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_DeactivateSprintDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_DeactivateVerizonDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_DeactivateVerizonDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Devices");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Devices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_DiscreteRestoreTMobileDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_DiscreteRestoreTMobileDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Handset_Commit");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Handset_Commit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Handset_Enter");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Handset_Enter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupAccountByMDN");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupAccountByMDN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupAvailableTopUp_Existing");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_Existing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupAvailableTopUp_New");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_New.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookUpBasePlan");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookUpBasePlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookUpCustomer");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookUpCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupCustomerDetails");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupCustomerDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupTopUpDetails");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupTopUpDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupTopUpTotalDue");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupTopUpTotalDue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupVerizonActivationStatus");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupVerizonActivationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupVerizonChangeESNStatus");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupVerizonChangeESNStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupVerizonDeactivateDeviceStatus");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookupVerizonDeactivateDeviceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookUpVerizonDiscreteDeviceInquiryStatus");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_LookUpVerizonDiscreteDeviceInquiryStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Order_Commit");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Order_Commit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Order_Enter");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Order_Enter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Recertify_BudgetMobile");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Recertify_BudgetMobile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_RetrPreactivatedHandsetByDeviceID");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_RetrPreactivatedHandsetByDeviceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_RetrVoiceandTextBalance");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_RetrVoiceandTextBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Sprint_RetrSingleDeviceActivationDetails");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Sprint_RetrSingleDeviceActivationDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TMobile_PortInActivateDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_TMobile_PortInActivateDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TMobile_RetrPreactivatedHandsetByDeviceID");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_TMobile_RetrPreactivatedHandsetByDeviceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TMobile_SwapIMSI");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_TMobile_SwapIMSI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TopUp_Commit");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_TopUp_Commit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TopUp_Enter");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_TopUp_Enter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_UpdateDeviceID");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_UpdateDeviceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_UpdateProviderDeviceID");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_UpdateProviderDeviceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_VerifyDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_VerifyDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Verizon_Discrete_DeviceInquiry");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Verizon_Discrete_DeviceInquiry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Verizon_RetrSingleDeviceActivationDetails");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Verizon_RetrSingleDeviceActivationDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Zip_Coverage");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Credentials_Zip_Coverage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "CustomerDetail");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.CustomerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateSprintDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.DeactivateSprintDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateVerizonDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.DeactivateVerizonDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "DeviceInfo_Output");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.DeviceInfo_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Devices");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Devices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "DiscreteRestoreTMobileDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.DiscreteRestoreTMobileDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Errors");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Errors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Handset");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Handset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Handset_Commit");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Handset_Commit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Handset_Enter");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Handset_Enter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "HandsetOrderItem");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.HandsetOrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupAccountByMDN");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupAccountByMDN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_Existing");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupAvailableTopUp_Existing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_New");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupAvailableTopUp_New.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookUpBasePlan");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookUpBasePlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookUpCustomer");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookUpCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupCustomerDetails");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupCustomerDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupTopUpDetails");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupTopUpDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupTopUpTotalDue");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupTopUpTotalDue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonActivationStatus");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupVerizonActivationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonChangeESNStatus");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupVerizonChangeESNStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonDeactivateDeviceStatus");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookupVerizonDeactivateDeviceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "LookUpVerizonDiscreteDeviceInquiryStatus");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.LookUpVerizonDiscreteDeviceInquiryStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Order_Commit");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Order_Commit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Order_Enter");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Order_Enter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Recertify_BudgetMobile");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Recertify_BudgetMobile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ResponseMsg");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.ResponseMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "RetrPreactivatedHandsetByDeviceID");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.RetrPreactivatedHandsetByDeviceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "RetrVoiceandTextBalance");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.RetrVoiceandTextBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Sprint_RetrSingleDeviceActivationDetails");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Sprint_RetrSingleDeviceActivationDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TaxItem");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TaxItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_PortInActivateDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TMobile_PortInActivateDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_RetrPreactivatedHandsetByDeviceID");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TMobile_RetrPreactivatedHandsetByDeviceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_SwapIMSI");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TMobile_SwapIMSI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_Commit");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TopUp_Commit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_Enter");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TopUp_Enter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProduct");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.TopUpProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/", "UpdateDeviceID");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.UpdateDeviceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "UpdateProviderDeviceID");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.UpdateProviderDeviceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "VerifyDevice");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.VerifyDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_Discrete_DeviceInquiry");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Verizon_Discrete_DeviceInquiry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_RetrSingleDeviceActivationDetails");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Verizon_RetrSingleDeviceActivationDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "Zip_Coverage");
            cachedSerQNames.add(qName);
            cls = com.budgetmobile.lifeline.Zip_Coverage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String helloWorld() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/HelloWorld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "HelloWorld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Address_Standardize address_Standardize(com.budgetmobile.lifeline.Credentials_Address_Standardize myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Address_Standardize");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Address_Standardize"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Address_Standardize) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Address_Standardize) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Address_Standardize.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Order_Enter order_Enter(com.budgetmobile.lifeline.Credentials_Order_Enter myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Order_Enter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_Enter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Order_Enter) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Order_Enter) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Order_Enter.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Order_Commit order_Commit(com.budgetmobile.lifeline.Credentials_Order_Commit myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Order_Commit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_Commit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Order_Commit) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Order_Commit) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Order_Commit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Devices devices(com.budgetmobile.lifeline.Credentials_Devices myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Devices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Devices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Devices) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Devices) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Devices.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Zip_Coverage zip_Coverage(com.budgetmobile.lifeline.Credentials_Zip_Coverage myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Zip_Coverage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Zip_Coverage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Zip_Coverage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Zip_Coverage) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Zip_Coverage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Address_VerifyLifeline address_VerifyLifeline(com.budgetmobile.lifeline.Credentials_Address_VerifyLifeline myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Address_VerifyLifeline");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Address_VerifyLifeline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Address_VerifyLifeline) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Address_VerifyLifeline) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Address_VerifyLifeline.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Handset_Commit handset_Commit(com.budgetmobile.lifeline.Credentials_Handset_Commit myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Handset_Commit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Handset_Commit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Handset_Commit) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Handset_Commit) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Handset_Commit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Handset_Enter handset_Enter(com.budgetmobile.lifeline.Credentials_Handset_Enter myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Handset_Enter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Handset_Enter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Handset_Enter) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Handset_Enter) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Handset_Enter.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.ActivateVerizonDevice activateVerizonDevice(com.budgetmobile.lifeline.Credentials_ActivateVerizonDevice myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ActivateVerizonDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateVerizonDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.ActivateVerizonDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.ActivateVerizonDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.ActivateVerizonDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupVerizonActivationStatus lookupVerizonActivationStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonActivationStatus myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupVerizonActivationStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonActivationStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupVerizonActivationStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupVerizonActivationStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupVerizonActivationStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.ActivateSprintDevice activateSprintDevice(com.budgetmobile.lifeline.Credentials_ActivateSprintDevice myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ActivateSprintDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateSprintDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.ActivateSprintDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.ActivateSprintDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.ActivateSprintDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.ActivateTmobileDevice activateTmobileDevice(com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ActivateTmobileDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateTmobileDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.ActivateTmobileDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.ActivateTmobileDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.ActivateTmobileDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.TMobile_RetrPreactivatedHandsetByDeviceID TMobile_RetrPreactivatedHandsetByDeviceID(com.budgetmobile.lifeline.Credentials_TMobile_RetrPreactivatedHandsetByDeviceID myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/TMobile_RetrPreactivatedHandsetByDeviceID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_RetrPreactivatedHandsetByDeviceID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.TMobile_RetrPreactivatedHandsetByDeviceID) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.TMobile_RetrPreactivatedHandsetByDeviceID) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.TMobile_RetrPreactivatedHandsetByDeviceID.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Sprint_RetrSingleDeviceActivationDetails sprint_RetrSingleDeviceActivationDetails(com.budgetmobile.lifeline.Credentials_Sprint_RetrSingleDeviceActivationDetails myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Sprint_RetrSingleDeviceActivationDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Sprint_RetrSingleDeviceActivationDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Sprint_RetrSingleDeviceActivationDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Sprint_RetrSingleDeviceActivationDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Sprint_RetrSingleDeviceActivationDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Verizon_RetrSingleDeviceActivationDetails verizon_RetrSingleDeviceActivationDetails(com.budgetmobile.lifeline.Credentials_Verizon_RetrSingleDeviceActivationDetails myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Verizon_RetrSingleDeviceActivationDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_RetrSingleDeviceActivationDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Verizon_RetrSingleDeviceActivationDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Verizon_RetrSingleDeviceActivationDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Verizon_RetrSingleDeviceActivationDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.RetrPreactivatedHandsetByDeviceID retrPreactivatedHandsetByDeviceID(com.budgetmobile.lifeline.Credentials_RetrPreactivatedHandsetByDeviceID myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/RetrPreactivatedHandsetByDeviceID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "RetrPreactivatedHandsetByDeviceID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.RetrPreactivatedHandsetByDeviceID) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.RetrPreactivatedHandsetByDeviceID) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.RetrPreactivatedHandsetByDeviceID.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.BudgetMobile_CompleteFulfillment budgetMobile_CompleteFulfillment(com.budgetmobile.lifeline.Credentials_BudgetMobile_CompleteFulfillment myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/BudgetMobile_CompleteFulfillment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobile_CompleteFulfillment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.BudgetMobile_CompleteFulfillment) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.BudgetMobile_CompleteFulfillment) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.BudgetMobile_CompleteFulfillment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.TMobile_SwapIMSI TMobile_SwapIMSI(com.budgetmobile.lifeline.Credentials_TMobile_SwapIMSI myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/TMobile_SwapIMSI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_SwapIMSI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.TMobile_SwapIMSI) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.TMobile_SwapIMSI) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.TMobile_SwapIMSI.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.ChangeESN_Verizon changeESN_Verizon(com.budgetmobile.lifeline.Credentials_ChangeESN_Verizon myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ChangeESN_Verizon");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ChangeESN_Verizon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.ChangeESN_Verizon) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.ChangeESN_Verizon) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.ChangeESN_Verizon.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupVerizonChangeESNStatus lookupVerizonChangeESNStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonChangeESNStatus myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupVerizonChangeESNStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonChangeESNStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupVerizonChangeESNStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupVerizonChangeESNStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupVerizonChangeESNStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Verizon_Discrete_DeviceInquiry verizon_Discrete_DeviceInquiry(com.budgetmobile.lifeline.Credentials_Verizon_Discrete_DeviceInquiry myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Verizon_Discrete_DeviceInquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_Discrete_DeviceInquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Verizon_Discrete_DeviceInquiry) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Verizon_Discrete_DeviceInquiry) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Verizon_Discrete_DeviceInquiry.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookUpVerizonDiscreteDeviceInquiryStatus lookUpVerizonDiscreteDeviceInquiryStatus(com.budgetmobile.lifeline.Credentials_LookUpVerizonDiscreteDeviceInquiryStatus myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookUpVerizonDiscreteDeviceInquiryStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookUpVerizonDiscreteDeviceInquiryStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookUpVerizonDiscreteDeviceInquiryStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookUpVerizonDiscreteDeviceInquiryStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookUpVerizonDiscreteDeviceInquiryStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.DeactivateVerizonDevice deactivateVerizonDevice(com.budgetmobile.lifeline.Credentials_DeactivateVerizonDevice myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/DeactivateVerizonDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateVerizonDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.DeactivateVerizonDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.DeactivateVerizonDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.DeactivateVerizonDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupVerizonDeactivateDeviceStatus lookupVerizonDeactivateDeviceStatus(com.budgetmobile.lifeline.Credentials_LookupVerizonDeactivateDeviceStatus myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupVerizonDeactivateDeviceStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupVerizonDeactivateDeviceStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupVerizonDeactivateDeviceStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupVerizonDeactivateDeviceStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupVerizonDeactivateDeviceStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.DeactivateSprintDevice deactivateSprintDevice(com.budgetmobile.lifeline.Credentials_DeactivateSprintDevice myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/DeactivateSprintDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateSprintDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.DeactivateSprintDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.DeactivateSprintDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.DeactivateSprintDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.CheckTmobileBalance checkTmobileBalance(com.budgetmobile.lifeline.Credentials_CheckTmobileBalance myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/CheckTmobileBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckTmobileBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.CheckTmobileBalance) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.CheckTmobileBalance) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.CheckTmobileBalance.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.CheckVerizonBalance checkVerizonBalance(com.budgetmobile.lifeline.Credentials_CheckVerizonBalance myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/CheckVerizonBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckVerizonBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.CheckVerizonBalance) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.CheckVerizonBalance) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.CheckVerizonBalance.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.RetrVoiceandTextBalance retrVoiceandTextBalance(com.budgetmobile.lifeline.Credentials_RetrVoiceandTextBalance myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/RetrVoiceandTextBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "RetrVoiceandTextBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.RetrVoiceandTextBalance) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.RetrVoiceandTextBalance) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.RetrVoiceandTextBalance.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupAvailableTopUp_Existing lookupAvailableTopUp_Existing(com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_Existing myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupAvailableTopUp_Existing");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_Existing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupAvailableTopUp_Existing) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupAvailableTopUp_Existing) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupAvailableTopUp_Existing.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.TopUp_Enter topUp_Enter(com.budgetmobile.lifeline.Credentials_TopUp_Enter myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/TopUp_Enter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_Enter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.TopUp_Enter) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.TopUp_Enter) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.TopUp_Enter.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.TopUp_Commit topUp_Commit(com.budgetmobile.lifeline.Credentials_TopUp_Commit myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/TopUp_Commit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_Commit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.TopUp_Commit) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.TopUp_Commit) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.TopUp_Commit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupAccountByMDN lookupAccountByMDN(com.budgetmobile.lifeline.Credentials_LookupAccountByMDN myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupAccountByMDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAccountByMDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupAccountByMDN) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupAccountByMDN) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupAccountByMDN.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.UpdateDeviceID updateDeviceID(com.budgetmobile.lifeline.Credentials_UpdateDeviceID myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/UpdateDeviceID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateDeviceID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.UpdateDeviceID) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.UpdateDeviceID) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.UpdateDeviceID.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupCustomerDetails lookupCustomerDetails(com.budgetmobile.lifeline.Credentials_LookupCustomerDetails myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupCustomerDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupCustomerDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupCustomerDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupCustomerDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupCustomerDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupTopUpDetails lookupTopUpDetails(com.budgetmobile.lifeline.Credentials_LookupTopUpDetails myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupTopUpDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupTopUpDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupTopUpDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupTopUpDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupTopUpDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.Recertify_BudgetMobile recertify_BudgetMobile(com.budgetmobile.lifeline.Credentials_Recertify_BudgetMobile myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Recertify_BudgetMobile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Recertify_BudgetMobile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.Recertify_BudgetMobile) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.Recertify_BudgetMobile) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.Recertify_BudgetMobile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.DiscreteRestoreTMobileDevice discreteRestoreTMobileDevice(com.budgetmobile.lifeline.Credentials_DiscreteRestoreTMobileDevice myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/DiscreteRestoreTMobileDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "DiscreteRestoreTMobileDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.DiscreteRestoreTMobileDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.DiscreteRestoreTMobileDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.DiscreteRestoreTMobileDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.VerifyDevice verifyDevice(com.budgetmobile.lifeline.Credentials_VerifyDevice myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/VerifyDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "VerifyDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.VerifyDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.VerifyDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.VerifyDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.UpdateProviderDeviceID updateProviderDeviceID(com.budgetmobile.lifeline.Credentials_UpdateProviderDeviceID myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/UpdateProviderDeviceID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateProviderDeviceID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.UpdateProviderDeviceID) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.UpdateProviderDeviceID) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.UpdateProviderDeviceID.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.TMobile_PortInActivateDevice TMobile_PortInActivateDevice(com.budgetmobile.lifeline.Credentials_TMobile_PortInActivateDevice myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/TMobile_PortInActivateDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_PortInActivateDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.TMobile_PortInActivateDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.TMobile_PortInActivateDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.TMobile_PortInActivateDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.ActivateTmobileDevice_ITG activateTmobileDevice_ITG(com.budgetmobile.lifeline.Credentials_ActivateTmobileDevice_ITG myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ActivateTmobileDevice_ITG");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateTmobileDevice_ITG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.ActivateTmobileDevice_ITG) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.ActivateTmobileDevice_ITG) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.ActivateTmobileDevice_ITG.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupTopUpTotalDue lookupTopUpTotalDue(com.budgetmobile.lifeline.Credentials_LookupTopUpTotalDue myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupTopUpTotalDue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupTopUpTotalDue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupTopUpTotalDue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupTopUpTotalDue) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupTopUpTotalDue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookUpBasePlan lookupBasePlan(com.budgetmobile.lifeline.Credentials_LookUpBasePlan myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupBasePlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupBasePlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookUpBasePlan) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookUpBasePlan) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookUpBasePlan.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookupAvailableTopUp_New lookupAvailableTopUp_New(com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_New myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupAvailableTopUp_New");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_New"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookupAvailableTopUp_New) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookupAvailableTopUp_New) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookupAvailableTopUp_New.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetmobile.lifeline.LookUpCustomer lookupCustomer(com.budgetmobile.lifeline.Credentials_LookUpCustomer myCreds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/LookupCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "LookupCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {myCreds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetmobile.lifeline.LookUpCustomer) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetmobile.lifeline.LookUpCustomer) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetmobile.lifeline.LookUpCustomer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

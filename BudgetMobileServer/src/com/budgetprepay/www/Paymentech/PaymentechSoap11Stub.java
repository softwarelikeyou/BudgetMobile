/**
 * PaymentechSoap11Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class PaymentechSoap11Stub extends org.apache.axis.client.Stub implements com.budgetprepay.www.Paymentech.Paymentech {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProfileDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileDeleteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileDeleteRequest"), com.budgetprepay.www.Paymentech.ProfileDeleteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileDeleteResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.ProfileDeleteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileDeleteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Inquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "InquiryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "InquiryRequest"), com.budgetprepay.www.Paymentech.InquiryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "InquiryResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.InquiryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "InquiryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkForCapture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "MarkForCaptureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "MarkForCaptureRequest"), com.budgetprepay.www.Paymentech.MarkForCaptureRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "MarkForCaptureResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.MarkForCaptureResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "MarkForCaptureResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NewOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "NewOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "NewOrderRequest"), com.budgetprepay.www.Paymentech.NewOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "NewOrderResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.NewOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "NewOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FlexCache");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "FlexCacheRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "FlexCacheRequest"), com.budgetprepay.www.Paymentech.FlexCacheRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "FlexCacheResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.FlexCacheResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "FlexCacheResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProfileUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileUpdateRequest"), com.budgetprepay.www.Paymentech.ProfileUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileUpdateResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.ProfileUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AccountUpdater");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "AccountUpdaterRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "AccountUpdaterRequest"), com.budgetprepay.www.Paymentech.AccountUpdaterRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "AccountUpdaterResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.AccountUpdaterResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "AccountUpdaterResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnMark");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "UnMarkRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "UnMarkRequest"), com.budgetprepay.www.Paymentech.UnMarkRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "UnMarkResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.UnMarkResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "UnMarkResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LogMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "LogMessageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "LogMessageRequest"), com.budgetprepay.www.Paymentech.LogMessageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "LogMessageResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.LogMessageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "LogMessageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProfileRetrieval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileRetrievalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileRetrievalRequest"), com.budgetprepay.www.Paymentech.ProfileRetrievalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileRetrievalResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.ProfileRetrievalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileRetrievalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Reversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ReversalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ReversalRequest"), com.budgetprepay.www.Paymentech.ReversalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ReversalResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.ReversalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ReversalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EndOfDay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "EndOfDayRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "EndOfDayRequest"), com.budgetprepay.www.Paymentech.EndOfDayRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "EndOfDayResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.EndOfDayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "EndOfDayResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SafetechFraudAnalysis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "SafetechFraudAnalysisRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "SafetechFraudAnalysisRequest"), com.budgetprepay.www.Paymentech.SafetechFraudAnalysisRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "SafetechFraudAnalysisResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.SafetechFraudAnalysisResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "SafetechFraudAnalysisResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProfileAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileAddRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileAddRequest"), com.budgetprepay.www.Paymentech.ProfileAddRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileAddResponse"));
        oper.setReturnClass(com.budgetprepay.www.Paymentech.ProfileAddResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileAddResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

    }

    public PaymentechSoap11Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PaymentechSoap11Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PaymentechSoap11Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "AccountUpdaterRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.AccountUpdaterRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "AccountUpdaterResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.AccountUpdaterResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "baseElements");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.BaseElements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "EndOfDayRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.EndOfDayRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "EndOfDayResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.EndOfDayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ErrorMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "FlexCacheRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.FlexCacheRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "FlexCacheResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.FlexCacheResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysis");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.FraudAnalysis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysisResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.FraudAnalysisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "InquiryRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.InquiryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "InquiryResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.InquiryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "LogMessageRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.LogMessageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "LogMessageResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.LogMessageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "MarkForCaptureRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.MarkForCaptureRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "MarkForCaptureResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.MarkForCaptureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "NewOrderRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.NewOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "NewOrderResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.NewOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3LineItems");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.PCard3LineItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileAddRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileAddRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileAddResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileAddResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileDeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileDeleteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileRetrievalRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileRetrievalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileRetrievalResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileRetrievalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ProfileUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ReversalRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ReversalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ReversalResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.ReversalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "SafetechFraudAnalysisRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.SafetechFraudAnalysisRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "SafetechFraudAnalysisResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.SafetechFraudAnalysisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softMerchantDescriptors");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.SoftMerchantDescriptors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "UnMarkRequest");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.UnMarkRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "UnMarkResponse");
            cachedSerQNames.add(qName);
            cls = com.budgetprepay.www.Paymentech.UnMarkResponse.class;
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

    public com.budgetprepay.www.Paymentech.ProfileDeleteResponse profileDelete(com.budgetprepay.www.Paymentech.ProfileDeleteRequest profileDeleteRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProfileDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profileDeleteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.ProfileDeleteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.ProfileDeleteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.ProfileDeleteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.InquiryResponse inquiry(com.budgetprepay.www.Paymentech.InquiryRequest inquiryRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Inquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inquiryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.InquiryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.InquiryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.InquiryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.MarkForCaptureResponse markForCapture(com.budgetprepay.www.Paymentech.MarkForCaptureRequest markForCaptureRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MarkForCapture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {markForCaptureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.MarkForCaptureResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.MarkForCaptureResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.MarkForCaptureResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.NewOrderResponse newOrder(com.budgetprepay.www.Paymentech.NewOrderRequest newOrderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NewOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {newOrderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.NewOrderResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.NewOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.NewOrderResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.FlexCacheResponse flexCache(com.budgetprepay.www.Paymentech.FlexCacheRequest flexCacheRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FlexCache"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {flexCacheRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.FlexCacheResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.FlexCacheResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.FlexCacheResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.ProfileUpdateResponse profileUpdate(com.budgetprepay.www.Paymentech.ProfileUpdateRequest profileUpdateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProfileUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profileUpdateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.ProfileUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.ProfileUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.ProfileUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.AccountUpdaterResponse accountUpdater(com.budgetprepay.www.Paymentech.AccountUpdaterRequest accountUpdaterRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AccountUpdater"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountUpdaterRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.AccountUpdaterResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.AccountUpdaterResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.AccountUpdaterResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.UnMarkResponse unMark(com.budgetprepay.www.Paymentech.UnMarkRequest unMarkRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnMark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unMarkRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.UnMarkResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.UnMarkResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.UnMarkResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.LogMessageResponse logMessage(com.budgetprepay.www.Paymentech.LogMessageRequest logMessageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LogMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logMessageRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.LogMessageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.LogMessageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.LogMessageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.ProfileRetrievalResponse profileRetrieval(com.budgetprepay.www.Paymentech.ProfileRetrievalRequest profileRetrievalRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProfileRetrieval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profileRetrievalRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.ProfileRetrievalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.ProfileRetrievalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.ProfileRetrievalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.ReversalResponse reversal(com.budgetprepay.www.Paymentech.ReversalRequest reversalRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Reversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reversalRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.ReversalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.ReversalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.ReversalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.EndOfDayResponse endOfDay(com.budgetprepay.www.Paymentech.EndOfDayRequest endOfDayRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EndOfDay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endOfDayRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.EndOfDayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.EndOfDayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.EndOfDayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.SafetechFraudAnalysisResponse safetechFraudAnalysis(com.budgetprepay.www.Paymentech.SafetechFraudAnalysisRequest safetechFraudAnalysisRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SafetechFraudAnalysis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {safetechFraudAnalysisRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.SafetechFraudAnalysisResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.SafetechFraudAnalysisResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.SafetechFraudAnalysisResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.budgetprepay.www.Paymentech.ProfileAddResponse profileAdd(com.budgetprepay.www.Paymentech.ProfileAddRequest profileAddRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProfileAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profileAddRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.budgetprepay.www.Paymentech.ProfileAddResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.budgetprepay.www.Paymentech.ProfileAddResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.budgetprepay.www.Paymentech.ProfileAddResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

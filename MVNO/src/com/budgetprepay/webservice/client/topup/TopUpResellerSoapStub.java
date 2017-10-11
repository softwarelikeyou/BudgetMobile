/**
 * TopUpResellerSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.webservice.client.topup;

public class TopUpResellerSoapStub extends org.apache.axis.client.Stub implements com.budgetprepay.webservice.client.topup.TopUpResellerSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HelloWorld");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://budgetprepay.com/", "HelloWorldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnterOrderDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ClientRefID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "MDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ProductID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ResellerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ReferenceID"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommitOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ReferenceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "TopUpID"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ReferenceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public TopUpResellerSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TopUpResellerSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TopUpResellerSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
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
        _call.setSOAPActionURI("http://budgetprepay.com/HelloWorld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://budgetprepay.com/", "HelloWorld"));

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

    public void enterOrderDetail(java.lang.String clientRefID, java.lang.String MDN, java.lang.String productID, short resellerID, javax.xml.rpc.holders.StringHolder referenceID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://budgetprepay.com/EnterOrderDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://budgetprepay.com/", "EnterOrderDetailsRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {clientRefID, MDN, productID, new java.lang.Short(resellerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                referenceID.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ReferenceID"));
            } catch (java.lang.Exception _exception) {
                referenceID.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ReferenceID")), java.lang.String.class);
            }
            try {
                errorCode.value = ((java.lang.Short) _output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode"))).shortValue();
            } catch (java.lang.Exception _exception) {
                errorCode.value = ((java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode")), short.class)).shortValue();
            }
            try {
                errorMessage.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage"));
            } catch (java.lang.Exception _exception) {
                errorMessage.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void commitOrder(java.lang.String referenceID, javax.xml.rpc.holders.LongHolder topUpID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://budgetprepay.com/CommitOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://budgetprepay.com/", "CommitOrderRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                topUpID.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "TopUpID"))).longValue();
            } catch (java.lang.Exception _exception) {
                topUpID.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "TopUpID")), long.class)).longValue();
            }
            try {
                errorCode.value = ((java.lang.Short) _output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode"))).shortValue();
            } catch (java.lang.Exception _exception) {
                errorCode.value = ((java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode")), short.class)).shortValue();
            }
            try {
                errorMessage.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage"));
            } catch (java.lang.Exception _exception) {
                errorMessage.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void cancelOrder(java.lang.String referenceID, javax.xml.rpc.holders.ShortHolder errorCode, javax.xml.rpc.holders.StringHolder errorMessage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://budgetprepay.com/CancelOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://budgetprepay.com/", "CancelOrderRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                errorCode.value = ((java.lang.Short) _output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode"))).shortValue();
            } catch (java.lang.Exception _exception) {
                errorCode.value = ((java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorCode")), short.class)).shortValue();
            }
            try {
                errorMessage.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage"));
            } catch (java.lang.Exception _exception) {
                errorMessage.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://budgetprepay.com/", "ErrorMessage")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

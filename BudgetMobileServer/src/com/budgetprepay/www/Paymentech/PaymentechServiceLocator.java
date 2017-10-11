/**
 * PaymentechServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class PaymentechServiceLocator extends org.apache.axis.client.Service implements com.budgetprepay.www.Paymentech.PaymentechService {

    public PaymentechServiceLocator() {
    }


    public PaymentechServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaymentechServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PaymentechSoap11
    private java.lang.String PaymentechSoap11_address = "http://sql008:80/Paymentech/Paymentech.wsdl";

    public java.lang.String getPaymentechSoap11Address() {
        return PaymentechSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PaymentechSoap11WSDDServiceName = "PaymentechSoap11";

    public java.lang.String getPaymentechSoap11WSDDServiceName() {
        return PaymentechSoap11WSDDServiceName;
    }

    public void setPaymentechSoap11WSDDServiceName(java.lang.String name) {
        PaymentechSoap11WSDDServiceName = name;
    }

    public com.budgetprepay.www.Paymentech.Paymentech getPaymentechSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PaymentechSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPaymentechSoap11(endpoint);
    }

    public com.budgetprepay.www.Paymentech.Paymentech getPaymentechSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.budgetprepay.www.Paymentech.PaymentechSoap11Stub _stub = new com.budgetprepay.www.Paymentech.PaymentechSoap11Stub(portAddress, this);
            _stub.setPortName(getPaymentechSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPaymentechSoap11EndpointAddress(java.lang.String address) {
        PaymentechSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.budgetprepay.www.Paymentech.Paymentech.class.isAssignableFrom(serviceEndpointInterface)) {
                com.budgetprepay.www.Paymentech.PaymentechSoap11Stub _stub = new com.budgetprepay.www.Paymentech.PaymentechSoap11Stub(new java.net.URL(PaymentechSoap11_address), this);
                _stub.setPortName(getPaymentechSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PaymentechSoap11".equals(inputPortName)) {
            return getPaymentechSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PaymentechService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PaymentechSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PaymentechSoap11".equals(portName)) {
            setPaymentechSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

/**
 * TopUpResellerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.webservice.client.topup;

public class TopUpResellerLocator extends org.apache.axis.client.Service implements com.budgetprepay.webservice.client.topup.TopUpReseller {

    public TopUpResellerLocator() {
    }


    public TopUpResellerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TopUpResellerLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TopUpResellerSoap
    private java.lang.String TopUpResellerSoap_address = "http://www.budgetprepay.com/webservices/TopUpReseller/TopUpReseller.asmx";

    public java.lang.String getTopUpResellerSoapAddress() {
        return TopUpResellerSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TopUpResellerSoapWSDDServiceName = "TopUpResellerSoap";

    public java.lang.String getTopUpResellerSoapWSDDServiceName() {
        return TopUpResellerSoapWSDDServiceName;
    }

    public void setTopUpResellerSoapWSDDServiceName(java.lang.String name) {
        TopUpResellerSoapWSDDServiceName = name;
    }

    public com.budgetprepay.webservice.client.topup.TopUpResellerSoap getTopUpResellerSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TopUpResellerSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTopUpResellerSoap(endpoint);
    }

    public com.budgetprepay.webservice.client.topup.TopUpResellerSoap getTopUpResellerSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.budgetprepay.webservice.client.topup.TopUpResellerSoapStub _stub = new com.budgetprepay.webservice.client.topup.TopUpResellerSoapStub(portAddress, this);
            _stub.setPortName(getTopUpResellerSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTopUpResellerSoapEndpointAddress(java.lang.String address) {
        TopUpResellerSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.budgetprepay.webservice.client.topup.TopUpResellerSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.budgetprepay.webservice.client.topup.TopUpResellerSoapStub _stub = new com.budgetprepay.webservice.client.topup.TopUpResellerSoapStub(new java.net.URL(TopUpResellerSoap_address), this);
                _stub.setPortName(getTopUpResellerSoapWSDDServiceName());
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
        if ("TopUpResellerSoap".equals(inputPortName)) {
            return getTopUpResellerSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://budgetprepay.com/", "TopUpReseller");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://budgetprepay.com/", "TopUpResellerSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TopUpResellerSoap".equals(portName)) {
            setTopUpResellerSoapEndpointAddress(address);
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

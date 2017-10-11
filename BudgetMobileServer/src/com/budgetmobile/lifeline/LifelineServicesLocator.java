/**
 * LifelineServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class LifelineServicesLocator extends org.apache.axis.client.Service implements com.budgetmobile.lifeline.LifelineServices {

    public LifelineServicesLocator() {
    }


    public LifelineServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LifelineServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LifelineServicesSoap
    private java.lang.String LifelineServicesSoap_address = "http://www.budgetprepay.com/webservices/lifelineservices/lifelineservices.asmx";

    public java.lang.String getLifelineServicesSoapAddress() {
        return LifelineServicesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LifelineServicesSoapWSDDServiceName = "LifelineServicesSoap";

    public java.lang.String getLifelineServicesSoapWSDDServiceName() {
        return LifelineServicesSoapWSDDServiceName;
    }

    public void setLifelineServicesSoapWSDDServiceName(java.lang.String name) {
        LifelineServicesSoapWSDDServiceName = name;
    }

    public com.budgetmobile.lifeline.LifelineServicesSoap getLifelineServicesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LifelineServicesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLifelineServicesSoap(endpoint);
    }

    public com.budgetmobile.lifeline.LifelineServicesSoap getLifelineServicesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.budgetmobile.lifeline.LifelineServicesSoapStub _stub = new com.budgetmobile.lifeline.LifelineServicesSoapStub(portAddress, this);
            _stub.setPortName(getLifelineServicesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLifelineServicesSoapEndpointAddress(java.lang.String address) {
        LifelineServicesSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.budgetmobile.lifeline.LifelineServicesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.budgetmobile.lifeline.LifelineServicesSoapStub _stub = new com.budgetmobile.lifeline.LifelineServicesSoapStub(new java.net.URL(LifelineServicesSoap_address), this);
                _stub.setPortName(getLifelineServicesSoapWSDDServiceName());
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
        if ("LifelineServicesSoap".equals(inputPortName)) {
            return getLifelineServicesSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "LifelineServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "LifelineServicesSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LifelineServicesSoap".equals(portName)) {
            setLifelineServicesSoapEndpointAddress(address);
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

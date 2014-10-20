/**
 * ClasseWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webserviceSOAP;

public class ClasseWSServiceLocator extends org.apache.axis.client.Service implements webserviceSOAP.ClasseWSService {

    public ClasseWSServiceLocator() {
    }


    public ClasseWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClasseWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for	 ClasseWS
    private java.lang.String ClasseWS_address = "http://localhost:8080/webserviceSOAP/services/ClasseWS";

    public java.lang.String getClasseWSAddress() {
        return ClasseWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClasseWSWSDDServiceName = "ClasseWS";

    public java.lang.String getClasseWSWSDDServiceName() {
        return ClasseWSWSDDServiceName;
    }

    public void setClasseWSWSDDServiceName(java.lang.String name) {
        ClasseWSWSDDServiceName = name;
    }

    public webserviceSOAP.ClasseWS getClasseWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClasseWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClasseWS(endpoint);
    }

    public webserviceSOAP.ClasseWS getClasseWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webserviceSOAP.ClasseWSSoapBindingStub _stub = new webserviceSOAP.ClasseWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getClasseWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClasseWSEndpointAddress(java.lang.String address) {
        ClasseWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webserviceSOAP.ClasseWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webserviceSOAP.ClasseWSSoapBindingStub _stub = new webserviceSOAP.ClasseWSSoapBindingStub(new java.net.URL(ClasseWS_address), this);
                _stub.setPortName(getClasseWSWSDDServiceName());
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
        if ("ClasseWS".equals(inputPortName)) {
            return getClasseWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webserviceSOAP", "ClasseWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webserviceSOAP", "ClasseWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClasseWS".equals(portName)) {
            setClasseWSEndpointAddress(address);
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

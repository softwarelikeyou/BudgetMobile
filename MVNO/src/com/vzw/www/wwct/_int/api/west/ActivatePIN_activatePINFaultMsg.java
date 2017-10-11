
/**
 * ActivatePIN_activatePINFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wwct._int.api.west;

public class ActivatePIN_activatePINFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517522960L;
    
    private com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ActivatePIN_activatePINFault faultMessage;

    
        public ActivatePIN_activatePINFaultMsg() {
            super("ActivatePIN_activatePINFaultMsg");
        }

        public ActivatePIN_activatePINFaultMsg(java.lang.String s) {
           super(s);
        }

        public ActivatePIN_activatePINFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ActivatePIN_activatePINFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ActivatePIN_activatePINFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ActivatePIN_activatePINFault getFaultMessage(){
       return faultMessage;
    }
}
    
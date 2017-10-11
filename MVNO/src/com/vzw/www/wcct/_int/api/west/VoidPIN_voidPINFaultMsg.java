
/**
 * VoidPIN_voidPINFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.west;

public class VoidPIN_voidPINFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517572630L;
    
    private com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPIN_voidPINFault faultMessage;

    
        public VoidPIN_voidPINFaultMsg() {
            super("VoidPIN_voidPINFaultMsg");
        }

        public VoidPIN_voidPINFaultMsg(java.lang.String s) {
           super(s);
        }

        public VoidPIN_voidPINFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public VoidPIN_voidPINFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPIN_voidPINFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPIN_voidPINFault getFaultMessage(){
       return faultMessage;
    }
}
    
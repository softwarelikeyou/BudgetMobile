
/**
 * VoidGroup_voidGroupFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.west;

public class VoidGroup_voidGroupFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517572677L;
    
    private com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidGroup_voidGroupFault faultMessage;

    
        public VoidGroup_voidGroupFaultMsg() {
            super("VoidGroup_voidGroupFaultMsg");
        }

        public VoidGroup_voidGroupFaultMsg(java.lang.String s) {
           super(s);
        }

        public VoidGroup_voidGroupFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public VoidGroup_voidGroupFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidGroup_voidGroupFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidGroup_voidGroupFault getFaultMessage(){
       return faultMessage;
    }
}
    
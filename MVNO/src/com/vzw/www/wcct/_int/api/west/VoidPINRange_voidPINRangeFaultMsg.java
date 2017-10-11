
/**
 * VoidPINRange_voidPINRangeFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.west;

public class VoidPINRange_voidPINRangeFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517572583L;
    
    private com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRange_voidPINRangeFault faultMessage;

    
        public VoidPINRange_voidPINRangeFaultMsg() {
            super("VoidPINRange_voidPINRangeFaultMsg");
        }

        public VoidPINRange_voidPINRangeFaultMsg(java.lang.String s) {
           super(s);
        }

        public VoidPINRange_voidPINRangeFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public VoidPINRange_voidPINRangeFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRange_voidPINRangeFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRange_voidPINRangeFault getFaultMessage(){
       return faultMessage;
    }
}
    
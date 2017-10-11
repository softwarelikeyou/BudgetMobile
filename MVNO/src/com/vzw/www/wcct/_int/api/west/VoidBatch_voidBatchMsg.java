
/**
 * VoidBatch_voidBatchMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.west;

public class VoidBatch_voidBatchMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517572614L;
    
    private com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidBatch_voidBatch faultMessage;

    
        public VoidBatch_voidBatchMsg() {
            super("VoidBatch_voidBatchMsg");
        }

        public VoidBatch_voidBatchMsg(java.lang.String s) {
           super(s);
        }

        public VoidBatch_voidBatchMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public VoidBatch_voidBatchMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidBatch_voidBatch msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidBatch_voidBatch getFaultMessage(){
       return faultMessage;
    }
}
    
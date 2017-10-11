
/**
 * UpdatePINBatchStatus_updateBatchStatusFaultUmMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wwct._int.api.west;

public class UpdatePINBatchStatus_updateBatchStatusFaultUmMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517522897L;
    
    private com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINBatchStatus_updateBatchStatusFaultUm faultMessage;

    
        public UpdatePINBatchStatus_updateBatchStatusFaultUmMsg() {
            super("UpdatePINBatchStatus_updateBatchStatusFaultUmMsg");
        }

        public UpdatePINBatchStatus_updateBatchStatusFaultUmMsg(java.lang.String s) {
           super(s);
        }

        public UpdatePINBatchStatus_updateBatchStatusFaultUmMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpdatePINBatchStatus_updateBatchStatusFaultUmMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINBatchStatus_updateBatchStatusFaultUm msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINBatchStatus_updateBatchStatusFaultUm getFaultMessage(){
       return faultMessage;
    }
}
    
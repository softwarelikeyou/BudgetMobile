
/**
 * UpdatePINGroupInfo_modifyGroupInfoFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wwct._int.api.west;

public class UpdatePINGroupInfo_modifyGroupInfoFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517522929L;
    
    private com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINGroupInfo_modifyGroupInfoFault faultMessage;

    
        public UpdatePINGroupInfo_modifyGroupInfoFaultMsg() {
            super("UpdatePINGroupInfo_modifyGroupInfoFaultMsg");
        }

        public UpdatePINGroupInfo_modifyGroupInfoFaultMsg(java.lang.String s) {
           super(s);
        }

        public UpdatePINGroupInfo_modifyGroupInfoFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpdatePINGroupInfo_modifyGroupInfoFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINGroupInfo_modifyGroupInfoFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINGroupInfo_modifyGroupInfoFault getFaultMessage(){
       return faultMessage;
    }
}
    
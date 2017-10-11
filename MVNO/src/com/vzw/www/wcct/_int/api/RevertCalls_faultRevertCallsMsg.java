
/**
 * RevertCalls_faultRevertCallsMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class RevertCalls_faultRevertCallsMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937184L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCalls_faultRevertCalls faultMessage;

    
        public RevertCalls_faultRevertCallsMsg() {
            super("RevertCalls_faultRevertCallsMsg");
        }

        public RevertCalls_faultRevertCallsMsg(java.lang.String s) {
           super(s);
        }

        public RevertCalls_faultRevertCallsMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RevertCalls_faultRevertCallsMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCalls_faultRevertCalls msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCalls_faultRevertCalls getFaultMessage(){
       return faultMessage;
    }
}
    
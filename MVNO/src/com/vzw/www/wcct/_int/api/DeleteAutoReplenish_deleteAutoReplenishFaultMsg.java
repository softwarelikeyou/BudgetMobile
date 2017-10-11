
/**
 * DeleteAutoReplenish_deleteAutoReplenishFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class DeleteAutoReplenish_deleteAutoReplenishFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937141L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo faultMessage;

    
        public DeleteAutoReplenish_deleteAutoReplenishFaultMsg() {
            super("DeleteAutoReplenish_deleteAutoReplenishFaultMsg");
        }

        public DeleteAutoReplenish_deleteAutoReplenishFaultMsg(java.lang.String s) {
           super(s);
        }

        public DeleteAutoReplenish_deleteAutoReplenishFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DeleteAutoReplenish_deleteAutoReplenishFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo getFaultMessage(){
       return faultMessage;
    }
}
    
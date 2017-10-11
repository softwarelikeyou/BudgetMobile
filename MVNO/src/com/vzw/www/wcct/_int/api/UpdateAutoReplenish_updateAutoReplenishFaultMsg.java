
/**
 * UpdateAutoReplenish_updateAutoReplenishFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class UpdateAutoReplenish_updateAutoReplenishFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937204L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo faultMessage;

    
        public UpdateAutoReplenish_updateAutoReplenishFaultMsg() {
            super("UpdateAutoReplenish_updateAutoReplenishFaultMsg");
        }

        public UpdateAutoReplenish_updateAutoReplenishFaultMsg(java.lang.String s) {
           super(s);
        }

        public UpdateAutoReplenish_updateAutoReplenishFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpdateAutoReplenish_updateAutoReplenishFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo getFaultMessage(){
       return faultMessage;
    }
}
    
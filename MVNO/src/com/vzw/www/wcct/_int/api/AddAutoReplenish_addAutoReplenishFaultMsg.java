
/**
 * AddAutoReplenish_addAutoReplenishFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class AddAutoReplenish_addAutoReplenishFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937336L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo faultMessage;

    
        public AddAutoReplenish_addAutoReplenishFaultMsg() {
            super("AddAutoReplenish_addAutoReplenishFaultMsg");
        }

        public AddAutoReplenish_addAutoReplenishFaultMsg(java.lang.String s) {
           super(s);
        }

        public AddAutoReplenish_addAutoReplenishFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AddAutoReplenish_addAutoReplenishFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberInfo_faultUpdateSubscriberInfo getFaultMessage(){
       return faultMessage;
    }
}
    
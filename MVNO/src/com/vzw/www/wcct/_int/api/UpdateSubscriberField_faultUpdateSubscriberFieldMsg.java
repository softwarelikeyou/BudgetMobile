
/**
 * UpdateSubscriberField_faultUpdateSubscriberFieldMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class UpdateSubscriberField_faultUpdateSubscriberFieldMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937223L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberField_faultUpdateSubscriberField faultMessage;

    
        public UpdateSubscriberField_faultUpdateSubscriberFieldMsg() {
            super("UpdateSubscriberField_faultUpdateSubscriberFieldMsg");
        }

        public UpdateSubscriberField_faultUpdateSubscriberFieldMsg(java.lang.String s) {
           super(s);
        }

        public UpdateSubscriberField_faultUpdateSubscriberFieldMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpdateSubscriberField_faultUpdateSubscriberFieldMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberField_faultUpdateSubscriberField msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberField_faultUpdateSubscriberField getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * UpdateCredit_faultUpdateCreditMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class UpdateCredit_faultUpdateCreditMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937319L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateCredit_faultUpdateCredit faultMessage;

    
        public UpdateCredit_faultUpdateCreditMsg() {
            super("UpdateCredit_faultUpdateCreditMsg");
        }

        public UpdateCredit_faultUpdateCreditMsg(java.lang.String s) {
           super(s);
        }

        public UpdateCredit_faultUpdateCreditMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpdateCredit_faultUpdateCreditMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateCredit_faultUpdateCredit msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateCredit_faultUpdateCredit getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * UpdateAccountBalance_faultUpdateAccountBalanceMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class UpdateAccountBalance_faultUpdateAccountBalanceMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937110L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccountBalance_faultUpdateAccountBalance faultMessage;

    
        public UpdateAccountBalance_faultUpdateAccountBalanceMsg() {
            super("UpdateAccountBalance_faultUpdateAccountBalanceMsg");
        }

        public UpdateAccountBalance_faultUpdateAccountBalanceMsg(java.lang.String s) {
           super(s);
        }

        public UpdateAccountBalance_faultUpdateAccountBalanceMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpdateAccountBalance_faultUpdateAccountBalanceMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccountBalance_faultUpdateAccountBalance msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccountBalance_faultUpdateAccountBalance getFaultMessage(){
       return faultMessage;
    }
}
    
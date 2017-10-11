
/**
 * SearchSubscriberInfo_faultSearchSubscriberInfoMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class SearchSubscriberInfo_faultSearchSubscriberInfoMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937086L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchSubscriberInfo_faultSearchSubscriberInfo faultMessage;

    
        public SearchSubscriberInfo_faultSearchSubscriberInfoMsg() {
            super("SearchSubscriberInfo_faultSearchSubscriberInfoMsg");
        }

        public SearchSubscriberInfo_faultSearchSubscriberInfoMsg(java.lang.String s) {
           super(s);
        }

        public SearchSubscriberInfo_faultSearchSubscriberInfoMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchSubscriberInfo_faultSearchSubscriberInfoMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchSubscriberInfo_faultSearchSubscriberInfo msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchSubscriberInfo_faultSearchSubscriberInfo getFaultMessage(){
       return faultMessage;
    }
}
    
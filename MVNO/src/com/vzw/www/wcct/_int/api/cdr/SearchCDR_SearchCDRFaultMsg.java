
/**
 * SearchCDR_SearchCDRFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.cdr;

public class SearchCDR_SearchCDRFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385427998059L;
    
    private com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDR_SearchCDRFault faultMessage;

    
        public SearchCDR_SearchCDRFaultMsg() {
            super("SearchCDR_SearchCDRFaultMsg");
        }

        public SearchCDR_SearchCDRFaultMsg(java.lang.String s) {
           super(s);
        }

        public SearchCDR_SearchCDRFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchCDR_SearchCDRFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDR_SearchCDRFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDR_SearchCDRFault getFaultMessage(){
       return faultMessage;
    }
}
    
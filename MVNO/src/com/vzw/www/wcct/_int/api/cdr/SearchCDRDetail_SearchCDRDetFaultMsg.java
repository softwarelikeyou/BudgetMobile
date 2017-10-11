
/**
 * SearchCDRDetail_SearchCDRDetFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.cdr;

public class SearchCDRDetail_SearchCDRDetFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385427997997L;
    
    private com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDRDetail_SearchCDRDetFault faultMessage;

    
        public SearchCDRDetail_SearchCDRDetFaultMsg() {
            super("SearchCDRDetail_SearchCDRDetFaultMsg");
        }

        public SearchCDRDetail_SearchCDRDetFaultMsg(java.lang.String s) {
           super(s);
        }

        public SearchCDRDetail_SearchCDRDetFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchCDRDetail_SearchCDRDetFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDRDetail_SearchCDRDetFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDRDetail_SearchCDRDetFault getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * SearchPIN_searchPINFaultfMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.west;

public class SearchPIN_searchPINFaultfMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517481916L;
    
    private com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPIN_searchPINFaultf faultMessage;

    
        public SearchPIN_searchPINFaultfMsg() {
            super("SearchPIN_searchPINFaultfMsg");
        }

        public SearchPIN_searchPINFaultfMsg(java.lang.String s) {
           super(s);
        }

        public SearchPIN_searchPINFaultfMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchPIN_searchPINFaultfMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPIN_searchPINFaultf msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPIN_searchPINFaultf getFaultMessage(){
       return faultMessage;
    }
}
    
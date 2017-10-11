
/**
 * SearchPINGroup_searchPINGroupFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.west;

public class SearchPINGroup_searchPINGroupFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517481979L;
    
    private com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINGroup_searchPINGroupFault faultMessage;

    
        public SearchPINGroup_searchPINGroupFaultMsg() {
            super("SearchPINGroup_searchPINGroupFaultMsg");
        }

        public SearchPINGroup_searchPINGroupFaultMsg(java.lang.String s) {
           super(s);
        }

        public SearchPINGroup_searchPINGroupFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchPINGroup_searchPINGroupFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINGroup_searchPINGroupFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINGroup_searchPINGroupFault getFaultMessage(){
       return faultMessage;
    }
}
    
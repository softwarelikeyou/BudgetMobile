
/**
 * SearchPINBatch_searchPINBatchFault1Msg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api.west;

public class SearchPINBatch_searchPINBatchFault1Msg extends java.lang.Exception{

    private static final long serialVersionUID = 1385517481948L;
    
    private com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINBatch_searchPINBatchFault1 faultMessage;

    
        public SearchPINBatch_searchPINBatchFault1Msg() {
            super("SearchPINBatch_searchPINBatchFault1Msg");
        }

        public SearchPINBatch_searchPINBatchFault1Msg(java.lang.String s) {
           super(s);
        }

        public SearchPINBatch_searchPINBatchFault1Msg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchPINBatch_searchPINBatchFault1Msg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINBatch_searchPINBatchFault1 msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINBatch_searchPINBatchFault1 getFaultMessage(){
       return faultMessage;
    }
}
    
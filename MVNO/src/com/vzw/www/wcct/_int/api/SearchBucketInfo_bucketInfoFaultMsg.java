
/**
 * SearchBucketInfo_bucketInfoFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class SearchBucketInfo_bucketInfoFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937301L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfo_bucketInfoFault faultMessage;

    
        public SearchBucketInfo_bucketInfoFaultMsg() {
            super("SearchBucketInfo_bucketInfoFaultMsg");
        }

        public SearchBucketInfo_bucketInfoFaultMsg(java.lang.String s) {
           super(s);
        }

        public SearchBucketInfo_bucketInfoFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchBucketInfo_bucketInfoFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfo_bucketInfoFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfo_bucketInfoFault getFaultMessage(){
       return faultMessage;
    }
}
    
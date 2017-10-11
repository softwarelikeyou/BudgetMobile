
/**
 * DeleteAllBuckets_deleteBucketFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class DeleteAllBuckets_deleteBucketFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937354L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfo_bucketInfoFault faultMessage;

    
        public DeleteAllBuckets_deleteBucketFaultMsg() {
            super("DeleteAllBuckets_deleteBucketFaultMsg");
        }

        public DeleteAllBuckets_deleteBucketFaultMsg(java.lang.String s) {
           super(s);
        }

        public DeleteAllBuckets_deleteBucketFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DeleteAllBuckets_deleteBucketFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfo_bucketInfoFault msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfo_bucketInfoFault getFaultMessage(){
       return faultMessage;
    }
}
    
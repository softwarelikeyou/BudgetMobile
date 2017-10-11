
/**
 * UpdateBucket_faultupdateBucketRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class UpdateBucket_faultupdateBucketRequestMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937243L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateBucket_faultupdateBucketRequest faultMessage;

    
        public UpdateBucket_faultupdateBucketRequestMsg() {
            super("UpdateBucket_faultupdateBucketRequestMsg");
        }

        public UpdateBucket_faultupdateBucketRequestMsg(java.lang.String s) {
           super(s);
        }

        public UpdateBucket_faultupdateBucketRequestMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpdateBucket_faultupdateBucketRequestMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateBucket_faultupdateBucketRequest msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateBucket_faultupdateBucketRequest getFaultMessage(){
       return faultMessage;
    }
}
    
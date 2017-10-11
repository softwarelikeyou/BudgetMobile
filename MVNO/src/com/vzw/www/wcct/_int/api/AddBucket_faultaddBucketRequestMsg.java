
/**
 * AddBucket_faultaddBucketRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vzw.www.wcct._int.api;

public class AddBucket_faultaddBucketRequestMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1383697937163L;
    
    private com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddBucket_faultaddBucketRequest faultMessage;

    
        public AddBucket_faultaddBucketRequestMsg() {
            super("AddBucket_faultaddBucketRequestMsg");
        }

        public AddBucket_faultaddBucketRequestMsg(java.lang.String s) {
           super(s);
        }

        public AddBucket_faultaddBucketRequestMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AddBucket_faultaddBucketRequestMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddBucket_faultaddBucketRequest msg){
       faultMessage = msg;
    }
    
    public com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddBucket_faultaddBucketRequest getFaultMessage(){
       return faultMessage;
    }
}
    
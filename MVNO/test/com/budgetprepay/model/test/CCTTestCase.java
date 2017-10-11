package com.budgetprepay.model.test;

import java.io.OutputStream;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

import org.apache.axis2.databinding.types.xsd.QName;
import org.apache.axis2.databinding.utils.writer.MTOMAwareOMBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.pojos.verizon.BalanceType;
import com.budgetprepay.webservice.pojos.verizon.TrueFalseType;
import com.budgetprepay.webservice.util.VerizonUtil;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddBucket;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BalanceType_type7;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketAddRequest;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketID_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketInfoRequest;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketValue_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.EndDate_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type9;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfo;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SweepOn_type1;

public class CCTTestCase {

	private AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub;
	
	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearchSubscriberInfo() {
		try {
	   
	        
		}
		catch (Exception e) {

		}
	}

	@Test
    public void testSearchBucketInfo() {
    	try {
            SearchBucketInfo searchBucketInfo = new SearchBucketInfo();
	   		
	        BucketInfoRequest bucketInfoRequest = new BucketInfoRequest();
	       
	        bucketInfoRequest.setBalanceType(BalanceType_type7.primary);
	        Mdn_type9 mdn = new Mdn_type9();
	        mdn.setMdn_type8("7134443489");
	        bucketInfoRequest.setMdn(mdn);
	        bucketInfoRequest.setProviderId(7899);
	        bucketInfoRequest.setSweepOn(SweepOn_type1.value2);
	        bucketInfoRequest.setUserId("steve");
	        bucketInfoRequest.setProviderId(1234);
	        searchBucketInfo.setInputSearchBucketInfo(bucketInfoRequest);
			System.out.println(VerizonUtil.ADB2XML(searchBucketInfo, SearchBucketInfo.MY_QNAME));
	    }
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
	@Test
    public  void testAddBucket() {
    	try {
    		AddBucket addBucket = new AddBucket();
 	        
 	        BucketAddRequest addBucketRequest = new BucketAddRequest();
 	        
 	        Mdn_type1 mdn = new Mdn_type1();
 	        mdn.setMdn_type0("1234567890");
 	        addBucketRequest.setMdn(mdn);
 	        BucketID_type1 bucketId = new BucketID_type1();
 	        bucketId.setBucketID_type0("BGD");
 	        addBucketRequest.setBucketID(bucketId);
 	        BucketValue_type1 bucketValue = new BucketValue_type1();
 	        bucketValue.setBucketValue_type0("10");
 	        addBucketRequest.setBucketValue(bucketValue);
 	        EndDate_type1 endDate = new EndDate_type1();
 	        endDate.setEndDate_type0("12/31/2013");
 	        addBucketRequest.setEndDate(endDate);
 	        addBucketRequest.setUserId("r0hougr");
 	       
 	        addBucket.setAddBucketRequest(addBucketRequest);	
    		
 	        System.out.println(VerizonUtil.ADB2XML(addBucket, AddBucket.MY_QNAME));
 	     
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
	@Test
    public  void testDeleteBucket() {
    	try {
       
    	}
    	catch (Exception e) {

    	}
    }
    
	@Test
    public  void testUpdateBucket() {
    	try {
    		
    	}
    	catch (Exception e) {

    	}
	}
}

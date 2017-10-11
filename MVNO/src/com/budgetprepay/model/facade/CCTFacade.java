package com.budgetprepay.model.facade;

import org.apache.log4j.Logger;

import com.budgetprepay.model.entity.ErrorRequest;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.pojos.verizon.AccountBalanceType;
import com.budgetprepay.webservice.pojos.verizon.AccountType;
import com.budgetprepay.webservice.pojos.verizon.ActivatePINRequest;
import com.budgetprepay.webservice.pojos.verizon.ActivatePINResponse;
import com.budgetprepay.webservice.pojos.verizon.AddAutoReplenishRequest;
import com.budgetprepay.webservice.pojos.verizon.AddAutoReplenishResponse;
import com.budgetprepay.webservice.pojos.verizon.AddBucketRequest;
import com.budgetprepay.webservice.pojos.verizon.AddBucketResponse;
import com.budgetprepay.webservice.pojos.verizon.AutoReplenishType;
import com.budgetprepay.webservice.pojos.verizon.BalanceType;
import com.budgetprepay.webservice.pojos.verizon.BatchAttributesType;
import com.budgetprepay.webservice.pojos.verizon.BucketInfoType;
import com.budgetprepay.webservice.pojos.verizon.BucketType;
import com.budgetprepay.webservice.pojos.verizon.DeleteAllBucketsRequest;
import com.budgetprepay.webservice.pojos.verizon.DeleteAllBucketsResponse;
import com.budgetprepay.webservice.pojos.verizon.DeleteBucketRequest;
import com.budgetprepay.webservice.pojos.verizon.DeleteBucketResponse;
import com.budgetprepay.webservice.pojos.verizon.GetAutoReplenishRequest;
import com.budgetprepay.webservice.pojos.verizon.GetAutoReplenishResponse;
import com.budgetprepay.webservice.pojos.verizon.OutputCallListType;
import com.budgetprepay.webservice.pojos.verizon.PinDetailType;
import com.budgetprepay.webservice.pojos.verizon.RecordArrayType;
import com.budgetprepay.webservice.pojos.verizon.RevertCallsRequest;
import com.budgetprepay.webservice.pojos.verizon.RevertCallsResponse;
import com.budgetprepay.webservice.pojos.verizon.RoamingInfoType;
import com.budgetprepay.webservice.pojos.verizon.RssType;
import com.budgetprepay.webservice.pojos.verizon.SearchBucketRequest;
import com.budgetprepay.webservice.pojos.verizon.SearchBucketResponse;
import com.budgetprepay.webservice.pojos.verizon.SearchCDRDetailRequest;
import com.budgetprepay.webservice.pojos.verizon.SearchCDRDetailResponse;
import com.budgetprepay.webservice.pojos.verizon.SearchCDRRequest;
import com.budgetprepay.webservice.pojos.verizon.SearchCDRResponse;
import com.budgetprepay.webservice.pojos.verizon.SearchPINBatchRequest;
import com.budgetprepay.webservice.pojos.verizon.SearchPINBatchResponse;
import com.budgetprepay.webservice.pojos.verizon.SearchPINGroupRequest;
import com.budgetprepay.webservice.pojos.verizon.SearchPINGroupResponse;
import com.budgetprepay.webservice.pojos.verizon.SearchPINRequest;
import com.budgetprepay.webservice.pojos.verizon.SearchPINResponse;
import com.budgetprepay.webservice.pojos.verizon.SearchSubscriberInfoRequest;
import com.budgetprepay.webservice.pojos.verizon.SearchSubscriberInfoResponse;
import com.budgetprepay.webservice.pojos.verizon.SummaryArrayType;
import com.budgetprepay.webservice.pojos.verizon.TransactionContextType;
import com.budgetprepay.webservice.pojos.verizon.TrueFalseType;
import com.budgetprepay.webservice.pojos.verizon.UpdateAccountBalanceRequest;
import com.budgetprepay.webservice.pojos.verizon.UpdateAccountBalanceResponse;
import com.budgetprepay.webservice.pojos.verizon.UpdateAutoReplenishRequest;
import com.budgetprepay.webservice.pojos.verizon.UpdateAutoReplenishResponse;
import com.budgetprepay.webservice.pojos.verizon.UpdateBucketRequest;
import com.budgetprepay.webservice.pojos.verizon.UpdateBucketResponse;
import com.budgetprepay.webservice.pojos.verizon.UpdateCreditRequest;
import com.budgetprepay.webservice.pojos.verizon.UpdateCreditResponse;
import com.budgetprepay.webservice.pojos.verizon.UpdatePINBatchStatusRequest;
import com.budgetprepay.webservice.pojos.verizon.UpdatePINBatchStatusResponse;
import com.budgetprepay.webservice.pojos.verizon.UpdatePINGroupInfoRequest;
import com.budgetprepay.webservice.pojos.verizon.UpdatePINGroupInfoResponse;
import com.budgetprepay.webservice.pojos.verizon.UpdateSubscriberFieldRequest;
import com.budgetprepay.webservice.pojos.verizon.UpdateSubscriberFieldResponse;
import com.budgetprepay.webservice.pojos.verizon.VoidBatchRequest;
import com.budgetprepay.webservice.pojos.verizon.VoidBatchResponse;
import com.budgetprepay.webservice.pojos.verizon.VoidGroupRequest;
import com.budgetprepay.webservice.pojos.verizon.VoidGroupResponse;
import com.budgetprepay.webservice.pojos.verizon.VoidPINRangeRequest;
import com.budgetprepay.webservice.pojos.verizon.VoidPINRangeResponse;
import com.budgetprepay.webservice.pojos.verizon.VoidPINRequest;
import com.budgetprepay.webservice.pojos.verizon.VoidPINResponse;
import com.budgetprepay.webservice.util.CommonUtil;
import com.budgetprepay.webservice.util.VerizonUtil;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Account;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AccountBalance;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddAutoReplenish;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddAutoReplenishResponseE;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddBucket;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AdjustmentType_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AdjustmentValue_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AutoReplenish;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BalanceType_type3;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BalanceType_type5;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BalanceType_type7;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketAddResponse;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketDeleteResponse;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketFault;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketID_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketID_type3;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketInfoRequest;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketInfoResponse;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketUpdateRequest;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketValue_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.DeleteAllBuckets;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.DeleteAllBucketsE;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.DeleteBucket;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.FaultResponse;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Fieldname_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Fieldvalue_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.GetAutoReplenish;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.GetAutoReplenishResponseE;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type11;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type13;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type17;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type19;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type3;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type7;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Mdn_type9;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RSSRPCResponse;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCalls;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCallsInputCall;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCallsResponseE;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfo;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchBucketInfoResponse;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchSubscriberInfo;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SubInfoFault;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SubscriberInfoRequest;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SweepOn_type1;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.TranType_type3;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccBalRequest;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccountBalance;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAutoReplenish;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAutoReplenishResponseE;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateBucket;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateCredit;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberField;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberFieldResponseE;
import com.vzw.www.wcct._int.api.AddAutoReplenish_addAutoReplenishFaultMsg;
import com.vzw.www.wcct._int.api.AddBucket_faultaddBucketRequestMsg;
import com.vzw.www.wcct._int.api.DeleteBucket_deleteBucketFaultMsg;
import com.vzw.www.wcct._int.api.GetAutoReplenish_getAutoReplenishFaultMsg;
import com.vzw.www.wcct._int.api.RevertCalls_faultRevertCallsMsg;
import com.vzw.www.wcct._int.api.SearchBucketInfo_bucketInfoFaultMsg;
import com.vzw.www.wcct._int.api.SearchSubscriberInfo_faultSearchSubscriberInfoMsg;
import com.vzw.www.wcct._int.api.UpdateAccountBalance_faultUpdateAccountBalanceMsg;
import com.vzw.www.wcct._int.api.UpdateAutoReplenish_updateAutoReplenishFaultMsg;
import com.vzw.www.wcct._int.api.UpdateBucket_faultupdateBucketRequestMsg;
import com.vzw.www.wcct._int.api.UpdateCredit_faultUpdateCreditMsg;
import com.vzw.www.wcct._int.api.UpdateSubscriberField_faultUpdateSubscriberFieldMsg;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.MARSDetailResponse;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.MARSGenDetRequest;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.MARSGenSumRequest;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.MARSSummaryResponse;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDR;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDRDetail;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.UsageFilter_type1;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.UserID_type1;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.UserID_type3;
import com.vzw.www.wcct._int.api.cdr.SearchCDRDetail_SearchCDRDetFaultMsg;
import com.vzw.www.wcct._int.api.cdr.SearchCDR_SearchCDRFaultMsg;
import com.vzw.www.wcct._int.api.west.SearchPINBatch_searchPINBatchFault1Msg;
import com.vzw.www.wcct._int.api.west.SearchPINGroup_searchPINGroupFaultMsg;
import com.vzw.www.wcct._int.api.west.SearchPIN_searchPINFaultfMsg;
import com.vzw.www.wcct._int.api.west.VoidBatch_voidBatchMsg;
import com.vzw.www.wcct._int.api.west.VoidGroup_voidGroupFaultMsg;
import com.vzw.www.wcct._int.api.west.VoidPINRange_voidPINRangeFaultMsg;
import com.vzw.www.wcct._int.api.west.VoidPIN_voidPINFaultMsg;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.PINBO;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPIN;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINBatch;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINGroup;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINResponseE;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidBatch;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidBatchResponseE;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidGroup;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidGroupResponseE;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPIN;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRange;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRangeResponseE;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINResponseE;
import com.vzw.www.wwct._int.api.west.ActivatePIN_activatePINFaultMsg;
import com.vzw.www.wwct._int.api.west.UpdatePINBatchStatus_updateBatchStatusFaultUmMsg;
import com.vzw.www.wwct._int.api.west.UpdatePINGroupInfo_modifyGroupInfoFaultMsg;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ActivatePIN;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ActivatePINResponseE;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdateBatchStatusRequest;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdateBatchStatusResponse;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdateGroupInfoRequest;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINBatchStatus;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINGroupInfo;

public class CCTFacade {

	private static Logger logger = Logger.getLogger(CCTFacade.class);
	
	private static String username;
	private static String password;
	private static String userid;
	private static String providerid;
	private static String rsid;
	private static String accountEndpoint;
	private static String usageEndpoint;
	private static String pinSearchEndpoint;
	private static String pinUpdateEndpoint;
	private static String pinVoidEndpoint;
	
	static {
		try {				
			username = ResourceUtil.get("verizon.api.cct.username");
			if (username == null)
				throw new Exception("CCT username is null");
			password = ResourceUtil.get("verizon.api.cct.password");
			if (password == null)
				throw new Exception("CCT password is null");
			userid = ResourceUtil.get("verizon.api.cct.userid");
			providerid = ResourceUtil.get("verizon.api.cct.providerid");
			rsid = ResourceUtil.get("verizon.api.cct.rsid");
			accountEndpoint = ResourceUtil.get("verizon.api.cct.account.endpoint");
			if (accountEndpoint == null)
				throw new Exception("CCT Account Gateway URL is null");
			usageEndpoint = ResourceUtil.get("verizon.api.cct.usage.endpoint");
			pinSearchEndpoint = ResourceUtil.get("verizon.api.cct.pin.search.endpoint");
			pinUpdateEndpoint = ResourceUtil.get("verizon.api.cct.pin.update.endpoint");
			pinVoidEndpoint = ResourceUtil.get("verizon.api.cct.pin.void.endpoint");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SearchBucketResponse searchBucketRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		SearchBucketResponse response = new SearchBucketResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
    	    SearchBucketRequest req = (SearchBucketRequest) VerizonUtil.XML2JAXB(SearchBucketRequest.class, request.getClientRequestXML());
			
	        SearchBucketInfo searchBucketInfo = new SearchBucketInfo();
	   		
	        BucketInfoRequest bucketInfoRequest = new BucketInfoRequest();
	       
	        if (req.getBalanceType() == null)
	        	bucketInfoRequest.setBalanceType(BalanceType_type7.primary);
	        else {
	            if (req.getBalanceType().equals(BalanceType.PRIMARY))
	                bucketInfoRequest.setBalanceType(BalanceType_type7.primary);
	            else
	        	    bucketInfoRequest.setBalanceType(BalanceType_type7.secondary);
	        }
	        Mdn_type9 mdn = new Mdn_type9();
	        if (req.getMdn() == null || req.getMdn().length() != 10)
	        	throw new Exception("Invalid MDN");
	        mdn.setMdn_type8(req.getMdn());
	        bucketInfoRequest.setMdn(mdn);
	        request.setMdn(req.getMdn());
	        bucketInfoRequest.setProviderId(Integer.valueOf(request.getUser().getGroup().getAccountNumber()));
	        if (req.getSweepOn() == null)
	        	bucketInfoRequest.setSweepOn(SweepOn_type1.value1);
	        else {
	            if (req.getSweepOn().equals(TrueFalseType.TRUE))
	                bucketInfoRequest.setSweepOn(SweepOn_type1.value1);
	            else
	                bucketInfoRequest.setSweepOn(SweepOn_type1.value2);
	        }
	        bucketInfoRequest.setUserId(userid);
	        bucketInfoRequest.setProviderId(Integer.valueOf(providerid));
	        
	        searchBucketInfo.setInputSearchBucketInfo(bucketInfoRequest);
	   			  
	        String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(searchBucketInfo, SearchBucketInfo.MY_QNAME);
	        if (verizonSynchronousRequestXML == null)
	        	verizonSynchronousRequestXML = "Unable to log";
	        request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
	        
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    // TODO add to group table
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			SearchBucketInfoResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.searchBucketInfo(searchBucketInfo);
			}
			catch (SearchBucketInfo_bucketInfoFaultMsg se) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				BucketFault fault = se.getFaultMessage().getSearchBucketInfo_bucketInfoFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMsg() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMsg());
				else if (fault.getErrorMessage() != null)
					response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: Verizon Request - " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			BucketInfoResponse bucketInfoResponse = null;
			if (verizonResponse == null || verizonResponse.getOutputSearchBucketInfo()== null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				bucketInfoResponse = verizonResponse.getOutputSearchBucketInfo();
		        request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, SearchBucketInfoResponse.MY_QNAME));		        
	   		    response.setAdditionalRecords(bucketInfoResponse.getAdditionalRecords());
	   		    if (bucketInfoResponse.isBucketInfoSpecified()) {
		   		    BucketInfoType bucketInfoType = new BucketInfoType();
		   		    if (bucketInfoResponse.getBucketInfo().isSweepOnSpecified()) {
		   		    	if (bucketInfoResponse.getBucketInfo().getSweepOn().equals("true"))
		   		    	    bucketInfoType.setSweepOn(TrueFalseType.TRUE);
		   		    	else
		   		    	    bucketInfoType.setSweepOn(TrueFalseType.FALSE);
		   		    }
		   		    if (verizonResponse.getOutputSearchBucketInfo().getBucketInfo().getBuckets() != null) {
		   		    	for (int i=0; i<verizonResponse.getOutputSearchBucketInfo().getBucketInfo().getBuckets().length; i++) {
		   		    		BucketType bucket = new BucketType();
		   		    		bucket.setBalanceValue(bucketInfoResponse.getBucketInfo().getBuckets()[i].getBalanceValue());
		   		    		bucket.setBucketTypeID(bucketInfoResponse.getBucketInfo().getBuckets()[i].getBucketTypeID());
		   		    		bucket.setBucketValue(bucketInfoResponse.getBucketInfo().getBuckets()[i].getBucketValue());
		   		    		bucket.setCanDelete(bucketInfoResponse.getBucketInfo().getBuckets()[i].getCanDelete().getValue());
		   		    		bucket.setCanUpdate(bucketInfoResponse.getBucketInfo().getBuckets()[i].getCanUpdate().getValue());
		   		    		bucket.setExpTime(bucketInfoResponse.getBucketInfo().getBuckets()[i].getExpTime());
		   		    		bucket.setReTime(bucketInfoResponse.getBucketInfo().getBuckets()[i].getReTime());
		   		    		bucket.setSourceId(bucketInfoResponse.getBucketInfo().getBuckets()[i].getSourceId());
		   		    		bucket.setSourceValue(bucketInfoResponse.getBucketInfo().getBuckets()[i].getSourceValue());
		   		    		bucket.setUom(bucketInfoResponse.getBucketInfo().getBuckets()[i].getUom());
		   		    		bucketInfoType.getBucket().add(bucket);
		   		    	}
		   		    	response.setBucketInfo(bucketInfoType);
		   		    }
	   		    }
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(verizonResponse.getOutputSearchBucketInfo().getTransactionContext().getMdn().getMdn_type4());
	   		    transactionContextType.setStatus(verizonResponse.getOutputSearchBucketInfo().getTransactionContext().getStatus());
	   		    transactionContextType.setTransactionId(verizonResponse.getOutputSearchBucketInfo().getTransactionContext().getTransactionId().getTransactionId_type0());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
	   		    response.setMdn(req.getMdn());
	   		    response.setNumberRecords(verizonResponse.getOutputSearchBucketInfo().getNumberRecords());
	   		    if (verizonResponse.getOutputSearchBucketInfo().getBucketInfo() != null)
	   		        response.setNumBuckets(verizonResponse.getOutputSearchBucketInfo().getBucketInfo().getNumBuckets());
	   		    if (verizonResponse.getOutputSearchBucketInfo().getPrimaryBalance() != null)
	   		        response.setPrimaryBalance(verizonResponse.getOutputSearchBucketInfo().getPrimaryBalance());
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + e.getMessage() + " - "+ CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static AddBucketResponse addBucketRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		AddBucketResponse response = new AddBucketResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
    	    AddBucketRequest req = (AddBucketRequest) VerizonUtil.XML2JAXB(AddBucketRequest.class, request.getClientRequestXML());

	        AddBucket addBucket = new AddBucket();
	        
	        AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketAddRequest addBucketRequest = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketAddRequest();	

	        Mdn_type1 mdn = new Mdn_type1();
	        if (req.getMdn() == null)
	        	throw new Exception("Null MDN");
	        mdn.setMdn_type0(req.getMdn());
	        addBucketRequest.setMdn(mdn);
	        request.setMdn(req.getMdn());
	        BucketID_type1 bucketId = new BucketID_type1();
	        if (req.getBucketId() == null)
	        	throw new Exception("Null Bucket ID");
	        bucketId.setBucketID_type0(req.getBucketId());
	        addBucketRequest.setBucketID(bucketId);
	        BucketValue_type1 bucketValue = new BucketValue_type1();
	        if (req.getBucketValue() == null)
	        	throw new Exception("Null Bucket value");
	        bucketValue.setBucketValue_type0(req.getBucketValue());
	        addBucketRequest.setBucketValue(bucketValue);
	        if (req.getEndDate() == null)
	        	throw new Exception("Null End date");
	        addBucketRequest.setEndDate(VerizonUtil.getEndDate(req.getEndDate()));
	        addBucketRequest.setUserId(userid);
	        
	        addBucket.setAddBucketRequest(addBucketRequest);	
	   			          	        	        
	        String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(addBucket, AddBucket.MY_QNAME);
	        if (verizonSynchronousRequestXML == null)
	        	verizonSynchronousRequestXML = "Unable to log";
	        request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
	        
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddBucketResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.addBucket(addBucket);
			}
			catch (AddBucket_faultaddBucketRequestMsg ae) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				BucketFault fault = ae.getFaultMessage().getAddBucket_faultaddBucketRequest();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMsg() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMsg());
				else if (fault.getErrorMessage() != null)
					response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: Verizon Request - " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			BucketAddResponse bucketAddResponse = null;
			if (verizonResponse == null || verizonResponse.getAddBucketResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				bucketAddResponse = verizonResponse.getAddBucketResponse();
		        request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddBucketResponse.MY_QNAME));
		        response.getTransactionContext().setMdn(bucketAddResponse.getTransactionContext().getMdn().getMdn_type4());
		        response.getTransactionContext().setStatus(bucketAddResponse.getTransactionContext().getStatus());
		        response.getTransactionContext().setTransactionId(bucketAddResponse.getTransactionContext().getTransactionId().getTransactionId_type0());
		        response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + e.getMessage() + " - " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static DeleteBucketResponse deleteBucketRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		DeleteBucketResponse response = new DeleteBucketResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
    	    DeleteBucketRequest req = (DeleteBucketRequest) VerizonUtil.XML2JAXB(DeleteBucketRequest.class, request.getClientRequestXML());
			
	        DeleteBucket deleteBucket = new DeleteBucket();
	        
	        AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketDeleteRequest deleteBucketRequest = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketDeleteRequest();	

	        Mdn_type17 mdn = new Mdn_type17();
	        if (req.getMdn() == null)
	        	throw new Exception("Null MDN");
	        mdn.setMdn_type16(req.getMdn());
	        request.setMdn(req.getMdn());
	        deleteBucketRequest.setMdn(mdn);
	        if (req.getBucketId() == null)
	        	throw new Exception("Null Bucket ID");
	        deleteBucketRequest.setBucketID(req.getBucketId());
	        deleteBucketRequest.setUserId(userid);
	       
	        deleteBucket.setDeleteBucketRequest(deleteBucketRequest);	
	   			     
	        String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(deleteBucket, DeleteBucket.MY_QNAME);
	        if (verizonSynchronousRequestXML == null)
	        	verizonSynchronousRequestXML = "Unable to log";
	        request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
	        
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		   
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.DeleteBucketResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.deleteBucket(deleteBucket);
			}
			catch (DeleteBucket_deleteBucketFaultMsg de) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				BucketFault fault = de.getFaultMessage().getSearchBucketInfo_bucketInfoFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMsg() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMsg());
				else if (fault.getErrorMessage() != null)
					response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: Verizon Request - " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			BucketDeleteResponse bucketDeleteResponse = null;
			if (verizonResponse == null || verizonResponse.getDeleteBucketResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				bucketDeleteResponse = verizonResponse.getDeleteBucketResponse();
		        request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.DeleteBucketResponse.MY_QNAME));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(bucketDeleteResponse.getTransactionContext().getMdn().getMdn_type4());
	   		    transactionContextType.setStatus(bucketDeleteResponse.getTransactionContext().getStatus());
	   		    transactionContextType.setTransactionId(bucketDeleteResponse.getTransactionContext().getTransactionId().getTransactionId_type0());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + e.getMessage() + " - " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static UpdateBucketResponse updateBucketRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		UpdateBucketResponse response = new UpdateBucketResponse();
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		response.setTransactionContext(new TransactionContextType());
		try {
    	    UpdateBucketRequest req = (UpdateBucketRequest) VerizonUtil.XML2JAXB(UpdateBucketRequest.class, request.getClientRequestXML());

	        UpdateBucket updateBucket = new UpdateBucket();
	        
	        BucketUpdateRequest updateBucketRequest = new BucketUpdateRequest();	

	        Mdn_type13 mdn = new Mdn_type13();
	        if (req.getMdn() == null)
	        	throw new Exception("Null MDN");
	        mdn.setMdn_type12(req.getMdn());
	        updateBucketRequest.setMdn(mdn);
	        request.setMdn(req.getMdn());
	        BucketID_type3 bucketId = new BucketID_type3();
	        if (req.getBucketId() == null)
	        	throw new Exception("null Bucket ID");
	        bucketId.setBucketID_type2(req.getBucketId());
	        updateBucketRequest.setBucketID(bucketId);
	        if (req.getAdjustmentType() == null)
	        	throw new Exception("Null Adjustment type");
	        if (req.getAdjustmentType().name().equals(AdjustmentType_type1.INCR.getValue()))
	            updateBucketRequest.setAdjustmentType(AdjustmentType_type1.INCR);
	        if (req.getAdjustmentType().name().equals(AdjustmentType_type1.DECR.getValue()))
	            updateBucketRequest.setAdjustmentType(AdjustmentType_type1.DECR);
	        if (req.getAdjustmentType().name().equals(AdjustmentType_type1.SETEXPIRATION.getValue()))
	            updateBucketRequest.setAdjustmentType(AdjustmentType_type1.SETEXPIRATION);
	        AdjustmentValue_type1 adjustmentValue = new AdjustmentValue_type1();
	        if (req.getAdjustmentValue() == null)
	        	throw new Exception("Null Adjustment value");
	        adjustmentValue.setAdjustmentValue_type0(req.getAdjustmentValue());
	        updateBucketRequest.setAdjustmentValue(adjustmentValue);
	        updateBucketRequest.setUserId(userid);
	       
	        updateBucket.setUpdateBucketRequest(updateBucketRequest);	
	   			        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(updateBucket, UpdateBucket.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
   
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateBucketResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.updateBucket(updateBucket);
			}
			catch (UpdateBucket_faultupdateBucketRequestMsg ue) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML())); 
				BucketFault fault = ue.getFaultMessage().getUpdateBucket_faultupdateBucketRequest();
				if (fault != null) {
					if (fault.getErrorCode() != null)
				        response.getReturnMessage().setReturnCode(fault.getErrorCode());
					if (fault.getErrorMsg() != null)
				        response.getReturnMessage().setReturnText(fault.getErrorMsg());
					if (fault.getTransactionID() != null)
				        response.getTransactionContext().setTransactionId(fault.getTransactionID());
					else response.getTransactionContext().setTransactionId(request.getClientReference());
				}
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: Verizon Request - " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketUpdateResponse bucketUpdateResponse = null;
			if (verizonResponse == null || verizonResponse.getUpdateBucketResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				bucketUpdateResponse = verizonResponse.getUpdateBucketResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateBucketResponse.MY_QNAME));			    
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(bucketUpdateResponse.getTransactionContext().getMdn().getMdn_type4());
	   		    transactionContextType.setStatus(bucketUpdateResponse.getTransactionContext().getStatus());
	   		    transactionContextType.setTransactionId(bucketUpdateResponse.getTransactionContext().getTransactionId().getTransactionId_type0());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + e.getMessage() + " - " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static AddAutoReplenishResponse addAutoReplenishRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		AddAutoReplenishResponse response = new AddAutoReplenishResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			AddAutoReplenishRequest req = (AddAutoReplenishRequest) VerizonUtil.XML2JAXB(AddAutoReplenishRequest.class, request.getClientRequestXML());

	        AddAutoReplenish addAutoReplenish = new AddAutoReplenish();
	        
	        AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddAutoReplenishRequest addAutoReplenishRequest = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddAutoReplenishRequest();	

	        if (req.getMdn() == null)
	        	throw new Exception("Null MDN");
	        addAutoReplenishRequest.setMdn(req.getMdn());
	        request.setMdn(req.getMdn());
	        addAutoReplenishRequest.setUserId(userid);
	        if (req.getActive().equals(TrueFalseType.TRUE))
	        	addAutoReplenishRequest.setActive("ON");
	        else
	        	addAutoReplenishRequest.setActive("OFF");
	        addAutoReplenishRequest.setStartDate(req.getStartDate());
	        addAutoReplenishRequest.setEndDate(req.getEndDate());
	        addAutoReplenishRequest.setAmount(req.getAmount());
	        addAutoReplenishRequest.setFrequencyType(req.getFrequencyType());
	        addAutoReplenishRequest.setFrequencyValue(req.getFrequencyValue());
	        	       
	        addAutoReplenish.setAddAutoReplenishRequest(addAutoReplenishRequest);
	   			          
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(addAutoReplenishRequest, AddAutoReplenish.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			AddAutoReplenishResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.addAutoReplenish(addAutoReplenish);
			}
			catch (AddAutoReplenish_addAutoReplenishFaultMsg ae) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				FaultResponse fault = ae.getFaultMessage().getUpdateSubscriberInfo_faultUpdateSubscriberInfo();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());				
				if (fault.getErrorMessage() != null)
					response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.AddAutoReplenishResponse addAutoReplenishResponse = null;
			if (verizonResponse == null || verizonResponse.getAddAutoReplenishResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				addAutoReplenishResponse = verizonResponse.getAddAutoReplenishResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, AddAutoReplenishResponseE.MY_QNAME));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(addAutoReplenishResponse.getTransactionContext().getMdn().getMdn_type4());
	   		    transactionContextType.setStatus(addAutoReplenishResponse.getTransactionContext().getStatus());
	   		    transactionContextType.setTransactionId(addAutoReplenishResponse.getTransactionContext().getTransactionId().getTransactionId_type0());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static UpdateAutoReplenishResponse updateAutoReplenishRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		UpdateAutoReplenishResponse response = new UpdateAutoReplenishResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			UpdateAutoReplenishRequest req = (UpdateAutoReplenishRequest) VerizonUtil.XML2JAXB(UpdateAutoReplenishRequest.class, request.getClientRequestXML());
			
	        UpdateAutoReplenish updateAutoReplenish = new UpdateAutoReplenish();
	        
	        AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAutoReplenishRequest updateAutoReplenishRequest = new com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAutoReplenishRequest();	

	        updateAutoReplenishRequest.setMdn(req.getMdn());
	        request.setMdn(req.getMdn());
	        updateAutoReplenishRequest.setUserId(userid);
	        if (req.getActive().equals(TrueFalseType.TRUE))
	        	updateAutoReplenishRequest.setActive("ON");
	        else
	        	updateAutoReplenishRequest.setActive("OFF");
	        updateAutoReplenishRequest.setStartDate(req.getStartDate());
	        updateAutoReplenishRequest.setEndDate(req.getEndDate());
	        updateAutoReplenishRequest.setAmount(req.getAmount());
	        updateAutoReplenishRequest.setFrequencyType(req.getFrequencyType());
	        updateAutoReplenishRequest.setFrequencyValue(req.getFrequencyValue());
	        	       
	        updateAutoReplenish.setUpdateAutoReplenishRequest(updateAutoReplenishRequest);
	   			          
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(updateAutoReplenishRequest, UpdateAutoReplenish.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			UpdateAutoReplenishResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.updateAutoReplenish(updateAutoReplenish);
			}
			catch (UpdateAutoReplenish_updateAutoReplenishFaultMsg ae) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				FaultResponse fault = ae.getFaultMessage().getUpdateSubscriberInfo_faultUpdateSubscriberInfo();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMessage() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAutoReplenishResponse updateAutoReplenishResponse = null;
			if (verizonResponse == null || verizonResponse.getUpdateAutoReplenishResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				updateAutoReplenishResponse = verizonResponse.getUpdateAutoReplenishResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, UpdateAutoReplenishResponseE.MY_QNAME));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(updateAutoReplenishResponse.getTransactionContext().getMdn().getMdn_type4());
	   		    transactionContextType.setStatus(updateAutoReplenishResponse.getTransactionContext().getStatus());
	   		    transactionContextType.setTransactionId(updateAutoReplenishResponse.getTransactionContext().getTransactionId().getTransactionId_type0());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static GetAutoReplenishResponse getAutoReplenishRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		GetAutoReplenishResponse response = new GetAutoReplenishResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			GetAutoReplenishRequest req = (GetAutoReplenishRequest) VerizonUtil.XML2JAXB(GetAutoReplenishRequest.class, request.getClientRequestXML());

	        GetAutoReplenish getAutoReplenish = new GetAutoReplenish();
	        
	        AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.GetAutoReplenishRequest getAutoReplenishRequest = new com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.GetAutoReplenishRequest();	

	        getAutoReplenishRequest.setMdn(req.getMdn());
	        request.setMdn(req.getMdn());
	        getAutoReplenishRequest.setUserId(userid);
	        	       
	        getAutoReplenish.setGetAutoReplenishRequest(getAutoReplenishRequest);
	   			          
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(getAutoReplenishRequest, GetAutoReplenish.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			GetAutoReplenishResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.getAutoReplenish(getAutoReplenish);
			}
			catch (GetAutoReplenish_getAutoReplenishFaultMsg ae) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				FaultResponse fault = ae.getFaultMessage().getUpdateSubscriberInfo_faultUpdateSubscriberInfo();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMessage() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.GetAutoReplenishResponse getAutoReplenishResponse = null;
			if (verizonResponse == null || verizonResponse.getGetAutoReplenishResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				getAutoReplenishResponse = verizonResponse.getGetAutoReplenishResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, GetAutoReplenishResponseE.MY_QNAME));

	   		    if (getAutoReplenishResponse.isAutoReplenishmentsSpecified()) {
	   		    	for (int i =0; i < getAutoReplenishResponse.getAutoReplenishments().getAutoReplenishment().length; i++) {
	   		    		AutoReplenish ar = getAutoReplenishResponse.getAutoReplenishments().getAutoReplenishment()[i];
	   		    		AutoReplenishType art = new AutoReplenishType();
	   		    		if (ar.getActive().equals("ON"))
	   		    		    art.setActive(TrueFalseType.TRUE);
	   		    		else
	   		    			art.setActive(TrueFalseType.FALSE);
	   		    		art.setAmount(ar.getAmount());
	   		    		art.setStartDate(ar.getStartDate());
	   		    		art.setEndDate(ar.getEndDate());
	   		    		art.setFrequencyType(ar.getFrequencyType());
	   		    		art.setFrequencyValue(ar.getFrequencyValue());
	   		    		response.getAutoReplenish().add(art);
	   		    	}
	   		    }
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(getAutoReplenishResponse.getTransactionContext().getMdn().getMdn_type4());
	   		    transactionContextType.setStatus(getAutoReplenishResponse.getTransactionContext().getStatus());
	   		    transactionContextType.setTransactionId(getAutoReplenishResponse.getTransactionContext().getTransactionId().getTransactionId_type0());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	@SuppressWarnings("unused")
	public static SearchSubscriberInfoResponse searchSubscriberInfo(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		SearchSubscriberInfoResponse response = new SearchSubscriberInfoResponse();
		response.setAccount(new AccountType());
		response.setBalance(new AccountBalanceType());
		response.setRss(new RssType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			SearchSubscriberInfoRequest req = (SearchSubscriberInfoRequest) VerizonUtil.XML2JAXB(SearchSubscriberInfoRequest.class, request.getClientRequestXML());

	        SearchSubscriberInfo searchSubscriberInfo = new SearchSubscriberInfo();
	   		
	        SubscriberInfoRequest searchSubscriberInfoRequest = new SubscriberInfoRequest();
	        
	        if (req.getBalanceType() != null) {
	        	switch (req.getBalanceType().name().toUpperCase()) {
	        	case "PRIMARY":
	        		searchSubscriberInfoRequest.setBalanceType(BalanceType_type3.primary);
	        		break;
	        	case "SECONDARY":
	        		searchSubscriberInfoRequest.setBalanceType(BalanceType_type3.secondary);
	        		break;	
	        	case "BOTH":
	        		searchSubscriberInfoRequest.setBalanceType(BalanceType_type3.both);
	        		break;
	        	default:
	        		searchSubscriberInfoRequest.setBalanceType(BalanceType_type3.primary);
	        	}
	        }
	        Mdn_type3 mdn =  new Mdn_type3();
	        mdn.setMdn_type2(req.getMdn());
	        searchSubscriberInfoRequest.setMdn(mdn);
	        request.setMdn(req.getMdn());
	        
	        searchSubscriberInfoRequest.setUserId(userid);
	        	       
	        searchSubscriberInfo.setInputSearchSubscriberInfo(searchSubscriberInfoRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(searchSubscriberInfo, SearchSubscriberInfo.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchSubscriberInfoResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.searchSubscriberInfo(searchSubscriberInfo);
			}
			catch (SearchSubscriberInfo_faultSearchSubscriberInfoMsg se) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				SubInfoFault fault = se.getFaultMessage().getSearchSubscriberInfo_faultSearchSubscriberInfo();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMsg() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMsg());
				if (fault.getErrorMessage() != null)
					response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SubscriberInfoResponse subscriberInfoResponse = null;
			if (verizonResponse == null || verizonResponse.getOutputSearchSubscriberInfo() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				subscriberInfoResponse = verizonResponse.getOutputSearchSubscriberInfo();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.SearchSubscriberInfoResponse.MY_QNAME));
	   		    Account account = subscriberInfoResponse.getAccount();
	   		    response.getAccount().setAccountStatus(account.getAccountStatus());
	   		    response.getAccount().setCos(account.getCos());
	   		    response.getAccount().setExpiration(account.getExpiration());
	   		    response.getAccount().setHasBuckets(account.getHasBuckets());
	   		    response.getAccount().setLangPref(account.getLangPref());
	   		    response.getAccount().setMdn(account.getMdn());
	   		    response.getAccount().setPinCode(account.getPinCode());
	   		    response.getAccount().setPreCallAnnouncement(account.getPreCallAnnouncement());
	   		    response.getAccount().setSmsNotifications(account.getSmsNotification());
	   		    response.getAccount().setSweepOn(account.getSweepOn());
	   		    AccountBalance balance = subscriberInfoResponse.getAccountBalance();
	   		    response.getBalance().setAmount(balance.getAmount());
	   		    response.getBalance().setBalanceType(balance.getBalanceType().getValue());
	   		    response.getBalance().setCurrency(balance.getCurrency().getValue());
	   		    response.getBalance().setMdn(balance.getMdn());
	   		    response.getBalance().setProviderId(balance.getProviderID());
	   		    RSSRPCResponse rss = subscriberInfoResponse.getRss();
	   		    response.getRss().setAccountId(String.valueOf(rss.getAccountID()));
	   		    response.getRss().setActivationDate(rss.getActivationDate().toString());
	   		    response.getRss().setBusinessName(rss.getBusinessName());
	   		    response.getRss().setCompany(rss.getCompanyCD());
	   		    response.getRss().setCustomerType(rss.getCustomerType());
	   		    response.getRss().setEsn(rss.getEsn());
	   		    response.getRss().setLineESNId(rss.getLineESNId());
	   		    response.getRss().setLineId(rss.getLineId());
	   		    response.getRss().setMdn(rss.getMdn());
	   		    response.getRss().setMin(rss.getMin());
	   		    response.getRss().setName(rss.getName());
	   		    response.getRss().setPassCode(rss.getPassCode());
	   		    response.getRss().setStatus(rss.getStatusCD());
	   		    response.getRss().setSvcPlan(rss.getSvcPlanCD());
	   		    response.setTransactionId(subscriberInfoResponse.getTransactionID().getTransactionID_type0());
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT); 
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static UpdateSubscriberFieldResponse updateSubscriberFieldRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		UpdateSubscriberFieldResponse response = new UpdateSubscriberFieldResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			UpdateSubscriberFieldRequest req = (UpdateSubscriberFieldRequest) VerizonUtil.XML2JAXB(UpdateSubscriberFieldRequest.class, request.getClientRequestXML());
			
	        UpdateSubscriberField updateSubscriberField = new UpdateSubscriberField();
	        
	        AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberFieldRequest updateSubscriberFieldRequest = new com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberFieldRequest();	

	        Mdn_type11 mdn = new Mdn_type11();
	        mdn.setMdn_type10(req.getMdn());
	        updateSubscriberFieldRequest.setMdn(mdn);
	        request.setMdn(req.getMdn());
	        com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UserId_type3 user = new  com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UserId_type3();
	        user.setUserId_type2(userid);
	        updateSubscriberFieldRequest.setUserId(user);
	        switch (req.getField().getName()) {
	        case "LANGUAGE":
	        	if (req.getField().getValue().endsWith("ENGLISH") || req.getField().getValue().equals("SPANISH")) {
	    	        updateSubscriberFieldRequest.setFieldname(Fieldname_type1.LANGUAGE);
	    	        Fieldvalue_type1 value = new Fieldvalue_type1();
	    	        value.setFieldvalue_type0(req.getField().getValue());
	    	        updateSubscriberFieldRequest.setFieldvalue(value);
	        	}
	        	else
	        		throw new Exception("Feild name must be ENGLISH or SPANISH");
	        	break;
	        case "PASSCODE":
	        	try {
	        		Integer.valueOf(req.getField().getValue());
	        	}
	        	catch (NumberFormatException e) {
	        		throw new Exception("Field value must be an integer");
	        	}
	        	if (req.getField().getValue().length() == 4) {
	    	        updateSubscriberFieldRequest.setFieldname(Fieldname_type1.PASSCODE);
	    	        Fieldvalue_type1 value = new Fieldvalue_type1();
	    	        value.setFieldvalue_type0(req.getField().getValue());
	    	        updateSubscriberFieldRequest.setFieldvalue(value);
	        	}
	        	else
	        		throw new Exception("Field value must be four digits in length");
	        	break;
	        case "PRECALL":
	        	if (req.getField().getValue().endsWith("ON") || req.getField().getValue().equals("OFF")) {
	    	        updateSubscriberFieldRequest.setFieldname(Fieldname_type1.PRECALL);
	    	        Fieldvalue_type1 value = new Fieldvalue_type1();
	    	        value.setFieldvalue_type0(req.getField().getValue());
	    	        updateSubscriberFieldRequest.setFieldvalue(value);
	        	}
	        	else
	        		throw new Exception("Feild value must be ON or OFF");
	        	break;
	        case "SMSNOTIFY":
	        	if (req.getField().getValue().endsWith("YES") || req.getField().getValue().equals("NO")) {
	    	        updateSubscriberFieldRequest.setFieldname(Fieldname_type1.SMSNOTIFY);
	    	        Fieldvalue_type1 value = new Fieldvalue_type1();
	    	        value.setFieldvalue_type0(req.getField().getValue());
	    	        updateSubscriberFieldRequest.setFieldvalue(value);
	        	}
	        	else
	        		throw new Exception("Feild value must be YES or NO");
	        	break;
	        default:
	        	throw new Exception("Feild name must be LANGUAGE, PASSCODE, PRECALL, or SMSNOTIFY");
	        }
	        	       
	        updateSubscriberField.setUpdateSubscriberField(updateSubscriberFieldRequest);
	   			         
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(updateSubscriberField, UpdateSubscriberField.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			UpdateSubscriberFieldResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.updateSubscriberField(updateSubscriberField);
			}
			catch (UpdateSubscriberField_faultUpdateSubscriberFieldMsg ae) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				FaultResponse fault = ae.getFaultMessage().getUpdateSubscriberField_faultUpdateSubscriberField();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMessage() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateSubscriberFieldResponse updateSubscriberFieldResponse = null;
			if (verizonResponse == null || verizonResponse.getStatus() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				updateSubscriberFieldResponse = verizonResponse.getStatus();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, UpdateSubscriberFieldResponseE.MY_QNAME));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(updateSubscriberFieldResponse.getMdn());
	   		    transactionContextType.setStatus(updateSubscriberFieldResponse.getStatus());
	   		    transactionContextType.setTransactionId(updateSubscriberFieldResponse.getTransactionId());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static DeleteAllBucketsResponse deleteAllBucketsRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		DeleteAllBucketsResponse response = new DeleteAllBucketsResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			DeleteAllBucketsRequest req = (DeleteAllBucketsRequest) VerizonUtil.XML2JAXB(DeleteAllBucketsRequest.class, request.getClientRequestXML());
			
	        DeleteAllBucketsE deleteAllBucketsE = new DeleteAllBucketsE();
	        
	        DeleteAllBuckets deleteAllBuckets = new DeleteAllBuckets();
	        
	        Mdn_type19 mdn = new Mdn_type19();
	        mdn.setMdn_type18(req.getMdn());
	        deleteAllBuckets.setMdn(mdn);
	        request.setMdn(req.getMdn());
	        deleteAllBuckets.setUserId(userid);
	       
	        deleteAllBucketsE.setDeleteAllBucketsRequest(deleteAllBuckets);
	        	   			         	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(deleteAllBucketsE, DeleteAllBucketsE.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
		    
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.DeleteAllBucketsResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.deleteAllBuckets(deleteAllBucketsE);
			}
			catch (com.vzw.www.wcct._int.api.DeleteAllBuckets_deleteBucketFaultMsg de) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				BucketFault fault = de.getFaultMessage().getSearchBucketInfo_bucketInfoFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMessage() != null)
					response.getReturnMessage().setReturnText(fault.getErrorMessage());
				if (fault.getErrorMsg() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMsg());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.BucketDeleteResponse bucketDeleteResponse = null;
			if (verizonResponse == null || verizonResponse.getDeleteBucketResponse() == null)
				throw new Exception("DeleteAllBuckets response is empty");
			else {
				bucketDeleteResponse = verizonResponse.getDeleteBucketResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.DeleteBucketResponse.MY_QNAME));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(bucketDeleteResponse.getTransactionContext().getMdn().getMdn_type4());
	   		    transactionContextType.setStatus(bucketDeleteResponse.getTransactionContext().getStatus());
	   		    transactionContextType.setTransactionId(bucketDeleteResponse.getTransactionContext().getTransactionId().getTransactionId_type0());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static UpdateAccountBalanceResponse updateAccountBalanceRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		UpdateAccountBalanceResponse response = new UpdateAccountBalanceResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setBalance(new AccountBalanceType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			UpdateAccountBalanceRequest req = (UpdateAccountBalanceRequest) VerizonUtil.XML2JAXB(UpdateAccountBalanceRequest.class, request.getClientRequestXML());
			
    	    UpdateAccountBalance updateAccountBalance = new UpdateAccountBalance();
	   		
    	    UpdateAccBalRequest updateAccBalRequest = new UpdateAccBalRequest();
	        
	        if (req.getBalanceType() != null) {
	        	switch (req.getBalanceType().name().toUpperCase()) {
	        	case "PRIMARY":
	        		updateAccBalRequest.setBalanceType(BalanceType_type5.primary);
	        		break;
	        	case "SECONDARY":
	        		updateAccBalRequest.setBalanceType(BalanceType_type5.secondary);
	        		break;	
	        	case "BOTH":
	        		updateAccBalRequest.setBalanceType(BalanceType_type5.both);
	        		break;
	        	default:
	        		updateAccBalRequest.setBalanceType(BalanceType_type5.primary);
	        	}
	        }
	        Mdn_type7 mdn =  new Mdn_type7();
	        mdn.setMdn_type6(req.getMdn());
	        updateAccBalRequest.setMdn(mdn);
	        request.setMdn(req.getMdn());
	        
	        if (req.getTransType() != null) {
	        	switch (req.getTransType().name().toLowerCase()) {
	        	case "credit":
	        		updateAccBalRequest.setTranType(TranType_type3.credit);
	        		break;
	        	case "debit":
	        		updateAccBalRequest.setTranType(TranType_type3.debit);
	        		break;
	        	}
	        }
	        
	        if (req.getAmount() != null)
	            updateAccBalRequest.setAmount(VerizonUtil.getAmount_type1Update(req.getAmount()));
	        updateAccBalRequest.setRsid(VerizonUtil.getRsid_type1Update(rsid));
	        updateAccBalRequest.setUserId(userid);
	        updateAccBalRequest.setProviderId(VerizonUtil.getProviderId_type1Update(providerid));
	        	       
	        updateAccountBalance.setInputUpdateAccountBalance(updateAccBalRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(updateAccountBalance, UpdateAccountBalance.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccountBalanceResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.updateAccountBalance(updateAccountBalance);
			}
			catch (UpdateAccountBalance_faultUpdateAccountBalanceMsg se) {
				logger.error(request.getVerizonSynchronousRequestXML());
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				FaultResponse fault = se.getFaultMessage().getUpdateAccountBalance_faultUpdateAccountBalance();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMessage() != null)
				     response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccBalResponse updateAccBarResponse = null;
			if (verizonResponse == null || verizonResponse.getOutputUpdateAccountBalance() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				updateAccBarResponse = verizonResponse.getOutputUpdateAccountBalance();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccountBalance.MY_QNAME));
	   		    AccountBalance accountBalance = updateAccBarResponse.getAccountBalance();
	   		    response.getBalance().setAmount(accountBalance.getAmount());
	   		    response.getBalance().setBalanceType(accountBalance.getBalanceType().getValue());
	   		    response.getBalance().setCurrency(accountBalance.getCurrency().getValue());
	   		    response.getBalance().setMdn(accountBalance.getMdn());
	   		    // TODO add undocumented fields
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(accountBalance.getMdn());
	   		    transactionContextType.setStatus("Unknown");
	   		    transactionContextType.setTransactionId(updateAccBarResponse.getTransactionId());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static UpdateCreditResponse updateCreditRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		UpdateCreditResponse response = new UpdateCreditResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setBalance(new AccountBalanceType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			UpdateCreditRequest req = (UpdateCreditRequest) VerizonUtil.XML2JAXB(UpdateCreditRequest.class, request.getClientRequestXML());
			
    	    UpdateCredit updateCredit = new UpdateCredit();
	   		
    	    UpdateAccBalRequest updateAccBalRequest = new UpdateAccBalRequest();
	        
	        if (req.getBalanceType() != null) {
	        	switch (req.getBalanceType().name().toUpperCase()) {
	        	case "PRIMARY":
	        		updateAccBalRequest.setBalanceType(BalanceType_type5.primary);
	        		break;
	        	case "SECONDARY":
	        		updateAccBalRequest.setBalanceType(BalanceType_type5.secondary);
	        		break;	
	        	case "BOTH":
	        		updateAccBalRequest.setBalanceType(BalanceType_type5.both);
	        		break;
	        	default:
	        		updateAccBalRequest.setBalanceType(BalanceType_type5.primary);
	        	}
	        }
	        Mdn_type7 mdn =  new Mdn_type7();
	        mdn.setMdn_type6(req.getMdn());
	        updateAccBalRequest.setMdn(mdn);
	        request.setMdn(req.getMdn());
	        
	        updateAccBalRequest.setUserId(userid);
	        	       
	        updateCredit.setInputUpdateCredit(updateAccBalRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(updateCredit, UpdateCredit.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateCreditResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.updateCredit(updateCredit);
			}
			catch (UpdateCredit_faultUpdateCreditMsg se) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				FaultResponse fault = se.getFaultMessage().getUpdateCredit_faultUpdateCredit();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				if (fault.getErrorMessage() != null)
				    response.getReturnMessage().setReturnText(fault.getErrorMessage());
				else 
					response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateAccBalResponse getOutputUpdateCreditResponse = null;
			if (verizonResponse == null || verizonResponse.getOutputUpdateCredit() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				getOutputUpdateCreditResponse = verizonResponse.getOutputUpdateCredit();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.UpdateCreditResponse.MY_QNAME));
	   		    AccountBalance accountBalance = getOutputUpdateCreditResponse.getAccountBalance();
	   		    response.getBalance().setAmount(accountBalance.getAmount());
	   		    response.getBalance().setBalanceType(accountBalance.getBalanceType().getValue());
	   		    response.getBalance().setCurrency(accountBalance.getCurrency().getValue());
	   		    response.getBalance().setMdn(accountBalance.getMdn());
	   		    // TODO add undocumented fields
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(accountBalance.getMdn());
	   		    transactionContextType.setStatus("Unknown");
	   		    transactionContextType.setTransactionId(getOutputUpdateCreditResponse.getTransactionId());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static ActivatePINResponse activatePINRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub stub = null;
		ActivatePINResponse response = new ActivatePINResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
    	    ActivatePINRequest req = (ActivatePINRequest) VerizonUtil.XML2JAXB(ActivatePINRequest.class, request.getClientRequestXML());
			
    	    ActivatePIN activatePIN = new ActivatePIN();
	   		
    	    com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ActivatePINRequest  activatePINRequest = new com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ActivatePINRequest();
	        
	        activatePINRequest.setMdn(VerizonUtil.getMdn_type1WEST(req.getMdn()));
	        request.setMdn(req.getMdn());
	        activatePINRequest.setPin(VerizonUtil.getPin_type1Update(req.getPin()));
	        activatePINRequest.setProviderCode(VerizonUtil.getProviderId1Update(providerid));
	        activatePINRequest.setUserId(userid);
	        	       
	        activatePIN.setActivatePINRequest(activatePINRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(activatePIN, ActivatePIN.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub(pinUpdateEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			ActivatePINResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.activatePIN(activatePIN);
			}
			catch (ActivatePIN_activatePINFaultMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getActivatePIN_activatePINFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ActivatePINResponse activatePINResponse = null;
			if (verizonResponse == null || verizonResponse.getActivatePINResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				activatePINResponse = verizonResponse.getActivatePINResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, ActivatePINResponseE.MY_QNAME));
	   		    response.setBalance(String.valueOf(activatePINResponse.getAccountBalance()));
	   		    response.setMdn(activatePINResponse.getMdn());
	   		    response.setPin(activatePINResponse.getPin());
	   		    response.setValue(String.valueOf(activatePINResponse.getPinValue()));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setMdn(activatePINResponse.getMdn());
	   		    transactionContextType.setStatus(activatePINResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(activatePINResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static VoidPINResponse voidPINRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub stub = null;
		VoidPINResponse response = new VoidPINResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
    	    VoidPINRequest req = (VoidPINRequest) VerizonUtil.XML2JAXB(VoidPINRequest.class, request.getClientRequestXML());
			
    	    VoidPIN voidPIN = new VoidPIN();
	   		
    	    WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRequest  voidPINRequest = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRequest();
	        
	        voidPINRequest.setPin(VerizonUtil.getPin_type1Void(req.getPin()));
	        voidPINRequest.setProviderCode(VerizonUtil.getProviderId1Void(providerid));
	        voidPINRequest.setUserID(userid);
	        	       
	        voidPIN.setVoidPINRequest(voidPINRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(voidPIN, ActivatePIN.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub(pinVoidEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			VoidPINResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.voidPIN(voidPIN);
			}
			catch (VoidPIN_voidPINFaultMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getVoidPIN_voidPINFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINResponse voidPINResponse = null;
			if (verizonResponse == null || verizonResponse.getVoidPINResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				voidPINResponse = verizonResponse.getVoidPINResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, VoidPINResponseE.MY_QNAME));
	   		    response.setPin(voidPINResponse.getPin());
	   		    response.setStatus(voidPINResponse.getPinStatus());
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(voidPINResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(voidPINResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static SearchCDRResponse searchCDRRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub stub = null;
		SearchCDRResponse response = new SearchCDRResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			SearchCDRRequest req = (SearchCDRRequest) VerizonUtil.XML2JAXB(SearchCDRRequest.class, request.getClientRequestXML());

    	    stub = new MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub(usageEndpoint);

			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
			
            SearchCDR searchCDR= new SearchCDR();
                    
            MARSGenSumRequest searchCDRRequest = new MARSGenSumRequest();
            
            searchCDRRequest.setProviderID(VerizonUtil.getProviderId3(providerid));
            searchCDRRequest.setEndDate(req.getEndData());
            MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.Mdn_type1 mdn = new MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.Mdn_type1();
            mdn.setMdn_type0(req.getMdn());
            searchCDRRequest.setMdn(mdn);
            request.setMdn(req.getMdn());
            searchCDRRequest.setRecordCount(req.getRecordCount());
            searchCDRRequest.setStartDate(req.getStartDate());
            switch (req.getFilter()) {
            case ALL_EVENTS:
            	searchCDRRequest.setUsageFilter(UsageFilter_type1.ALL_EVENTS);
            	break;
            case VOICE_ONLY:
            	searchCDRRequest.setUsageFilter(UsageFilter_type1.VOICE_ONLY);
            	break;
            case DATA_ONLY:
            	searchCDRRequest.setUsageFilter(UsageFilter_type1.DATA_ONLY);
            	break;
            default:
            	searchCDRRequest.setUsageFilter(UsageFilter_type1.ALL_EVENTS);
            }
            UserID_type3 user = new UserID_type3();
            user.setUserID_type2(userid);
            searchCDRRequest.setUserID(user);
           
            searchCDR.setSearchCDRRequest(searchCDRRequest);
            
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(searchCDR, SearchCDR.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDRResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.searchCDR(searchCDR);
			}
			catch (SearchCDR_SearchCDRFaultMsg se) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.FaultResponse fault = se.getFaultMessage().getSearchCDR_SearchCDRFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setMdn(req.getMdn());
				return response;
			}
			
			MARSSummaryResponse marsSummaryResponse = null;
			if (verizonResponse == null || verizonResponse.getSearchCDRResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				marsSummaryResponse = verizonResponse.getSearchCDRResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDRResponse.MY_QNAME));
	   		    for (int i = 0; i < marsSummaryResponse.getSummaryArray().length; i++) {
	   		        SummaryArrayType summary = new SummaryArrayType();
	   		        RecordArrayType record = new RecordArrayType();
	   		        record.setCallCost(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getCallCost());
	   		        record.setCallDuration(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getCallDuration());
	   		        record.setCallStartTime(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getCallStartTime());
	   		        record.setCdrType(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getCdrType());
	   		        record.setEventLabel(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getEventLabel());
	   		        record.setEventResult(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getEventResult());
	   		        record.setInternationalRoamin(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getInternationalRoaming());
	   		        record.setIsRevertable(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getIsRevertable());
	   		        record.setMdn(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getMdn());
	   		        record.setOrigDialedDigits(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getOrigDialedDigits());
	   		        record.setPostEventBal(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getPostEventBal());
	   		        record.setPreEventBal(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getPreEventBal());
	   		        record.setRowID(marsSummaryResponse.getSummaryArray()[i].getRecordArray().getRowID());
	   		        summary.setRecordArray(record);
	   		        summary.setAdditionalEvtDesc(marsSummaryResponse.getSummaryArray()[i].getAdditionalEvtDesc());
	   		        summary.setEventDesc(marsSummaryResponse.getSummaryArray()[i].getEventDesc());
	   		        summary.setEventLabelDesc(marsSummaryResponse.getSummaryArray()[i].getEventLabelDesc());
	   		        summary.setEventResultDesc(marsSummaryResponse.getSummaryArray()[i].getEventResultDesc());
	   		        response.getSummaryArray().add(summary);
	   		    }	
	   		    response.getTransactionContext().setStatus(VerizonUtil.SUCCESS_TEXT);
	   		    response.getTransactionContext().setTransactionId(marsSummaryResponse.getTransactionID());
	   		    response.getTransactionContext().setUserId(request.getUser().getUsername());
	   		    response.getTransactionContext().setMdn(marsSummaryResponse.getMdn());
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static SearchCDRDetailResponse searchCDRDetailRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub stub = null;
		SearchCDRDetailResponse response = new SearchCDRDetailResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		response.setRoamingInfo(new RoamingInfoType());
		try {
			SearchCDRDetailRequest req = (SearchCDRDetailRequest) VerizonUtil.XML2JAXB(SearchCDRDetailRequest.class, request.getClientRequestXML());
			
    	    stub = new MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub(usageEndpoint);

			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));

            SearchCDRDetail searchCDRDetail= new SearchCDRDetail();
                    
            MARSGenDetRequest searchCDRDetailRequest = new MARSGenDetRequest();

            searchCDRDetailRequest.setRowID(req.getRowID());
            UserID_type1 user = new UserID_type1();
            user.setUserID_type0(userid);
            searchCDRDetailRequest.setUserID(user);
           
            searchCDRDetailRequest.setProviderID(VerizonUtil.getProviderId1(providerid));
            
            searchCDRDetail.setSearchCDRDetRequest(searchCDRDetailRequest);
                
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(searchCDRDetail, SearchCDRDetail.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDRDetailResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.searchCDRDetail(searchCDRDetail);
			}
			catch (SearchCDRDetail_SearchCDRDetFaultMsg se) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.FaultResponse fault = se.getFaultMessage().getSearchCDRDetail_SearchCDRDetFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
				response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getReturnMessage().setReturnText(se.getMessage());
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				response.getTransactionContext().setUserId(req.getMessageHeader().getUserId());
			}
			
			MARSDetailResponse marsDetailResponse = null;
			if (verizonResponse == null || verizonResponse.getSearchCDRDetResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
			    marsDetailResponse = verizonResponse.getSearchCDRDetResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.SearchCDRDetailResponse.MY_QNAME));
	   		    response.setAddCharges(marsDetailResponse.getAddCharges());
	   		    response.setAdditionalEvtDesc(marsDetailResponse.getAdditionalEvtDesc());
	   		    response.setBonusOnRecharge(marsDetailResponse.getBonusOnRecharge());
	   		    response.setCallStartTimezone(marsDetailResponse.getCallStartTimezone());
	   		    response.setCallVolume(marsDetailResponse.getCallVolume());
	   		    response.setCos(marsDetailResponse.getCos());
	   		    response.setDestZoneCode(marsDetailResponse.getDestZoneCode());
	   		    response.setDialedDigits(marsDetailResponse.getDialedDigits());
	   		    response.setEnhancedRef(marsDetailResponse.getEnhancedRef());
	   		    response.setEventDesc(marsDetailResponse.getEventDesc());
	   		    response.setEventLabelDesc(marsDetailResponse.getEventLabelDesc());
	   		    response.setEventResultDesc(marsDetailResponse.getEventResultDesc());
	   		    response.setExtendedDialedDig(marsDetailResponse.getExtendedDialedDig());
	   		    response.setGenTime(marsDetailResponse.getGenTime());
	   		    response.setGenTimezone(marsDetailResponse.getGenTimezone());
	   		    response.setInitTariffRate(marsDetailResponse.getInitTariffRate());
	   		    response.setMerchantID(marsDetailResponse.getMerchantID());
	   		    response.setMscAddress(marsDetailResponse.getMscAddress());
	   		    response.setNewTariffPlanCOSP(marsDetailResponse.getNewTariffPlanCOSP());
	   		    response.setOrigZoneCode(marsDetailResponse.getOrigZoneCode());
	   		    response.setOrigZoneCode(marsDetailResponse.getOrigZoneCode());
	   		    response.setPostEventSIM(marsDetailResponse.getPostEventSIM());
	   		    response.setPreEventSIM(marsDetailResponse.getPreEventSIM());
	   		    response.setRechargeAmount(marsDetailResponse.getRechargeAmount());
	   		    response.setRegularChargeForBal(marsDetailResponse.getRegularChargeForBal());
	   		    response.setReqSysId(marsDetailResponse.getReqSysId());
	   		    response.getRoamingInfo().setCallDescription(marsDetailResponse.getRoamingInfo().getCallDescription());
	   		    response.getRoamingInfo().setCallType(marsDetailResponse.getRoamingInfo().getCallType());
	   		    response.setRoundedCallDuration(marsDetailResponse.getRoundedCallDuration());
	   		    response.setSmscUsageCost(marsDetailResponse.getSmscUsageCost());
	   		    SummaryArrayType summary = new SummaryArrayType();
	   		    summary.setEventDesc(marsDetailResponse.getEventDesc());
	   		    summary.setEventLabelDesc(marsDetailResponse.getEventLabelDesc());
	   		    summary.setEventResultDesc(marsDetailResponse.getEventResultDesc());
	   		    response.setSummaryArray(summary);
	   		    response.setTariffPlanCOSP(marsDetailResponse.getTariffPlanCOSP());
	   		    response.getTransactionContext().setTransactionId(marsDetailResponse.getTransactionID());
	   		    response.getTransactionContext().setUserId(request.getUser().getUsername());
	   		    response.setTransactionID(marsDetailResponse.getTransactionID());
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static SearchPINResponse searchPINRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub stub = null;
		SearchPINResponse response = new  SearchPINResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			SearchPINRequest req = (SearchPINRequest) VerizonUtil.XML2JAXB(SearchPINRequest.class, request.getClientRequestXML());
			
			SearchPIN searchPIN = new SearchPIN();
	   		
    	    WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINRequest searchPINRequest = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINRequest();
	        
    	    if (req.getBatch() != null)
    	        searchPINRequest.setBatch(VerizonUtil.getBatch_type7Search(req.getBatch()));
    	    searchPINRequest.setGroup(VerizonUtil.getGroup_type9Search(req.getGroup()));
    	    searchPINRequest.setMdn(VerizonUtil.getMdn_type1Search(req.getMdn()));
    	    request.setMdn(req.getMdn());
    	    searchPINRequest.setPin(VerizonUtil.getPin_type1Search(req.getPin()));
    	    searchPINRequest.setProviderCode(VerizonUtil.getProviderCode_type5Search(providerid));
    	    searchPINRequest.setSerial(VerizonUtil.getSerial_type1ESearch(req.getSerial()));
    	    searchPINRequest.setUserID(userid);

    	    searchPIN.setSearchPINRequest(searchPINRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(searchPIN, SearchPIN.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub(pinSearchEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			SearchPINResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.searchPIN(searchPIN);
			}
			catch (SearchPIN_searchPINFaultfMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getSearchPIN_searchPINFaultf();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINResponse searchPINResponse = null;
			if (verizonResponse == null || verizonResponse.getSearchPINResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				searchPINResponse = verizonResponse.getSearchPINResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, SearchPINResponseE.MY_QNAME));
	   		    PinDetailType detail = new PinDetailType();
	   		    for (int i = 0; i < searchPINResponse.getPinDetail().length; i++) {
	   		    	PINBO bo = searchPINResponse.getPinDetail()[i];
	   		    	detail.setBatch(bo.getBatch().getBatch_type2());
	   		    	detail.setGroup(bo.getGroup().getGroup_type4());
	   		    	detail.setMDN(bo.getMDN());
	   		    	detail.setPIN(bo.getPIN());
	   		    	detail.setPINActivatedDate(bo.getPINActivatedDate().getTime().toString());
	   		    	detail.setPINExpirationDate(bo.getPINExpirationDate().toString());
	   		    	detail.setPINLevel(bo.getPINLevel());
	   		    	detail.setPINStatus(bo.getPINStatus());
	   		    	detail.setPINValue(String.valueOf(bo.getPINValue()));
	   		    	detail.setPrepaidPlatform(bo.getPrepaidPlatform());
	   		    }
	   		    response.setDetail(detail);
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(searchPINResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(searchPINResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
	   		    if (searchPINResponse.getErrorCode() == null)
				    response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
	   		    else
	   		    	response.getReturnMessage().setReturnCode(searchPINResponse.getErrorCode());
	   		    if (searchPINResponse.getErrorDescription() == null)
	   		    	response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
	   		    else
				    response.getReturnMessage().setReturnText(searchPINResponse.getErrorDescription());
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static SearchPINBatchResponse searchPINBatchRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub stub = null;
		SearchPINBatchResponse response = new  SearchPINBatchResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			SearchPINBatchRequest req = (SearchPINBatchRequest) VerizonUtil.XML2JAXB(SearchPINBatchRequest.class, request.getClientRequestXML());
			
			SearchPINBatch searchPINBatch = new SearchPINBatch();
	   		
    	    WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchBatchRequest searchBatchRequest = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchBatchRequest();
	        
    	    if (req.getBatch() != null)
    	    	searchBatchRequest.setBatch(VerizonUtil.getBatch_type1Search(req.getBatch()));
    	    searchBatchRequest.setGroup(VerizonUtil.getGroup_type1Search(req.getGroup()));
    	    searchBatchRequest.setProviderCode(VerizonUtil.getProviderCode_type1Search(providerid));
    	    searchBatchRequest.setUserID(userid);

    	    searchPINBatch.setSearchPINBatchRequest(searchBatchRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(searchPINBatch, SearchPINBatch.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub(pinSearchEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINBatchResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.searchPINBatch(searchPINBatch);
			}
			catch (SearchPINBatch_searchPINBatchFault1Msg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getSearchPINBatch_searchPINBatchFault1();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchBatchResponse searchBatchResponse = null;
			if (verizonResponse == null || verizonResponse.getSearchPINBatchResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				searchBatchResponse = verizonResponse.getSearchPINBatchResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINBatchResponse.MY_QNAME));
	   		    BatchAttributesType attributes = new BatchAttributesType();
	   		    attributes.setActivatedPINCount(String.valueOf(searchBatchResponse.getBatchAttributes().getActivatedPINCount()));
	   		    attributes.setAvailablePINCount(String.valueOf(searchBatchResponse.getBatchAttributes().getAvailablePINCount()));
	   		    attributes.setBatch(searchBatchResponse.getBatchAttributes().getBatch().getBatch_type4());
	   		    attributes.setBatchStatus(searchBatchResponse.getBatchAttributes().getBatchStatus());
	   		    attributes.setBatchValue(String.valueOf(searchBatchResponse.getBatchAttributes().getBatchValue()));
	   		    attributes.setRetiredPINCount(String.valueOf(searchBatchResponse.getBatchAttributes().getRetiredPINCount()));
	   			response.setBatchAttributes(attributes);
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(searchBatchResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(searchBatchResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
	   		    if (searchBatchResponse.getErrorCode() == null)
				    response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
	   		    else
	   		    	response.getReturnMessage().setReturnCode(searchBatchResponse.getErrorCode());
	   		    if (searchBatchResponse.getErrorDescription() == null)
	   		    	response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
	   		    else
				    response.getReturnMessage().setReturnText(searchBatchResponse.getErrorDescription());
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static VoidPINRangeResponse voidPINRangeRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub stub = null;
		VoidPINRangeResponse response = new VoidPINRangeResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
    	    VoidPINRangeRequest req = (VoidPINRangeRequest) VerizonUtil.XML2JAXB(VoidPINRangeRequest.class, request.getClientRequestXML());
			
    	    VoidPINRange voidPINRange = new VoidPINRange();
	   		
    	    WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRangeRequest  voidPINRangeRequest = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRangeRequest();
	        
	        voidPINRangeRequest.setBeginningSerial(VerizonUtil.getBeginningSerial_type1Void(req.getBeginningSerial()));
	        voidPINRangeRequest.setEndingSerial(VerizonUtil.getEndingSerial_type1Void(req.getEndingSerial()));
	        voidPINRangeRequest.setGroup(VerizonUtil.getGroup_type7Void(req.getGroup()));
	        voidPINRangeRequest.setProviderCode(VerizonUtil.getProviderCode_type7Void(providerid));
	        voidPINRangeRequest.setUserID(userid);
	        	       
	        voidPINRange.setVoidPINRangeRequest(voidPINRangeRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(voidPINRange, VoidPINRange.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub(pinVoidEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			VoidPINRangeResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.voidPINRange(voidPINRange);
			}
			catch (VoidPINRange_voidPINRangeFaultMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getVoidPINRange_voidPINRangeFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidPINRangeResponse voidPINRangeResponse = null;
			if (verizonResponse == null || verizonResponse.getVoidPINRangeResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				voidPINRangeResponse = verizonResponse.getVoidPINRangeResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, VoidPINRangeResponseE.MY_QNAME));
	
	   	
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(voidPINRangeResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(voidPINRangeResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static VoidGroupResponse voidGroupRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub stub = null;
		VoidGroupResponse response = new VoidGroupResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
    	    VoidGroupRequest req = (VoidGroupRequest) VerizonUtil.XML2JAXB(VoidGroupRequest.class, request.getClientRequestXML());
			
    	    VoidGroup voidGroup = new VoidGroup();
	   		
    	    WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidGroupRequest  voidGroupRequest = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidGroupRequest();
	        
    	    voidGroupRequest.setGroup(VerizonUtil.getGroup_type1Void(req.getGroup()));
    	    voidGroupRequest.setProviderCode(VerizonUtil.getProviderCode_type3Void(providerid));
    	    voidGroupRequest.setUserID(userid);
	        	       
    	    voidGroup.setVoidGroupRequest(voidGroupRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(voidGroup, VoidGroup.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub(pinVoidEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			VoidGroupResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.voidGroup(voidGroup);
			}
			catch (VoidGroup_voidGroupFaultMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getVoidGroup_voidGroupFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidGroupResponse voidGroupResponse = null;
			if (verizonResponse == null || verizonResponse.getVoidGroupResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				voidGroupResponse = verizonResponse.getVoidGroupResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, VoidGroupResponseE.MY_QNAME));
	   		    response.setActivatedPINCount(String.valueOf(voidGroupResponse.getCounts().getActivatedPINCount()));
	   		    response.setAvailablePINCount(String.valueOf(voidGroupResponse.getCounts().getAvailablePINCount()));
	   		    response.setGroup(voidGroupResponse.getGroup().getGroup_type4());
	   		    response.setRetiredPINCount(String.valueOf(voidGroupResponse.getCounts().getRetiredPINCount()));
	   		    response.setUpdateRows(String.valueOf(voidGroupResponse.getCounts().getUpdatedRows()));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(voidGroupResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(voidGroupResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static VoidBatchResponse voidBatchRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub stub = null;
		VoidBatchResponse response = new VoidBatchResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
    	    VoidBatchRequest req = (VoidBatchRequest) VerizonUtil.XML2JAXB(VoidBatchRequest.class, request.getClientRequestXML());
			
    	    VoidBatch voidBatch = new VoidBatch();
	   		
    	    WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidBatchRequest  voidBatchRequest = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidBatchRequest();
	        
    	    voidBatchRequest.setBatch(VerizonUtil.getBatch_type1Void(req.getBatch()));
    	    voidBatchRequest.setProviderCode(VerizonUtil.getProviderCode_type5Void(providerid));
    	    voidBatchRequest.setUserID(userid);
	        	       
    	    voidBatch.setVoidBatchRequest(voidBatchRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(voidBatch, VoidBatch.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub(pinVoidEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			VoidBatchResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.voidBatch(voidBatch);
			}
			catch (VoidBatch_voidBatchMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getVoidBatch_voidBatch();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.VoidBatchResponse voidBatchResponse = null;
			if (verizonResponse == null || verizonResponse.getVoidBatchResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				voidBatchResponse = verizonResponse.getVoidBatchResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, VoidBatchResponseE.MY_QNAME));

	   		    
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(voidBatchResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(voidBatchResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static SearchPINGroupResponse searchPINGroupRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub stub = null;
		SearchPINGroupResponse response = new  SearchPINGroupResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			SearchPINGroupRequest req = (SearchPINGroupRequest) VerizonUtil.XML2JAXB(SearchPINGroupRequest.class, request.getClientRequestXML());
			
			SearchPINGroup searchPINGroup = new SearchPINGroup();
	   		
    	    WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchGroupRequest searchGroupRequest = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchGroupRequest();
	        
    	    if (req.getGroup() != null)
    	    	searchGroupRequest.setGroup(VerizonUtil.getGroup_type3Search(req.getGroup()));
    	    searchGroupRequest.setProviderCode(VerizonUtil.getProviderCode_type3Search(providerid));
    	    searchGroupRequest.setUserID(userid);

    	    searchPINGroup.setSearchPINGroupRequest(searchGroupRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(searchPINGroup, SearchPINGroup.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub(pinSearchEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINGroupResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.searchPINGroup(searchPINGroup);
			}
			catch (SearchPINGroup_searchPINGroupFaultMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getSearchPINGroup_searchPINGroupFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchGroupResponse searchGroupResponse = null;
			if (verizonResponse == null || verizonResponse.getSearchPINGroupResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				searchGroupResponse = verizonResponse.getSearchPINGroupResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.SearchPINGroupResponse.MY_QNAME));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(searchGroupResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(searchGroupResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
	   		    if (searchGroupResponse.getErrorCode() == null)
				    response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
	   		    else
	   		    	response.getReturnMessage().setReturnCode(searchGroupResponse.getErrorCode());
	   		    if (searchGroupResponse.getErrorDescription() == null)
	   		    	response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
	   		    else
				    response.getReturnMessage().setReturnText(searchGroupResponse.getErrorDescription());
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static UpdatePINBatchStatusResponse updatePINBatchStatusRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub stub = null;
		UpdatePINBatchStatusResponse response = new UpdatePINBatchStatusResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			UpdatePINBatchStatusRequest req = (UpdatePINBatchStatusRequest) VerizonUtil.XML2JAXB(UpdatePINBatchStatusRequest.class, request.getClientRequestXML());
			
			UpdatePINBatchStatus updatePINBatchStatus = new UpdatePINBatchStatus();
	   		
    	    UpdateBatchStatusRequest  updateBatchStatusRequest = new UpdateBatchStatusRequest();
	        
    	    updateBatchStatusRequest.setBatch(VerizonUtil.getBatch_type3Update(req.getBatch()));
    	    updateBatchStatusRequest.setGroup(VerizonUtil.getGroup_type5Update(req.getGroup()));
    	    updateBatchStatusRequest.setProviderCode(VerizonUtil.getProviderCode_type5Update(providerid));
    	    updateBatchStatusRequest.setUserID(userid);
	        	       
    	    updatePINBatchStatus.setUpdateBatchStatusRequest(updateBatchStatusRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(updatePINBatchStatus, UpdatePINBatchStatus.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub(pinUpdateEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINBatchStatusResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.updatePINBatchStatus(updatePINBatchStatus);
			}
			catch (UpdatePINBatchStatus_updateBatchStatusFaultUmMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getUpdatePINBatchStatus_updateBatchStatusFaultUm();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			UpdateBatchStatusResponse updateBatchStatusResponse = null;
			if (verizonResponse == null || verizonResponse.getUpdateBatchStatusResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				updateBatchStatusResponse = verizonResponse.getUpdateBatchStatusResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, ActivatePINResponseE.MY_QNAME));
	   		    response.setBatch(updateBatchStatusResponse.getBatch().getBatch_type0());
	   		    response.setCount(String.valueOf(updateBatchStatusResponse.getPinCount()));
	   		    response.setGroup(updateBatchStatusResponse.getGroup().getGroup_type0());
	   		    response.setStatus(updateBatchStatusResponse.getBatchStatus());
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(updateBatchStatusResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(updateBatchStatusResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static UpdatePINGroupInfoResponse updatePINGroupInfoRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub stub = null;
		UpdatePINGroupInfoResponse response = new UpdatePINGroupInfoResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			UpdatePINGroupInfoRequest req = (UpdatePINGroupInfoRequest) VerizonUtil.XML2JAXB(UpdatePINGroupInfoRequest.class, request.getClientRequestXML());
			
			UpdatePINGroupInfo updatePINGroupInfo = new UpdatePINGroupInfo();
	   		
    	    UpdateGroupInfoRequest  updateGroupInfoRequest = new UpdateGroupInfoRequest();
	        
    	    updateGroupInfoRequest.setGroup(VerizonUtil.getGroup_type3Update(req.getGroup()));
    	    updateGroupInfoRequest.setNewDenomination(VerizonUtil.getDemonination(req.getDenomination()));
    	    updateGroupInfoRequest.setNewExpirationDate(VerizonUtil.getExpirationDate(req.getExpirationDate()));
    	    updateGroupInfoRequest.setNewLevel(req.getLevel());
    	    updateGroupInfoRequest.setProviderCode(VerizonUtil.getProviderCode_type3Update(providerid));
    	    updateGroupInfoRequest.setUserID(userid);
	        	       
    	    updatePINGroupInfo.setModifyGroupInfoRequest(updateGroupInfoRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(updatePINGroupInfo, UpdatePINGroupInfo.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub(pinUpdateEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdatePINGroupInfoResponse verizonResponse = null;
			
			try {
			    verizonResponse = stub.updatePINGroupInfo(updatePINGroupInfo);
			}
			catch (UpdatePINGroupInfo_modifyGroupInfoFaultMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getUpdatePINGroupInfo_modifyGroupInfoFault();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.UpdateGroupInfoResponse updateGroupInfoResponse = null;
			if (verizonResponse == null || verizonResponse.getModifyGroupInfoResponse() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				updateGroupInfoResponse = verizonResponse.getModifyGroupInfoResponse();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, ActivatePINResponseE.MY_QNAME));
	   		    response.setActivatedPINCount(String.valueOf(updateGroupInfoResponse.getCount().getActivatedPINCount()));
	   		    response.setAvailablePINCount(String.valueOf(updateGroupInfoResponse.getCount().getAvailablePINCount()));
	   		    response.setDenomination(String.valueOf(updateGroupInfoResponse.getNewDenomination()));
	   		    response.setExpirationDate(String.valueOf(updateGroupInfoResponse.getNewExpirationDate()));
	   		    response.setGroup(updateGroupInfoResponse.getGroup());
	   		    response.setLevel(updateGroupInfoResponse.getNewLevel());
	   		    response.setRetiredPINCount(String.valueOf(updateGroupInfoResponse.getCount().getRetiredPINCount()));
	   		    response.setUpdateRows(String.valueOf(updateGroupInfoResponse.getCount().getUpdatedRows()));
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(updateGroupInfoResponse.getErrorCode());
	   		    transactionContextType.setTransactionId(updateGroupInfoResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
	
	public static RevertCallsResponse revertCallsRequest(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub stub = null;
		RevertCallsResponse response = new RevertCallsResponse();
		response.setTransactionContext(new TransactionContextType());
		response.setReturnMessage(new com.budgetprepay.webservice.pojos.verizon.ReturnMessageType());
		try {
			RevertCallsRequest req = (RevertCallsRequest) VerizonUtil.XML2JAXB(RevertCallsRequest.class, request.getClientRequestXML());
			
			RevertCalls revertCalls = new RevertCalls();
	   		
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCallsRequest  revertCallsRequest = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCallsRequest();
	        
			RevertCallsInputCall[] list = new RevertCallsInputCall[req.getRowId().size()];
			for (int i = 0; i < req.getRowId().size(); i++) {
				RevertCallsInputCall call = new RevertCallsInputCall();
				call.setROWID(req.getRowId().get(i));
				list[i] = call;
			}
			revertCallsRequest.setInputCallList(list);
			revertCallsRequest.setMdn(req.getMdn());
			request.setMdn(req.getMdn());
			revertCallsRequest.setProviderID(providerid);
			revertCallsRequest.setUserID(userid);
	        	       
			revertCalls.setInputRevertCalls(revertCallsRequest);
	        
            String verizonSynchronousRequestXML = VerizonUtil.ADB2XML(revertCalls, RevertCalls.MY_QNAME);
            if (verizonSynchronousRequestXML == null)
   	            verizonSynchronousRequestXML = "Unable to log";
            request.setVerizonSynchronousRequestXML(verizonSynchronousRequestXML);
            
			stub = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub(accountEndpoint);
			
			stub._getServiceClient().addHeader(VerizonUtil.createSecurityHeader(username, password));
	   		
			RevertCallsResponseE verizonResponse = null;
			
			try {
			    verizonResponse = stub.revertCalls(revertCalls);
			}
			catch (RevertCalls_faultRevertCallsMsg e) {
				ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
				AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.FaultResponse fault = e.getFaultMessage().getRevertCalls_faultRevertCalls();
				response.getReturnMessage().setReturnCode(fault.getErrorCode());
			    response.getReturnMessage().setReturnText(VerizonUtil.getCCTErrorDescriton(fault.getErrorCode()));
				response.getTransactionContext().setTransactionId(fault.getTransactionID());
				response.getTransactionContext().setUserId(request.getUser().getUsername());
				response.getTransactionContext().setStatus("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()));
				return response;
			}
			
			AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.RevertCallsResponse revertCallsResponse = null;
			if (verizonResponse == null || verizonResponse.getOutputRevertCalls() == null)
				throw new Exception(request.getClientRequestClass() + " response is empty");
			else {
				revertCallsResponse = verizonResponse.getOutputRevertCalls();
	   		    request.setVerizonSynchronousResponseXML(VerizonUtil.ADB2XML(verizonResponse, RevertCallsResponseE.MY_QNAME));
	   		    response.setBalance(revertCallsResponse.getAccountBalance());
	   		    for (int i = 0; i < revertCallsResponse.getOutputCallList().length; i++) {
	   		        OutputCallListType call = new OutputCallListType();
	   		        call.setPreviouseRevertedDate(revertCallsResponse.getOutputCallList()[i].getPreviousRevertDate());
	   		        call.setPreviousRevertedUserId(revertCallsResponse.getOutputCallList()[i].getPreviousReverterUserID());
	   		        call.setRevertResultCode(String.valueOf(revertCallsResponse.getOutputCallList()[i].getRevertResultCode()));
	   		        call.setRowId(revertCallsResponse.getOutputCallList()[i].getROWID());
	   		    	response.getOutputCallList().add(call);
	   		    }
	   		    TransactionContextType transactionContextType = new TransactionContextType();
	   		    transactionContextType.setStatus(VerizonUtil.SUCCESS_CODE);
	   		    transactionContextType.setTransactionId(revertCallsResponse.getTransactionID());
	   		    transactionContextType.setUserId(request.getUser().getUsername());
	   		    response.setTransactionContext(transactionContextType);
				response.getReturnMessage().setReturnCode(VerizonUtil.SUCCESS_CODE);
				response.getReturnMessage().setReturnText(VerizonUtil.SUCCESS_TEXT);
			}
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
		return response;
	}
}

package com.budgetprepay.verizon.rss;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import com.budgetprepay.verizon.rss.pojos.*;

public class RSSUtil {

    public static ResellerReserveResponse createResellerReserveResponse(final MessageHeaderType messageHeader, 
    		                                                            final ResellerReserveResponseType orderResponse) throws Exception {
    	ResellerReserveResponse response = new ResellerReserveResponse();
    	try {
    		if (messageHeader != null)
    		    response.setMessageHeader(messageHeader);
    		if (orderResponse != null)
    		    response.setOrderResponse(orderResponse);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerReserveResponse invalid", e);
    	}
    	return response;
    }

    public static MessageHeaderType createMessageHeaderType(final String asyncErrorURL,
        	                                                final String channelId,
        	                                                final String channelType,
        	                                                final String futureDateTime,
        	                                                final String orderType,
        	                                                final String referenceNumber,
        	                                                final String requestType,
        	                                                final int resend,
        	                                                final String returnURL,
        	                                                final String userID,
        	                                                final String vendorId,
        	                                                final String versionNumber) throws Exception {
    	MessageHeaderType messageHeaderType = new MessageHeaderType();
        try {
        	messageHeaderType.setAsyncErrorURL(asyncErrorURL);
        	messageHeaderType.setChannelId(channelId);
        	messageHeaderType.setChannelType(channelType);
        	messageHeaderType.setFutureDateTime(createOasDateType(null, futureDateTime));
        	messageHeaderType.setOrderType(orderType);
        	messageHeaderType.setReferenceNumber(createReferenceNumberType(null, referenceNumber));
        	messageHeaderType.setRequestType(requestType);
        	messageHeaderType.setResend(resend);
        	messageHeaderType.setReturnURL(returnURL);
        	messageHeaderType.setUserID(userID);
        	messageHeaderType.setVendorId(vendorId);
        	messageHeaderType.setVersionNumber(versionNumber);
        }
        catch (Exception e) {
        	throw new Exception ("MessageHeader invalid", e);
        }
        return messageHeaderType;
    }

    public static ResellerReserveResponseType createResellerReserveResponseType(final MdnType mdn,
    		                                                                    final String min,
    		                                                                    final String returnCode,
    		                                                                    final String returnMessage) throws Exception {
    	ResellerReserveResponseType resellerReserveResponseType = new ResellerReserveResponseType();
    	try {
    		if (mdn != null)
    		    resellerReserveResponseType.setMdn(mdn);
    		if (min != null)
    		    resellerReserveResponseType.setMin(min);
    		if (returnCode != null)
    		    resellerReserveResponseType.setReturnCode(returnCode);
    		if (returnMessage != null)
    		    resellerReserveResponseType.setReturnMessage(returnMessage);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerReserveResponseType invalid", e);
    	}
    	return resellerReserveResponseType;
    }

    public static OrderInquiry createOrderInquiry(final MessageHeaderType messageHeader,
    		                                      final SecurityType security) throws Exception {
    	OrderInquiry orderInquiry = new OrderInquiry();
    	try {
    		if (messageHeader != null)
    		    orderInquiry.setMessageHeader(messageHeader);
    		if (security != null)
    		    orderInquiry.setSecurity(security);
    	}
    	catch (Exception e) {
    		throw new Exception("OrderInquiry invalid", e);
    	}
    	return orderInquiry;
    }

    public static SecurityType createSecurityType(final String password, final String userId) throws Exception {
    	SecurityType securityType = new SecurityType();
    	try {
    		if (password != null)
    		    securityType.setPassword(password);
    		if (userId != null)
    		    securityType.setUserId(userId);
    	}
    	catch (Exception e) {
    		throw new Exception("SecurityType invalid", e);
    	}
    	return securityType;
    }

    public static ResellerLineResponse createResellerLineResponse(final ResellerLineResponseType lineResponse,
    		                                                      final MessageHeaderType messageHeader) throws Exception {
    	ResellerLineResponse resellerLineResponse = new ResellerLineResponse();
    	try {
    		if (lineResponse != null)
    		    resellerLineResponse.setLineResponse(lineResponse);
    		if (messageHeader != null)
    		    resellerLineResponse.setMessageHeader(messageHeader);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerLineResponse invalid", e);
    	}
    	return resellerLineResponse;
    }

    public static ResellerLineResponseType createResellerLineResponseType(final String deviceId,
    		                                                              final EquipmentType equipment,
    		                                                              final String errorCode,
    		                                                              final String errorMessage,
    		                                                              final String esn,
    		                                                              final YesNoType fUSFExemptFlag,
    		                                                              final String iCCID,
    		                                                              final OasStringType initialServiceDate,
    		                                                              final OasString10Type ldc,
    		                                                              final OasStringType lteStatusCode,
    		                                                              final MdnType mdn,
    		                                                              final String meid,
    		                                                              final String min,
    		                                                              final OasStringType mobileIPAddress,
    		                                                              final PlanType plan,
    		                                                              final OasStringType statusCode) throws Exception {
    	ResellerLineResponseType resellerLineResponseType = new ResellerLineResponseType();
    	try {
    		if (deviceId != null)
    		    resellerLineResponseType.setDeviceId(deviceId);
    		if (equipment != null)
    		    resellerLineResponseType.setEquipment(equipment);
    		if (errorCode != null)
    		    resellerLineResponseType.setErrorCode(errorCode);
    		if (errorMessage != null)
    		    resellerLineResponseType.setErrorMessage(errorMessage);
    		if (esn != null)
    		    resellerLineResponseType.setEsn(esn);
    		if (fUSFExemptFlag != null)
    		    resellerLineResponseType.setFUSFExemptFlag(fUSFExemptFlag);
    		if (iCCID != null)
    		    resellerLineResponseType.setICCID(iCCID);
    		if (initialServiceDate != null)
    		    resellerLineResponseType.setInitialServiceDate(initialServiceDate);
    		if (ldc != null)
    		    resellerLineResponseType.setLdc(ldc);
    		if (lteStatusCode != null)
    		    resellerLineResponseType.setLteStatusCode(lteStatusCode);
    		if (mdn != null)
    		    resellerLineResponseType.setMdn(mdn);
    		if (meid != null)
    		    resellerLineResponseType.setMeid(meid);
    		if (min != null)
    		    resellerLineResponseType.setMin(min);
    		if (mobileIPAddress != null)
    		    resellerLineResponseType.setMobileIPAddress(mobileIPAddress);
    		if (plan != null)
    		resellerLineResponseType.setPlan(plan);
    		if (statusCode != null)
    		    resellerLineResponseType.setStatusCode(statusCode);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerLineResponseType invalid", e);
    	}
    	return resellerLineResponseType;
    }

    public static ValidateDeviceResponse createValidateDeviceResponse(final DeviceResponseType deviceResponse,
    		                                                          final MessageHeaderType messageHeader) throws Exception {
    	ValidateDeviceResponse validateDeviceResponse = new ValidateDeviceResponse();
    	try {
    		if (deviceResponse != null)
    		    validateDeviceResponse.setDeviceResponse(deviceResponse);
    		if (messageHeader != null)
    		    validateDeviceResponse.setMessageHeader(messageHeader);
    	}
    	catch (Exception e) {
    		throw new Exception("ValidateDeviceResponse invalid", e);
    	}
    	return validateDeviceResponse;
    }

    public static DeviceResponseType createDeviceResponseType(final String deviceId,
    		                                                  final EquipmentType equipment,
    		                                                  final YesNoType isInDMD,
    		                                                  final YesNoType isLostOrStolen,
    		                                                  final YesNoType isPIBlock,
    		                                                  final YesNoType isValid,
    		                                                  final String returnCode,
    		                                                  final String returnMessage) throws Exception {
    	DeviceResponseType deviceResponseType = new DeviceResponseType();
    	try {
    		if (deviceId != null)
    		    deviceResponseType.setDeviceId(deviceId);
    		if (equipment != null)
    		    deviceResponseType.setEquipment(equipment);
    		if (isInDMD != null)
    		    deviceResponseType.setIsInDMD(isInDMD);
    		if (isLostOrStolen != null)
    		    deviceResponseType.setIsLostOrStolen(isLostOrStolen);
    		if (isPIBlock != null)
    		    deviceResponseType.setIsPIBLock(isPIBlock); 
    		if (isValid != null)
    		    deviceResponseType.setIsValid(isValid);
    		if (returnCode != null)
    		    deviceResponseType.setReturnCode(returnCode);
    		if (returnMessage != null)
    		    deviceResponseType.setReturnMessage(returnMessage);
    	}
    	catch (Exception e) {
    		throw new Exception("DeviceResponseType invalid", e);
    	}
    	return deviceResponseType;
    }

    public static OasOrderResponse createOasOrderResponse(final MessageHeaderType messageHeaderType,
    		                                              final OrderInquiryResponseType orderResponse) throws Exception {
    	OasOrderResponse oasOrderResponse = new OasOrderResponse();
    	try {
    		if (messageHeaderType != null)
    		    oasOrderResponse.setMessageHeader(messageHeaderType);
    		if (orderResponse != null)
    		    oasOrderResponse.setOrderResponse(orderResponse);
    	}
    	catch (Exception e) {
    		throw new Exception("OasOrderResponse invalid", e);
    	}
    	return oasOrderResponse; 
    }

    public static OrderInquiryResponseType createOrderInquiryResponseType(final String errorCode,
    		                                                              final String errorMessage,
    		                                                              final MdnType mdn,
    		                                                              final String message,
    		                                                              final String noOfLines,
    		                                                              final String orderStatus,
    		                                                              final String orderTimeStamp) throws Exception {
    	OrderInquiryResponseType orderInquiryResponseType = new OrderInquiryResponseType();
    	try {
    		orderInquiryResponseType.setErrorCode(errorCode);
    		orderInquiryResponseType.setErrorMessage(errorMessage);
    		orderInquiryResponseType.setMdn(mdn);
    		orderInquiryResponseType.setMessage(message);
    		orderInquiryResponseType.setNoOfLines(noOfLines);
    		orderInquiryResponseType.setOrderStatus(orderStatus);
    		orderInquiryResponseType.setOrderTimeStamp(orderTimeStamp);
    	}
    	catch (Exception e) {
    		throw new Exception("OrderInquiryResponseType invalid", e);
    	}
    	return orderInquiryResponseType;
    }

    public static ResellerOrder createResellerOrder(final MessageHeaderType messageHeader,
    		                                        final ResellerOrderType order) throws Exception {
    	ResellerOrder resellerOrder = new ResellerOrder();
    	try{
    		if (messageHeader != null)
    		    resellerOrder.setMessageHeader(messageHeader);
    		if (order != null)
    		    resellerOrder.setOrder(order);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerOrder invalid", e);
    	}
    	return resellerOrder;
    }

    public static ResellerOrderType createResellerOrderType(final OasStringType accountNumber,
    		                                                final OasStringType orderTimeStamp,
    		                                                final ResellerSubOrderType subOrder) throws Exception {
    	ResellerOrderType resellerOrderType = new ResellerOrderType();
    	try {
    		if (accountNumber != null)
    		    resellerOrderType.setAccountNumber(accountNumber);
    		if (orderTimeStamp != null)
    		    resellerOrderType.setOrderTimeStamp(orderTimeStamp);
    		if (subOrder != null)
    		    resellerOrderType.setSubOrder(subOrder);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerOrderType invalid", e);
    	}
    	return resellerOrderType;
    }

    public static ResellerAsyncResponse createResellerAsyncResponse(final ResellerDeviceResponseType deviceResponse,
    		                                                        final MessageHeaderType messageHeader,
    		                                                        final ResellerAsyncResponseType orderProgrammingResponse,
    		                                                        final ResellerAsyncResponseType orderResponse) throws Exception {
    	ResellerAsyncResponse resellerAsyncResponse = new ResellerAsyncResponse();
    	try {
    		if (deviceResponse != null)
    		    resellerAsyncResponse.setDeviceResponse(deviceResponse);
    		if (messageHeader != null)
    		    resellerAsyncResponse.setMessageHeader(messageHeader);
    		if (orderProgrammingResponse != null)
    		    resellerAsyncResponse.setOrderProgrammingResponse(orderProgrammingResponse);
    		if (orderResponse != null)
    		    resellerAsyncResponse.setOrderResponse(orderResponse);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerAsyncResponse invalid", e);
    	}
    	return resellerAsyncResponse;
    }

    public static ResellerAsyncResponseType createResellerAsyncResponseType() throws Exception {
    	ResellerAsyncResponseType resellerAsyncResponseType = new ResellerAsyncResponseType();
    	try {
    	
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerAsyncResponseType invalid", e);
    	}
    	return resellerAsyncResponseType;
    }

    public static ResellerDeviceResponseType createResellerDeviceResponseType(final String deviceId,
    		                                                                  final EquipmentType equipment,
    		                                                                  final String esn,
    		                                                                  final String iccid,
    		                                                                  final OasString10Type iec,
    		                                                                  final OasStringType initialServiceDate,
    		                                                                  final MdnType mdn,
    		                                                                  final String meid,
    		                                                                  final String min,
    		                                                                  final OasStringType mobileIPAddress,
    		                                                                  final PlanType plan,
    		                                                                  final String returnCode,
    		                                                                  final String returnMessage,
    		                                                                  final OasStringType statusCode) throws Exception {
    	ResellerDeviceResponseType resellerDeviceResponseType = new ResellerDeviceResponseType();
    	try {
    		resellerDeviceResponseType.setDeviceId(deviceId);
    		resellerDeviceResponseType.setEquipment(equipment);
    		resellerDeviceResponseType.setEsn(esn);
    		resellerDeviceResponseType.setIccid(iccid);
    		resellerDeviceResponseType.setIec(iec);
    		resellerDeviceResponseType.setInitialServiceDate(initialServiceDate);
    		resellerDeviceResponseType.setMdn(mdn);
    		resellerDeviceResponseType.setMeid(meid);
    		resellerDeviceResponseType.setMin(min);
    		resellerDeviceResponseType.setMobileIPAddress(mobileIPAddress);
    		resellerDeviceResponseType.setPlan(plan);
    		resellerDeviceResponseType.setReturnCode(returnCode);
    		resellerDeviceResponseType.setReturnMessage(returnMessage);
    		resellerDeviceResponseType.setStatusCode(statusCode);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerDeviceResponseType invalid", e);
    	}
    	return resellerDeviceResponseType;
    }

    public static ResellerHBQualInfoResponse createResellerHBQualInfoResponse(final MessageHeaderType messageHeader,
    		                                                                  final QualificationResponseType qualificationResponse) throws Exception {
    	ResellerHBQualInfoResponse resellerHBQualInfoResponse = new ResellerHBQualInfoResponse();
    	try {
    		if (messageHeader != null)
    		resellerHBQualInfoResponse.setMessageHeader(messageHeader);
    		if (qualificationResponse != null)
    		    resellerHBQualInfoResponse.setQualificationResponse(qualificationResponse);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerHBQualInfoResponse invalid", e);
    	}
    	return resellerHBQualInfoResponse;
    }

    public static QualificationResponseType createQualificationResponseType(final AddressInfoListType addressInfoList,
    		                                                                final InputAddressType inputAddress,
    		                                                                final String returnCode,
    		                                                                final String returnMessage) throws Exception {
    	QualificationResponseType qualificationResponseType = new QualificationResponseType();
    	try {
    		if (addressInfoList != null)
    			qualificationResponseType.setAddressInfoList(addressInfoList);
    		if (inputAddress != null)
    			qualificationResponseType.setInputAddress(inputAddress);
    		if (returnCode != null)
    			qualificationResponseType.setReturnCode(returnCode);
    		if (returnMessage != null)
    			qualificationResponseType.setReturnMessage(returnMessage);
    	}
    	catch (Exception e) {
    		throw new Exception("QualificationResponseType invalid", e);
    	}
    	return qualificationResponseType;
    }

    public static ResellerPRLResponse createResellerPRLResponse(final MessageHeaderType messageHeader,
    		                                                    final ResellerPRLResponseType prlResponse) throws Exception {
    	ResellerPRLResponse resellerPRLResponse = new ResellerPRLResponse();
    	try {
    		if (messageHeader != null)
    			resellerPRLResponse.setMessageHeader(messageHeader);
    		if (prlResponse != null)
    			resellerPRLResponse.setPrlResponse(prlResponse);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerPRLResponse invalid", e);
    	}
    	return resellerPRLResponse;
    }

    public static ResellerPRLResponseType createResellerPRLResponseType(final String errorCode,
    		                                                            final String errorMessage,
    		                                                            final String esn,
    		                                                            final String iccid,
    		                                                            final MdnType mdn,
    		                                                            final String meid,
    		                                                            final String min,
    		                                                            final String pLMNDownloadDate,
    		                                                            final String pLMNNumber,
    		                                                            final String pLMNProgrammingDate,
    		                                                            final String pLMNTemplate,
    		                                                            final String pRLDownloadDate,
    		                                                            final String pRLNumber) throws Exception {
    	ResellerPRLResponseType resellerPRLResponseType = new ResellerPRLResponseType();
    	try {
    		if (errorCode != null)
    			resellerPRLResponseType.setErrorCode(errorCode);
    		if (errorMessage != null)
    			resellerPRLResponseType.setErrorMessage(errorMessage);
    		if (esn != null)
    			resellerPRLResponseType.setEsn(esn);
    		if (iccid != null)
    			resellerPRLResponseType.setIccid(iccid);
    		if (mdn != null)
    			resellerPRLResponseType.setMdn(mdn);
    		if (meid != null)
    			resellerPRLResponseType.setMeid(meid);
    		if (min != null)
    			resellerPRLResponseType.setMin(min);
    		if (pLMNDownloadDate != null)
    			resellerPRLResponseType.setPLMNDownloadDate(pLMNDownloadDate);
    		if (pLMNNumber != null)
    			resellerPRLResponseType.setPLMNNumber(pLMNNumber);
    		if (pLMNProgrammingDate != null)
    			resellerPRLResponseType.setPLMNProgrammingDate(pLMNProgrammingDate);
    		if (pLMNTemplate != null)
    			resellerPRLResponseType.setPLMNTemplate(pLMNTemplate);
    		if (pRLDownloadDate != null)
    			resellerPRLResponseType.setPRLDownloadDate(pRLDownloadDate);
    		if (pRLNumber != null)
    			resellerPRLResponseType.setPRLNumber(pRLNumber);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerPRLResponseType invalid", e);
    	}
    	return resellerPRLResponseType;
    }

    public static ResellerOrderResponse createResellerOrderResponse(final MessageHeaderType messageHeader, final ResellerOrderResponseType orderResponse ) throws Exception {
    	ResellerOrderResponse resellerOrderResponse = new ResellerOrderResponse();
    	try {
    		if (messageHeader != null)
    		    resellerOrderResponse.setMessageHeader(messageHeader);
    		if (orderResponse != null)
    		    resellerOrderResponse.setOrderResponse(orderResponse);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerOrderResponse invalid", e);
    	}
        return resellerOrderResponse;
    }

    public static ResellerOrderResponseType createResellerOrderResponseType(final String returnCode, final String returnMessage) throws Exception {
    	ResellerOrderResponseType resellerOrderResponseType = new ResellerOrderResponseType();
    	try {
    		if (returnCode != null)
    		    resellerOrderResponseType.setReturnCode(returnCode);
    		if (returnMessage != null)
    		    resellerOrderResponseType.setReturnMessage(returnMessage);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerOrderResponseType invalid", e);
    	}
        return resellerOrderResponseType;
    }

    public static ResellerDeviceNotification createResellerDeviceNotification(final SimOtaDeviceChangeNotificationType simOtaDeviceChangeNotification) throws Exception {
    	ResellerDeviceNotification resellerDeviceNotification = new ResellerDeviceNotification();
    	try {
    		if (simOtaDeviceChangeNotification != null)
    		    resellerDeviceNotification.setSimOtaDeviceChangeNotification(simOtaDeviceChangeNotification);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerDeviceNotification invalid", e);
    	}
        return resellerDeviceNotification;
    }

    public static SimOtaDeviceChangeNotificationType createSimOtaDeviceChangeNotificationType(final OasStringType accountNumber,
    		                                                                                  final OasDateType dateChanged,
    		                                                                                  final String deviceId,
    		                                                                                  final String iccid,
    		                                                                                  final MdnType mdn,
    		                                                                                  final String terminalProfile) throws Exception {
    	SimOtaDeviceChangeNotificationType simOtaDeviceChangeNotificationType = new SimOtaDeviceChangeNotificationType();
    	try {
    		if (accountNumber != null)
    			simOtaDeviceChangeNotificationType.setAccountNumber(accountNumber);
    		if (dateChanged != null)
    			simOtaDeviceChangeNotificationType.setDateChanged(dateChanged);
    		if (deviceId != null)
    			simOtaDeviceChangeNotificationType.setDeviceId(deviceId);
    		if (iccid != null)
    			simOtaDeviceChangeNotificationType.setIccid(iccid);
    		if (mdn != null)
    			simOtaDeviceChangeNotificationType.setMdn(mdn);
    		if (terminalProfile != null)
    			simOtaDeviceChangeNotificationType.setTerminalProfile(terminalProfile);
    	}
    	catch (Exception e) {
    		throw new Exception("SimOtaDeviceChangeNotificationType invalid", e);
    	}
        return simOtaDeviceChangeNotificationType;
    }

    public static AddressInfoListType createAddressInfoListType() throws Exception {
    	AddressInfoListType addressInfoListType = new AddressInfoListType();
    	try {
    		
    	}
    	catch (Exception e) {
    		throw new Exception("AddressInfoListType invalid", e);
    	}
        return addressInfoListType;
    }

    public static MeidWithOldEsnMeidType createMeidWithOldEsnMeidType(final String old, final String value) throws Exception {
    	MeidWithOldEsnMeidType meidWithOldEsnMeidType = new MeidWithOldEsnMeidType();
    	try {
    		if (old != null)
    			meidWithOldEsnMeidType.setOld(old);
    		if (value != null)
    			meidWithOldEsnMeidType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("MeidWithOldEsnMeidType invalid", e);
    	}
        return meidWithOldEsnMeidType;
    }

    public static IncludedWithPlanType createIncludedWithPlanType(final String old, final String value) throws Exception {
    	IncludedWithPlanType includedWithPlanType = new IncludedWithPlanType();
    	try {
    		if (old != null)
    			includedWithPlanType.setOld(old);
    		if (value != null)
    			includedWithPlanType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("IncludedWithPlanType invalid", e);
    	}
    	return includedWithPlanType;
    }

    public static PersonNameType createPersonNameType(final String old, final String value) throws Exception {
    	PersonNameType personNameType = new PersonNameType();
    	try {
    		if (old != null)
    			personNameType.setOld(old);
    		if (value != null)
    			personNameType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("PersonNameType invalid", e);
    	}
    	return personNameType;
    }

    public static OasDateType createOasDateType(final String old, final String value) throws Exception {
    	OasDateType oasDateType = new OasDateType();
    	try {
    		if (old != null)
    		    oasDateType.setOld(old);
    		if (value != null)
    		    oasDateType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("OasDateType invalid");
    	}
        return oasDateType;
    }
    
    public static CityType createCityType(final String old, final String value) throws Exception {
    	CityType cityType = new CityType();
    	try {
    		if (old != null)
    			cityType.setOld(old);
    		if (value != null)
    			cityType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("CitType invalid", e);
    	}
    	return cityType;
    }

    public static FeatureType createFeatureType(final OasStringType featureCode, final AddDeleteType subscribe) throws Exception {
    	FeatureType featureType = new FeatureType();
    	try {
    		if (featureCode != null)
    		    featureType.setFeatureCode(featureCode);
    		if (subscribe != null)
    			featureType.setSubscribe(subscribe);
    	}
    	catch (Exception e) {
    		throw new Exception("FeatureType invalid", e);
    	}
        return featureType;
    }

    public static ResellerFUSFExemptUpdateType createResellerFUSFExemptUpdateType(final YesNoType fUSFExemptFlag,
    		                                                                      final MdnType mdn,
    		                                                                      final ZipCodeType serviceZipCode,
    		                                                                      final SubReferenceNumberType subReferenceNumber,
    		                                                                      final SystemDataType systemData) throws Exception {
    	ResellerFUSFExemptUpdateType resellerFUSFExemptUpdateType = new ResellerFUSFExemptUpdateType();
    	try {
    		if (fUSFExemptFlag != null)
    			resellerFUSFExemptUpdateType.setFUSFExemptFlag(fUSFExemptFlag);
    		if (mdn != null)
    			resellerFUSFExemptUpdateType.setMdn(mdn);
    		if (serviceZipCode != null)
    			resellerFUSFExemptUpdateType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerFUSFExemptUpdateType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerFUSFExemptUpdateType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerFUSFExemptUpdateType invalid", e);
    	}
        return resellerFUSFExemptUpdateType;
    }

    public static ResellerAddSubscriberByESNType createResellerAddSubscriberByESNType(final String esn,
    		                                                                          final YesNoType fUSFExemptFlag,
    		                                                                          final String globalSIMCard,
    		                                                                          final LdcOrIecType iec,
    		                                                                          final LdcOrIecType ldc,                                  
    		                                                                          final String meid,
    		                                                                          final OasStringType mobileIPAddress,
    		                                                                          final OasStringType mPNPoolName,
    		                                                                          final PlanType plan,
    		                                                                          final YesNoType portInFlag,
    		                                                                          final ZipCodeType serviceZipCode,
    		                                                                          final OasStringType subOrgID,
    		                                                                          final SubReferenceNumberType subReferenceNumber,
    		                                                                          final SystemDataType systemData) throws Exception {
    	ResellerAddSubscriberByESNType resellerAddSubscriberByESNType = new ResellerAddSubscriberByESNType();
    	try {
    		if (esn != null)
    			resellerAddSubscriberByESNType.setEsn(esn);
    		if (fUSFExemptFlag != null)
    			resellerAddSubscriberByESNType.setFUSFExemptFlag(fUSFExemptFlag);
    		if (globalSIMCard != null)
    			resellerAddSubscriberByESNType.setGlobalSIMCard(globalSIMCard);
    		if (iec != null)
    			resellerAddSubscriberByESNType.setIec(iec);
    		if (ldc != null)
    			resellerAddSubscriberByESNType.setLdc(ldc);
    		if (meid != null)
    			resellerAddSubscriberByESNType.setMeid(meid);
    		if (mobileIPAddress != null)
    			resellerAddSubscriberByESNType.setMobileIPAddress(mobileIPAddress);
    		if (mPNPoolName != null)
    			resellerAddSubscriberByESNType.setMPNPoolName(mPNPoolName);
    		if (plan != null)
    			resellerAddSubscriberByESNType.setPlan(plan);
    		if (portInFlag != null)
    			resellerAddSubscriberByESNType.setPortInFlag(portInFlag);
    		if (serviceZipCode != null)
    			resellerAddSubscriberByESNType.setServiceZipCode(serviceZipCode);
    		if (subOrgID != null)
    			resellerAddSubscriberByESNType.setSubOrgID(subOrgID);
    		if (subReferenceNumber != null)
    			resellerAddSubscriberByESNType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerAddSubscriberByESNType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerAddSubscriberByESNType invalid", e);
    	}
        return resellerAddSubscriberByESNType;
    }

    public static LnpAddressType createLnpAddressType(final StreetNameType addressLine1,
    		                                          final StreetNameType addressLine2,
    		                                          final CityType city,
    		                                          final CountryType country,
    		                                          final StateType state,
    		                                          final ZipCodeType zip) throws Exception {
    	LnpAddressType lnpAddressType = new LnpAddressType();
    	try {
    		if (addressLine1 != null)
    			lnpAddressType.setAddressLine1(addressLine1);
    		if (addressLine2 != null)
    			lnpAddressType.setAddressLine2(addressLine2);
    		if (city != null)
    			lnpAddressType.setCity(city);
    		if (country != null)
    			lnpAddressType.setCountry(country);
    		if (state != null)
    			lnpAddressType.setState(state);
    		if (zip != null)
    			lnpAddressType.setZip(zip);
    	}
    	catch (Exception e) {
    		throw new Exception("LnpAddressType invalid", e);
    	}
    	return lnpAddressType;
    }

    public static ResellerChangeESNType createResellerChangeESNType(final EsnWithOldEsnMeidType esn,
    		                                                        final MdnType mdn,
    		                                                        final MeidWithOldEsnMeidType meid,
    		                                                        final String min,
    		                                                        final ZipCodeType serviceZipCode,
    		                                                        final SubReferenceNumberType subReferenceNumber,
    		                                                        final SystemDataType systemData) throws Exception {
    	ResellerChangeESNType resellerChangeESNType = new ResellerChangeESNType();
    	try {
    		if (esn != null)
    			resellerChangeESNType.setEsn(esn);
    		if (mdn != null)
    			resellerChangeESNType.setMdn(mdn);
    		if (meid != null)
    			resellerChangeESNType.setMeid(meid);
    		if (min != null)
    			resellerChangeESNType.setMin(min);
    		if (serviceZipCode != null)
    			resellerChangeESNType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerChangeESNType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerChangeESNType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerChangeESNType invalid", e);
    	}
    	return resellerChangeESNType;
    }

    public static CompetitorCodeType createCompetitorCodeType(final String description, final String old, final String value) throws Exception {
    	CompetitorCodeType competitorCodeType = new CompetitorCodeType();
    	try {
    		if (description != null)
    			competitorCodeType.setDescription(description);
    		if (old != null)
    			competitorCodeType.setOld(old);
    		if (value != null)
    			competitorCodeType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("CompetitorCodeType invalid", e);
    	}
    	return competitorCodeType;
    }

    public static MdnWithOldMdnType createMdnWithOldMdnType(final String old, final String type, final String value) throws Exception {
    	MdnWithOldMdnType mdnWithOldMdnType = new MdnWithOldMdnType();
    	try {
    		if (old != null)
    			mdnWithOldMdnType.setOld(old);
    		if (type != null)
    			mdnWithOldMdnType.setType(type);
    		if (value != null)
    			mdnWithOldMdnType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("MdnWithOldMdnType invalid", e);
    	}
    	return mdnWithOldMdnType;
    }

    public static EquipmentType createEquipmentType(final OasStringType make, final OasStringType mode, final OasStringType model) throws Exception {
    	EquipmentType equipmentType = new EquipmentType();
    	try {
    		if (make != null)
    			equipmentType.setMake(make);
    		if (mode != null)
    			equipmentType.setMode(mode);
    		if (model != null)
    			equipmentType.setModel(model);
    	}
    	catch (Exception e) {
    		throw new Exception("EquipmentType invalid", e);
    	}
    	return equipmentType;
    }

    public static OasSingleCharacterType createOasSingleCharacterType(final String old, final String value) throws Exception {
    	OasSingleCharacterType oasSingleCharacterType = new OasSingleCharacterType();
    	try {
    		if (old != null)
    			oasSingleCharacterType.setOld(old.substring(0, 1));
    		if (value != null)
    			oasSingleCharacterType.setValue(value.substring(0, 1));
    	}
    	catch (Exception e) {
    		throw new Exception("OasSingleCharacterType invalid", e);
    	}
    	return oasSingleCharacterType;
    }

    public static LnpType createLnpType() throws Exception {
    	LnpType lnpType = new LnpType();
    	try {
    		
    	}
    	catch (Exception e) {
    		throw new Exception("LnpType invalid", e);
    	}
    	return lnpType;
    }

    public static LdcOrIecType createLdcOrIecType(final String old, final String value) throws Exception {
    	LdcOrIecType ldcOrIecType = new LdcOrIecType();
    	try {
    		if (old != null)
    			ldcOrIecType.setOld(old);
    		if (value != null)
    			ldcOrIecType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("LdcOrIecType invalid", e);
    	}
    	return ldcOrIecType;
    }

    public static CountryType createCountryType(final String old, final String value) throws Exception {
    	CountryType countryType = new CountryType();
    	try {
    		if (old != null)
    		    countryType.setOld(old);
    		if (value != null)
    		    countryType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("CountryType invalid", e);
    	}
    	return countryType;
    }

    public static ResellerReconnectType createResellerReconnectType(final String esn,
    		                                                        final String iccid,
    		                                                        final MdnType mdn,
    		                                                        final String meid,
    		                                                        final String min,
    		                                                        final SubReferenceNumberType subReferenceNumber) throws Exception {
    	ResellerReconnectType resellerReconnectType = new ResellerReconnectType();
    	try {
    		if (esn != null)
    		    resellerReconnectType.setEsn(esn);
    		if (iccid != null)
    			resellerReconnectType.setIccid(iccid);
    		if (mdn != null)
    			resellerReconnectType.setMdn(mdn);
    		if (meid != null)
    			resellerReconnectType.setMeid(meid);
    		if (min != null)
    			resellerReconnectType.setMin(min);
    		if (subReferenceNumber != null)
    			resellerReconnectType.setSubReferenceNumber(subReferenceNumber);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerReconnectType", e);
    	}
    	return resellerReconnectType;
    }

    public static OasString60Type createOasString60Type(final String old, final String value) throws Exception {
    	OasString60Type oasString60Type = new OasString60Type();
    	try {
    		if (old != null)
    			oasString60Type.setOld(old.substring(0, 60));
    		if (value != null)
    			oasString60Type.setValue(value.substring(0, 60));
    	}
    	catch (Exception e) {
    		throw new Exception("OasString60Type invalid", e);
    	}
    	return oasString60Type;
    }

    public static SubReferenceNumberType createSubReferenceNumberType(final String old, final String value) throws Exception {
    	SubReferenceNumberType subReferenceNumberType = new SubReferenceNumberType();
    	try {
    		if (old != null)
    			subReferenceNumberType.setOld(old);
    		if (value != null)
    			subReferenceNumberType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("SubReferenceNumberType invalid", e);
    	}
    	return subReferenceNumberType;
    }

    public static ResellerSuspendSubscriberType createResellerSuspendSubscriberType(final String esn,
    		                                                                        final MdnType mdn,
    		                                                                        final String meid,
    		                                                                        final String min,
    		                                                                        final ZipCodeType serviceZipCode,
    		                                                                        final SubReferenceNumberType subReferenceNumber,
    		                                                                        final SystemDataType systemData) throws Exception {
    	ResellerSuspendSubscriberType resellerSuspendSubscriberType = new ResellerSuspendSubscriberType();
    	try {
    		if (esn != null)
    			resellerSuspendSubscriberType.setEsn(esn);
    		if (mdn != null)
    			resellerSuspendSubscriberType.setMdn(mdn);
    		if (meid != null)
    			resellerSuspendSubscriberType.setMeid(meid);
    		if (min != null)
    			resellerSuspendSubscriberType.setMin(min);
    		if (serviceZipCode != null)
    			resellerSuspendSubscriberType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerSuspendSubscriberType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerSuspendSubscriberType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerSuspendSubscriberType invalid", e);
    	}
    	return resellerSuspendSubscriberType;
    }

    public static ResellerSubOrderBaseType createResellerSubOrderBaseType(final ZipCodeType serviceZipCode,
    		                                                              final SubReferenceNumberType subReferenceNumber,
    		                                                              final SystemDataType systemData) throws Exception {
    	ResellerSubOrderBaseType resellerSubOrderBaseType = new ResellerSubOrderBaseType();
    	try {
    		if (serviceZipCode != null)
    			resellerSubOrderBaseType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerSubOrderBaseType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerSubOrderBaseType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerSubOrderBaseType invalid", e);
    	}
    	return resellerSubOrderBaseType;
    }

    public static ReasonCodeType createReasonCodeType(final String description, final String old, final String value) throws Exception {
    	ReasonCodeType reasonCodeType = new ReasonCodeType();
    	try {
    		if (description != null)
    		    reasonCodeType.setDescription(description);
    		if (old != null)
    			reasonCodeType.setOld(old);
    		if (value != null)
    			reasonCodeType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("ReasonCodeType invalid", e);
    	}
    	return reasonCodeType;
    }

    public static ResellerLineInquiryType createResellerLineInquiryType(final MdnType mdn,
    		                                                            final String min,
    		                                                            final ZipCodeType serviceZipCode,
    		                                                            final SubReferenceNumberType subReferenceNumber,
    		                                                            final SystemDataType systemData) throws Exception {
    	ResellerLineInquiryType resellerLineInquiryType = new ResellerLineInquiryType();
    	try {
    		if (mdn != null)
    			resellerLineInquiryType.setMdn(mdn);
    		if (min != null)
    			resellerLineInquiryType.setMin(min);
    		if (serviceZipCode != null)
    			resellerLineInquiryType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerLineInquiryType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerLineInquiryType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerLineInquiryType invalid", e);
    	}
    	return resellerLineInquiryType;
    }

    public static PhoneType createPhoneType(final String old, final String value) throws Exception {
    	PhoneType phoneType = new PhoneType();
    	try {
    		if (old != null)
    		    phoneType.setOld(old);
    		if (value != null)
    			phoneType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("PhoneType invalid", e);
    	}
    	return phoneType;
    }

    public static UpdatePortInType createUpdatePortInType(final XMLGregorianCalendar desiredDueDate,
    		                                              final String deviceId,
    		                                              final MdnType mdn,
    		                                              final ReferenceNumberType originalRefNumber,
    		                                              final OasString160Type remark,
    		                                              final ZipCodeType serviceZipCode,
    		                                              final SubReferenceNumberType subReferenceNumber,
    		                                              final SystemDataType systemData,
    		                                              final String updateType) throws Exception {
    	UpdatePortInType updatePortInType = new UpdatePortInType();
    	try {
    		if (desiredDueDate != null)
    			updatePortInType.setDesiredDueDate(desiredDueDate);
    		if (deviceId != null)
    			updatePortInType.setDeviceId(deviceId);
    		if (mdn != null)
    			updatePortInType.setMdn(mdn);
    		if (originalRefNumber != null)
    			updatePortInType.setOriginalRefNumber(originalRefNumber);
    		if (remark != null)
    			updatePortInType.setRemark(remark);
    		if (serviceZipCode != null)
    			updatePortInType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			updatePortInType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			updatePortInType.setSystemData(systemData);
    		if (updateType != null)
    			updatePortInType.setUpdateType(updateType);
    	}
    	catch (Exception e) {
    		throw new Exception("UpdatePortInType invalid", e);
    	}
    	return updatePortInType;
    }

    public static ResellerHBQualificationInfoType createResellerHBQualificationInfoType(final OasString120Type addressLine,
    		                                                                            final OasString100Type city,
    		                                                                            final ZipCodeType serviceZipCode,
    		                                                                            final StateType state,
    		                                                                            final SubReferenceNumberType subReferenceNumber,
    		                                                                            final SystemDataType systemData,
    		                                                                            final ZipCodeType zip) throws Exception {
    	ResellerHBQualificationInfoType resellerHBQualificationInfoType = new ResellerHBQualificationInfoType();
    	try {
    		if (addressLine != null)
    			resellerHBQualificationInfoType.setAddressLine(addressLine);
    		if (city != null)
    			resellerHBQualificationInfoType.setCity(city);
    		if (serviceZipCode != null)
    			resellerHBQualificationInfoType.setServiceZipCode(serviceZipCode);
    		if (state != null)
    			resellerHBQualificationInfoType.setState(state);
    		if (subReferenceNumber != null)
    			resellerHBQualificationInfoType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerHBQualificationInfoType.setSystemData(systemData);
    		if (zip != null)
    			resellerHBQualificationInfoType.setZip(zip);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerHBQualificationInfoType invalid", e);
    	}
    	return resellerHBQualificationInfoType;
    }

    public static ResellerHotlineSubscriberType createResellerHotlineSubscriberType(final String esn,
    		                                                                        final PhoneType hotline,
    		                                                                        final PhoneType hotlineNumber,
    		                                                                        final OasStringType hotlineType,
    		                                                                        final LdcOrIecType iec,
    		                                                                        final LdcOrIecType ldc,
    		                                                                        final MdnType mdn,
    		                                                                        final String meid,
    		                                                                        final String min,
    		                                                                        final ReasonCodeType reasonCode,
    		                                                                        final ZipCodeType serviceZipCode,
    		                                                                        final SubReferenceNumberType subReferenceNumber,
    		                                                                        final SystemDataType systemData) throws Exception {
    	ResellerHotlineSubscriberType resellerHotlineSubscriberType = new ResellerHotlineSubscriberType(); 
    	try {
    		if (esn != null)
    			resellerHotlineSubscriberType.setEsn(esn);
    		if (hotline != null)
    			resellerHotlineSubscriberType.setHotline(hotline);
    		if (hotlineNumber != null)
    			resellerHotlineSubscriberType.setHotlineNumber(hotlineNumber);
    		if (hotlineType != null)
    			resellerHotlineSubscriberType.setHotlineType(hotlineType);
    		if (iec != null)
    			resellerHotlineSubscriberType.setIec(iec);
    		if (ldc != null)
    			resellerHotlineSubscriberType.setLdc(ldc);
    		if (mdn != null)
    			resellerHotlineSubscriberType.setMdn(mdn);
    		if (meid != null)
    			resellerHotlineSubscriberType.setMeid(meid);
    		if (min != null)
    			resellerHotlineSubscriberType.setMin(min);
    		if (reasonCode != null)
    			resellerHotlineSubscriberType.setReasonCode(reasonCode);
    		if (serviceZipCode != null)
    			resellerHotlineSubscriberType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerHotlineSubscriberType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerHotlineSubscriberType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerHotlineSubscriberType invalid", e);
    	}
    	return resellerHotlineSubscriberType;
    }

    public static ResellerRestoreSubscriberType createResellerRestoreSubscriberType(final String esn,
    		                                                                        final MdnType mdn,
    		                                                                        final String meid,
    		                                                                        final String min,
    		                                                                        final ZipCodeType serviceZipCode,
    		                                                                        final SubReferenceNumberType subReferenceNumber,
    		                                                                        final SystemDataType systemData) throws Exception {
    	ResellerRestoreSubscriberType resellerRestoreSubscriberType = new ResellerRestoreSubscriberType();
    	try {
    		if (esn != null)
    			resellerRestoreSubscriberType.setEsn(esn);
    		if (mdn != null)
    			resellerRestoreSubscriberType.setMdn(mdn);
    		if (meid != null)
    			resellerRestoreSubscriberType.setMeid(meid);
    		if (min != null)
    			resellerRestoreSubscriberType.setMin(min);
    		if (serviceZipCode != null)
    			resellerRestoreSubscriberType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerRestoreSubscriberType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerRestoreSubscriberType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerRestoreSubscriberType invalid", e);
    	}
    	return resellerRestoreSubscriberType;
    }

    public static SIMCardWithOldSIMCardType createSIMCardWithOldSIMCardType(final String old, final String value) throws Exception {
    	SIMCardWithOldSIMCardType sIMCardWithOldSIMCardType = new SIMCardWithOldSIMCardType();
    	try {
    		if (old != null)
    		    sIMCardWithOldSIMCardType.setOld(old);
    		if (value != null)
    		    sIMCardWithOldSIMCardType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("SIMCardWithOldSIMCardType invalid", e);
    	}
    	return sIMCardWithOldSIMCardType;
    }

    public static DeviceIdWithOldDeviceIdType createDeviceIdWithOldDeviceIdType(final String old, final String value) throws Exception {
    	DeviceIdWithOldDeviceIdType deviceIdWithOldDeviceIdType = new DeviceIdWithOldDeviceIdType();
    	try {
    		if (old != null)
    		    deviceIdWithOldDeviceIdType.setOld(old);
    		if (value != null)
    		    deviceIdWithOldDeviceIdType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("DeviceIdWithOldDeviceIdType invalid", e);
    	}
    	return deviceIdWithOldDeviceIdType;
    }

    public static ResellerPRLInquiryType createResellerPRLInquiryType(final String esn,
    		                                                          final MdnType mdn,
    		                                                          final String meid,
    		                                                          final String min,
    		                                                          final ZipCodeType serviceZipCode,
    		                                                          final SubReferenceNumberType subReferenceNumber,
    		                                                          final SystemDataType systemData) throws Exception {
    	ResellerPRLInquiryType resellerPRLInquiryType = new ResellerPRLInquiryType();
    	try {
    		if (esn != null)
    			resellerPRLInquiryType.setEsn(esn);
    		if (mdn != null)
    			resellerPRLInquiryType.setMdn(mdn);
    		if (meid != null)
    			resellerPRLInquiryType.setMeid(meid);
    		if (min != null)
    			resellerPRLInquiryType.setMin(min);
    		if (serviceZipCode != null)
    			resellerPRLInquiryType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerPRLInquiryType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerPRLInquiryType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerPRLInquiryType invalid", e);
    	}
    	return resellerPRLInquiryType;
    }

    public static SsnOrTaxIdType createSsnOrTaxIdType(final OasStringType ssn, final OasStringType taxId) throws Exception {
    	SsnOrTaxIdType ssnOrTaxIdType = new SsnOrTaxIdType();
    	try {
    		if (ssn != null)
    		    ssnOrTaxIdType.setSsn(ssn);
    		if (taxId != null)
    			ssnOrTaxIdType.setTaxId(taxId);
    	}
    	catch (Exception e) {
    		throw new Exception("SsnOrTaxIdType invalid", e);
    	}
    	return ssnOrTaxIdType;
    }

    public static EsnWithOldEsnType createEsnWithOldEsnType(final String old, final String value) throws Exception {
    	EsnWithOldEsnType esnWithOldEsnType = new EsnWithOldEsnType();
    	try {
    		if (old != null)
    		    esnWithOldEsnType.setOld(old);
    		if (value != null)
    		    esnWithOldEsnType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("EsnWithOldEsnType invalid", e);
    	}
    	return esnWithOldEsnType;
    }

    public static MdnType createMdnType(final String type, final String value) throws Exception {
    	MdnType mdnType = new MdnType();
    	try {
    		if (type != null)
    		    mdnType.setType(type);
    		if (value != null)
    		    mdnType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("MdnType invalid", e);
    	}
    	return mdnType;
    }

    public static AddDeleteType createAddDeleteType(final String old, final String value) throws Exception {
    	AddDeleteType addDeleteType = new AddDeleteType();
    	try {
    		if (old != null)
    		    addDeleteType.setOld(old);
    		if (value != null)
    			addDeleteType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("AddDeleteType invalid", e);
    	}
    	return addDeleteType;
    }

    public static ResellerChangeSIMType createResellerChangeSIMType(final SIMCardWithOldSIMCardType iccid,
    		                                                        final MdnType mdn,
    		                                                        final ZipCodeType serviceZipCode,
    		                                                        final SubReferenceNumberType subReferenceNumber,
    		                                                        final SystemDataType systemData) throws Exception {
    	ResellerChangeSIMType resellerChangeSIMType = new ResellerChangeSIMType();
    	try {
    		if (iccid != null)
    			resellerChangeSIMType.setIccid(iccid);
    		if (mdn != null)
    			resellerChangeSIMType.setMdn(mdn);
    		if (serviceZipCode != null)
    			resellerChangeSIMType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerChangeSIMType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerChangeSIMType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerChangeSIMType invalid", e);
    	}
    	return resellerChangeSIMType;
    }

    public static ValidateDeviceType createValidateDeviceType(final String deviceId,
    		                                                  final OasStringType planCode,
    		                                                  final ZipCodeType serviceZipCode,
    		                                                  final SubReferenceNumberType subReferenceNumber, 
    		                                                  final SystemDataType systemData) throws Exception {
    	ValidateDeviceType validateDeviceType = new ValidateDeviceType();
    	try {
    		if (deviceId != null)
    			validateDeviceType.setDeviceId(deviceId);
    		if (planCode != null)
    			validateDeviceType.setPlanCode(planCode);
    		if (serviceZipCode != null)
    			validateDeviceType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			validateDeviceType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			validateDeviceType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ValidateDeviceType invalid", e);
    	}
    	return validateDeviceType;
    }

    public static OasString100Type createOasString100Type(final String old, final String value) throws Exception {
    	OasString100Type oasString100Type = new OasString100Type();
    	try {
    		if (old != null)
    			oasString100Type.setOld(old.substring(0, 100));
    		if (value != null)
    			oasString100Type.setValue(value.substring(0, 100));
    	}
    	catch (Exception e) {
    		throw new Exception("OasString100Type invalid", e);
    	}
    	return oasString100Type;
    }

    public static OspAccountNoType createOspAccountNoType(final String old, final String value) throws Exception {
    	OspAccountNoType ospAccountNoType = new OspAccountNoType();
    	try {
    		if (old != null)
    			ospAccountNoType.setOld(old);
    		if (value != null)
    		    ospAccountNoType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("OspAccountNoType invalid", e);
    	}
    	return ospAccountNoType;
    }

    public static AddressInfoType createAddressInfoType(final OasString120Type addressLine,
    		                                            final DirectionalIndicatorType azimuth,
    		                                            final OasString100Type city,
    		                                            final String qualification,
    		                                            final OasString500Type qualificationDesc,
    		                                            final StateType state,
    		                                            final ZipCodeType zip) throws Exception {
    	AddressInfoType addressInfoType = new AddressInfoType();
    	try {
    		if (addressLine != null)
    			addressInfoType.setAddressLine(addressLine);
    		if (azimuth != null)
    			addressInfoType.setAzimuth(azimuth);
    		if (city != null)
    			addressInfoType.setCity(city);
    		if (qualification != null)
    			addressInfoType.setQualification(qualification);
    		if (qualificationDesc != null)
    			addressInfoType.setQualificationDesc(qualificationDesc);
    		if (state != null)
    			addressInfoType.setState(state);
    		if (zip != null)
    			addressInfoType.setZip(zip);
    	}
    	catch (Exception e) {
    		throw new Exception("AddressInfoType invalid", e);
    	}
    	return addressInfoType;
    }

    public static ResellerReserveMDNType createResellerReserveMDNType(final NextAvailableReserveMDNType nextAvailableMDN,
    		                                                          final ZipCodeType serviceZipCode,
    		                                                          final SubReferenceNumberType subReferenceNumber,
    		                                                          final SystemDataType systemData) throws Exception {
    	ResellerReserveMDNType resellerReserveMDNType = new ResellerReserveMDNType();
    	try {
    		if (nextAvailableMDN != null)
    		    resellerReserveMDNType.setNextAvailableMDN(nextAvailableMDN);
    		if (serviceZipCode != null)
    		    resellerReserveMDNType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    		    resellerReserveMDNType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    		    resellerReserveMDNType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerReserveMDNType invalid", e);
    	}
    	return resellerReserveMDNType;
    }

    public static NextAvailableReserveMDNType createNextAvailableReserveMDNType(final NpaNxxType npaNxx,
    		                                                                    final ZipCodeType zipCode) throws Exception {
    	NextAvailableReserveMDNType nextAvailableReserveMDNType = new NextAvailableReserveMDNType();
    	try {
    		if (npaNxx != null)
    			nextAvailableReserveMDNType.setNpaNxx(npaNxx);
    		if (zipCode != null)
    			nextAvailableReserveMDNType.setZipCode(zipCode);
    	}
    	catch (Exception e) {
    		throw new Exception("NextAvailableReserveMDNType invalid", e);
    	}
    	return nextAvailableReserveMDNType;
    }

    public static YesNoType createYesNoType(final String old, final String value) throws Exception {
    	YesNoType yesNoType = new YesNoType();
    	try {
    		if (old != null)
    		    yesNoType.setOld(value);
    		if (value != null)
    			yesNoType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("YesNoType invalid", e);
    	}
    	return yesNoType;
    }

    public static ResellerResetFeatureType createResellerResetFeatureType(final OasStringType featureCode,
    		                                                              final MdnType mdn,
    		                                                              final OasStringType password,
    		                                                              final Integer resetId,
    		                                                              final ZipCodeType serviceZipCode,
    		                                                              final SubReferenceNumberType subReferenceNumber,
    		                                                              final SystemDataType systemData) throws Exception {
    	ResellerResetFeatureType resellerResetFeatureType = new ResellerResetFeatureType();
    	try {
    		if (featureCode != null)
    			resellerResetFeatureType.setFeatureCode(featureCode);
    		if (mdn != null)
    			resellerResetFeatureType.setMdn(mdn);
    		if (password != null)
    			resellerResetFeatureType.setPassword(password);
    		if (resetId != null)
    			resellerResetFeatureType.setResetId(resetId);
    		if (serviceZipCode != null)
    			resellerResetFeatureType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerResetFeatureType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerResetFeatureType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerResetFeatureType invalid", e);
    	}
    	return resellerResetFeatureType;
    }
    
    public static StateType createStateType(final String old, final String value) throws Exception {
    	StateType stateType = new StateType();
    	try {
    		if (old != null)
    			stateType.setOld(old);
    		if (value != null)
    			stateType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("StateType invalid", e);
    	}
    	return stateType;
    }

    public static ZipCodeType createZipCodeType(final String old, final String value) throws Exception {
    	ZipCodeType zipCodeType = new ZipCodeType();
    	try {
    		if (old != null)
    		    zipCodeType.setOld(old);
    		if (value != null)
    			zipCodeType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("ZipCodeType invalid", e);
    	}
    	return zipCodeType;
    }

    public static FeatureRPType createFeatureRPType(final OasStringType featureCode,
    		                                        final IncludedWithPlanType includedWithPlan,
    		                                        final AddDeleteType subscribe) throws Exception {
    	FeatureRPType featureRPType = new FeatureRPType();
    	try {
    		if (featureCode != null)
    			featureRPType.setFeatureCode(featureCode);
    		if (includedWithPlan != null)
    			featureRPType.setIncludedWithPlan(includedWithPlan);
    		if (subscribe != null)
    			featureRPType.setSubscribe(subscribe);
    	}
    	catch (Exception e) {
    		throw new Exception("FeatureRPType invalid", e);
    	}
    	return featureRPType;
    }

    public static OasString10Type createOasString10Type(final String old, final String value) throws Exception {
    	OasString10Type oasString10Type = new OasString10Type();
    	try {
    		if (old != null)
    		    oasString10Type.setOld(old.substring(0, 10));
    		if (value != null)
    			oasString10Type.setValue(value.substring(0, 10));
    	}
    	catch (Exception e) {
    		throw new Exception("OasString10Type invalid", e);
    	}
    	return oasString10Type;
    }

    public static ReferenceNumberType createReferenceNumberType(final String old, final String value) throws Exception {
    	ReferenceNumberType referenceNumberType = new ReferenceNumberType();
    	try {
    		if (old != null)
    		    referenceNumberType.setOld(old);
    		if (value != null)
    		    referenceNumberType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("ReferenceNumberType invalid");
    	}
    	return referenceNumberType;
    }

    public static ResellerChangeNumberType createResellerChangeNumberType(final String esn,
    		                                                              final YesNoType fUSFExemptFlag,
    		                                                              final LdcOrIecType iec,
    		                                                              final LdcOrIecType ldc,
    		                                                              final MdnWithOldMdnType mdn,
    		                                                              final String meid,
    		                                                              final MinWithOldMinType min,
    		                                                              final NextAvailablewithOldMDNType nextAvailableMDN,
    		                                                              final ZipCodeType serviceZipCode,
    		                                                              final SubReferenceNumberType subReferenceNumber,
    		                                                              final SystemDataType systemData) throws Exception {
    	ResellerChangeNumberType resellerChangeNumberType = new ResellerChangeNumberType();
    	try {
    		if (esn != null)
    			resellerChangeNumberType.setEsn(esn);
    		if (fUSFExemptFlag != null)
    			resellerChangeNumberType.setFUSFExemptFlag(fUSFExemptFlag);
    		if (iec != null)
    			resellerChangeNumberType.setIec(iec);
    		if (ldc != null)
    			resellerChangeNumberType.setLdc(ldc);
    		if (mdn != null)
    			resellerChangeNumberType.setMdn(mdn);
    		if (meid != null)
    			resellerChangeNumberType.setMeid(meid);
    		if (min != null)
    			resellerChangeNumberType.setMin(min);
    		if (nextAvailableMDN != null)
    			resellerChangeNumberType.setNextAvailableMDN(nextAvailableMDN);
    		if (serviceZipCode != null)
    			resellerChangeNumberType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerChangeNumberType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerChangeNumberType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerChangeNumberType invalid", e);
    	}
    	return resellerChangeNumberType;
    }

    public static NextAvailableMDNType createNextAvailableMDNType(final CityType city,
    	                                                          final NpaNxxType npaNxx,
    	                                                          final StateType state,
    	                                                          final ZipCodeType zipCode) throws Exception {
    	NextAvailableMDNType nextAvailableMDNType = new NextAvailableMDNType();
    	try {
    		if (city != null)
    			nextAvailableMDNType.setCity(city);
    		if (npaNxx != null)
    			nextAvailableMDNType.setNpaNxx(npaNxx);
    		if (state != null)
    			nextAvailableMDNType.setState(state);
    		if (zipCode != null)
    			nextAvailableMDNType.setZipCode(zipCode);
    	}
    	catch (Exception e) {
    		throw new Exception("NextAvailableMDNType invalid", e);
    	}
    	return nextAvailableMDNType;
    }

    public static ResellerAddHotlineSubscriberType createResellerAddHotlineSubscriberType(final CompetitorCodeType competitorCode,
    		                                                                              final String deviceId,
    		                                                                              final String esn,
    		                                                                              final YesNoType fUSFExemptFlag,
    		                                                                              final String globalSIMCard,
    		                                                                              final PhoneType hotline,
    		                                                                              final PhoneType hotlineNumber,
    		                                                                              final OasStringType hotlineType,
    		                                                                              final String iccid,
    		                                                                              final LdcOrIecType iec,
    		                                                                              final LdcOrIecType ldc,
    		                                                                              final MdnType mdn,
    		                                                                              final String meid,
    		                                                                              final String min,
    		                                                                              final OasStringType mobileIPAddress,
    		                                                                              final OasStringType mPNPoolName,
    		                                                                              final NextAvailableMDNType nextAvailableMDN,
    		                                                                              final PlanType plan,
    		                                                                              final ReasonCodeType reasonCode,
    		                                                                              final ZipCodeType serviceZipCode,
    		                                                                              final OasStringType subOrgID,
    		                                                                              final SubReferenceNumberType subReferenceNumber,
    		                                                                              final SystemDataType systemData) throws Exception {
    	ResellerAddHotlineSubscriberType resellerAddHotlineSubscriberType = new ResellerAddHotlineSubscriberType();
    	try {
    		if (competitorCode != null)
    			resellerAddHotlineSubscriberType.setCompetitorCode(competitorCode);
    		if (deviceId != null)
    			resellerAddHotlineSubscriberType.setDeviceId(deviceId);
    		if (esn != null)
    			resellerAddHotlineSubscriberType.setEsn(esn);
    		if (fUSFExemptFlag != null)
    			resellerAddHotlineSubscriberType.setFUSFExemptFlag(fUSFExemptFlag);
    		if (globalSIMCard != null)
    			resellerAddHotlineSubscriberType.setGlobalSIMCard(globalSIMCard);
    		if (hotline != null)
    			resellerAddHotlineSubscriberType.setHotline(hotline);
    		if (hotlineNumber != null)
    			resellerAddHotlineSubscriberType.setHotlineNumber(hotlineNumber);
    		if (hotlineType != null)
    			resellerAddHotlineSubscriberType.setHotlineType(hotlineType);
    		if (iccid != null)
    			resellerAddHotlineSubscriberType.setIccid(iccid);
    		if (iec != null)
    			resellerAddHotlineSubscriberType.setIec(iec);
    		if (ldc != null)
    			resellerAddHotlineSubscriberType.setLdc(ldc);
    		if (mdn != null)
    			resellerAddHotlineSubscriberType.setMdn(mdn);
    		if (meid != null)
    			resellerAddHotlineSubscriberType.setMeid(meid);
    		if (min != null)
    			resellerAddHotlineSubscriberType.setMin(min);
    		if (mobileIPAddress != null)
    			resellerAddHotlineSubscriberType.setMobileIPAddress(mobileIPAddress);
    		if (mPNPoolName != null)
    			resellerAddHotlineSubscriberType.setMPNPoolName(mPNPoolName);
    		if (nextAvailableMDN != null)
    			resellerAddHotlineSubscriberType.setNextAvailableMDN(nextAvailableMDN);
    		if (plan != null)
    			resellerAddHotlineSubscriberType.setPlan(plan);
    		if (reasonCode != null)
    			resellerAddHotlineSubscriberType.setReasonCode(reasonCode);
    		if (serviceZipCode != null)
    			resellerAddHotlineSubscriberType.setServiceZipCode(serviceZipCode);
    		if (subOrgID != null)
    			resellerAddHotlineSubscriberType.setSubOrgID(subOrgID);
    		if (subReferenceNumber != null)
    			resellerAddHotlineSubscriberType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerAddHotlineSubscriberType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerAddHotlineSubscriberType invalid", e);
    	}
    	return resellerAddHotlineSubscriberType;
    }

    public static PlanType createPlanType(final OasStringType value) throws Exception {
    	PlanType planType = new PlanType();
    	try {
    		if (value != null)
    		    planType.setPlanCode(value);
    	}
    	catch (Exception e) {
    		throw new Exception("PlanType invalid", e);
    	}
    	return planType;
    }

    public static SystemDataType createSystemDataType(final OasStringType areaName,
    		                                          final OasStringType bta,
    		                                          final OasStringType databaseID,
    		                                          final OasStringType fulfillment,
    		                                          final OasStringType marketCode,
    		                                          final OasStringType msa,
    		                                          final OasStringType regionCode,
    		                                          final OasStringType serviceCity,
    		                                          final StateType serviceState,
    		                                          final ZipCodeType serviceZipCode) throws Exception {
    	SystemDataType systemDataType = new SystemDataType();
    	try {
    		if (areaName != null) 
    		    systemDataType.setAreaName(areaName);
    		if (bta != null)
    			systemDataType.setBta(bta);
    		if (databaseID != null)
    			systemDataType.setDatabaseID(databaseID);
    		if (fulfillment != null)
    			systemDataType.setFulfillment(fulfillment);
    		if (marketCode != null)
    			systemDataType.setMarketCode(marketCode);
    		if (msa != null)
    			systemDataType.setMsa(msa);
    		if (regionCode != null)
    			systemDataType.setRegionCode(regionCode);
    		if (serviceCity != null)
    			systemDataType.setServiceCity(serviceCity);
    		if (serviceState != null)
    			systemDataType.setServiceState(serviceState);
    		if (serviceZipCode != null)
    			systemDataType.setServiceZipCode(serviceZipCode);
    	}
    	catch (Exception e) {
    		throw new Exception("SystemDataType invalid", e);
    	}
    	return systemDataType;
    }

    public static ResellerSubscribeFeatureType createResellerSubscribeFeatureType(final String esn,
    		                                                                      final YesNoType fUSFExemptFlag,
    		                                                                      final String globalSIMCard,
    		                                                                      final LdcOrIecType iec,
    		                                                                      final MdnType mdn,
    		                                                                      final String meid,
    		                                                                      final String min,
    		                                                                      final OasStringType mobileIPAddress,
    		                                                                      final OasStringType mPNPoolName,
    		                                                                      final String oldGlobalSIMCard,
    		                                                                      final ZipCodeType serviceZipCode,
    		                                                                      final OasStringType subOrgID,
    		                                                                      final SubReferenceNumberType subReferenceNumber,
    		                                                                      final SystemDataType systemData) throws Exception {
    	ResellerSubscribeFeatureType resellerSubscribeFeatureType = new ResellerSubscribeFeatureType();
    	try {
    		resellerSubscribeFeatureType.setEsn(esn);
    		resellerSubscribeFeatureType.setFUSFExemptFlag(fUSFExemptFlag);
    		resellerSubscribeFeatureType.setGlobalSIMCard(globalSIMCard);
    		resellerSubscribeFeatureType.setIec(iec);
    		resellerSubscribeFeatureType.setMdn(mdn);
    		resellerSubscribeFeatureType.setMeid(meid);
    		resellerSubscribeFeatureType.setMin(min);
    		resellerSubscribeFeatureType.setMobileIPAddress(mobileIPAddress);
    		resellerSubscribeFeatureType.setMPNPoolName(mPNPoolName);
    		resellerSubscribeFeatureType.setOldGlobalSIMCard(oldGlobalSIMCard);
    		resellerSubscribeFeatureType.setServiceZipCode(serviceZipCode);
    		resellerSubscribeFeatureType.setSubOrgID(subOrgID);
    		resellerSubscribeFeatureType.setSubReferenceNumber(subReferenceNumber);
    		resellerSubscribeFeatureType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerSubscribeFeatureType invalid", e);
    	}
    	return resellerSubscribeFeatureType;
    }

    public static ResellerAddHotlineSubscriberByESNType createResellerAddHotlineSubscriberByESNType(final CompetitorCodeType competitorCode,
    		                                                                                        final String esn,
    		                                                                                        final YesNoType fUSFExemptFlag,
    		                                                                                        final PhoneType hotline,
    		                                                                                        final PhoneType hotlineNumber,
    		                                                                                        final OasStringType hotlineType,
    		                                                                                        final LdcOrIecType iec,
    		                                                                                        final LdcOrIecType ldc,
    		                                                                                        final String meid,
    		                                                                                        final OasStringType mobileIPAddress,
    		                                                                                        final OasStringType mPNPoolName,
    		                                                                                        final PlanType plan,
    		                                                                                        final ReasonCodeType reasonCode,
    		                                                                                        final ZipCodeType serviceZipCode,
    		                                                                                        final OasStringType subOrgID,
    		                                                                                        final SubReferenceNumberType subReferenceNumber,
    		                                                                                        final SystemDataType systemData) throws Exception {
    	ResellerAddHotlineSubscriberByESNType resellerAddHotlineSubscriberByESNType = new ResellerAddHotlineSubscriberByESNType();
    	try {
    		if (competitorCode != null)
    		    resellerAddHotlineSubscriberByESNType.setCompetitorCode(competitorCode);
    		if (esn != null)
    		    resellerAddHotlineSubscriberByESNType.setEsn(esn);
    		if (fUSFExemptFlag != null)
    			resellerAddHotlineSubscriberByESNType.setFUSFExemptFlag(fUSFExemptFlag);
    		if (hotline != null)
    			resellerAddHotlineSubscriberByESNType.setHotline(hotline);
    		if (hotlineNumber != null)
    			resellerAddHotlineSubscriberByESNType.setHotlineNumber(hotlineNumber);
    		if (hotlineType != null)
    			resellerAddHotlineSubscriberByESNType.setHotlineType(hotlineType);
    		if (iec != null)
    			resellerAddHotlineSubscriberByESNType.setIec(iec);
    		if (ldc != null)
    			resellerAddHotlineSubscriberByESNType.setLdc(ldc);
    		if (meid != null)
    			resellerAddHotlineSubscriberByESNType.setMeid(meid);
    		if (mobileIPAddress != null)
    			resellerAddHotlineSubscriberByESNType.setMobileIPAddress(mobileIPAddress);
    		if (mPNPoolName != null)
    			resellerAddHotlineSubscriberByESNType.setMPNPoolName(mPNPoolName);
    		if (plan != null)
    			resellerAddHotlineSubscriberByESNType.setPlan(plan);
    		if (reasonCode != null)
    			resellerAddHotlineSubscriberByESNType.setReasonCode(reasonCode);
    		if (serviceZipCode != null)
    			resellerAddHotlineSubscriberByESNType.setServiceZipCode(serviceZipCode);
    		if (subOrgID != null)
    			resellerAddHotlineSubscriberByESNType.setSubOrgID(subOrgID);
    		if (subReferenceNumber != null)
    			resellerAddHotlineSubscriberByESNType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    		    resellerAddHotlineSubscriberByESNType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerAddHotlineSubscriberByESNType invalid", e);
    	}
    	return resellerAddHotlineSubscriberByESNType;
    }

    public static ResellerAddSubscriberPortInType createResellerAddSubscriberPortInType(final String deviceId,
    		                                                                            final String esn,
    		                                                                            final YesNoType fUSFExemptFlag,
    		                                                                            final String globalSIMCard,
    		                                                                            final String iccid,
    		                                                                            final LdcOrIecType iec,
    		                                                                            final LdcOrIecType ldc,
    		                                                                            final LnpType lnp,
    		                                                                            final MdnType mdn,
    		                                                                            final String meid,
    		                                                                            final String min,
    	 	                                                                            final OasStringType mobileIPAddress,
    		                                                                            final OasStringType mPNPoolName,
    		                                                                            final PlanType plan,
    		                                                                            final YesNoType portInFlag,
    		                                                                            final ZipCodeType serviceZipCode,
    		                                                                            final OasStringType subOrgID,
    		                                                                            final SubReferenceNumberType subReferenceNumber,
    		                                                                            final SystemDataType systemData) throws Exception {
    	ResellerAddSubscriberPortInType resellerAddSubscriberPortInType = new ResellerAddSubscriberPortInType();
    	try {
    		if (deviceId != null)
    			resellerAddSubscriberPortInType.setDeviceId(deviceId);
    		if (esn != null)
    			resellerAddSubscriberPortInType.setEsn(esn);
    		if (fUSFExemptFlag != null)
    			resellerAddSubscriberPortInType.setFUSFExemptFlag(fUSFExemptFlag);
    		if (globalSIMCard != null)
    			resellerAddSubscriberPortInType.setGlobalSIMCard(globalSIMCard);
    		if (iccid != null)
    			resellerAddSubscriberPortInType.setIccid(iccid);
    		if (iec != null)
    			resellerAddSubscriberPortInType.setIec(iec);
    		if (ldc != null)
    			resellerAddSubscriberPortInType.setLdc(ldc);
    		if (lnp != null)
    			resellerAddSubscriberPortInType.setLnp(lnp);
    		if (mdn != null)
    			resellerAddSubscriberPortInType.setMdn(mdn);
    		if (meid != null)
    			resellerAddSubscriberPortInType.setMeid(meid);
    		if (min != null)
    			resellerAddSubscriberPortInType.setMin(min);
    		if (mobileIPAddress != null)
    			resellerAddSubscriberPortInType.setMobileIPAddress(mobileIPAddress);
    		if (mPNPoolName != null)
    			resellerAddSubscriberPortInType.setMPNPoolName(mPNPoolName);
    		if (portInFlag != null)
    			resellerAddSubscriberPortInType.setPlan(plan);
    		if (plan != null)
    			resellerAddSubscriberPortInType.setPortInFlag(portInFlag);
    		if (serviceZipCode != null)
    			resellerAddSubscriberPortInType.setServiceZipCode(serviceZipCode);
    		if (subOrgID != null)
    			resellerAddSubscriberPortInType.setSubOrgID(subOrgID);
    		if (subReferenceNumber != null)
    			resellerAddSubscriberPortInType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerAddSubscriberPortInType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerAddSubscriberPortInType invalid", e);
    	}
    	return resellerAddSubscriberPortInType;
    }

    public static PinType createPinType(final String old, final String value) throws Exception {
    	PinType pinType = new PinType();
    	try {
    		if (old != null)
    		    pinType.setOld(old);
    		if (value != null)
    			pinType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("PinType invalid", e);
    	}
    	return pinType;
    }

    public static ResellerValidateMDNPortabilityType createResellerValidateMDNPortabilityType(final MdnType mdn,
    		                                                                                  final ZipCodeType serviceZipCode,
                                                                                              final SubReferenceNumberType subReferenceNumber,
                                                                                              final SystemDataType systemData) throws Exception {
    	ResellerValidateMDNPortabilityType resellerValidateMDNPortabilityType = new ResellerValidateMDNPortabilityType();
    	try {
    		if (mdn != null)
    		    resellerValidateMDNPortabilityType.setMdn(mdn);
    		if (serviceZipCode != null)
    		    resellerValidateMDNPortabilityType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    		    resellerValidateMDNPortabilityType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    		    resellerValidateMDNPortabilityType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ReesellerValidateMDNPortabilityType invalid", e);
    	}
    	return resellerValidateMDNPortabilityType;
    }

    public static ResellerAddSubscriberType createResellerAddSubscriberType(final ZipCodeType serviceZipCode,
    		                                                                final SubReferenceNumberType subReferenceNumber,
                                                                            final SystemDataType systemData) throws Exception {
    	ResellerAddSubscriberType resellerAddSubscriberType = new ResellerAddSubscriberType();
    	try {
    		if (serviceZipCode != null)
    		    resellerAddSubscriberType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    		    resellerAddSubscriberType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    		    resellerAddSubscriberType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerAddSubscriberType invalid", e);
    	}
    	return resellerAddSubscriberType;
    }

    public static OasDecimalType createOasDecimalType(final BigDecimal old, final BigDecimal value) throws Exception {
    	OasDecimalType oasDecimalType = new OasDecimalType();
    	try { 
    		if (old != null)
    		    oasDecimalType.setOld(old);
    		if (value != null)
    		    oasDecimalType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("OasDecimalType invalid", e);
    	}
    	return oasDecimalType;
    }

    public static RatePlanType createRatePlanType(final PlanType plan) throws Exception {
    	RatePlanType ratePlanType = new RatePlanType();
    	try {
    		if (plan != null)
    		    ratePlanType.setPlan(plan);
    	}
    	catch (Exception e) {
    		throw new Exception("RatePlanType invalid", e);
    	}
    	return ratePlanType;
    }

    public static MinWithOldMinType createMinWithOldMinType(final String old, final String value) throws Exception {
    	MinWithOldMinType minWithOldMinType = new MinWithOldMinType();
    	try {
    		if (old != null)
    		    minWithOldMinType.setOld(old);
    		if (value != null)
    		    minWithOldMinType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("MinWithOldMinType invalid", e);
    	}
    	return minWithOldMinType;
    }

    public static StreetNameType createStreetNameType(final String old, final String value) throws Exception {
    	StreetNameType streetNameType = new StreetNameType();
    	try {
    		if (old != null)
    		    streetNameType.setOld(old);
    		if (value != null)
    		    streetNameType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("StreetNameType invalid", e);
    	}
    	return streetNameType;
    }

    public static NpaNxxType createNpaNxxType(final String type, final String value) throws Exception {
    	NpaNxxType npaNxxType = new NpaNxxType();
    	try {
    		if (type != null)
    		    npaNxxType.setType(type);
    		if (value != null)
    		    npaNxxType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("NpaNxxType invalid", e);
    	}
    	return npaNxxType;
    }

    public static OasString120Type createOasString120Type(final String old, final String value) throws Exception {
    	OasString120Type oasString120Type = new OasString120Type();
    	try {
    		if (old != null)
    		    oasString120Type.setOld(old.substring(0, 120));
    		if (value != null)
    		    oasString120Type.setValue(value.substring(0, 120));
    	}
    	catch (Exception e) {
    		throw new Exception("OasString120Type invalid", e);
    	}
    	return oasString120Type;
    }

    public static ResellerRemoveHotlineType createResellerRemoveHotlineType(final String esn,
    		                                                                final MdnType mdn,
    		                                                                final String meid,
    		                                                                final String min,
    		                                                                final ZipCodeType serviceZipCode,
    		                                                                final SubReferenceNumberType subReferenceNumber,
    		                                                                final SystemDataType systemData) throws Exception {
    	ResellerRemoveHotlineType resellerRemoveHotlineType = new ResellerRemoveHotlineType();
    	try {
    		if (esn != null)
    			resellerRemoveHotlineType.setEsn(esn);
    		if (mdn != null)
    			resellerRemoveHotlineType.setMdn(mdn);
    		if (meid != null)
    			resellerRemoveHotlineType.setMeid(meid);
    		if (min != null)
    			resellerRemoveHotlineType.setMin(min);
    		if (serviceZipCode != null)
    			resellerRemoveHotlineType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    			resellerRemoveHotlineType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerRemoveHotlineType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerRemoveHotlineType invalid", e);
    	}
    	return resellerRemoveHotlineType;
    }

    public static OasString500Type createOasString500Type(final String old, final String value) throws Exception {
    	OasString500Type oasString500Type = new OasString500Type();
    	try {
    		if (old != null)
    		    oasString500Type.setOld(old.substring(0, 500));
    		if (value != null)
    		    oasString500Type.setValue(value.substring(0, 500));
    	}
    	catch (Exception e) {
    		throw new Exception("OasString500Type invalid", e);
    	}
    	return oasString500Type;
    }

    public static ResellerChangeRatePlanType createResellerChangeRatePlanType(final String esn,
    		                                                                  final YesNoType fUSFExemptFlag,
    		                                                                  final String globalSIMCard,
    		                                                                  final MdnType mdn,
    		                                                                  final String meid,
    		                                                                  final String min,
    		                                                                  final OasStringType mobileIPAddress,
    		                                                                  final OasStringType mPNPoolName,
    		                                                                  final String newEsn,
    		                                                                  final String newIccid,
    	 	                                                                  final String newMeid,
    		                                                                  final RatePlanType newRatePlan,
    		                                                                  final RatePlanType oldRatePlan,
    		                                                                  final YesNoType serviceTypeChange,
    		                                                                  final ZipCodeType serviceZipCode,
    		                                                                  final OasStringType subOrgID,
    		                                                                  final SubReferenceNumberType subReferenceNumber,
    		                                                                  final SystemDataType systemData) throws Exception {
    	ResellerChangeRatePlanType resellerChangeRatePlanType = new ResellerChangeRatePlanType();
    	try {
    		if (esn != null)
    			resellerChangeRatePlanType.setEsn(esn);
    		if (fUSFExemptFlag != null)
    			resellerChangeRatePlanType.setFUSFExemptFlag(fUSFExemptFlag);
    		if (globalSIMCard != null)
    			resellerChangeRatePlanType.setGlobalSIMCard(globalSIMCard);
    		if (mdn != null)
    			resellerChangeRatePlanType.setMdn(mdn);
    		if (meid != null)
    			resellerChangeRatePlanType.setMeid(meid);
    		if (min != null)
    			resellerChangeRatePlanType.setMin(min);
    		if (mobileIPAddress != null)
    			resellerChangeRatePlanType.setMobileIPAddress(mobileIPAddress);
    		if (mPNPoolName != null)
    			resellerChangeRatePlanType.setMPNPoolName(mPNPoolName);
    		if (newEsn != null)
    			resellerChangeRatePlanType.setNewEsn(newEsn);
    		if (newIccid != null)
    			resellerChangeRatePlanType.setNewIccid(newIccid);
    		if (newMeid != null)
    			resellerChangeRatePlanType.setNewMeid(newMeid);
    		if (newRatePlan != null)
    			resellerChangeRatePlanType.setNewRatePlan(newRatePlan);
    		if (oldRatePlan != null)
    			resellerChangeRatePlanType.setOldRatePlan(oldRatePlan);
    		if (serviceTypeChange != null)
    			resellerChangeRatePlanType.setServiceTypeChange(serviceTypeChange);
    		if (serviceZipCode != null)
    			resellerChangeRatePlanType.setServiceZipCode(serviceZipCode);
    		if (subOrgID != null)
    			resellerChangeRatePlanType.setSubOrgID(subOrgID);
    		if (subReferenceNumber != null)
    			resellerChangeRatePlanType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    			resellerChangeRatePlanType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerChangeRatePlanType invalid", e);
    	}
    	return resellerChangeRatePlanType;
    }

    public static ResellerDeleteSubscriberType createResellerDeleteSubscriberType(final String esn,
    		                                                                      final MdnType mdn,
    		                                                                      final String meid,
    		                                                                      final String min,
    		                                                                      final ZipCodeType serviceZipCode,
    		                                                                      final SubReferenceNumberType subReferenceNumber,
    		                                                                      final SystemDataType systemData) throws Exception {
    	ResellerDeleteSubscriberType resellerDeleteSubscriberType = new ResellerDeleteSubscriberType();
    	try {
    		if (esn != null)
    		    resellerDeleteSubscriberType.setEsn(esn);
    		if (mdn != null)
    		    resellerDeleteSubscriberType.setMdn(mdn);
    		if (meid != null)
    		    resellerDeleteSubscriberType.setMeid(meid);
    		if (min != null)
    		    resellerDeleteSubscriberType.setMin(min);
    		if (serviceZipCode != null)
    		    resellerDeleteSubscriberType.setServiceZipCode(serviceZipCode);
    		if (subReferenceNumber != null)
    		    resellerDeleteSubscriberType.setSubReferenceNumber(subReferenceNumber);
    		if (systemData != null)
    		    resellerDeleteSubscriberType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerDeleteSubscriberType invalid", e);
    	}
    	return resellerDeleteSubscriberType;
    }

    public static OasStringType createOasStringType(final String old, final String value) throws Exception {
    	OasStringType oasStringType = new OasStringType();
    	try {
    		if (old != null)
    		    oasStringType.setOld(old);
    		if (value != null)
    		    oasStringType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("OasStringType invalid", e);
    	}
    	return oasStringType;
    }

    public static LnpPersonNameType createLnpPersonNameType(final PersonNameType first,
    		                                                final PersonNameType last,
    		                                                final OasSingleCharacterType middleInitial,
    		                                                final OasString10Type prefix,
    		                                                final OasString10Type suffix) throws Exception {
    	LnpPersonNameType lnpPersonNameType = new LnpPersonNameType();
    	try {
    		if (first != null)
    		    lnpPersonNameType.setFirst(first);
    		if (last != null)
    		    lnpPersonNameType.setLast(last);
    		if (middleInitial != null)
    		    lnpPersonNameType.setMiddleInitial(middleInitial);
    		if (prefix != null)
    		    lnpPersonNameType.setPrefix(prefix);
    		if (suffix != null)
    		    lnpPersonNameType.setSuffix(suffix);
    	}
    	catch (Exception e) {
    		throw new Exception("LnpPersonNameType invalid", e);
    	}
    	return lnpPersonNameType;
    }

    public static ResellerSubOrderType createResellerSubOrderType(final Object value) throws Exception {
    	ResellerSubOrderType resellerSubOrderType = new ResellerSubOrderType();
    	try {
    		switch (value.getClass().getSimpleName()) {
    		case "ResellerAddHotlineSubscriberType":
    			resellerSubOrderType.setResellerAddHotlineSubscriber((ResellerAddHotlineSubscriberType) value);
    			break;
    		case "ResellerAddHotlineSubscriberByESNType":
    			resellerSubOrderType.setResellerAddHotlineSubscriberByESN((ResellerAddHotlineSubscriberByESNType) value);
    			break;
    		case "ResellerAddSubscriberType":
    			resellerSubOrderType.setResellerAddSubscriber((ResellerAddSubscriberType) value);
    			break;
    		case "ResellerAddSubscriberByESNType":
    			resellerSubOrderType.setResellerAddSubscriberByESN((ResellerAddSubscriberByESNType) value);
    			break;
    		case "ResellerAddSubscriberPortInType":
    			resellerSubOrderType.setResellerAddSubscriberPortIn((ResellerAddSubscriberPortInType) value);
    			break;
    		case "ResellerChangeESNType":
    			resellerSubOrderType.setResellerChangeESN((ResellerChangeESNType) value);
    			break;
    		case "ResellerChangeNumberType":
    			resellerSubOrderType.setResellerChangeNumber((ResellerChangeNumberType) value);
    			break;
    		case "ResellerChangeRatePlanType":
    			resellerSubOrderType.setResellerChangeRatePlan((ResellerChangeRatePlanType) value);
    			break;
    		case "ResellerChangeSIMType":
    			resellerSubOrderType.setResellerChangeSIM((ResellerChangeSIMType) value);
    			break;
    		case "ResellerDeleteSubscriberType":
    			resellerSubOrderType.setResellerDeleteSubscriber((ResellerDeleteSubscriberType) value);
    			break;
    		case "ResellerDeviceInquiryType":
    			resellerSubOrderType.setResellerDeviceInquiry((ResellerDeviceInquiryType) value);
    			break;
    		case "ResellerFUSFExemptUpdateType":
    			resellerSubOrderType.setResellerFUSFExemptUpdate((ResellerFUSFExemptUpdateType) value);
    			break;
    		case "ResellerHBQualificationInfoType":
    			resellerSubOrderType.setResellerHBQualificationInfo((ResellerHBQualificationInfoType) value);
    			break;
    		case "ResellerHotlineSubscriberType":
    			resellerSubOrderType.setResellerHotlineSubscriber((ResellerHotlineSubscriberType) value);
    			break;
    		case "ResellerLineInquiryType":
    			resellerSubOrderType.setResellerLineInquiry((ResellerLineInquiryType) value);
    			break;
    		case "ResellerPRLInquiryType":
    			resellerSubOrderType.setResellerPRLInquiry((ResellerPRLInquiryType) value);
    			break;
    		case "ResellerReconnectType":
    			resellerSubOrderType.setResellerReconnect((ResellerReconnectType) value);
    			break;
    		case "ResellerRemoveHotlineType":
    			resellerSubOrderType.setResellerRemoveHotline((ResellerRemoveHotlineType) value);
    			break;
    		case "ResellerReserveMDNType":
    			resellerSubOrderType.setResellerReserveMDN((ResellerReserveMDNType) value);
    			break;
    		case "ResellerResetFeatureType":
    			resellerSubOrderType.setResellerResetFeature((ResellerResetFeatureType) value);
    			break;
    		case "ResellerRestoreSubscriberType":
    			resellerSubOrderType.setResellerRestoreSubscriber((ResellerRestoreSubscriberType) value);
    			break;
    		case "ResellerSubscribeFeatureType":
    			resellerSubOrderType.setResellerSubscribeFeature((ResellerSubscribeFeatureType) value);
    			break;
    		case "ResellerSuspendSubscriberType":
    			resellerSubOrderType.setResellerSuspendSubscriber((ResellerSuspendSubscriberType) value);
    			break;
    		case "ResellerValidateMDNPortabilityType":
    			resellerSubOrderType.setResellerValidateMDNPortability((ResellerValidateMDNPortabilityType) value);
    			break;
    		case "UpdatePortInType":
    			resellerSubOrderType.setUpdatePortIn((UpdatePortInType) value);
    			break;
    		case "ValidateDeviceType":
    			resellerSubOrderType.setValidateDevice((ValidateDeviceType) value);
    			break;
    		default:
    			throw new Exception("Invalid sub order type: " + value.getClass().getSimpleName());
    		}
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerSubOrderType invalid", e);
    	}
    	return resellerSubOrderType;
    }

    public static LnpNameType createLnpNameType(final OasString60Type business,
    		                                    final LnpPersonNameType name) throws Exception {
    	LnpNameType lnpNameType = new LnpNameType();
    	try {
    		if (business != null)
    		    lnpNameType.setBusiness(business);
    		if (name != null)
    		    lnpNameType.setName(name);
    	}
    	catch (Exception e) {
    		throw new Exception("LnpNameType invalid", e);
    	}
    	return lnpNameType;
    }
    
    public static NextAvailablewithOldMDNType createNextAvailablewithOldMDNType(final CityType city,
    		                                                                    final NpaNxxType npaNxx,
    		                                                                    final MdnType oldMdn,
    		                                                                    final StateType state,
    		                                                                    final ZipCodeType zipCode) throws Exception {
    	NextAvailablewithOldMDNType nextAvailablewithOldMDNType = new NextAvailablewithOldMDNType();
    	try {
    		if (city != null)
    		    nextAvailablewithOldMDNType.setCity(city);
    		if (npaNxx != null)
    		    nextAvailablewithOldMDNType.setNpaNxx(npaNxx);
    		if (oldMdn != null)
    		    nextAvailablewithOldMDNType.setOldMdn(oldMdn);
    		if (state != null)
    		    nextAvailablewithOldMDNType.setState(state);
    		if (zipCode != null)
    		    nextAvailablewithOldMDNType.setZipCode(zipCode);
    	}
    	catch (Exception e) {
    		throw new Exception("NextAvailablewithOldMDNType invalid", e);
    	}
    	return nextAvailablewithOldMDNType;
    }

    public static EsnWithOldEsnMeidType createEsnWithOldEsnMeidType(final String old, final String value) throws Exception {
    	EsnWithOldEsnMeidType esnWithOldEsnMeidType = new EsnWithOldEsnMeidType();
    	try {
    		if (old != null)
    		    esnWithOldEsnMeidType.setOld(value);
    		if (value != null)
    		    esnWithOldEsnMeidType.setValue(value);
    	}
    	catch (Exception e) {
    		throw new Exception("EsnWithOldEsnMeidType invalid", e);
    	}
    	return esnWithOldEsnMeidType;
    }

    public static OasString160Type createOasString160Type(final String old, final String value) throws Exception {
    	OasString160Type oasString160Type = new OasString160Type();
    	try {
    		if (old != null)
    		    oasString160Type.setOld(old.substring(0, 60));
    		if (value != null)
    		    oasString160Type.setValue(value.substring(0, 60));
    	}
    	catch (Exception e) {
    		
    	}
    	return oasString160Type;
    }

    public static ResellerDeviceInquiryType createResellerDeviceInquiryType(final String deviceId,
    		                                                                final String esn,
    		                                                                final String iccid,
    		                                                                final String meid,
    		                                                                final String min,
    		                                                                final ZipCodeType serviceZipCode,
    		                                                                final SubReferenceNumberType subReferenceNumber,
    		                                                                final SystemDataType systemData) throws Exception {
    	ResellerDeviceInquiryType resellerDeviceInquiryType = new ResellerDeviceInquiryType();
    	try {
    		resellerDeviceInquiryType.setDeviceId(deviceId);
    		resellerDeviceInquiryType.setEsn(esn);
    		resellerDeviceInquiryType.setIccid(iccid);
    		resellerDeviceInquiryType.setMeid(meid);
    		resellerDeviceInquiryType.setMin(min);
    		resellerDeviceInquiryType.setServiceZipCode(serviceZipCode);
    		resellerDeviceInquiryType.setSubReferenceNumber(subReferenceNumber);
    		resellerDeviceInquiryType.setSystemData(systemData);
    	}
    	catch (Exception e) {
    		throw new Exception("ResellerDeviceInquiryType invalid", e);
    	}
    	return resellerDeviceInquiryType;
    }

    public static InputAddressType createInputAddressType(final OasString120Type addressLine,
    		                                              final OasString100Type city,
    		                                              final StateType state,
    		                                              final ZipCodeType zip) throws Exception {
    	InputAddressType inputAddressType = new InputAddressType();
    	try {
    		inputAddressType.setAddressLine(addressLine);
    		inputAddressType.setCity(city);
    		inputAddressType.setState(state);
    		inputAddressType.setZip(zip);
    	}
    	catch (Exception e) {
    		throw new Exception("InputAddressType invalid", e);
    	}
    	return inputAddressType;
    }
}

package com.budgetprepay.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.budgetprepay.model.upgrade.DatabaseConstants;

@Entity
@Table(name=DatabaseConstants.TBL_REQUESTS)
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String MDN_PARAM = "mdn";
	public static final String CLIENTREFERENCE_PARAM = "clientReference";
	
	@Id 
	@Column(name=DatabaseConstants.COL_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(final Long id) {
		this.id = id;
	}
	
	@Column(name=DatabaseConstants.COL_CREATED, nullable=false)
	private Date created = new Date();
	public Date getCreated() {
		return created;
	}
	public void setCreate(final Date create) {
		this.created = create;
	}
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name=DatabaseConstants.COL_USER_ID, nullable=false)
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(final User user) {
		this.user = user;
	}
	
	@Column(name=DatabaseConstants.COL_REFERENCE_NUMBER, unique=true, nullable=false, length=255)
	private String referenceNumber = "0";
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(final String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	
	@Column(name=DatabaseConstants.COL_CLIENT_REFERENCE, unique=true, nullable=false, length=255)
	private String clientReference;
	public String getClientReference() {
		return clientReference;
	}
	public void setClientReference(final String clientReference) {
		this.clientReference = clientReference;
	}
	
	@Column(name=DatabaseConstants.COL_CLIENT_ASYNCHRONOUS_RETURN_URL, nullable=true, length=255)
	private String clientAsynchronousReturnUrl;
	public String getClientAsynchronousReturnUrl() {
		return clientAsynchronousReturnUrl;
	}
	public void setClientAsynchronousReturnUrl(final String clientAsynchronousReturnUrl) {
		this.clientAsynchronousReturnUrl = clientAsynchronousReturnUrl;
	}
	
	@Column(name=DatabaseConstants.COL_CLIENT_REQUEST_CLASS, nullable=false, length=255)
	private String clientRequestClass;
	public String getClientRequestClass() {
		return clientRequestClass;
	}
	public void setClientRequestClass(final String clientRequestClass) {
		this.clientRequestClass = clientRequestClass;
	}
	
	@Column(name=DatabaseConstants.COL_CLIENT_REQUEST_XML, nullable=false, columnDefinition="varchar(max)")
	private String clientRequestXML;
	public String getClientRequestXML() {
		return clientRequestXML;
	}
	public void setClientRequestXML(final String clientRequestXML) {
		this.clientRequestXML = clientRequestXML;
	}
	
	@Column(name=DatabaseConstants.COL_CLIENT_SYNCHRONOUS_RESPONSE_XML, nullable=true, columnDefinition="varchar(max)")
	private String clientSynchronousResponseXML;
	public String getClientSynchronousResponseXML() {
		return clientSynchronousResponseXML;
	}
	public void setClientSynchronousResponseXML(final String clientSynchronousResponseXML) {
		this.clientSynchronousResponseXML = clientSynchronousResponseXML;
	}
	
	@Column(name=DatabaseConstants.COL_VERIZON_SYNCHRONOUS_REQUEST_XML, nullable=true, columnDefinition="varchar(max)")
	private String verizonSynchronousRequestXML;
	public String getVerizonSynchronousRequestXML() {
		return verizonSynchronousRequestXML;
	}
	public void setVerizonSynchronousRequestXML(final String verizonSynchronousRequestXML) {
		this.verizonSynchronousRequestXML = verizonSynchronousRequestXML;
	}
	
	@Column(name=DatabaseConstants.COL_VERIZON_SYNCHRONOUS_RESPONSE_XML, nullable=true, columnDefinition="varchar(max)")
	private String verizonSynchronousResponseXML;
	public String getVerizonSynchronousResponseXML() {
		return verizonSynchronousResponseXML;
	}
	public void setVerizonSynchronousResponseXML(final String verizonSynchronousResponseXML) {
		this.verizonSynchronousResponseXML = verizonSynchronousResponseXML;
	}
	
	@Column(name=DatabaseConstants.COL_VERIZON_ASYNCHRONOUS_RESPONSE_XML, nullable=true, columnDefinition="varchar(max)")
	private String verizonAsynchronousResponseXML;
	public String getVerizonAsynchronousResponseXML() {
		return verizonAsynchronousResponseXML;
	}
	public void setVerizonAsynchronousResponseXML(final String verizonAsynchronousResponseXML) {
		this.verizonAsynchronousResponseXML = verizonAsynchronousResponseXML;
	}
	
	@Column(name=DatabaseConstants.COL_CLIENT_ASYNCHRONOUS_RESPONSE_XML, nullable=true, columnDefinition="varchar(max)")
	private String clientAsynchronousResponseXML;
	public String getClientAsynchronousResponseXML() {
		return clientAsynchronousResponseXML;
	}
	public void setClientAsynchronousResponseXML(final String clientAsynchronousResponseXML) {
		this.clientAsynchronousResponseXML = clientAsynchronousResponseXML;
	}
	
	@Column(name=DatabaseConstants.COL_CLIENT_ASYNCHRONOUS_RETURN_HTTP_CODE, nullable=true)
	private Integer clientAsynchronousReturnHttpCode = 200;
	public Integer getClientAsynchronousReturnHttpCode() {
		return clientAsynchronousReturnHttpCode;
	}
	public void setClientAsynchronousReturnHttpCode(final Integer clientAsynchronousReturnHttpCode) {
		this.clientAsynchronousReturnHttpCode = clientAsynchronousReturnHttpCode;
	}

	public enum RequestType {
		DEVICE_INQUIRY("Device Inquiry"),
		DEVICE_ACTIVATION("Activation"),
		DEVICE_ACTIVATION_PORTIN("Port-in"),
		DELETE_SUBSCRIBER("Deactivation"),
		VALIDATE_MDN_PORTIN("Validate MDN Port-in"),
		ORDER_INQUIRY("Order Inquiry"),
		SEARCH_BUCKET("Search Bucket"),
		CHANGE_ESN("Change ESN"),
		ADD_BUCKET("Add Bucket"),
		DELETE_BUCKET("Delete Bucket"),
		ADD_HOTLINE_SUBSCRIBER("Add Hotline Subscriber"),
		ADD_HOTLINE("Add Hotline"),
		REMOVE_HOTLINE("Remove Hotline"),
		RECONNECT_MDN("Reconnect MDN"),
		RESTORE_SUSPENDED_SUBSCRIBER("Restore Suspended Subscriber"),
		SUSPEND_SUBSCRIBER("Suspend Subscriber"),
		LINE_INQUIRY("Line Inquiry"),
		PORTIN_INQUIRY("PortIn Inquiry"),
		PRL_INQUIRY("PRL Inquiry"),
		VALIDATE_DEVICE("Valid Device"),
		CHANGE_MOBILE_NUMBER("Change Mobile Number"),
		RESET_FEATURE("Rest Feature"),
		CHANGE_FEATURES("Change Features"),
		CHANGE_RATEPLAN("Change Rate Plan"),
		CHANGE_SIM("Change SIM"),
		FUSF_EXEMPT_UPDATE("FUSF Exempt Update"),
		ADD_AUTO_REPLENISH("Add Auto Replenish"),
		UPDATE_AUTO_REPLENISH("Update Auto Replenish"),
		GET_AUTO_REPLENISH("Get Auto Replenish"),
		SEARCH_SUBSCRIBER_INFO("Search Subscriber Info"),
		UPDATE_SUBSCRIBER_FIELD("Update Subsriber Field"),
		DELETE_ALL_BUCKETS("Delete All Buckets"),
		UPDATE_ACCOUNT_BALANCE("Update Account Balance"),
		UPDATE_CREDIT("Update Credit"),
		SEARCH_CDR("Search CDR"),
		SEARCH_CDR_DETAIL("Search CDR Detail"),
		UPDATE_BUCKET("Update Bucket"),
		ACTIVATE_PIN("Activate Pin"),
		VOID_PIN("Void Pin"),
		SEARCH_PIN("Search Pin"),
		SEARCH_PIN_BATCH("Search Pin Batch"),
		VOID_PIN_RANGE("Void Pin Range"),
		VOID_GROUP("Void Group"),
		VOID_BATCH("Void Batch"),
		SEARCH_PIN_GROUP("Search Pin Group"),
		UPDATE_PIN_BATCH_STATUS("Update Pin Batch Status"),
		UPDATE_PIN_GROUP_INFO("Update Pin Group Info"),
		REVERT_CALLS("Revert Calls"),
		ENTER_ORDER_DETAILS("Enter Order Details"),
		CANCEL_ORDER("Cancel Order"),
		BEQUICK_GET_COVERAGE("Bequick Get Coverage"),
		BEQUICK_GET_SERVICE_INFORMATION("Bequick Get Service Information"),
		BEQUICK_ACTIVATE("Bequick Activate"),
		BEQUICK_SWAPMDN("Bequick SwapMDN"),
		BEQUICK_SWAPESN("Bequick SwapESN"),
		BEQUICK_SUSPEND("Bequick Suspend"),
		BEQUICK_RESTORE("Bequick Restore"),
		BEQUICK_DISCONNECT("Bequick Disconnect"),
		BEQUICK_PURCHASE("Bequick Purchase"),
		BEQUICK_PORTIN("Bequick PortIn"),
		PLINTRON_SEND_MESSAGE("Plintron Send Message"),
		PLINTRON_SEND_BULK_MESSAGE("Plintron Send Bulk Message"),
		PLINTRON_CANCEL_BULK_MESSAGE("Plintron Cancel Bulk Message"),
		PLINTRON_STATUS_BULK_MESSAGE("Plintron Status Bulk Message"),
		PLINTRON_REPORT_BULK_MESSAGE("Plintron Report Bulk Message"),
		PLINTRON_PORTIN_VALIDATE("Plintron PortIn Validate"),
		PLINTRON_PORTIN_CREATE("Plintron PortIn Create"),
		PLINTRON_PORTIN_UPDATE("Plintron PortIn Update"),
		PLINTRON_PORTIN_STATUS("Plintron PortIn Status"),
		PLINTRON_PORTIN_CANCEL("Plintron PortIn Cancel"),
		PLINTRON_PORTOUT_VALIDATE("Plintron PortOut Validate"),
		PLINTRON_CHANGE_VM_PIN("Plintron Change VM Pin"),
		PLINTRON_SERVICE_ACTIVATE("Plintron Service Activate"),
		PLINTRON_SERVICE_DEACTIVATE("Plintron Service Deactivate"),
		PLINTRON_GET_ACCOUNT_DETAILS("Plintron Get Account Details"),
		PLINTRON_GET_SUBSCRIPTION_STATUS("Plintron Get Subscription Status"),
		PLINTRON_GET_BUNDLE_SUBSCRIPTION("Plintron Get Bundle Subscription"),
		PLINTRON_REMOVE_SUBSCRIBER("Plintron Remove Subscriber"),
		PLINTRON_ALLOCATE_MDN("Plintron Allocate MDN"),
		PLINTRON_GET_SUBSCRIBER_INFO("Plintron Get Subscriber Info"),
		PLINTRON_MODIFY_SUBSCRIBER_STATUS("Plintron Modify Subscriber Status"),
		PLINTRON_CHANGE_PLAN("Plintron Change Plan"),
		PLINTRON_QUERY_SUBSCRIBER_USAGE("Plintron Query Subscriber Usage"),
		PLINTRON_REACTIVATE_SUBSCRIBER("Plintron Reactivate Subscriber"),
		PLINTRON_REPLACE_MSISDN("Plintron Replace MSISDN"),
		PLINTRON_CHANGE_MSISDN("Plintron Chnage MSISDN"),
		PLINTRON_BLOCK_UNBLOCK_SIM("Plintron Block/Unblock SIM"),
		PLINTRON_MODIFY_LANGUAGE("Plintron Modify Language"),
		PLINTRON_SWAP_MSISDN("Plintron Swap MSISDN"),
		PLINTRON_CHANGE_IMSI("Plintron Change IMSI"),
		PLINTRON_ADD_SOC("Plintron Add SOC"),
		PLINTRON_REMOVE_SOC("Plintron Remove SOC"),
		PLINTRON_MODIFY_SUBSCRIBER_BUCKET("Plintron Modify Subscriber Bucket"),
		PLINTRON_SWAP_IMSI("Plintron Swap IMSI");
		
		private String dataKey;

		private RequestType(String dataKey) {
			this.dataKey = dataKey;
		}

		public String asString() {
			return dataKey;
		}
		
		public static RequestType fromString(final String requestType)
		{
			for( RequestType tempRequestType : RequestType.values() ) {
				if( tempRequestType.dataKey.equals(requestType) ) return tempRequestType;
			}
			return null;
		}
	}
	@Enumerated(EnumType.STRING)
	@Column(name="TYPE", nullable=false)
	private RequestType type = RequestType.DEVICE_INQUIRY;
	public RequestType getType() {
		return type;
	}
	public void setType(final RequestType type) {
		this.type = type;
	}
	
	@Column(name=DatabaseConstants.COL_CANCEL, nullable=true, columnDefinition="bit")
	private Boolean cancel = false;
	public Boolean getCancel() {
		return cancel;
	}
	public void setCancel(final Boolean cancel) {
		this.cancel = cancel;
	}
	
	@JoinColumn(name=DatabaseConstants.COL_CREATED, nullable=true)
	private Date commited = null;
	public Date getCommited() {
		return commited;
	}
	public void setCommited(final Date commited) {
		this.commited = commited;
	}
	
	@JoinColumn(name=DatabaseConstants.COL_MDN, nullable=true)
	private String mdn = null;
	public String getMdn() {
		return mdn;
	}
	public void setMdn(final String mdn) {
		this.mdn = mdn;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
		.append(id)
		.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if( obj == null ) return false;
		if( this == obj ) return true;
		if( getClass() != obj.getClass() ) return false;

		Request rhs = (Request) obj;
        
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.isEquals();
	}
}

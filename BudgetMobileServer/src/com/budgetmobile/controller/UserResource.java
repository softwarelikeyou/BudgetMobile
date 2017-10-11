package com.budgetmobile.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import com.budgetmobile.client.BudgetMobileClient;
import com.budgetmobile.client.LifelineClient;
import com.budgetmobile.client.PaymentechClient;
import com.budgetmobile.client.SpinlifeservClient;
import com.budgetmobile.client.ZenDeskClient;
import com.budgetmobile.lifeline.CheckTmobileBalance;
import com.budgetmobile.lifeline.CheckVerizonBalance;
import com.budgetmobile.lifeline.LookupAccountByMDN;
import com.budgetmobile.lifeline.LookupCustomerDetails;
//import com.budgetmobile.lifeline.MobileApp_ClerkAssociation;
import com.budgetmobile.lifeline.RetrVoiceandTextBalance;
import com.budgetmobile.lifeline.TopUpProduct;
import com.budgetmobile.lifeline.TopUp_Commit;
import com.budgetmobile.model.entity.Address;
import com.budgetmobile.model.entity.CheckoutResult;
import com.budgetmobile.model.entity.ErrorMessage;
import com.budgetmobile.model.entity.Order;
import com.budgetmobile.model.entity.Promo;
import com.budgetmobile.model.entity.PromoResult;
import com.budgetmobile.model.entity.Purchase;
import com.budgetmobile.model.entity.PurchaseResult;
import com.budgetmobile.model.entity.User;
import com.budgetprepay.www.Paymentech.NewOrderResponse;

@Path("/users")
public class UserResource {
	public static String ENCODE_KEY = "55Chevy";
	public static Boolean MOCK = Boolean.FALSE;
	
	public static User getUser(final String key) throws Exception {
	    String[] split = StringXORer.decode(key, UserResource.ENCODE_KEY).split(":");
        return BudgetMobileClient.getUserByUsernamePassword(split[0], (split[1]));
	}
	
    @GET
    @Path("{key}")
    @Produces({ MediaType.APPLICATION_JSON })
    public User getByUsernamePassword(@PathParam("key") String key) {
	    User user = null;
	    try {
	    	if (MOCK)
	    		return UserMock.mocked();
	    	
            user = getUser(key);
                        
            for (Order order : user.getOrders()) {
            	order.setBudgetMobileId(UserMock.VERIZON_BMID);
                LookupCustomerDetails details = LifelineClient.lookupCustomerDetail(Integer.valueOf(order.getBudgetMobileId()));
                if (details != null) {
                	if (details.isIsError()) {
                		user.setErrorCode("1");
                		user.setErrorMessage(details.getErrors().getErrorMessage());
                		return user;
                	}
                	order.setBillingAddress(new Address(details.getBillingAddress(), details.getBillingAddress2(), details.getBillingCity(), details.getBillingState(), details.getBillingZip()));
                	order.setBirthDate(details.getBirthDate());
                	order.setContactNumber(details.getContactNumber());
                	order.setEmailAddress(details.getEmailAddress());
                	user.setEmail(details.getEmailAddress());
                	order.setFirstName(details.getFirstName());
                	user.setfName(details.getFirstName());
                	order.setLastName(details.getLastName());
                	user.setlName(details.getLastName());
                	order.setLifeline_Expiration(details.getLifeline_Expiration());
                	order.setLastCallDateTime(details.getLastCallDateTime());
                	order.setProviderID(details.getProviderID());
                	order.setProviderName(details.getProviderName());
                	order.setServiceAddress(new Address(details.getAddress1(), details.getAddress2(), details.getCity(), details.getState(), details.getZip()));
                	order.setServicePlan(details.getServicePlan());
                	order.setServiceEndDate(details.getServiceEndDate());
                	order.setSSN(details.getSSN());
                	order.setPhoneNumber(details.getMobileNumber());
                	order.setMigrationInProgress(details.isMigrationInProgress());
                	if (details.isMigrationInProgress()) {
                		return user;
                	}
                	//order.setMobileAccountCredit(details.getMobileAccountCredits());
                	//order.setAssociateWithClerk(details.isAssociateWithClerk());
                }
                else {
                	user.setErrorCode("1");
                	user.setIsError(Boolean.TRUE);
                	user.setErrorMessage("Unable to login");
                	return user;
                }
                
                switch (order.getProviderID()) {
                case "1":
                	RetrVoiceandTextBalance sprint = LifelineClient.checkSprintBalance(Integer.valueOf(order.getBudgetMobileId()));
                	order.setPlanBalance_Voice(sprint.getPlanBalance_Voice());
                	order.setPlanBalance_Text(sprint.getPlanBalance_Text());
                	order.setPlanBalance_Data(sprint.getPlanBalance_Data());
                	order.setPlanBalance_Combo_VS(sprint.getPlanBalance_Combo_VS());
                	order.setTopUpExpirationSet(sprint.isTopUpExpirationSet());
                	order.setTopUpExpiration(sprint.getTopUpExpiration());
                	order.setTopUpBalance_Voice(sprint.getTopUpBalance_Voice());
                	order.setTopUpBalance_Text(sprint.getTopUpBalance_Text());
                	order.setTopUpBalance_Data(sprint.getTopUpBalance_Data());
                	order.setTopUpBalance_Combo_VS(sprint.getTopUpBalance_Combo_VS());
                	order.setServiceEndDate(sprint.getServiceEndDate());
                	break;
                case "2":
                	CheckVerizonBalance verizon = LifelineClient.checkVerizonBalance(order.getPhoneNumber());
                	order.setPlanBalance_Voice(verizon.getPlanBalance_Voice());
                	order.setPlanBalance_Text(verizon.getPlanBalance_Text());
                	order.setPlanBalance_Data(verizon.getPlanBalance_Data());
                	order.setPlanBalance_Combo_VS(verizon.getPlanBalance_Combo_VS());
                	order.setTopUpExpirationSet(verizon.isTopUpExpirationSet());
                	order.setTopUpExpiration(verizon.getTopUpExpiration());
                	order.setTopUpBalance_Voice(verizon.getTopUpBalance_Voice());
                	order.setTopUpBalance_Text(verizon.getTopUpBalance_Text());
                	order.setTopUpBalance_Data(verizon.getTopUpBalance_Data());
                	order.setTopUpBalance_Combo_VS(verizon.getTopUpBalance_Combo_VS());
                	order.setServiceEndDate(verizon.getServiceEndDate());
                	break;
                case "3":
                	CheckTmobileBalance tmobile = LifelineClient.checkTmobileBalance(order.getPhoneNumber());
                	order.setPlanBalance_Voice(tmobile.getPlanBalance_Voice());
                	order.setPlanBalance_Text(tmobile.getPlanBalance_Text());
                	order.setTopUpBalance_Data(tmobile.getTopUpBalance_Data());
                	order.setTopUpBalance_Text(tmobile.getTopUpBalance_Text());
                	order.setTopUpBalance_Voice(tmobile.getTopUpBalance_Voice());
                	order.setTopUpExpirationSet(tmobile.isTopUpExpirationSet());
                	order.setTopUpExpiration(tmobile.getTopUpExpiration());
                	order.setPhoneNumber(tmobile.getWirelessNumber());
                	break;
                }
               
                
                for (TopUpProduct topUpProduct : LifelineClient.getProducts(Integer.valueOf(order.getBudgetMobileId())))
                    order.addTopUpProduct(new com.budgetmobile.model.entity.TopUpProduct(topUpProduct.getTopUpProductID(), 
                    		                                                             topUpProduct.getType(),
                    		                                                             topUpProduct.getDescription(),
                    		                                                             topUpProduct.getFaceValue(),
                    		                                                             topUpProduct.getAccountCreditsRequired()));
            }
	    }
	    catch (Exception e) {
		    throw new WebApplicationException(e.getMessage());
	    }
	    return user;
    }
 
    @GET
    @Path("/mdn/{mdn}")
    @Produces({ MediaType.APPLICATION_JSON })
    public User getUserByMDN(@PathParam("mdn") String mdn) {
    	User user = new User();
    	try {
	    	if (MOCK)
	    		return UserMock.mocked();
	    	
    		LookupAccountByMDN account = LifelineClient.lookupAccountByMDN(mdn);
            if (account != null) {
            	if (account.getBudgetMobileId() != 0) {
            		if (account.isMigrationInProgress()) {
            			user.setIsError(Boolean.TRUE);
            			user.setErrorMessage(account.getErrors().getErrorMessage());
            			return user;
            		}
                	User temp = BudgetMobileClient.getUserById(String.valueOf(account.getBudgetMobileId()));
                	if (temp != null) {
                		if (temp.getEmail() != null && temp.getUserId() != null) {
                		    user.setEmail(temp.getEmail());
            	            user.setUserId(temp.getUserId());
                		}
                		else {
                			user.setIsError(Boolean.TRUE);
                			user.setErrorMessage("ERROR");
                		}
                	}
                	else {
                		user.setIsError(Boolean.TRUE);
                		user.setErrorCode("ERROR");
                	}
            	}
            	else {
            		user.setIsError(Boolean.TRUE);
            		user.setErrorMessage("ERROR");
            	}
            }
            else {
            	user.setIsError(Boolean.TRUE);
            	user.setErrorMessage("ERROR");
            }
    	}
	    catch (Exception e) {
	    	user.setErrorMessage("ERROR");
		    throw new WebApplicationException(e.getMessage());		
	    }
	    return user;
    }
    
    @GET
    @Path("/forgotcredentials/{id}-{email}")
    @Produces({ MediaType.APPLICATION_JSON })
    public ErrorMessage forgotCredentials(@PathParam("id") String id, @PathParam("email") String email) {
    	ErrorMessage errorMessage = new ErrorMessage();
    	
    	try {
    		if (id != null && email != null) {
    			errorMessage = BudgetMobileClient.forgotCredentials(id, email);
    		}
    		else
    			errorMessage.setIsError(Boolean.TRUE);
    	}
    	catch (Exception e) {
    		errorMessage.setIsError(Boolean.TRUE);
    		throw new WebApplicationException(e.getMessage());	
    	}
    	return errorMessage;
    }
    
    @GET
    @Path("/checkout/{bmid}-{topup}-{credits}")
    @Produces({ MediaType.APPLICATION_JSON })
    public CheckoutResult checkout(@PathParam("bmid") Integer bmid, @PathParam("topup") Integer topup, @PathParam("credits") Integer credits) {		
		try {
			String orderId = LifelineClient.newOrderId();
			return LifelineClient.topUp_Enter2CheckoutResult(LifelineClient.enterTopUp(bmid, orderId, topup, credits), orderId);
		}
		catch (Exception e) {
		    throw new WebApplicationException(e.getMessage());
		}
	}
    
    @POST
    @Path("/purchase")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
    public PurchaseResult purchase(Purchase purchase) throws Exception {
    	PurchaseResult purchaseResult = new PurchaseResult();
    	NewOrderResponse response = null;
    	try {    
    		response = PaymentechClient.newOrder(purchase.getCreditCard(), 
    				                             purchase.getExpiration(),
    				                             purchase.getCcc(), 
    				                             purchase.getZip(), 
    				                             purchase.getStreetAddress1(), 
    				                             purchase.getCity(), 
    				                             purchase.getState(), 
    				                             purchase.getName(), 
    				                             purchase.getPhone(),
    				                             purchase.getEmail(), 
    				                             purchase.getOrderID(), 
    				                             String.valueOf(purchase.getTotal().replace(".", "")), 
    				                             purchase.getDescription());
    		if (response != null) {
    			purchaseResult.setApprovalStatus(response.getApprovalStatus());
    			purchaseResult.setAuthorizationCode(response.getAuthorizationCode());
    			purchaseResult.setAvsRespCode(response.getAvsRespCode());
    			purchaseResult.setCardBrand(response.getCardBrand());
    			purchaseResult.setCcAccountNum(response.getCcAccountNum());
    			purchaseResult.setCustomerRefNum(response.getCustomerRefNum());
    			purchaseResult.setCvvRespCode(response.getCvvRespCode());
    			if (response.getErrorMessage() != null) {
    				purchaseResult.setErrorCode(response.getErrorMessage().getErrorCode());
    				purchaseResult.setErrorText(response.getErrorMessage().getErrorText());
    			}
    			purchaseResult.setOrderID(response.getOrderID());
    			purchaseResult.setProcStatus(response.getProcStatus());
    			purchaseResult.setProcStatusMessage(response.getProcStatusMessage());
    			purchaseResult.setRequestAmount(purchase.getTotal());
    			purchaseResult.setRespCode(response.getRespCode());
    			purchaseResult.setRespCodeMessage(response.getRespCodeMessage());
    			purchaseResult.setRespDateTime(response.getRespDateTime());
    			purchaseResult.setTxRefNum(response.getTxRefNum());
    			
    			if (purchaseResult.getApprovalStatus() != null) {
        			if (purchaseResult.getApprovalStatus().equals("1")) {
        				TopUp_Commit topUpCommit = LifelineClient.commitTopUp(purchase.getReferenceID());
        				purchaseResult.setTopUpId(String.valueOf(topUpCommit.getTopUpID()));
        			}
    			}
    		}
    	}
    	catch (Exception e) {
    		e.printStackTrace();
		    //throw new WebApplicationException(e.getMessage());
    		if (response.getErrorMessage() != null) {
        		purchaseResult.setErrorCode(response.getErrorMessage().getErrorCode());
    		    purchaseResult.setErrorText(response.getErrorMessage().getErrorText());
    		}
    		else {
        		purchaseResult.setErrorCode(e.getCause().getMessage());
    		    purchaseResult.setErrorText(e.getMessage());
    		}
    	}
    	return purchaseResult;
    }
    
    @POST
    @Path("/commit")
    public Integer commit(@FormParam("referenceID") Integer referenceID) throws Exception {
		TopUp_Commit topUpCommit = LifelineClient.commitTopUp(referenceID);
    	return topUpCommit.getTopUpID();
    }
    
    @POST
    @Path("/ticket")
    public Integer submitTicket(@FormParam("name") String name, 
    		                    @FormParam("email") String email, 
    		                    @FormParam("subject") String subject, 
    		                    @FormParam("message") String message) throws Exception {
    	return ZenDeskClient.submitTicket(name, email, subject, message);
    }
   
    @GET
    @Path("/promo/confirm/{username}")
    @Produces({ MediaType.APPLICATION_JSON })
    public PromoResult confirmPromo(@PathParam("username") String username) throws Exception {
    	return SpinlifeservClient.confirmPromoCode(username);
    }
    
    // TODO
/*    @POST
    @Path("/promo/save")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
    public PromoResult clerkAssociation(Promo promo) throws Exception {
    	PromoResult result = new PromoResult();
    	try {
    		result = SpinlifeservClient.confirmPromoCode(promo.getUsername());
    		if (Boolean.TRUE.equals(result.getIsError())) {
    			result.setErrorCode(-1);
    			result.setErrorMessage("Unable to verify");
    			return result;
    		}
    	}
    	catch (Exception e) {
    		result.setIsError(Boolean.TRUE);
    		result.setErrorCode(-1);
    		result.setErrorMessage(e.getMessage());
    		return result;
    	}
    	
    	try {
    		MobileApp_ClerkAssociation response = LifelineClient.clerkAssociation(promo.getUsername(), 
    				                                                              result.getFullName(),
    				                                                              Integer.valueOf(promo.getBmi()));
    		if (Boolean.TRUE.equals(response.isIsError())) {
    			result.setErrorCode(response.getErrors().getErrorCode());
    			result.setErrorMessage(response.getErrors().getErrorMessage());
    			result.setIsError(response.isIsError());
    		}
    	}
    	catch (Exception e) {
    		result.setErrorCode(1);
    		result.setErrorMessage(e.getMessage());
    	}
    	return result;
    }*/
} 
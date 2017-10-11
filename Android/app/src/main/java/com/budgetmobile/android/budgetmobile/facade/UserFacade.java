package com.budgetmobile.android.budgetmobile.facade;

import com.budgetmobile.android.budgetmobile.Constants;
import com.budgetmobile.android.budgetmobile.entity.Promo;
import com.budgetmobile.android.budgetmobile.entity.PromoResult;
import com.budgetmobile.android.budgetmobile.helper.ApplicationHelper;
import com.budgetmobile.android.budgetmobile.helper.HttpHelper;
import com.budgetmobile.android.budgetmobile.helper.RemoteService;
import com.budgetmobile.android.budgetmobile.helper.StringXORer;
import com.budgetmobile.android.budgetmobile.entity.Address;
import com.budgetmobile.android.budgetmobile.entity.Checkout;
import com.budgetmobile.android.budgetmobile.entity.CheckoutResult;
import com.budgetmobile.android.budgetmobile.entity.Order;
import com.budgetmobile.android.budgetmobile.entity.Purchase;
import com.budgetmobile.android.budgetmobile.entity.PurchaseResult;
import com.budgetmobile.android.budgetmobile.entity.Tax;
import com.budgetmobile.android.budgetmobile.entity.TopUpProduct;
import com.budgetmobile.android.budgetmobile.entity.User;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Collections;

public class UserFacade {

    public static User getUserByUsernamePassword(final String username, final String password) throws Exception {
        User user;
        try {
            HttpHelper helper;
            helper = RemoteService.doGetJson(RemoteService.USERS_URL +
                                        StringXORer.encode(username + ":" + password, Constants.ENCODE_KEY));
            if (helper.getResponseCode() != 200)
                return null;

            if (Constants.MODE.equals("DEV"))
                System.out.println(helper.getJsonObject().toString());

            user = new User();
            user.setJsonObject(helper.getJsonObject());
            if (!helper.getJsonObject().isNull("ISERROR"))
                user.setIsError(helper.getJsonObject().getBoolean("ISERROR"));
            if (!helper.getJsonObject().isNull("ERRORCODE"))
                user.setErrorCode(helper.getJsonObject().getString("ERRORCODE"));
            if (!helper.getJsonObject().isNull("ERRORMESSAGE"))
                user.setErrorMessage(helper.getJsonObject().getString("ERRORMESSAGE"));
            if (!helper.getJsonObject().isNull("USERID"))
                user.setUserId(helper.getJsonObject().getInt("USERID"));
            if (!helper.getJsonObject().isNull("FNAME"))
                user.setfName(helper.getJsonObject().getString("FNAME"));
            if (!helper.getJsonObject().isNull("LNAME"))
                user.setlName(helper.getJsonObject().getString("LNAME"));
            if (!helper.getJsonObject().isNull("EMAIL"))
                user.setEmail(helper.getJsonObject().getString("EMAIL"));
            JSONArray jsonArray = helper.getJsonObject().getJSONArray("ORDERS");
            if (jsonArray != null) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    Order order = new Order();
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    if (!jsonObject.isNull("PHONENUMBER"))
                        order.setPhoneNumber(jsonObject.getString("PHONENUMBER"));
                    if (!jsonObject.isNull("BUDGETMOBILEID"))
                        order.setBudgetMobileId(jsonObject.getString("BUDGETMOBILEID"));
                    if (!jsonObject.isNull("LIFELINE"))
                        order.setLifeLine(jsonObject.getString("LIFELINE"));
                    if (!jsonObject.isNull("ORDERID"))
                        order.setOrderId(jsonObject.getString("ORDERID"));
                    if (!jsonObject.isNull("firstName"))
                        order.setFirstName(jsonObject.getString("firstName"));
                    if (!jsonObject.isNull("lastName"))
                        order.setLastName(jsonObject.getString("lastName"));
                    if (!jsonObject.isNull("providerID"))
                        order.setProviderID(jsonObject.getString("providerID"));
                    if (!jsonObject.isNull("providerName"))
                        order.setProviderName(jsonObject.getString("providerName"));
                    if (!jsonObject.isNull("SSN"))
                        order.setSSN(jsonObject.getString("SSN"));
                    if (!jsonObject.isNull("birthDate"))
                        order.setBirthDate(jsonObject.getString("birthDate"));
                    if (!jsonObject.isNull("mobileAccountCredit"))
                        order.setMobileAccountCredit(jsonObject.getInt("mobileAccountCredit"));
                    if (!jsonObject.isNull("associateWithClerk"))
                        order.setAssociateWithClerk(jsonObject.getBoolean("associateWithClerk"));
                    JSONObject addressJSON = jsonObject.getJSONObject("serviceAddress");
                    Address serviceAddress = new Address();
                    if (!addressJSON.isNull("address1"))
                        serviceAddress.setAddress1(addressJSON.getString("address1"));
                    if (!addressJSON.isNull("address2"))
                        serviceAddress.setAddress2(addressJSON.getString("address2"));
                    if (!addressJSON.isNull("city"))
                        serviceAddress.setCity(addressJSON.getString("city"));
                    if (!addressJSON.isNull("state"))
                        serviceAddress.setState(addressJSON.getString("state"));
                    if (!addressJSON.isNull("zip"))
                        serviceAddress.setZip(addressJSON.getString("zip"));
                    order.setServiceAddress(serviceAddress);
                    if (!jsonObject.isNull("emailAddress"))
                        order.setEmailAddress(jsonObject.getString("emailAddress"));
                    if (!jsonObject.isNull("contactNumber"))
                        order.setContactNumber(jsonObject.getString("contactNumber"));
                    if (!jsonObject.isNull("lifeline_Expiration"))
                        order.setLifeline_Expiration(jsonObject.getString("lifeline_Expiration"));
                    if (!jsonObject.isNull("lastCallDateTime"))
                        order.setLastCallDateTime(jsonObject.getString("lastCallDateTime"));
                    if (!jsonObject.isNull("billingAddress"))
                        addressJSON = jsonObject.getJSONObject("billingAddress");
                    Address billingAddress = new Address();
                    if (!addressJSON.isNull("address1"))
                        billingAddress.setAddress1(addressJSON.getString("address1"));
                    if (!addressJSON.isNull("address2"))
                        billingAddress.setAddress2(addressJSON.getString("address2"));
                    if (!addressJSON.isNull("city"))
                        billingAddress.setCity(addressJSON.getString("city"));
                    if (!addressJSON.isNull("state"))
                        billingAddress.setState(addressJSON.getString("state"));
                    if (!addressJSON.isNull("zip"))
                        billingAddress.setZip(addressJSON.getString("zip"));
                    order.setBillingAddress(billingAddress);
                    if (!jsonObject.isNull("servicePlan"))
                        order.setServicePlan(jsonObject.getString("servicePlan"));
                    if (!jsonObject.isNull("planBalance_Voice"))
                        order.setPlanBalance_Voice(ApplicationHelper.decorateUnlimitedBalance(jsonObject.getString("planBalance_Voice")));
                    if (!jsonObject.isNull("planBalance_Text"))
                        order.setPlanBalance_Text(ApplicationHelper.decorateUnlimitedBalance(jsonObject.getString("planBalance_Text")));
                    if (!jsonObject.isNull("planBalance_Combo_VS"))
                        order.setPlanBalance_Combo_VS(jsonObject.getString("planBalance_Combo_VS"));
                    if (!jsonObject.isNull("planBalance_Data"))
                        order.setPlanBalance_Data(jsonObject.getString("planBalance_Data"));
                    if (!jsonObject.isNull("planBalance_MMS"))
                        order.setPlanBalance_MMS(jsonObject.getString("planBalance_MMS"));
                    if (!jsonObject.isNull("topUpBalance_Voice"))
                        order.setTopUpBalance_Voice(ApplicationHelper.decorateUnlimitedBalance(jsonObject.getString("topUpBalance_Voice")));
                    if (!jsonObject.isNull("topUpBalance_Text"))
                        order.setTopUpBalance_Text(ApplicationHelper.decorateUnlimitedBalance(jsonObject.getString("topUpBalance_Text")));
                    if (!jsonObject.isNull("topUpBalance_Combo_VS"))
                        order.setTopUpBalance_Combo_VS(jsonObject.getString("topUpBalance_Combo_VS"));
                    if (!jsonObject.isNull("topUpBalance_Data"))
                        order.setTopUpBalance_Data(jsonObject.getString("topUpBalance_Data"));
                    if (!jsonObject.isNull("serviceEndDate"))
                        order.setServiceEndDate(jsonObject.getString("serviceEndDate"));
                    if (!jsonObject.isNull("topUpExpirationSet"))
                        order.setTopUpExpirationSet(jsonObject.getBoolean("topUpExpirationSet"));
                    if (!jsonObject.isNull("topUpExpiration"))
                        order.setTopUpExpiration(jsonObject.getString("topUpExpiration"));
                    if (!jsonObject.isNull("migrationInProgress"))
                        order.setMigrationInProgress(jsonObject.getBoolean("migrationInProgress"));
                    JSONArray topUpProductsJSONArray = jsonObject.getJSONArray("TOPUP_PRODUCTS");
                    if (topUpProductsJSONArray != null) {
                        for (int j = 0; j < topUpProductsJSONArray.length(); j++) {
                            TopUpProduct topUpProduct = new TopUpProduct();
                            JSONObject topUpJSON = topUpProductsJSONArray.getJSONObject(j);
                            if (!topUpJSON.isNull("description"))
                                topUpProduct.setDescription(topUpJSON.getString("description"));
                            if (!topUpJSON.isNull("faceValue"))
                                topUpProduct.setFaceValue(topUpJSON.getDouble("faceValue"));
                            if (!topUpJSON.isNull("topUpProductID"))
                                topUpProduct.setTopUpProductID(topUpJSON.getInt("topUpProductID"));
                            if (!topUpJSON.isNull("type"))
                                topUpProduct.setType(topUpJSON.getInt("type"));
                            if (!topUpJSON.isNull("creditsRequired"))
                                topUpProduct.setCreditsRequired(topUpJSON.getInt("creditsRequired"));
                            order.getTopUpProducts().add(topUpProduct);
                        }

                        Collections.sort(order.getTopUpProducts(), TopUpProduct.Comparators.FACEVALUE);
                    }
                    user.addOrder(order);
                }
            }
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return user;
    }

    public static User getUserByMDN(final String mdn) throws Exception {
        User user = new User();
        try {
            HttpHelper helper;
            helper = RemoteService.doGetJson(RemoteService.MDN_URL + mdn);

            if (helper.getResponseCode() != 200)
                return null;

            if (helper.getJsonObject().isNull("ISERROR"))
                user.setIsError(Boolean.FALSE);
            else
                user.setIsError(helper.getJsonObject().getBoolean("ISERROR"));
            if (!helper.getJsonObject().isNull("ERRORCODE"))
                user.setErrorCode(helper.getJsonObject().getString("ERRORCODE"));
            if (!helper.getJsonObject().isNull("ERRORMESSAGE"))
                user.setErrorMessage(helper.getJsonObject().getString("ERRORMESSAGE"));
            if (!helper.getJsonObject().isNull("USERID"))
                user.setUserId(helper.getJsonObject().getInt("USERID"));
            if (!helper.getJsonObject().isNull("EMAIL"))
                user.setEmail(helper.getJsonObject().getString("EMAIL"));
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return user;
    }

    public static Boolean forgotCredentials(final String id, final String email) throws Exception {
        try {
            HttpHelper helper = RemoteService.doGetJson(RemoteService.FORGOT_CREDENTIALS_URL + id + "-" + email);
            if (helper.getResponseCode() != 200)
                return Boolean.FALSE;
            if (helper.getJsonObject() != null) {
                if (!helper.getJsonObject().isNull("ERRORCODE"))
                    return Boolean.FALSE;
            }
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return Boolean.TRUE;
    }



    public static CheckoutResult checkOut(Checkout checkout) throws Exception {
        CheckoutResult checkoutResult = new CheckoutResult();
        try {
            HttpHelper helper = RemoteService.doGetJson(RemoteService.CHECKOUT_URL + checkout.getBmid() + "-" +  checkout.getProduct() + "-" + checkout.getCredits());
            if (helper.getResponseCode() != 200)
                return null;
            JSONObject jsonObject = helper.getJsonObject();
            checkoutResult.setOrderID(jsonObject.getString("ORDERID"));
            checkoutResult.setReferenceID(jsonObject.getInt("REFERENCEID"));
            checkoutResult.setOrderTotal(jsonObject.getString("TOTAL"));
            checkoutResult.setTopUpDescription(jsonObject.getString("DESCRIPTION"));
            checkoutResult.setTopUpCost(jsonObject.getString("COST"));
            checkoutResult.setTaxesApply(jsonObject.getBoolean("TAXESAPPLY"));
            JSONArray taxes = jsonObject.getJSONArray("TAXES");
            for (int i=0; i < taxes.length(); i++) {
                Tax tax = new Tax();
                tax.setAmount(taxes.getJSONObject(i).getDouble("AMOUNT"));
                tax.setDescription(taxes.getJSONObject(i).getString("DESCRIPTION"));
                checkoutResult.addTax(tax);
            }
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return checkoutResult;
    }

    public static PurchaseResult purchase(Purchase purchase) throws Exception {
        PurchaseResult purchaseResult = new PurchaseResult();
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("ORDERID", purchase.getCheckoutResult().getOrderID());
            jsonObject.put("REFERENCEID", purchase.getCheckoutResult().getReferenceID());
            if (Constants.MODE.equals("DEV"))
                jsonObject.put("TOTAL", "0.00");
            else
                jsonObject.put("TOTAL", purchase.getCheckoutResult().getOrderTotal());
            jsonObject.put("DESCRIPTION", purchase.getCheckoutResult().getTopUpDescription());
            jsonObject.put("CREDIT_CARD", purchase.getCreditCard());
            jsonObject.put("EXPIRATION", purchase.getExpiration());
            jsonObject.put("CCC", purchase.getCcc());
            jsonObject.put("NAME", purchase.getName());
            jsonObject.put("STREET_ADDRESS1", purchase.getStreetAddress1());
            //jsonObject.put("STREET_ADDRESS2", purchase.getStreetAddress2());
            jsonObject.put("CITY", purchase.getCity());
            jsonObject.put("STATE", purchase.getState());
            jsonObject.put("ZIP", purchase.getZip());
            jsonObject.put("PHONE", purchase.getPhone());
            jsonObject.put("EMAIL", purchase.getEmail());
            HttpHelper helper = RemoteService.doPost(RemoteService.PURCHASE_URL, jsonObject);
            if (helper.getResponseCode() != 200) {
                return null;
            }

            jsonObject = helper.getJsonObject();
            if (!jsonObject.isNull("APPROVAL_STATUS"))
                 purchaseResult.setApprovalStatus(jsonObject.getString("APPROVAL_STATUS"));
            if (!jsonObject.isNull("AUTHORIZATION_CODE"))
                purchaseResult.setAuthorizationCode(jsonObject.getString("AUTHORIZATION_CODE"));
            if (!jsonObject.isNull("AVS_RESP_CODE"))
                purchaseResult.setAvsRespCode(jsonObject.getString("AVS_RESP_CODE"));
            if (!jsonObject.isNull("CARD_BRAND"))
                purchaseResult.setCardBrand(jsonObject.getString("CARD_BRAND"));
            if (!jsonObject.isNull("CC_ACCOUNT_NUM"))
                purchaseResult.setCcAccountNum(jsonObject.getString("CC_ACCOUNT_NUM"));
            if (!jsonObject.isNull("CUSTOMER_REF_NUM"))
                purchaseResult.setCustomerRefNum(jsonObject.getString("CUSTOMER_REF_NUM"));
            if (!jsonObject.isNull("CVV_RESP_CODE"))
                purchaseResult.setCvvRespCode(jsonObject.getString("CVV_RESP_CODE"));
            if (!jsonObject.isNull("ERROR_CODE"))
                purchaseResult.setErrorCode(jsonObject.getString("ERROR_CODE"));
            if (!jsonObject.isNull("ERROR_TEXT"))
                purchaseResult.setErrorText(jsonObject.getString("ERROR_TEXT"));
            if (!jsonObject.isNull("ORDER_ID"))
                purchaseResult.setOrderID(jsonObject.getString("ORDER_ID"));
            if (!jsonObject.isNull("PROC_STATUS"))
                purchaseResult.setProcStatus(jsonObject.getString("PROC_STATUS"));
            if (!jsonObject.isNull("PROC_STATUS_MESSAGE"))
                purchaseResult.setProcStatusMessage(jsonObject.getString("PROC_STATUS_MESSAGE"));
            if (!jsonObject.isNull("REQUEST_AMOUNT"))
                purchaseResult.setRequestAmount(jsonObject.getString("REQUEST_AMOUNT"));
            if (!jsonObject.isNull("RESP_CODE"))
                purchaseResult.setRespCode(jsonObject.getString("RESP_CODE"));
            if (!jsonObject.isNull("RESP_CODE_MESSAGE"))
                purchaseResult.setRespCodeMessage(jsonObject.getString("RESP_CODE_MESSAGE"));
            if (!jsonObject.isNull("RESP_DATE_TIME"))
                purchaseResult.setRespDateTime(jsonObject.getString("RESP_DATE_TIME"));
            if (!jsonObject.isNull("TX_REF_NUM"))
                purchaseResult.setTxRefNum(jsonObject.getString("TX_REF_NUM"));
            if (!jsonObject.isNull("TOPUP_ID"))
                purchaseResult.setTopUpId(jsonObject.getString("TOPUP_ID"));
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return purchaseResult;
    }

    public static Integer ticket(final String name, final String email, final String subject, final String message) throws Exception {
        try {
            HttpHelper helper = RemoteService.doPost(RemoteService.TICKET_URL, "name=" + name + "&email=" + email + "&subject=" + subject + "&message=" + message);
            return helper.getResponseCode();
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static PromoResult savePromo(final Promo promo) throws Exception {
        PromoResult result = new PromoResult();
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("username", promo.getUsername());
            jsonObject.put("bmi", promo.getBmi());
            HttpHelper helper = RemoteService.doPost(RemoteService.PROMO_URL + "save", jsonObject);
            if (helper.getResponseCode() != 200)
                return null;
            jsonObject = helper.getJsonObject();
            if (Constants.MODE.equals("DEV"))
                System.out.println(helper.getJsonObject().toString());
            if (!jsonObject.isNull("isError"))
                result.setIsError(jsonObject.getBoolean("isError"));
            if (!jsonObject.isNull("userName"))
                result.setUserName(jsonObject.getString("userName"));
            if (!jsonObject.isNull("fullName"))
                result.setFullName(jsonObject.getString("fullName"));
            if (!jsonObject.isNull("bmLocation"))
                result.setBmiLocation(jsonObject.getString("bmLocation"));
            if (!jsonObject.isNull("errorCode"))
                result.setErrorCode(jsonObject.getInt("errorCode"));
            if (!jsonObject.isNull("errorMessage"))
                result.setErrorMessage(jsonObject.getString("errorMessage"));
        }
        catch (Exception e) {
            result.setErrorCode(1);
            result.setErrorMessage(e.getMessage());
        }
        return result;
    }
}

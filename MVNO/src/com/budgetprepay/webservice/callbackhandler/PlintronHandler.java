package com.budgetprepay.webservice.callbackhandler;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;

import com.budgetprepay.model.entity.PlintronAsyncResponse;
import com.budgetprepay.model.facade.PlintronAsyncResponseFacade;
import com.budgetprepay.scheduler.CommitScheduler;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleAsyncResponseInput;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesalePartnerPortoutValidationInput;
import com.budgetprepay.webservice.endpoints.PlintronEndpoint;
import com.budgetprepay.webservice.pojos.plintron.BlockUnblockSIMRequest;
import com.budgetprepay.webservice.pojos.plintron.BlockUnblockSIMResponse;
import com.budgetprepay.webservice.pojos.plintron.MessageHeaderType;
import com.budgetprepay.webservice.pojos.plintron.RemoveSubscriberRequest;
import com.budgetprepay.webservice.pojos.plintron.RemoveSubscriberResponse;

public class PlintronHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static Logger logger = Logger.getLogger(PlintronHandler.class);
	
    public PlintronHandler() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer sb = new StringBuffer();
        String line = null;
		BufferedReader reader = null;
		PrintWriter writer = null; 
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
	    PlintronAsyncResponse plintronAsyncResponse = new PlintronAsyncResponse();
	    String resp = null;
	    
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			
			response.setContentType("application/xml");
			writer = response.getWriter();
		    reader = request.getReader();
		    
		    
		    while ((line = reader.readLine()) != null)
		        sb.append(line);
		    		    
		    plintronAsyncResponse.setBody(sb.toString());
		    
			Document doc = dBuilder.parse(new ByteArrayInputStream(sb.toString().getBytes()));

			if (doc.getElementsByTagName("ns0:WholesaleAsyncResponseInput").getLength() > 0) {
				WholesaleAsyncResponseInput wholesaleAsyncResponseInput = WholesaleAsyncResponseInput.parse(doc);
				plintronAsyncResponse.setReferenceNumber(wholesaleAsyncResponseInput.getTransactionId());
				plintronAsyncResponse.setMdn(wholesaleAsyncResponseInput.getMsisdn());
				plintronAsyncResponse.setDescription(wholesaleAsyncResponseInput.getDescription());
				resp = WholesaleAsyncResponseInput.response("SUCCESS");
			    plintronAsyncResponse.setResponse(resp);
			    
			    switch (wholesaleAsyncResponseInput.getDescription()) {
			        case "PortOutDeactivation Successfully Complete":
			        	plintronAsyncResponse.setType("PortOutDeactivation");
			    	    break;
			        case "UpdatePortInRequest Successfully Complete":
			        	plintronAsyncResponse.setType("UpdatePortInRequest");
			        	CommitScheduler.schedulePlintronPortCSRFeedbackJob(plintronAsyncResponse);
			        	break;
			        case "PortIn request Cancelled":
			        	plintronAsyncResponse.setType("PortIn Cancelled");
			        	break;
			        case "Subscriber has reached the data threshold limit and is being WARNED":
			        	plintronAsyncResponse.setType("Threshold limit WARNED");
			        	break;
			        case "Subscriber has reached the data threshold limit and is being THROTTLED":
			        	plintronAsyncResponse.setType("Threshold limit THROTTLED");
			        	break;
			        case "Subscriber has reached the data threshold limit and is being BLOCKED":
			        	plintronAsyncResponse.setType("Threshold limit BLOCKED");
			        	break;
			        case "CreatePortInRequest Successfully Complete":
			        	plintronAsyncResponse.setType("CreatePortInRequest");
			        	CommitScheduler.schedulePlintronPortCSRFeedbackJob(plintronAsyncResponse);
			        	break;
			        case "CancelPortInRequest Successfully Complete":
			        	plintronAsyncResponse.setType("CancelPortInRequest");
			        	break;
			    	default:
			    		plintronAsyncResponse.setType(wholesaleAsyncResponseInput.getDescription().substring(0, 63));
			    		break;
			    }
			}
			
			if (doc.getElementsByTagName("ns0:WholesalePartnerPortoutValidationInput").getLength() > 0) {
				String imsi = "";
				String result = "0";
				String description = "Success";
				String messageCode = "";
				String status = "";
				
				WholesalePartnerPortoutValidationInput wholesalePartnerPortoutValidationInput = null;
				try {
					wholesalePartnerPortoutValidationInput = WholesalePartnerPortoutValidationInput.parse(doc);
					plintronAsyncResponse.setReferenceNumber(wholesalePartnerPortoutValidationInput.getTransactionId());
					plintronAsyncResponse.setMdn(wholesalePartnerPortoutValidationInput.getMsisdn());
					plintronAsyncResponse.setType("WholesalePartnerPortoutValidationInput");
					
					if (wholesalePartnerPortoutValidationInput.getMsisdn() == null) {
						messageCode = "6A";
						status = "MDN_NOT_FOUND";
						throw new Exception("MSISDN cannot be empty");
					}
					
					if (wholesalePartnerPortoutValidationInput.getMsisdn().length() != 10) {
						messageCode = "6A";
						status = "MDN_NOT_FOUND";
						throw new Exception("MSISDN must be 10 digits");
					}
					
					if (wholesalePartnerPortoutValidationInput.getOspAccountNumber() == null) {
						messageCode = "8A";
						status = "ACCOUNT_NUM_REQ_OR_INCORRECT";
						throw new Exception("Ops Account Number cannot be empty");
					}
					
					if (wholesalePartnerPortoutValidationInput.getSsn() == null) {
						messageCode = "8B";
						status = "SSN_TAX_ID_REQ_OR_INCORRECT";
						throw new Exception("SSN cannot be empty");
					}
					
				    try {
					    Connection connection = null;
					    Class.forName(ResourceUtil.get("hibernate.connection.driver")).newInstance();
					    String URI = ResourceUtil.get("plintron.portout.validate.url");
						connection = DriverManager.getConnection (URI, ResourceUtil.get("plintron.portout.validate.username"), ResourceUtil.get("plintron.portout.validate.password"));
				        String SPsql = "EXEC " + ResourceUtil.get("plintron.portout.validate.sp") + " ?,?,?";
					    PreparedStatement ps = connection.prepareStatement(SPsql);
					    ps.setString(1, wholesalePartnerPortoutValidationInput.getMsisdn());
					    ps.setString(2, wholesalePartnerPortoutValidationInput.getOspAccountNumber());
					    ps.setString(3, wholesalePartnerPortoutValidationInput.getSsn());
					    ResultSet rs = ps.executeQuery();
						ResultSetMetaData rsmd = rs.getMetaData();
						if (rsmd.getColumnCount() == 3) {
					        while (rs.next()) {
					        	imsi = rs.getString("IMSI");
						        result = rs.getString("Response_Code");
						        description = rs.getString("Error_Message");
					        }
						}
						else {
							while (rs.next()) {
					            result = rs.getString("Response_Code");
					            description = rs.getString("Error_Message");
							}
						}

				    }
				    catch (Exception e) {
						messageCode = "1P";
						status = "OTHER_REASON";
				    	throw new Exception(ResourceUtil.get("plintron.portout.validate.sp") + " - " + e.getMessage());
				    }
				    
				    switch (result) {
				    case "0":
						messageCode = "7A";
						status = "MDN_OK";
				    	break;
				    case "1":
						messageCode = "8A";
						status = "ACCOUNT_NUM_REQ_OR_INCORRECT";
				    	break;
				    case "2":
						messageCode = "6A";
						status = "MDN_NOT_FOUND";
				    	break;
				    case "3":
						messageCode = "6A";
						status = "MDN_NOT_FOUND";
				    	break;
				    case "4":
						messageCode = "7A";
						status = "MDN_OK";
				    	break;
				    case "5":
						messageCode = "8B";
						status = "SSN_TAX_ID_REQ_OR_INCORRECT";
				    	break;
				    case "6":
						messageCode = "8B";
						status = "SSN_TAX_ID_REQ_OR_INCORRECT";
				    	break;
				    default:
						messageCode = "IP";
						status = "OTHER_REASON";
				    	break;
				    }
					
				}
				catch (Exception e) {
					logger.error(e);
			        result = "ERROR";
			        description = e.getMessage();
				}

				resp = WholesalePartnerPortoutValidationInput.response(wholesalePartnerPortoutValidationInput.getMsisdn(), result, description, messageCode, status);	
			    plintronAsyncResponse.setResponse(resp);
			    
			    if (result.equals("0")) {
			        PlintronEndpoint endPoint = new PlintronEndpoint();
			    
			        try {
					    // Call Remove Subscriber
					    RemoveSubscriberRequest removeSubscriberRequest = new RemoveSubscriberRequest();
					    removeSubscriberRequest.setMessageHeader(new MessageHeaderType());
					    removeSubscriberRequest.getMessageHeader().setUsername("plintron_internal");
					    removeSubscriberRequest.setImsi(imsi);
					    removeSubscriberRequest.setMDN(wholesalePartnerPortoutValidationInput.getMsisdn());
					    removeSubscriberRequest.setReason("Ported-Out");
					    @SuppressWarnings("unused")
						JAXBElement<RemoveSubscriberResponse> removeSubscriberResponse = endPoint.removeSubscriberRequest(removeSubscriberRequest);
			        }
			        catch (Exception e) {
			        	logger.error(wholesalePartnerPortoutValidationInput.getMsisdn() + " - Port-Out validation Remove Subscriber" + sb.toString(), e);
			        }

			        try {
					    // Call Unblock SIM
					    BlockUnblockSIMRequest blockUnblockSIMRequest = new BlockUnblockSIMRequest();
					    blockUnblockSIMRequest.setMessageHeader(new MessageHeaderType());
					    blockUnblockSIMRequest.setMDN(wholesalePartnerPortoutValidationInput.getMsisdn());
					    blockUnblockSIMRequest.setOperationCode("PO");
					    blockUnblockSIMRequest.setSetFlag("1");
					    @SuppressWarnings("unused")
						JAXBElement<BlockUnblockSIMResponse> blockUnblockSIMResponse = endPoint.blockUnblockSIMRequest(blockUnblockSIMRequest);
			        }
			        catch (Exception e) {
			        	logger.error(wholesalePartnerPortoutValidationInput.getMsisdn() + " - Port-Out validation Unblock SIM" + sb.toString(), e);
			        }
			    }
			}
		} 
		catch (Exception e) { 
		    logger.error("Provisioning Listener ERROR " + sb.toString(), e);
			resp = WholesaleAsyncResponseInput.response("FAILURE");
		}
		finally {
			try {
				if (plintronAsyncResponse.getType() == null)
					plintronAsyncResponse.setType(plintronAsyncResponse.getDescription().substring(0, 63));
			    PlintronAsyncResponseFacade.createOrUpdate(plintronAsyncResponse);
			}
			catch (Exception e) {
				;
			}
		    writer.println(resp);
			reader.close();
			writer.flush();
			writer.close();
		}	
	}
}

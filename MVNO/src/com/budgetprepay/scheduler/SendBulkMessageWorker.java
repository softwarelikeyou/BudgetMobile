package com.budgetprepay.scheduler;

import org.apache.log4j.Logger;
import org.quartz.InterruptableJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.quartz.UnableToInterruptJobException;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.budgetprepay.model.entity.PlintronBulkMessageRequest;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.facade.PlintronBulkMessageRequestFacade;
import com.budgetprepay.model.facade.PlintronFacade;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.util.EmailUtil;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.client.plintron.esme.pojo.SMSNotifyRequest;

public class SendBulkMessageWorker implements StatefulJob, InterruptableJob {

	public static Logger logger = Logger.getLogger(SendBulkMessageWorker.class);
	
	private Request request = null;
	
	@SuppressWarnings("unchecked")
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		Socket socket = null;
		List<String> responses = new ArrayList<String>();
		
		try {
      
		    for (JobExecutionContext job : (List<JobExecutionContext>) context.getScheduler().getCurrentlyExecutingJobs()) {
				if (job.getJobDetail().getName().equals(context.getJobDetail().getName()) && !job.getJobInstance().equals(this)) {
					logger.info("Job " + context.getJobDetail().getName() + " is running");
					throw new JobExecutionException("Request Send Bulk Message Job " + context.getJobDetail().getName() + " is already running");
				}
			}
			
			request  = (Request) context.getJobDetail().getJobDataMap().get("request");

			if (request == null) {
				logger.error("Request cannot be null");
				throw new JobExecutionException("Request cannot be null");
			}
			
			// Get the latest data
			request = RequestFacade.retrieveByReferenceNumber(request.getReferenceNumber());
			
			if (request == null) {
				logger.error("Request cannot be null");
				throw new JobExecutionException("Request cannot be null");
			}
			
			List<SMSNotifyRequest> plintronRequests = PlintronFacade.getSMSNotifyRequestList(request);
			
			byte[] buffer = null;
			
			long sleep = 500;
			
			try {
				String esmeHost = null;
				Integer esmePort = null;
				esmeHost = ResourceUtil.get("plintron.esme.host");
				esmePort = Integer.valueOf(ResourceUtil.get("plintron.esme.port"));
				sleep = Long.valueOf(ResourceUtil.get("plintron.bulk.message.thread.sleep.ms"));
				
				if (esmeHost == null || esmePort == null)
					throw new Exception("Unable to open socket to Plintron SMS Server");
				
				socket = new Socket(esmeHost, esmePort);
			}
			catch (Exception e) {
				throw e;
			}		
			
			for (SMSNotifyRequest plintronRequest : plintronRequests) {
				PlintronBulkMessageRequest plintronBulkMessageRequest = new PlintronBulkMessageRequest();
				plintronBulkMessageRequest.setUser(request.getUser());
				plintronBulkMessageRequest.setReferenceNumber(request.getReferenceNumber());
				plintronBulkMessageRequest.setMdn(plintronRequest.getDestAddr().substring(1));
				plintronBulkMessageRequest.setStarted(new Date());
				plintronBulkMessageRequest.setRequestXML(plintronRequest.toString());
				String response = null;
				try {
					ByteBuffer out = ByteBuffer.allocate(new String(PlintronFacade.length(plintronRequest.toString()) + plintronRequest.toString()).length());
					out.order(ByteOrder.LITTLE_ENDIAN);
					out.put(new String(PlintronFacade.length(plintronRequest.toString()) + plintronRequest.toString()).getBytes());
			        
					DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
			        outToServer.write(out.array());
					
			        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
			        
			        while (inFromServer.available() <= 0)
			            Thread.sleep(sleep);
			    	
			        if (inFromServer.available() > 0) {
			            buffer = new byte[inFromServer.available()];
			        	inFromServer.readFully(buffer);
			        }
			        
			        response = new String(buffer);
			        plintronBulkMessageRequest.setResponseXML(response);
			        plintronBulkMessageRequest.setEnded(new Date());
			        PlintronBulkMessageRequestFacade.createorUpdate(plintronBulkMessageRequest);
			        
			        responses.add(response.replaceFirst("<SMSNotifyResponse>", "<SMSNotifyResponse>" + "\n" + "  <MDN>" + plintronBulkMessageRequest.getMdn() + "</MDN>") + "\n");
				}
				catch (Exception e) {
					responses.add(plintronBulkMessageRequest.getMdn() + "-" + plintronRequest.toString() + " - " + e.getMessage());
				}
			} // End For Loop
			
	        sendEmail(responses);
		}
		catch (Exception e) {
			responses.add(e.getMessage());
			sendEmail(responses);
		}
		finally {
			if (socket != null)
				try {
				    socket.close();
				}
				catch (Exception e) {
					;
				}
		}
	}
	
	private void sendEmail(final List<String> responses) {
		StringBuilder sb = new StringBuilder();
		for (String s : responses) 
			sb.append(s + "\t");
		
		EmailUtil email = new EmailUtil();
		email.setSubject("BudgetPrepay MVNO - Plintron Send Bulk Message");
		try {
		    email.sendXML(request.getUser().getEmail(), sb.toString());
		}
		catch (Exception ex) {
			logger.error(ex);
		}
	}

	@Override
	public void interrupt() throws UnableToInterruptJobException {
		try {
			EmailUtil email = new EmailUtil();
			email.setSubject("BudgetPrepay MVNO - Plintron Send Bulk Message");
			email.sendXML(request.getUser().getEmail(), "Canceled Job - " + request.getReferenceNumber());
	
		}
		catch (Exception e) {
			logger.error(e);
		}
	}
}

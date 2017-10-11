package com.budgetprepay.webservice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.budgetprepay.model.facade.ErrorRequestFacade;
import com.budgetprepay.model.facade.ErrorResponseFacade;

public class ErrorRequestResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			String xml = "";
			if (request.getParameter("request") != null)
			    xml = ErrorRequestFacade.retrieveById(Long.valueOf(request.getParameter("request"))).getXML();
			else if (request.getParameter("response") != null)
				xml = ErrorResponseFacade.retrieveById(Long.valueOf(request.getParameter("response"))).getXML();
			else
				throw new Exception("Invalid request");
			
			if (!xml.startsWith("<?xml"))
				writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			writer.append(xml);
		} 
		catch (Exception e) { 
		    writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			writer.append("<errorrequest>");
			writer.append("<message>" + e.getMessage() + "</message>");
			for (int i = 0; i < e.getStackTrace().length; i++) {
				StackTraceElement element = e.getStackTrace()[i];
				writer.append("<trace>");
				writer.append("<file>"   + element.getFileName()   + "</file>");
				writer.append("<class>"  + element.getClassName()  + "</class>");
				writer.append("<line>"   + element.getLineNumber() + "</line>");
				writer.append("<method>" + element.getMethodName() + "</method>");
				writer.append("</trace>");
			}
 			writer.append("</errorrequest>");
		}
		finally {
			writer.flush();
			writer.close();
		}
	}
}
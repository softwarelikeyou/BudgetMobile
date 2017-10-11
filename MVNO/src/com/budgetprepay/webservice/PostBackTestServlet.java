package com.budgetprepay.webservice;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostBackTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer sb = new StringBuffer();
		 String line = null;
		 BufferedReader reader = null;
		 try {
		     reader = request.getReader();
		     while ((line = reader.readLine()) != null)
		         sb.append(line);
		     System.out.println(sb.toString());
		 } 
		 catch (Exception e) { 
			 e.printStackTrace();
		 }
		 finally {
			 reader.close();
		 }
	}
	
}

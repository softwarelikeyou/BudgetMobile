package com.budgetprepay.webservice.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CommitOrderMock {

	public static void main(String[] args) {
        ServerSocket listener = null;
		try {     
			listener = new ServerSocket(9090);
		    while (true) {                
			    Socket socket = listener.accept();                
				try {                    
				    PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
					out.println("Commit");                
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				finally {                    
			        socket.close();               
				}            
			}        
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {            
		    try {
				listener.close();
			} 
		    catch (IOException e) {
				e.printStackTrace();
			}        
	    }
	}

}

package com.budgetprepay.webservice.client.plintron.billing.pojo;

import java.net.Socket;

public class Session {
    public Socket socket;
	public String sessionId;
	public String dialogId;
	
	public Session(Socket socket, String sessionId, String dialogId) {
		this.socket = socket;
		this.sessionId = sessionId;
		this.dialogId = dialogId;
	}
	
	public void close() throws Exception {
		if (socket != null)
			socket.close();
	}
}

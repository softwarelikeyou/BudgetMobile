package com.budgetprepay.webservice.client.bequick.pojo;

public enum Response {
	GETCOVERAGE("GetCoverageResponse");
	
	private String dataKey;

	private Response(String dataKey) {
		this.dataKey = dataKey;
	}

	public String asString() {
		return dataKey;
	}
	
	public static Response fromString(final String type)
	{
		for( Response temp : Response.values() ) {
			if (temp.dataKey.equals(type)) 
				return temp;
		}
		return null;
	}
}

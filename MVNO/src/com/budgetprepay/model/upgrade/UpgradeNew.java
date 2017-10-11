package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.budgetprepay.ServerVersion;

public class UpgradeNew extends Upgrade {

	@Override
	protected int getVersion() {
		return 0;
	}
	
	private static final String[] CREATE_QUERIES = new String[] {
		DatabaseConstants.CREATE_TBL_DBVERSION,
		DatabaseConstants.CREATE_TBL_CLASS_OF_SERVICE,
		DatabaseConstants.CREATE_TBL_GROUPS,
		DatabaseConstants.CREATE_TBL_GROUP_CLASS_OF_SERVICE,
		DatabaseConstants.CREATE_TBL_USERS,
		DatabaseConstants.CREATE_TBL_USERDATA,
		DatabaseConstants.CREATE_TBL_REQUESTS,
		DatabaseConstants.CREATE_TBL_ERROR_REQUESTS,
		DatabaseConstants.CREATE_TBL_ERROR_RESPONSES,
    };

    @Override  
    protected void upgrade(Connection connection) throws SQLException {
	    System.out.println("Building new database");

	    for (String createQuery : CREATE_QUERIES) {
		    PreparedStatement ps = connection.prepareStatement(createQuery);
		    System.out.println("UpgradeNew: Executing query: " + createQuery);
		    try {
			    ps.executeUpdate();
		    }
		    finally {
			    ps.close();
		    }
	    }
	    initializeVersionTable(connection, getVersion());
		createRequestIdIndex(connection);
		createUsersUsernameIndex(connection);
	    System.out.println("Database created");
    }
    
	private void initializeVersionTable(Connection connection, int version) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DatabaseConstants.INSERT_DBVERSION);
		try {
			ps.setInt(1, version);
			ps.setString(2, ServerVersion.SERVER_LONG_VERSION_STR);
			ps.executeUpdate();
		}
		finally {
			ps.close();
		}
	}
	
	private void createRequestIdIndex(Connection connection) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DatabaseConstants.CREATE_INDEX_REQUESTS_USER_ID);
		System.out.println("Upgrade: Executing query: " + DatabaseConstants.CREATE_INDEX_REQUESTS_USER_ID);
		try {
			ps.executeUpdate();
		}
		finally {
			ps.close();
		}
	}
	
	private void createUsersUsernameIndex(Connection connection) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DatabaseConstants.CREATE_INDEX_USERS_USERNAME);
		System.out.println("Upgrade: Executing query: " + DatabaseConstants.CREATE_INDEX_USERS_USERNAME);
		try {
			ps.executeUpdate();
		}
		finally {
			ps.close();
		}
	}
}

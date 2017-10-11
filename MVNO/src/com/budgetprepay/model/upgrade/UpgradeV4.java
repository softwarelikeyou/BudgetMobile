package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV4 extends Upgrade {

	@Override
	protected int getVersion() {
		return 4;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (columnExists(connection, DatabaseConstants.COL_CLIENT_ASYNCHRONOUS_RETURN_URL, DatabaseConstants.TBL_REQUESTS))
			alterColumn(connection, DatabaseConstants.TBL_REQUESTS, DatabaseConstants.COL_CLIENT_ASYNCHRONOUS_RETURN_URL, " varchar(255) NULL");
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

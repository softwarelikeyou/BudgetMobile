package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV12 extends Upgrade {

	@Override
	protected int getVersion() {
		return 12;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (columnExists(connection, DatabaseConstants.COL_MDN, DatabaseConstants.TBL_REQUESTS))
			alterColumn(connection, DatabaseConstants.TBL_REQUESTS, DatabaseConstants.COL_MDN, " varchar(11) NULL");
		
		if (columnExists(connection, DatabaseConstants.COL_DESCRIPTION, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE))
			alterColumn(connection, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE, DatabaseConstants.COL_DESCRIPTION, " varchar(255) NULL");
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

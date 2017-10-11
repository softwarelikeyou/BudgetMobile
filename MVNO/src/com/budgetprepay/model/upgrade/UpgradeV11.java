package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV11 extends Upgrade {

	@Override
	protected int getVersion() {
		return 11;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!columnExists(connection, DatabaseConstants.COL_TYPE, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE))
		    addColumn(connection, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE, DatabaseConstants.COL_TYPE, " varchar(64) NULL");
	
		if (!columnExists(connection, DatabaseConstants.COL_DESCRIPTION, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE))
		    addColumn(connection, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE, DatabaseConstants.COL_DESCRIPTION, " varchar(64) NULL");
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

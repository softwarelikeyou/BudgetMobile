package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV10 extends Upgrade {

	@Override
	protected int getVersion() {
		return 10;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!columnExists(connection, DatabaseConstants.COL_MDN, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE))
		    addColumn(connection, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE, DatabaseConstants.COL_MDN, " varchar(10) NULL");
	
		if (!columnExists(connection, DatabaseConstants.COL_RESPONSE, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE))
		    addColumn(connection, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE, DatabaseConstants.COL_RESPONSE, " varchar(max) NULL");
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV1 extends Upgrade {

	@Override
	protected int getVersion() {
		return 1;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!columnExists(connection, DatabaseConstants.COL_COMMITED, DatabaseConstants.TBL_REQUESTS))
		    addColumn(connection, DatabaseConstants.TBL_REQUESTS, DatabaseConstants.COL_COMMITED, " datetime NULL");

		if (!columnExists(connection, DatabaseConstants.COL_CANCEL, DatabaseConstants.TBL_REQUESTS))
		    addColumn(connection, DatabaseConstants.TBL_REQUESTS, DatabaseConstants.COL_CANCEL, " bit NULL");
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

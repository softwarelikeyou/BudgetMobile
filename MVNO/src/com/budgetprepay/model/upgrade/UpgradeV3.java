package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV3 extends Upgrade {

	@Override
	protected int getVersion() {
		return 3;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!columnExists(connection, DatabaseConstants.COL_MDN, DatabaseConstants.TBL_REQUESTS))
		    addColumn(connection, DatabaseConstants.TBL_REQUESTS, DatabaseConstants.COL_MDN, " varchar(10) NULL");
		
		if (!indexExists(connection, DatabaseConstants.TBL_REQUESTS, DatabaseConstants.INDEX_REQUESTS_MDN))
			executeSimpleQuery(connection, DatabaseConstants.CREATE_INDEX_REQUESTS_MDN);
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

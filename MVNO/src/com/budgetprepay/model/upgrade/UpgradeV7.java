package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV7 extends Upgrade {

	@Override
	protected int getVersion() {
		return 7;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!columnExists(connection, DatabaseConstants.COL_EMAIL, DatabaseConstants.TBL_USERS))
		    addColumn(connection, DatabaseConstants.TBL_USERS, DatabaseConstants.COL_EMAIL, " VARCHAR(40)");
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

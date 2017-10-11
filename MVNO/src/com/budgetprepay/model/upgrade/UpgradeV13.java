package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV13 extends Upgrade {

	@Override
	protected int getVersion() {
		return 13;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!tableExists(connection, DatabaseConstants.CREATE_TBL_PLINTRON_BULK_MESSAGE_REQUEST))
			executeSimpleQuery(connection, DatabaseConstants.CREATE_TBL_PLINTRON_BULK_MESSAGE_REQUEST);
	
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV8 extends Upgrade {

	@Override
	protected int getVersion() {
		return 8;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!tableExists(connection, DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE))
			executeSimpleQuery(connection, DatabaseConstants.CREATE_TBL_PLINTRON_ASYNC_RESPONSE);
	
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

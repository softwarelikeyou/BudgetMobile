package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV9 extends Upgrade {

	@Override
	protected int getVersion() {
		return 9;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!triggerExists(connection, DatabaseConstants.TRG_PLINTRON_ASYNC_RESPONSE))
			executeSimpleQuery(connection, DatabaseConstants.CREATE_TRG_PLINTRON_ASYNC_RESPONSE);
	
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

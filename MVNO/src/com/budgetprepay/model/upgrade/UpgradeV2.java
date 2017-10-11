package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV2 extends Upgrade {

	@Override
	protected int getVersion() {
		return 2;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		runScript(connection, DatabaseConstants.QUARTZ_SCRIPT_FILE);
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV6 extends Upgrade {

	@Override
	protected int getVersion() {
		return 6;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (!columnExists(connection, DatabaseConstants.COL_RESELLER_ID, DatabaseConstants.TBL_GROUPS))
		    addColumn(connection, DatabaseConstants.TBL_GROUPS, DatabaseConstants.COL_RESELLER_ID, " INT");
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

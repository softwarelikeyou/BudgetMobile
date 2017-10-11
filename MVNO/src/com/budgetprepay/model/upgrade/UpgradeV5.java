package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.SQLException;

public class UpgradeV5 extends Upgrade {

	@Override
	protected int getVersion() {
		return 5;
	}
	
	@Override
	protected void upgrade(Connection connection) throws SQLException, Exception {
		
		if (columnExists(connection, DatabaseConstants.COL_VERIZON_SYNCHRONOUS_REQUEST_XML, DatabaseConstants.TBL_REQUESTS))
			alterColumn(connection, DatabaseConstants.TBL_REQUESTS, DatabaseConstants.COL_VERIZON_SYNCHRONOUS_REQUEST_XML, " varchar(max) NULL");
		
		InitializeDatabase.updateVersionTable(connection, getVersion());
	}
}

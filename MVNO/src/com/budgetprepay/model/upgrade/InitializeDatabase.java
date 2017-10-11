package com.budgetprepay.model.upgrade;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.budgetprepay.ServerVersion;

public class InitializeDatabase {
		
	protected static final Map<Integer, Class<? extends Upgrade>> UPGRADE_MAP = new LinkedHashMap<Integer, Class<? extends Upgrade>>();
	static {
		UPGRADE_MAP.put(1, UpgradeV1.class);
		UPGRADE_MAP.put(2, UpgradeV2.class);
		UPGRADE_MAP.put(3, UpgradeV3.class);
		UPGRADE_MAP.put(4, UpgradeV4.class);
		UPGRADE_MAP.put(5, UpgradeV5.class);
		UPGRADE_MAP.put(6, UpgradeV6.class);
		UPGRADE_MAP.put(7, UpgradeV7.class);
		UPGRADE_MAP.put(8, UpgradeV8.class);
		UPGRADE_MAP.put(9, UpgradeV9.class);
		UPGRADE_MAP.put(10, UpgradeV10.class);
		UPGRADE_MAP.put(11, UpgradeV11.class);
		UPGRADE_MAP.put(12, UpgradeV12.class);
		UPGRADE_MAP.put(13, UpgradeV13.class);
	}
	
	public static final int CURRENT_OM_VERSION = UPGRADE_MAP.size();

	public void initDatabase(Connection connection) throws Exception {
		UpgradeNew upgradeNew = null;

		// Check first to see if we need to populate a new DB
		try {
			if (isEmpty(connection)) {
				upgradeNew = UpgradeNew.class.newInstance();
				upgradeNew.upgrade(connection);
			}
		}
		catch( Exception e ) {
			throw new Exception("Could not initialize database", e);
		}
		// Check DB so see if any upgrades are needed.
		try {
			upgradeDatabase(connection);
		}
		catch( Exception e ) {
			throw new Exception("Could not initialize database", e);
		}
	}
	
	private boolean isEmpty(Connection connection) throws Exception {
		boolean results = true;
		PreparedStatement ps = connection.prepareStatement("SELECT name FROM sys.tables");
		try {
			ResultSet resultSet = ps.executeQuery();
			try {
				if( resultSet.next() ) 
					results = false;
			}
			finally {
				resultSet.close();
			}
		}
		finally {
			ps.close();
		}
		return results;
	}

	protected static void upgradeDatabase(Connection connection) throws Exception {
		int versionFound = 0;
		String lastUpgradedFromCDPVersion = null;
		PreparedStatement ps = connection.prepareStatement(DatabaseConstants.SELECT_VERSION_TABLE);
		try {
			// Get the latest version of the DB
			ResultSet rs = ps.executeQuery();
			try {
				if( rs.next() ) {
					versionFound = rs.getInt(DatabaseConstants.COL_OM_VERSION);
					lastUpgradedFromCDPVersion = rs.getString(DatabaseConstants.COL_LAST_UPGRADE_VERSION);
				}
			}
			finally {
				rs.close();
			}
		}
		finally {
			ps.close();
		}
		if (lastUpgradedFromCDPVersion == null) 
			lastUpgradedFromCDPVersion = "(never)";
		System.out.println("Found database version " + versionFound + "-" + lastUpgradedFromCDPVersion);
		// if same version do nothing
		if (versionFound == CURRENT_OM_VERSION) 
			return;
		// do not allow downgrades
		if (versionFound > CURRENT_OM_VERSION) 
			throw new Exception("Database downgrade warning");
		// find the first version to upgrade to
		Iterator<Integer> it = UPGRADE_MAP.keySet().iterator();
		while (it.hasNext()) {
			Upgrade upgrader = null;
			Integer upgradeVersion = it.next();
			if( upgradeVersion <= versionFound ) 
				continue;
			System.out.println("Uprading database to " + upgradeVersion);
			Class<? extends Upgrade> upgradeClass = UPGRADE_MAP.get(upgradeVersion);
			try {
				upgrader = upgradeClass.getConstructor().newInstance();
			}
			catch( IllegalArgumentException e ) {
				throw new RuntimeException(e);
			}
			catch (SecurityException e) {
				throw new RuntimeException(e);
			}
			catch (InstantiationException e) {
				throw new RuntimeException(e);
			}
			catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
			catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
			catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
			upgrader.upgrade(connection);
		}

	}
	
	protected static void updateVersionTable(Connection connection, int newVersion) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DatabaseConstants.UPDATE_VERSION_TABLE);
		try {
			ps.setInt(1, newVersion);
			ps.setString(2, ServerVersion.SERVER_LONG_VERSION_STR);
			ps.executeUpdate();
		}
		finally {
			ps.close();
		}
	}
}
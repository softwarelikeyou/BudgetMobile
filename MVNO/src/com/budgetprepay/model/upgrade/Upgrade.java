package com.budgetprepay.model.upgrade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

public abstract class Upgrade {

	private static final String ADD_COLUMN_FORMAT_STRING = "ALTER TABLE %s ADD %s %s";
	private static final String DROP_COLUMN_FORMAT_STRING = "ALTER TABLE %s DROP COLUMN %s";
	private static final String ALTER_COLUMN_FORMAT_STRING = "ALTER TABLE %s ALTER COLUMN %s %s";
	private static final String TABLE_EXISTS_FORMAT_STRING = "SELECT name FROM sys.tables WHERE Name = N'%s'";
	private static final String COLUMN_EXISTS_FORMAT_STRING = "SELECT name FROM sys.columns WHERE Name = N'%s' AND Object_ID = Object_ID(N'%s')";
	private static final String INDEX_EXISTS_FORMAT_STRING = "SELECT name FROM sys.indexes WHERE Name = N'%s' AND Object_ID = Object_ID(N'%s')";
	private static final String TRIGGER_EXISTS_FORMAT_STRING = "SELECT * FROM sys.triggers WHERE Name = N'%s'";
	
	protected abstract void upgrade(Connection connection) throws Exception;
	
	protected abstract int getVersion();
	
	protected void addColumn(Connection connection, String tableName, String columnName, String columnDefinition) throws SQLException {
		String addColumnQuery = String.format(ADD_COLUMN_FORMAT_STRING, tableName, columnName, columnDefinition);
		System.out.println("Upgrade: addColumn: Executing query: " + addColumnQuery);
		executeSimpleQuery(connection, addColumnQuery);
	}

	protected void dropColumn(Connection connection, String tableName, String columnName) throws SQLException {
		String dropColumnQuery = String.format(DROP_COLUMN_FORMAT_STRING, tableName, columnName);
		System.out.println("Upgrade: dropColumn: Executing query: " + dropColumnQuery);
		executeSimpleQuery(connection, dropColumnQuery);
	}
	
	protected void alterColumn(Connection connection, String tableName, String columnName, String columnDefinition) throws SQLException {
		String alterColumnQuery = String.format(ALTER_COLUMN_FORMAT_STRING, tableName, columnName, columnDefinition);
		System.out.println("Upgrade: alterColumn: Executing query: " + alterColumnQuery);
		executeSimpleQuery(connection, alterColumnQuery);
	}
	
	protected static void executeSimpleQuery(Connection connection, String query) throws SQLException {
		System.out.println("Upgrade: Executing query: " + query);
		PreparedStatement ps = connection.prepareStatement(query);
		try {
			ps.execute();
		}
		finally {
			ps.close();
		}
	}
	
	protected boolean tableExists(Connection connection, final String tableName) throws Exception {
		boolean results = true;
		int rowCount = 0;
		PreparedStatement ps = connection.prepareStatement(String.format(TABLE_EXISTS_FORMAT_STRING, tableName));
		try {
			ResultSet resultSet = ps.executeQuery();
			try {
				while (resultSet.next())   
				    rowCount++;   
				if (rowCount == 0)
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
	
	protected boolean columnExists(Connection connection, final String columnName, final String tableName) throws Exception {
		boolean results = true;
		int rowCount = 0;
		PreparedStatement ps = connection.prepareStatement(String.format(COLUMN_EXISTS_FORMAT_STRING, columnName, tableName));
		try {
			ResultSet resultSet = ps.executeQuery();
			try {
				while (resultSet.next())   
				    rowCount++;   
				if (rowCount == 0)
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
	
	protected boolean indexExists(Connection connection, final String tableName, final String indexName) throws Exception {
		boolean results = true;
		int rowCount = 0;
		PreparedStatement ps = connection.prepareStatement(String.format(INDEX_EXISTS_FORMAT_STRING, tableName, indexName));
		try {
			ResultSet resultSet = ps.executeQuery();
			try {
				while (resultSet.next())   
				    rowCount++;   
				if (rowCount == 0)
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
	
	protected boolean triggerExists(Connection connection, String triggerName) throws Exception {
		boolean results = true;
		int rowCount = 0;
		PreparedStatement ps = connection.prepareStatement(String.format(TRIGGER_EXISTS_FORMAT_STRING, triggerName));
		try {
			ResultSet resultSet = ps.executeQuery();
			try {
				while (resultSet.next())   
				    rowCount++;   
				if (rowCount == 0)
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
	
	protected static void runScript(Connection connection, final String script) throws Exception {
		try {
		    ResourceDatabasePopulator rdp = new ResourceDatabasePopulator(); 
		    rdp.addScript(new ClassPathResource(script));
		    System.out.println("Upgrade: runScript: Executing file: " + script);
	        rdp.populate(connection);
		} 
		catch (Exception e) {
		    throw new Exception("Unable to run sql script " + script);
		}
	}
}

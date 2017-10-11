package com.budgetprepay.model.upgrade;

public interface DatabaseConstants
{
	// Table names
	public static final String TBL_DBVERSION = "DBVERSION";
	public static final String TBL_GROUPS = "GROUPS";
	public static final String TBL_USERS = "USERS";
	public static final String TBL_USERDATA = "USERDATA";
	public static final String TBL_REQUESTS = "REQUESTS";
	public static final String TBL_ERROR_REQUESTS = "ERROR_REQUESTS";
	public static final String TBL_ERROR_RESPONSES = "ERROR_RESPONSES";
	public static final String TBL_CLASS_OF_SERVICE = "CLASS_OF_SERVICE";
	public static final String TBL_GROUP_CLASS_OF_SERVICE = "GROUP_CLASS_OF_SERVICE";
	public static final String TBL_PLINTRON_ASYNC_RESPONSE = "PLINTRON_ASYNC_RESPONSE";
	public static final String TBL_PLINTRON_BULK_MESSAGE_REQUEST = "PLINTRON_BULK_MESSAGE_REQUEST";
	
	// Column Names
	public static final String COL_OM_VERSION = "OM_VERSION";
	public static final String COL_LAST_UPGRADE_VERSION = "LAST_UPGRAD_EVERSION";
	public static final String COL_ID = "ID";
	public static final String COL_ACCOUNT_NUMBER = "ACCOUNT_NUMBER";
	public static final String COL_CLASS_OF_SERVICE = "CLASS_OF_SERVICE";
	public static final String COL_DISPLAY = "DISPLAY";
	public static final String COL_NAME = "NAME";
	public static final String COL_ENABLED = "ENABLED";
	public static final String COL_PASSWORD = "PASSWORD";
	public static final String COL_USERTYPE = "USERTYPE";
	public static final String COL_USERNAME = "USERNAME";
	public static final String COL_GROUP_ID = "GROUP_ID";
	public static final String COL_USER_ID = "USER_ID";
	public static final String COL_PROPERTY = "PROPERTY";
	public static final String COL_VALUE = "VALUE";
	public static final String COL_CLIENT_ASYNCHRONOUS_RESPONSE_XML = "CLIENT_ASYNCHRONOUS_RESPONSE_XML";
	public static final String COL_CLIENT_ASYNCHRONOUS_RETURN_HTTP_CODE = "CLIENT_ASYNCHRONOUS_RETURN_HTTP_CODE";
	public static final String COL_CLIENT_ASYNCHRONOUS_RETURN_URL = "CLIENT_ASYNCHRONOUS_RETURN_URL";
	public static final String COL_CLIENT_REFERENCE = "CLIENT_REFERENCE";
	public static final String COL_CLIENT_REQUEST_CLASS = "CLIENT_REQUEST_CLASS";
	public static final String COL_CLIENT_REQUEST_XML = "CLIENT_REQUEST_XML";
	public static final String COL_CLIENT_SYNCHRONOUS_RESPONSE_XML = "CLIENT_SYNCHRONOUS_RESPONSE_XML";
	public static final String COL_CREATED = "CREATED";
	public static final String COL_REFERENCE_NUMBER = "REFERENCE_NUMBER";
	public static final String COL_TYPE = "TYPE";
	public static final String COL_VERIZON_ASYNCHRONOUS_RESPONSE_XML = "VERIZON_ASYNCHRONOUS_RESPONSE_XML";
	public static final String COL_VERIZON_SYNCHRONOUS_REQUEST_XML = "VERIZON_SYNCHRONOUS_REQUEST_XML";
	public static final String COL_VERIZON_SYNCHRONOUS_RESPONSE_XML = "VERIZON_SYNCHRONOUS_RESPONSE_XML";
	public static final String COL_XML = "XML";
	public static final String COL_RATE_PLAN = "RATE_PLAN";
	public static final String COL_CLASS_OF_SERVICE_ID = "CLASS_OF_SERVICE_ID";
	public static final String COL_URL = "URL";
	public static final String COL_CANCEL = "CANCEL";
	public static final String COL_COMMITED = "COMMITED";
	public static final String COL_MDN = "MDN";
	public static final String COL_RESELLER_ID = "RESELLER_ID";
	public static final String COL_EMAIL = "EMAIL";
	public static final String COL_STATUS = "STATUS";
	public static final String COL_BODY = "BODY";
	public static final String COL_RESPONSE = "RESPONSE";
	public static final String COL_DESCRIPTION = "DESCRIPTION";
	public static final String COL_STARTED = "STARTED";
	public static final String COL_ENDED = "ENDED";
	public static final String COL_MESSAGE = "MESSAGE";
	public static final String COL_REQUEST_XML = "REQUEST_XML";
	public static final String COL_RESPONSE_XML = "RESPONSE_XML";
	
	// Index names

	public static final String INDEX_REQUESTS_USER_ID = "REQUESTS_USER_ID_IDX";
	public static final String INDEX_USERS_USERNAME = "USERS_USERNAME_IDX";
	public static final String INDEX_REQUESTS_MDN = "REQUESTS_MDN_IDX";
	
	// Trigger names
	public static final String TRG_PLINTRON_ASYNC_RESPONSE = "Coorelate_Request_Response";
	
	// Create table statements

	public static final String CREATE_TBL_DBVERSION  = "CREATE TABLE " +
	    DatabaseConstants.TBL_DBVERSION + " (" +
		DatabaseConstants.COL_OM_VERSION + " INT, " +
		DatabaseConstants.COL_LAST_UPGRADE_VERSION + " VARCHAR(255)) ";
	
	public static final String CREATE_TBL_GROUPS = "CREATE TABLE " +
		DatabaseConstants.TBL_GROUPS + " (" +
		DatabaseConstants.COL_ID + " numeric(19, 0) IDENTITY(1,1) NOT NULL PRIMARY KEY, " +
		DatabaseConstants.COL_NAME + " varchar(255) NOT NULL UNIQUE, " +
		DatabaseConstants.COL_DISPLAY + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_ACCOUNT_NUMBER + " varchar(255))";
	
	public static final String CREATE_TBL_USERS = "CREATE TABLE " +
		DatabaseConstants.TBL_USERS + " (" +
		DatabaseConstants.COL_ID + " numeric(19, 0) IDENTITY(1,1) NOT NULL PRIMARY KEY, " +
		DatabaseConstants.COL_DISPLAY + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_EMAIL + " varchar(40), " +
		DatabaseConstants.COL_ENABLED + " tinyint NOT NULL, " +
		DatabaseConstants.COL_PASSWORD + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_USERTYPE + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_USERNAME + " varchar(255) NOT NULL UNIQUE, " +
		DatabaseConstants.COL_GROUP_ID + " numeric(19, 0) NOT NULL FOREIGN KEY REFERENCES GROUPS(ID))";
			
	public static final String CREATE_TBL_USERDATA = "CREATE TABLE " +
		DatabaseConstants.TBL_USERDATA + " (" +
		DatabaseConstants.COL_USER_ID + " numeric(19, 0) NOT NULL FOREIGN KEY REFERENCES USERS(ID), " +
		DatabaseConstants.COL_PROPERTY + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_VALUE + " varchar(255) NULL)";
			
	public static final String CREATE_TBL_REQUESTS = "CREATE TABLE " +
		DatabaseConstants.TBL_REQUESTS + " (" +
		DatabaseConstants.COL_ID + " numeric(19, 0) IDENTITY(1,1) NOT NULL PRIMARY KEY, " +
		DatabaseConstants.COL_USER_ID + " numeric(19, 0) NOT NULL FOREIGN KEY REFERENCES USERS(ID), " +
		DatabaseConstants.COL_CLIENT_ASYNCHRONOUS_RESPONSE_XML + " varchar(max) NULL, " +
		DatabaseConstants.COL_CLIENT_ASYNCHRONOUS_RETURN_HTTP_CODE + " int NULL, " +
		DatabaseConstants.COL_CLIENT_ASYNCHRONOUS_RETURN_URL + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_CLIENT_REFERENCE + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_CLIENT_REQUEST_CLASS + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_CLIENT_REQUEST_XML + " varchar(max) NOT NULL, " +
		DatabaseConstants.COL_CLIENT_SYNCHRONOUS_RESPONSE_XML + " varchar(max) NULL, " +
		DatabaseConstants.COL_CREATED + " datetime NULL, " +
		DatabaseConstants.COL_REFERENCE_NUMBER + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_TYPE + " varchar(255) NOT NULL, " +
		DatabaseConstants.COL_VERIZON_ASYNCHRONOUS_RESPONSE_XML + " varchar(max) NULL, " +
		DatabaseConstants.COL_VERIZON_SYNCHRONOUS_REQUEST_XML + " varchar(max) NOT NULL, " +
		DatabaseConstants.COL_VERIZON_SYNCHRONOUS_RESPONSE_XML + " varchar(max) NULL, " +
		DatabaseConstants.COL_COMMITED + " datetime NULL, " +
		DatabaseConstants.COL_CANCEL + " bit NULL, " +
		DatabaseConstants.COL_MDN + " varchar(10) NULL)";
			
	public static final String CREATE_TBL_ERROR_REQUESTS = "CREATE TABLE " +
		DatabaseConstants.TBL_ERROR_REQUESTS + " (" +	
		DatabaseConstants.COL_ID + " numeric(19, 0) IDENTITY(1,1) NOT NULL PRIMARY KEY, " +
		DatabaseConstants.COL_CREATED + " datetime NULL, " +
		DatabaseConstants.COL_XML + " varchar(max) NULL)";
	
	public static final String CREATE_TBL_ERROR_RESPONSES = "CREATE TABLE " +
		DatabaseConstants.TBL_ERROR_RESPONSES + " (" +	
		DatabaseConstants.COL_ID + " numeric(19, 0) IDENTITY(1,1) NOT NULL PRIMARY KEY, " +
		DatabaseConstants.COL_CREATED + " datetime NULL, " +
		DatabaseConstants.COL_XML + " varchar(max) NULL)";
		
	public static final String CREATE_TBL_CLASS_OF_SERVICE = "CREATE TABLE " +
		DatabaseConstants.TBL_CLASS_OF_SERVICE + " (" +	
		DatabaseConstants.COL_ID + " numeric(19, 0) IDENTITY(1,1) NOT NULL PRIMARY KEY, " +
		DatabaseConstants.COL_ENABLED + " tinyint NOT NULL, " +
		DatabaseConstants.COL_NAME + " varchar(255) NOT NULL UNIQUE, " +
		DatabaseConstants.COL_RATE_PLAN + " varchar(255) NOT NULL)";
			
	public static final String CREATE_TBL_GROUP_CLASS_OF_SERVICE = "CREATE TABLE " +
		DatabaseConstants.TBL_GROUP_CLASS_OF_SERVICE + " (" +	
		DatabaseConstants.COL_GROUP_ID + " numeric(19, 0) NOT NULL FOREIGN KEY REFERENCES " + TBL_GROUPS + "(" + COL_ID + "), " +
		DatabaseConstants.COL_CLASS_OF_SERVICE_ID + " numeric(19, 0) NOT NULL FOREIGN KEY REFERENCES " + TBL_CLASS_OF_SERVICE + "(" + COL_ID + "))";
	
	public static final String CREATE_TBL_PLINTRON_ASYNC_RESPONSE = "CREATE TABLE " +
			DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE + " (" +	
			DatabaseConstants.COL_ID + " numeric(19, 0) IDENTITY(1,1) NOT NULL PRIMARY KEY, " +
			DatabaseConstants.COL_CREATED + " datetime NOT NULL, " +
			DatabaseConstants.COL_STATUS + " int NULL, " +
			DatabaseConstants.COL_REFERENCE_NUMBER + " varchar(255) NULL, " +
			DatabaseConstants.COL_MDN + " varchar(10) NULL, " +
			DatabaseConstants.COL_TYPE + " varchar(64) NULL, " +
			DatabaseConstants.COL_DESCRIPTION + " varchar(64) NULL, " +
			DatabaseConstants.COL_BODY + " varchar(max) NULL, " +
	        DatabaseConstants.COL_RESPONSE + " varchar(max) NULL)";
	
	public static final String CREATE_TBL_PLINTRON_BULK_MESSAGE_REQUEST = "CREATE TABLE " +
			DatabaseConstants.TBL_PLINTRON_BULK_MESSAGE_REQUEST + " (" +	
			DatabaseConstants.COL_ID + " numeric(19, 0) IDENTITY(1,1) NOT NULL PRIMARY KEY, " +
			DatabaseConstants.COL_USER_ID + " numeric(19, 0) NOT NULL FOREIGN KEY REFERENCES USERS(ID), " +
			DatabaseConstants.COL_REFERENCE_NUMBER + " varchar(255) NULL, " +
			DatabaseConstants.COL_MDN + " varchar(10) NULL, " +
			DatabaseConstants.COL_STARTED + " datetime NOT NULL, " +
			DatabaseConstants.COL_ENDED + " datetime NULL, " +
			DatabaseConstants.COL_REQUEST_XML + " varchar(max) NULL, " +
			DatabaseConstants.COL_RESPONSE_XML + " varchar(max) NULL)";
	
	// Create Index Statements 

	public static final String CREATE_INDEX_REQUESTS_USER_ID = "CREATE INDEX " + 
	    DatabaseConstants.INDEX_REQUESTS_USER_ID + 
	    " ON " + 
	    DatabaseConstants.TBL_REQUESTS + 
	    " (" + DatabaseConstants.COL_USER_ID + ")";
	
	public static final String CREATE_INDEX_USERS_USERNAME = "CREATE INDEX " + 
		    DatabaseConstants.INDEX_USERS_USERNAME + 
		    " ON " + 
		    DatabaseConstants.TBL_USERS + 
		    " (" + DatabaseConstants.COL_USERNAME + ")";
	
	public static final String CREATE_INDEX_REQUESTS_MDN = "CREATE INDEX " + 
		    DatabaseConstants.INDEX_REQUESTS_MDN + 
		    " ON " + 
		    DatabaseConstants.TBL_REQUESTS + 
		    " (" + DatabaseConstants.COL_MDN + ")";
	
	// Select statements
	public static final String SELECT_VERSION_TABLE = "SELECT " +
		DatabaseConstants.COL_OM_VERSION + "," +
		DatabaseConstants.COL_LAST_UPGRADE_VERSION + " FROM " +
		DatabaseConstants.TBL_DBVERSION;

	// Update Statements
	public static final String UPDATE_VERSION_TABLE = "UPDATE " +
		DatabaseConstants.TBL_DBVERSION + " SET " +
		DatabaseConstants.COL_OM_VERSION + "=?, " +
		DatabaseConstants.COL_LAST_UPGRADE_VERSION + "= ?";
	
	// Insert Statements
	public static final String INSERT_DBVERSION = "INSERT INTO " + DatabaseConstants.TBL_DBVERSION + " VALUES(?,?)";

	// Script files
	public static final String QUARTZ_SCRIPT_FILE = "com/budgetprepay/model/upgrade/quartz.sql";
	
	// Trigger Statements
	public static final String CREATE_TRG_PLINTRON_ASYNC_RESPONSE = "CREATE TRIGGER " + TRG_PLINTRON_ASYNC_RESPONSE +
			                                                        " ON PLINTRON_ASYNC_RESPONSE" +
                                                                    " AFTER INSERT AS" +
                                                                    " UPDATE REQUESTS" +
                                                                    " SET REQUESTS.VERIZON_ASYNCHRONOUS_RESPONSE_XML = i.BODY" +
                                                                    " FROM Inserted i" +
                                                                    " WHERE REQUESTS.REFERENCE_NUMBER = i.REFERENCE_NUMBER";
	
	public static final String LOG4J_AUDIT_FILE =   "com/budgetprepay/model/upgrade/audit.sql";
}

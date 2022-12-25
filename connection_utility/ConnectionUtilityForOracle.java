package com.connection_utility;
import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

public class ConnectionUtilityForOracle {
 public static Connection conn;
 public static OracleDataSource ods;

public static Connection getMyConnection() {
	try {
		ods = new OracleDataSource();
		ods.setUser("system");
		ods.setPassword("2212");
		ods.setDriverType("thin");
		ods.setPortNumber(1521);
		ods.setDatabaseName("xe");
		ods.setServerName("localhost");
		conn = ods.getConnection();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return conn;
	
}
}

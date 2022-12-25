package com.connection_utility;
import java.sql.Connection;
import com.mysql.cj.jdbc.MysqlDataSource;

 public class ConnectionUtilityForMySQL {
	 public static Connection conn;
	 public static MysqlDataSource mds;
	
	public static Connection getMySQLConnection() {
		try {
			mds = new MysqlDataSource();
			mds.setServerName("localhost");
			mds.setPortNumber(3306);
			mds.setDatabaseName("vinayak");
			mds.setUser("root");
			mds.setPassword("2212");
			conn = mds.getConnection();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn; 
		
	}
}



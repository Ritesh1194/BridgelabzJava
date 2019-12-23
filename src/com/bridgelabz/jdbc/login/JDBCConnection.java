package com.bridgelabz.jdbc.login;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	private static Connection connection = null;
	static {
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Ritesh?autoRecoonect=true&useSSL=false", "root", "mysql");
		} catch (Exception e) {
		}
	}

	public static Connection dbConnection() {
		return connection;
	}
}
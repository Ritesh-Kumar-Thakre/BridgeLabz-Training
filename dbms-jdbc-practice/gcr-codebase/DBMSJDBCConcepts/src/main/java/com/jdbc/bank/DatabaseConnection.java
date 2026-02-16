package com.jdbc.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/Bank?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true\";\r\n";
	private static final String USER = "root";
	private static final String PASSWORD = "Ritesh2004";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}

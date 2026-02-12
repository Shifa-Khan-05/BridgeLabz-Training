package com.preparedstatementsvsstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static String URL="jdbc:mysql://localhost:3306/jdbcconnection";
	private static String PASSWORD="05052005";
	private static String USER="root";
	
	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection= DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("Database connected successfully");
		} catch (ClassNotFoundException e) {
 
			System.out.println("MYSQL Drivaer not found");
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}

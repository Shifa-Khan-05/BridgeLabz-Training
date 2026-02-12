package com.databaseconnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		Connection conn= DatabaseConnection.getConnection();
	    if(conn!=null)
	    {
	    	try {
				conn.close();
				System.out.println("Connection is closed...");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	}
}

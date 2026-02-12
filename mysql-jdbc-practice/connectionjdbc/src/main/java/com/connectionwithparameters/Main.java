package com.connectionwithparameters;
import java.sql.Connection;
import java.sql.SQLException;
public class Main {
	 public static void main(String[] args) {

	        try {
	        	Connection connection = DatabaseConfig.getConnection();

	            if (connection != null) {
	                System.out.println("Database connected successfully");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}

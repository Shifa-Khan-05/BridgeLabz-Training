package com.singletonpatternconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {

    // Step 1: Create static instance
    private static DatabaseConnectionSingleton instance;

    // Step 2: Create Connection object
    private Connection connection;

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/jdbcconnection";
    private static final String USER = "root";
    private static final String PASSWORD = "05052005";

    // Step 3: Private constructor
    private DatabaseConnectionSingleton() throws SQLException {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database connected successfully!");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found", e);
        }
    }

    // Step 4: Global access point
    public static DatabaseConnectionSingleton getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DatabaseConnectionSingleton();
        }
        return instance;
    }

    // Step 5: Getter for connection
    public Connection getConnection() {
        return connection;
    }
}

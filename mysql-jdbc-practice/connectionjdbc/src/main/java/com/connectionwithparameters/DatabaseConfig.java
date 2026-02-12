package com.connectionwithparameters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/jdbcconnection";

        java.util.Properties properties = new java.util.Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "05052005");
        properties.setProperty("useSSL", "false");
        properties.setProperty("serverTimezone", "UTC");
        properties.setProperty("allowPublicKeyRetrieval", "true");

        return DriverManager.getConnection(url, properties);
    }
}

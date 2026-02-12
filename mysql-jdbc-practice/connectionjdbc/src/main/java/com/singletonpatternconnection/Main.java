package com.singletonpatternconnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
            // Get singleton instance
            DatabaseConnectionSingleton dbInstance =
                    DatabaseConnectionSingleton.getInstance();

            // Get connection
            Connection con = dbInstance.getConnection();

            if (con != null && !con.isClosed()) {
                System.out.println("Connection is active.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

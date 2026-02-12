package com.transactionmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
public class SavepointExample {

    public static void complexTransaction() {

        Connection conn = null;
        Savepoint savepoint1 = null;
        Savepoint savepoint2 = null;

        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);

            String sql = "INSERT INTO logs (message) VALUES (?)";

            PreparedStatement pstmt1 = conn.prepareStatement(sql);
            pstmt1.setString(1, "Operation 1");
            pstmt1.executeUpdate();

            savepoint1 = conn.setSavepoint("Savepoint1");

            PreparedStatement pstmt2 = conn.prepareStatement(sql);
            pstmt2.setString(1, "Operation 2");
            pstmt2.executeUpdate();

            savepoint2 = conn.setSavepoint("Savepoint2");

            PreparedStatement pstmt3 = conn.prepareStatement(sql);
            pstmt3.setString(1, "Operation 3");
            pstmt3.executeUpdate();

            conn.rollback(savepoint2);

            System.out.println("Rolled back to Savepoint2");

            conn.commit();

        } catch (SQLException e) {

            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();

        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

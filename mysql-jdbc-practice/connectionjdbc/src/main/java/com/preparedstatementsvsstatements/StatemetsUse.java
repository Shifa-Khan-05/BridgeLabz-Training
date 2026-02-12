package com.preparedstatementsvsstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StatemetsUse {

    public void insertUsingStatement(String name, int age) {

        String sql = "INSERT INTO students2(name, age) VALUES('" 
                     + name + "', " + age + ")";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            int rows = stmt.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Inserted using Statement");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertUsingPreparedStatement(String name, int age) {

        String sql = "INSERT INTO students2(name, age) VALUES(?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Inserted using PreparedStatement");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 🚀 Main Method
    public static void main(String[] args) {

        StatemetsUse obj = new StatemetsUse();

        // Using Statement
        obj.insertUsingStatement("Shifa", 20);

        // Using PreparedStatement
        obj.insertUsingPreparedStatement("Ali", 22);
    }
}

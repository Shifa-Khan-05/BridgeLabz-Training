package com.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {

    public static void insertStudent(String name, String email, int age, String grade) {

        String sql = "INSERT INTO students (name, email, age, grade, enrollment_date) " +
                     "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, age);
            pstmt.setString(4, grade);
            pstmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) inserted successfully!");

        } catch (SQLException e) {
            System.err.println("Insert failed!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insertStudent("John Doe", "john.doe@email.com", 20, "A");
        insertStudent("Jane Smith", "jane.smith@email.com", 22, "B");
    }
}

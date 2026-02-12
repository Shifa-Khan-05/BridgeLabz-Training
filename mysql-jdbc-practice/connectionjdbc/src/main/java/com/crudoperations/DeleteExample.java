package com.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteExample {

    public static boolean deleteStudentSafe(int studentId) {

        String checkSql = "SELECT COUNT(*) FROM students WHERE id = ?";
        String deleteSql = "DELETE FROM students WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection()) {

            // Check if student exists
            try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
                checkStmt.setInt(1, studentId);
                ResultSet rs = checkStmt.executeQuery();
                rs.next();

                if (rs.getInt(1) == 0) {
                    System.out.println("Student not found!");
                    return false;
                }
            }

            // Delete student
            try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
                deleteStmt.setInt(1, studentId);
                deleteStmt.executeUpdate();
                System.out.println("Student deleted successfully!");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        deleteStudentSafe(1);
    }
}

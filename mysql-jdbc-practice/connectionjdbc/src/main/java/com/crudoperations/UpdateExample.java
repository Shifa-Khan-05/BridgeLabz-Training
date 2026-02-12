package com.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {

    public static void updateStudentGrade(int studentId, String newGrade) {

        String sql = "UPDATE students SET grade = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newGrade);
            pstmt.setInt(2, studentId);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Grade updated successfully!");
            } else {
                System.out.println("Student not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStudentInfo(int id, String name, String email, int age) {

        String sql = "UPDATE students SET name = ?, email = ?, age = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, age);
            pstmt.setInt(4, id);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) updated!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        updateStudentGrade(1, "A+");
        updateStudentInfo(2, "Jane Smith Updated", "jane.new@email.com", 23);
    }
}

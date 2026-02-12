package com.crudoperations;

import java.sql.*;

public class SelectExample {

    // Select all students
    public static void getAllStudents() {

        String sql = "SELECT * FROM students";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("ID\tName\t\tEmail\t\t\tAge\tGrade");
            System.out.println("--------------------------------------------------------");

            while (rs.next()) {
                System.out.printf("%d\t%s\t%s\t%d\t%s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("grade"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Select student by ID
    public static void getStudentById(int studentId) {

        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Student Found:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Grade: " + rs.getString("grade"));
            } else {
                System.out.println("Student not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getAllStudents();
        System.out.println();
        getStudentById(1);
    }
}

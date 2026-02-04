package com.smartuniversitymanagementsystem;

public class UserFactory {

    public static Users createUser(String role) {

        switch (role.toLowerCase()) {
            case "student":
                return new Student();
            case "faculty":
                return new Faculty();
            case "librarian":
                return new Librarian();
            default:
                throw new IllegalArgumentException("Invalid user role");
        }
    }
}

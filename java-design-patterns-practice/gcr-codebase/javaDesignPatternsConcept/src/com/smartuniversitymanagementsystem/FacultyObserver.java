package com.smartuniversitymanagementsystem;

public class FacultyObserver implements Observer {

    private String name;

    public FacultyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookTitle) {
        System.out.println("Notification to Faculty " + name +
                ": New book added -> " + bookTitle);
    }
}
package com.smartuniversitymanagementsystem;


public class StudentObserver implements Observer {

    private String name;

    public StudentObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookTitle) {
        System.out.println("Notification to Student " + name +
                ": Book available -> " + bookTitle);
    }
}

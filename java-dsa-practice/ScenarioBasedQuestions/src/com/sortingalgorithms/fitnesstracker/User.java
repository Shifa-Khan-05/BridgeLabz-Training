package com.sortingalgorithms.fitnesstracker;

public class User {

    private int userId;
    private String name;
    private int steps;

    public User(int userId, String name, int steps) {
        this.userId = userId;
        this.name = name;
        this.steps = steps;
    }

    public int getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return userId + " - " + name + " - Steps: " + steps;
    }
}

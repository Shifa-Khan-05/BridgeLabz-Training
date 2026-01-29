package com.csvandjson.markmate;

public class Student {

    private int rollNo;
    private String name;
    private int maths;
    private int science;
    private int english;
    private int total;
    private double average;
    private String grade;

    public Student(int rollNo, String name, int maths, int science, int english) {
        this.rollNo = rollNo;
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
        calculateResult();
    }

    private void calculateResult() {
        total = maths + science + english;
        average = total / 3.0;

        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 60) grade = "C";
        else grade = "D";
    }

    // ✅ GETTERS (VERY IMPORTANT)
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }

    public int getEnglish() {
        return english;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public String getGrade() {
        return grade;
    }
}

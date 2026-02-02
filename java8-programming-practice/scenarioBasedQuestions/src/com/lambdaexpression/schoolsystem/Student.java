package com.lambdaexpression.schoolsystem;

public class Student {

    private String name;
    private int age;
    private int marks;
    private int rank;

    public Student(String name, int age, int marks, int rank) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", rank=" + rank +
                '}';
    }
}

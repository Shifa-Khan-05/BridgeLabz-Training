package com.generics.multileveluniversitycoursemanager;


import java.util.ArrayList;
import java.util.List;

/*
 * Exam-based course
 */
class ExamCourse extends CourseType {

    private int examMarks;

    public ExamCourse(String courseName, int credits, int examMarks) {
        super(courseName, credits);
        this.examMarks = examMarks;
    }

    @Override
    public void evaluate() {
        System.out.println("Exam Course: " + courseName +
                ", Credits: " + credits +
                ", Exam Marks: " + examMarks);
    }
}

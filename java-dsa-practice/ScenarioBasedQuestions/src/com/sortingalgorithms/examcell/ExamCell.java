package com.sortingalgorithms.examcell;

import java.util.*;

public class ExamCell {

    public static void main(String[] args) {

        // Pre-sorted center-wise student lists
        List<Student> center1 = Arrays.asList(
                new Student(101, "Asha", 95),
                new Student(102, "Ravi", 90),
                new Student(103, "Neha", 85)
        );

        List<Student> center2 = Arrays.asList(
                new Student(201, "Kiran", 98),
                new Student(202, "Meena", 92),
                new Student(203, "Amit", 85)
        );

        List<Student> center3 = Arrays.asList(
                new Student(301, "Suresh", 97),
                new Student(302, "Pooja", 91),
                new Student(303, "Rahul", 88)
        );

        // Combine all center-wise lists
        List<Student> allStudents = new ArrayList<>();
        allStudents.addAll(center1);
        allStudents.addAll(center2);
        allStudents.addAll(center3);

        // Sort using Merge Sort
        MergeSort.mergeSort(allStudents);

        // Display State-Level Rank List
        System.out.println("===== STATE LEVEL RANK LIST =====");
        int rank = 1;
        for (Student s : allStudents) {
            System.out.println("Rank " + rank++ + ": " + s);
        }
    }
}

package com.sortingalgorithms.eduresults;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<Student> district1 = Arrays.asList(
            new Student(101, "Asha", 90),
            new Student(102, "Ravi", 85)
        );

        List<Student> district2 = Arrays.asList(
            new Student(201, "Meena", 95),
            new Student(202, "Kiran", 85)
        );

        List<Student> district3 = Arrays.asList(
            new Student(301, "Suresh", 88),
            new Student(302, "Neha", 80)
        );

        // Merge all districts
        List<Student> stateList = new ArrayList<>();
        stateList.addAll(district1);
        stateList.addAll(district2);
        stateList.addAll(district3);

        // Sort using Merge Sort
        MergeSortRank.mergeSort(stateList);

        System.out.println(" Final State Rank List:");
        for (Student s : stateList) {
            System.out.println(s);
        }
    }
}


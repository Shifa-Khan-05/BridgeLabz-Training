package com.sortingalgorithms.examcell;
import java.util.*;

public class MergeSort {

	// Merge Sort method
    public static void mergeSort(List<Student> list) {
        if (list.size() <= 1)
            return;

        int mid = list.size() / 2;

        List<Student> left = new ArrayList<>(list.subList(0, mid));
        List<Student> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    // Merge two sorted lists (Descending order by score)
    private static void merge(List<Student> result,
                              List<Student> left,
                              List<Student> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            if (left.get(i).getScore() >= right.get(j).getScore()) {
                result.set(k++, left.get(i++)); // stable
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }
}
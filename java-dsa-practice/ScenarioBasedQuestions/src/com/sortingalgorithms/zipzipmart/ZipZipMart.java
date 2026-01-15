package com.sortingalgorithms.zipzipmart;

import java.time.LocalDate;
import java.util.*;

public class ZipZipMart {

    /**
     * Performs Merge Sort on a list of Transaction objects.
     * Sorting priority:
     * 1. Date (ascending)
     * 2. Amount (ascending if dates are equal)
     */
    public static void mergeSort(List<Transaction> list) {

        // Base condition: A list of size 0 or 1 is already sorted
        if (list.size() <= 1)
            return;

        // Find the middle index of the list
        int mid = list.size() / 2;

        // Divide the list into two halves
        List<Transaction> left = new ArrayList<>(list.subList(0, mid));
        List<Transaction> right = new ArrayList<>(list.subList(mid, list.size()));

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves back into the original list
        merge(list, left, right);
    }

    /**
     * Merges two sorted lists (left and right) into the result list.
     */
    private static void merge(List<Transaction> result,
                              List<Transaction> left,
                              List<Transaction> right) {

        // Index pointers for left, right, and result lists
        int i = 0, j = 0, k = 0;

        // Compare elements from both lists and place the smaller one first
        while (i < left.size() && j < right.size()) {

            // Compare transactions by date
            int dateCompare = left.get(i).date.compareTo(right.get(j).date);

            /*
             * If left date is earlier, OR
             * if dates are equal and left amount is smaller or equal,
             * then choose the left transaction
             */
            if (dateCompare < 0 ||
               (dateCompare == 0 &&
                left.get(i).amount <= right.get(j).amount)) {

                result.set(k++, left.get(i++));
            } else {
                // Otherwise, choose the right transaction
                result.set(k++, right.get(j++));
            }
        }

        // Copy remaining elements from left list (if any)
        while (i < left.size())
            result.set(k++, left.get(i++));

        // Copy remaining elements from right list (if any)
        while (j < right.size())
            result.set(k++, right.get(j++));
    }

    
    
    public static void main(String[] args) {

        // Create a list of transactions
        List<Transaction> list = new ArrayList<>();

        // Add sample transaction data
        list.add(new Transaction(LocalDate.of(2025, 1, 1), 23456));
        list.add(new Transaction(LocalDate.of(2025, 1, 1), 18000));
        list.add(new Transaction(LocalDate.of(2025, 1, 2), 23456));
        list.add(new Transaction(LocalDate.of(2025, 1, 5), 12000));
        list.add(new Transaction(LocalDate.of(2025, 1, 10), 5000));

        // Sort the transactions using merge sort
        mergeSort(list);

        // Print the sorted transactions
        list.forEach(System.out::println);
    }
}

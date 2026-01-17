package com.sortingalgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class RoboWarehouse {

    // Method to sort the list using Insertion Sort
    public static void insertionSort(ArrayList<Integer> list) {

        // Loop starts from second element
        for (int i = 1; i < list.size(); i++) {

            // Store the current element
            int key = list.get(i);

            // Index of previous element
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j)); // shift element to right
                j--;
            }

            // Insert key at the correct position
            list.set(j + 1, key);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // Taking user-defined input
        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Calling insertion sort
        insertionSort(list);

        // Display sorted list
        System.out.println("\nSorted package weights:");
        System.out.println(list);

        sc.close();
    }
}

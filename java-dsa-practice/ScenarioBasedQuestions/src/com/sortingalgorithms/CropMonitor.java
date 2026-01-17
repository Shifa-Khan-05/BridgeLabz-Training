package com.sortingalgorithms;

import java.util.Scanner;

public class CropMonitor {

    // Partition method to place pivot at correct position
    public static int partition(int[] a, int low, int high) {

        // Taking last element as pivot
        int pivot = a[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse from low to high - 1
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j); // swap smaller element
            }
        }

        // Place pivot in correct position
        swap(a, i + 1, high);

        return i + 1;
    }

    // Method to swap two elements
    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Quick Sort method
    public static void quickSort(int[] a, int low, int high) {

        // Base condition
        if (low < high) {

            // Partition index
            int part = partition(a, low, high);

            // Recursively sort left part
            quickSort(a, low, part - 1);

            // Recursively sort right part
            quickSort(a, part + 1, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input for number of sensor readings
        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking sensor data input
        System.out.println("Enter sensor data values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Apply Quick Sort
        quickSort(arr, 0, n - 1);

        // Display sorted sensor data
        System.out.println("\nSorted Sensor Data:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}

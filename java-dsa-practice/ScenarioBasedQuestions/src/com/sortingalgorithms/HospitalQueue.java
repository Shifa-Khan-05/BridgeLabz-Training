package com.sortingalgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalQueue {

    // Bubble Sort method
    public void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (list.get(j) > list.get(j + 1)) {
                    // Swap
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> level = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int levels;
        while (true) {
            System.out.println("Enter the patient's level (0 to exit): ");
            levels = scanner.nextInt();

            if (levels == 0) {
                break;
            }
            level.add(levels);
        }

        HospitalQueue hq = new HospitalQueue();

        System.out.println("\nBefore Sorting (Arrival Order): " + level);

        // Sorting patient levels
        hq.bubbleSort(level);

        System.out.println("After Sorting (Priority Order): " + level);

        scanner.close();
    }
}

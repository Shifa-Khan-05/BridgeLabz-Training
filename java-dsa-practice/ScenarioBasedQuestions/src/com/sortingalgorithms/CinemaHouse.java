package com.sortingalgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class CinemaHouse {

    // Method to sort movie show times using Bubble Sort
    public void bubbleSort(ArrayList<Integer> list) {

        int n = list.size();

        // Outer loop runs for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // If current show time is greater than next
                if (list.get(j) > list.get(j + 1)) {

                    // Swap the show times
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CinemaHouse cinema = new CinemaHouse();

        ArrayList<Integer> showTimes = new ArrayList<>();

        // Taking user input for number of shows
        System.out.print("Enter number of movie shows: ");
        int n = sc.nextInt();

        // Taking movie show times as input
        System.out.println("Enter movie show times (in hours):");
        for (int i = 0; i < n; i++) {
            showTimes.add(sc.nextInt());
        }

        // Sorting show times
        cinema.bubbleSort(showTimes);

        // Display sorted show times
        System.out.println("\nSorted Movie Show Times:");
        System.out.println(showTimes);

        sc.close();
    }
}

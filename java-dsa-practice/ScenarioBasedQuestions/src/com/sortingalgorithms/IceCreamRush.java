package com.sortingalgorithms;

//IceCreamRush - Sorting Ice Cream Flavors by Popularity
//Sorting Technique Used: Bubble Sort

class IceCreamRush {

 public static void main(String[] args) {

     // Array representing weekly sales of 8 ice cream flavors
     int[] sales = {120, 200, 150, 180, 90, 160, 110, 140};

     System.out.println("Sales before sorting:");
     printArray(sales);

     // Bubble Sort logic
     // Outer loop controls number of passes
     for (int i = 0; i < sales.length - 1; i++) {

         // Inner loop compares adjacent elements
         for (int j = 0; j < sales.length - i - 1; j++) {

             // Swap if current element is greater than next element
             if (sales[j] > sales[j + 1]) {
                 int temp = sales[j];
                 sales[j] = sales[j + 1];
                 sales[j + 1] = temp;
             }
         }
     }

     System.out.println("\nSales after sorting (Least → Most Popular):");
     printArray(sales);
 }

 // Method to print array elements
 public static void printArray(int[] arr) {
     for (int value : arr) {
         System.out.print(value + " ");
     }
     System.out.println();
 }
}

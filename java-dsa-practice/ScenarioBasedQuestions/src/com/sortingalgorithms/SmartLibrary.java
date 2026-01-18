package com.sortingalgorithms;

//SmartLibrary - Auto-Sorting Borrowed Books
//Sorting Technique Used: Insertion Sort

class SmartLibrary {

 public static void main(String[] args) {

     // Array of borrowed book titles (nearly sorted list)
     String[] books = {
             "Algorithms",
             "Data Structures",
             "Java Basics",
             "Operating Systems",
             "Computer Networks"
     };

     System.out.println("Books before sorting:");
     printBooks(books);

     // Insertion Sort logic
     for (int i = 1; i < books.length; i++) {

         // Current book to be inserted in the sorted part
         String currentBook = books[i];
         int j = i - 1;

         // Shift books that are greater than currentBook to the right
         while (j >= 0 && books[j].compareTo(currentBook) > 0) {
             books[j + 1] = books[j];
             j--;
         }

         // Insert the book at the correct position
         books[j + 1] = currentBook;
     }

     System.out.println("\nBooks after sorting (Alphabetical Order):");
     printBooks(books);
 }

 // Method to print book titles
 public static void printBooks(String[] books) {
     for (String book : books) {
         System.out.println(book);
     }
 }
}

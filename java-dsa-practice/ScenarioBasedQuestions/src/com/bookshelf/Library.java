package com.bookshelf;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Library {
  

    // Genre → List of Books
    private HashMap<String, LinkedList<String>> catalog = new HashMap<>();

    // To avoid duplicate books (optional)
    private HashSet<String> bookSet = new HashSet<>();

    // Add a book to a genre
    public void addBook(String genre, String bookName) {

        // Avoid duplicate books
        if (bookSet.contains(bookName)) {
            System.out.println("Book already exists: " + bookName);
            return;
        }

        // Create genre if not present
        catalog.putIfAbsent(genre, new LinkedList<>());

        // Add book
        catalog.get(genre).add(bookName);
        bookSet.add(bookName);

        System.out.println("Added book: " + bookName + " to genre: " + genre);
    }

    // Borrow (remove) a book
    public void borrowBook(String genre, String bookName) {

        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found!");
            return;
        }

        LinkedList<String> books = catalog.get(genre);

        if (books.remove(bookName)) {
            bookSet.remove(bookName);
            System.out.println("Borrowed book: " + bookName);
        } else {
            System.out.println("Book not available!");
        }
    }

    // Display all books
    public void displayCatalog() {
        System.out.println("\nLibrary Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " → " + catalog.get(genre));
        }
    }

    // Main method (Demo)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library shelf = new Library();

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Display Catalog");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String book = sc.nextLine();

                    shelf.addBook(genre, book);
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    genre = sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    book = sc.nextLine();

                    shelf.borrowBook(genre, book);
                    break;

                case 3:
                    shelf.displayCatalog();
                    break;

                case 4:
                    System.out.println("Exiting Library System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
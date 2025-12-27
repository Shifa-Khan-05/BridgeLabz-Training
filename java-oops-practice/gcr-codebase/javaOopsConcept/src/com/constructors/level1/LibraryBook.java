package com.constructors.level1;
  

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println(title + " Available: " + available);
    }
    public static void main(String[] args) {
		LibraryBook libraryBook=new LibraryBook("ACC",	"xyz", 2334);
		libraryBook.display();
	}
}

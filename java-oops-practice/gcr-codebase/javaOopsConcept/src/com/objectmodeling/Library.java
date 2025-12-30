package com.objectmodeling;

import java.util.ArrayList;

class Library {

	// Library name
	private String libraryName;

	// Aggregation: Library HAS-A list of Books
	private ArrayList<Book> books;

	// Constructor
	public Library(String libraryName) {
		this.libraryName = libraryName;
		this.books = new ArrayList<>();
	}

	// Method to add a book to library
	public void addBook(Book book) {
		books.add(book);
	}

	// Method to display library details
	public void displayLibrary() {
		System.out.println("\nLibrary Name: " + libraryName);
		System.out.println("Books Available:");
		System.out.println("----------------");

		for (Book book : books) {
			book.displayBook();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Library library=new Library("abx");
        library.displayLibrary();
        Book book=new Book("sdf", "asdfghgfds");
        library.addBook(book);
        library.displayLibrary();
	}
	
}


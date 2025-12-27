package com.constructors.level1;
//Creating subclass EBook
class EBook extends Books {

 String format;   // Extra variable for ebook

 // Constructor of EBook class
 public EBook(String ISBN, String title, String author, String format) {
     super(ISBN, title, author);
     this.format = format;
 }

 // Method to display ebook details
 public void displayEBookDetails() {

     // Accessing public variable
     System.out.println("ISBN   : " + ISBN);

     // Accessing protected variable
     System.out.println("Title  : " + title);

     // Accessing private variable using getter
     System.out.println("Author : " + getAuthor());

     System.out.println("Format : " + format);
 }

 // Main method
 public static void main(String[] args) {

     // Creating EBook object
     EBook ebook = new EBook(
             "978-0135166307",
             "Java Programming",
             "Herbert Schildt",
             "PDF"
     );

     // Updating author using setter
     ebook.setAuthor("H. Schildt");

     // Displaying ebook details
     ebook.displayEBookDetails();
 }
}

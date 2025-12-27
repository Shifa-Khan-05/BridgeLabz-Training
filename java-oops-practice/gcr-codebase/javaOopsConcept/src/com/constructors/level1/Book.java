package com.constructors.level1;

public class Book {

	 String title;
	 String author;
	 double price;
	 
	 //default constructor
	 Book(){
	     String title="abs";
	     String author="abs";
	     double price= 23.456 ;
	 }
	 
	 //parameterized constructor
	 Book(String title, String author, double price)
	 {
		 this.title=title;
		 this.author=author;
		 this.price=price;
	 }
	 
	public static void main(String[] args) {
	  Book book=new Book("abc", "abc", 6758.958);
	  
	}

}

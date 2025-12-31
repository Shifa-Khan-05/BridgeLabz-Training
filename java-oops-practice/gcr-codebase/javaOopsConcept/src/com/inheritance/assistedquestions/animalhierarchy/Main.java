package com.inheritance.assistedquestions.animalhierarchy;

public class Main {
 
	public static void main(String[] args) {
		    Dog dog = new Dog("puppy",2);
	        dog.makeSound();  // Inherited from Animal

	        Cat cat = new Cat("kitten",1);
	        cat.makeSound();  // Inherited from Animal
	       
	        Bird bird=new Bird("charlie",5);
	        bird.makeSound(); // Inherited from Animal
	}
}

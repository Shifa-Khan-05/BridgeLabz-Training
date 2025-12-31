package com.inheritance.assistedquestions.animalhierarchy;

public class Animal {
	String name;
    int age;
 // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
     
     void makeSound()
     {
    	 System.out.println("Animals make sound");
     }
}

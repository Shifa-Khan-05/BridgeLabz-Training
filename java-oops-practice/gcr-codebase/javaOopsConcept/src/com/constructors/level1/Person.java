package com.constructors.level1;
public class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + "  Age: " + age);
    }
    
    public static void main(String[] args) {
		Person person=new Person("abhay",22);
		person.display();
	}
}

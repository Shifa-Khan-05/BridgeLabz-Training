package com.constructors.level1;

//Creating Student class
public class Student {

 // Public variable (accessible everywhere)
 public int rollNumber;

 // Protected variable (accessible within package and subclass)
 protected String name;

 // Private variable (accessible only within this class)
 private double CGPA;

 // Constructor to initialize roll number and name
 Student(int rollNumber, String name, double CGPA) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.CGPA = CGPA;
 }

 // Public method to access (get) CGPA
 public double getCGPA() {
     return CGPA;
 }

 // Public method to modify (set) CGPA
 public void setCGPA(double CGPA) {
     this.CGPA = CGPA;
 }

 // Method to display student details
 public void displayStudentDetails() {
     System.out.println("Roll Number : " + rollNumber);
     System.out.println("Name        : " + name);
     System.out.println("CGPA        : " + CGPA);
 }
}
class PostgraduateStudent extends Student {

	 String specialization;

	 // Constructor of subclass
	 PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
	     super(rollNumber, name, CGPA);
	     this.specialization = specialization;
	 }

	 // Method to display postgraduate student details
	 public void displayPostgraduateDetails() {

	     // Accessing protected variable from parent class
	     System.out.println("Name (Protected) : " + name);

	     // Accessing public variable
	     System.out.println("Roll Number     : " + rollNumber);

	     // Accessing private variable using public method
	     System.out.println("CGPA            : " + getCGPA());

	     System.out.println("Specialization  : " + specialization);
	 }

	 // Main method
	 public static void main(String[] args) {

	     // Creating object of PostgraduateStudent
	     PostgraduateStudent pg = new PostgraduateStudent(
	             101, "Maya Sharma", 8.5, "Computer Science");

	     // Modifying CGPA using setter method
	     pg.setCGPA(8.9);

	     // Displaying details
	     pg.displayPostgraduateDetails();
	 }
	}

package com.constructors.level1;
//Creating a class named Course
public class Courses {

 // Instance variables (different for each course)
 String courseName;
 int duration;        // duration in months
 double fee;

 // Class variable (common for all courses)
 static String instituteName = "Tech Learning Hub";

 // Constructor to initialize instance variables
 Courses(String courseName, int duration, double fee) {
     this.courseName = courseName;
     this.duration = duration;
     this.fee = fee;
 }
 

 // Instance method to display course details
 // This method displays details of one course
 public void displayCourseDetails() {
     System.out.println("Institute Name : " + instituteName);
     System.out.println("Course Name    : " + courseName);
     System.out.println("Duration       : " + duration + " months");
     System.out.println("Course Fee     : ₹" + fee);
     System.out.println("-----------------------------");
 }

 // Class method to update institute name
 // This method updates institute name for all courses
 public static void updateInstituteName(String newInstituteName) {
     instituteName = newInstituteName;
 }

 // Main method
 public static void main(String[] args) {

     // Creating course objects
     Courses c1 = new Courses("Java Programming", 6, 12000);
     Courses c2 = new Courses("Web Development", 4, 10000);

     // Displaying course details before update
     c1.displayCourseDetails();
     c2.displayCourseDetails();

     // Updating institute name using class method
     Courses.updateInstituteName("Code Academy");

     // Displaying course details after update
     c1.displayCourseDetails();
     c2.displayCourseDetails();
 }
}

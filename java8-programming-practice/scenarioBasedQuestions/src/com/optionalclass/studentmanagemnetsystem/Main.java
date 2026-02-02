package com.optionalclass.studentmanagemnetsystem;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Student student=new Student(1, "Amit", null, null, "Pune", null);
		System.out.println("---------------------------------------------------------");

		
		Optional<String> email=Optional.ofNullable(student.getEmail());
		System.out.println("Email : " + 
		     email.orElse("Email Not available"));
		
		System.out.println("---------------------------------------------------------");
		
		Optional<String> phone =Optional.ofNullable(student.getPhone());
		System.out.println("Phone Num : " + phone.orElse("0000000000"));
	
		System.out.println("---------------------------------------------------------");

		 // Find student by ID
        Optional<Student> foundStudent =
                Optional.ofNullable(student)
                        .filter(s -> s.getId() == 2);

        System.out.println(
                foundStudent
                        .map(s -> "Student found: " + s.getName())
                        .orElse("Student not available")
        );
		System.out.println("---------------------------------------------------------");

	
        Optional<String> address =
                Optional.ofNullable(student.getAddress());

        address.ifPresentOrElse(
                addr -> System.out.println("Address: " + addr),
                () -> System.out.println("Address not available")
        );
	
		System.out.println("---------------------------------------------------------");

        String displayName =
                Optional.ofNullable(student.getNickname())
                        .orElse(student.getName());

        System.out.println("Display Name: " + displayName);
    
	
	}
}

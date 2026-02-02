package com.lambdaexpression.schoolsystem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
public class School {
	public static void main(String[] args) {
      
		// Student list
        List<Student> students = new ArrayList<>();

        students.add(new Student("Amit", 20, 85, 5));
        students.add(new Student("Sneha", 17, 45, 15));
        students.add(new Student("Rahul", 22, 65, 8));
        students.add(new Student("Pooja", 18, 35, 25));
        students.add(new Student("Karan", 19, 90, 2));

        System.out.println("==============================================");

        // 1. Welcome message using lambda
        students.forEach(
                s -> System.out.println("Welcome to the school, " + s.getName())
        );

        System.out.println("==============================================");

        // 2. Check pass or fail using lambda
        students.forEach(
                s -> {
                    if (s.getMarks() >= 40)
                        System.out.println(s.getName() + " : PASS");
                    else
                        System.out.println(s.getName() + " : FAIL");
                }
        );

        System.out.println("==============================================");

        // 3. Sort students by name using lambda
        students.sort(
                (s1, s2) -> s1.getName().compareTo(s2.getName())
        );
        System.out.println("Students sorted by Name:");
        students.forEach(System.out::println);

        System.out.println("==============================================");

        // 4. Sort students by rank using lambda
        students.sort(
                (s1, s2) -> Integer.compare(s1.getRank(), s2.getRank())
        );
        System.out.println("Students sorted by Rank:");
        students.forEach(System.out::println);

        System.out.println("==============================================");

        // 5. Display students whose age is above 18 using lambda
        Predicate<Student> ageAbove18 = s -> s.getAge() > 18;

        students.stream()
                .filter(ageAbove18)
                .forEach(System.out::println);
    }
}
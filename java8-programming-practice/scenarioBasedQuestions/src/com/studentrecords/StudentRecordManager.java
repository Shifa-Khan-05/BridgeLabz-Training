package com.studentrecords;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class StudentRecordManager {

    public static void main(String[] args) {

        // Create list to store Student objects
        List<Student> students = new ArrayList<>();

        // Add student records to the list
        students.add(new Student(1, "Amit", 20, "CS", "Male", "Pune", 57, 9876543210L));
        students.add(new Student(2, "Sneha", 26, "IT", "Female", "Mumbai", 33, 9876543201L));
        students.add(new Student(3, "Rahul", 21, "Mechanical", "Male", "Delhi", 10, 9876543202L));
        students.add(new Student(4, "Riya", 18, "CS", "Female", "Pune", 81, 9876543203L));
        students.add(new Student(5, "Karan", 22, "Mechanical", "Male", "Mumbai", 98, 9876543204L));
        students.add(new Student(6, "Neha", 24, "IT", "Female", "Delhi", 25, 9876543205L));
        students.add(new Student(7, "Arjun", 23, "CS", "Male", "Bangalore", 15, 9876543206L));
        students.add(new Student(8, "Pooja", 21, "Electrical", "Female", "Pune", 40, 9876543207L));
        students.add(new Student(9, "Rohit", 27, "Mechanical", "Male", "Chennai", 60, 9876543208L));
        students.add(new Student(10, "Anjali", 19, "IT", "Female", "Mumbai", 12, 9876543209L));
        students.add(new Student(11, "Vikas", 28, "Civil", "Male", "Jaipur", 75, 9876543211L));
        students.add(new Student(12, "Kavita", 22, "CS", "Female", "Indore", 18, 9876543212L));
        students.add(new Student(13, "Suresh", 30, "Electrical", "Male", "Hyderabad", 55, 9876543213L));
        students.add(new Student(14, "Meena", 25, "IT", "Female", "Bhopal", 35, 9876543214L));
        students.add(new Student(15, "Nikhil", 24, "Mechanical", "Male", "Nagpur", 22, 9876543215L));

        // Print all student records
        System.out.println("All Student Records:");
        students.forEach(System.out::println);

        System.out.println("==============================================");

        // Filter students whose rank is less than 50
        List<Student> studentRank =
                students.stream()
                        .filter(s -> s.getRank() < 50)
                        .toList();
        studentRank.forEach(System.out::println);

        System.out.println("==============================================");

        // Filter students whose age is greater than 25
        List<Student> studentAge =
                students.stream()
                        .filter(s -> s.getAge() > 25)
                        .toList();
        studentAge.forEach(System.out::println);

        System.out.println("==============================================");

        // Print only the names of all students
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Print names of students belonging to Mechanical branch
        students.stream()
                .filter(s -> s.getBranch().equalsIgnoreCase("Mechanical"))
                .map(Student::getName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Print students not from Mumbai
        students.stream()
                .filter(s -> s.getCity() != "Mumbai")
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Sort students by rank in ascending order
        List<Student> rankAsc =
                students.stream()
                        .sorted(Comparator.comparing(Student::getRank))
                        .toList();
        rankAsc.forEach(System.out::println);

        System.out.println("==============================================");

        // Sort students by rank in descending order
        List<Student> rankDsc =
                students.stream()
                        .sorted(Comparator.comparing(Student::getRank).reversed())
                        .toList();
        rankDsc.forEach(System.out::println);

        System.out.println("==============================================");

        // Print top 5 students based on rank
        students.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .limit(5)
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Print last 3 students based on rank
        students.stream()
                .sorted(Comparator.comparing(Student::getRank).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Sort students by name and then by rank
        students.stream()
                .sorted(Comparator.comparing(Student::getName)
                        .thenComparing(Student::getRank))
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Count number of students in each department
        Map<String, Long> numOfStuInEachDepartment =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getBranch,
                                Collectors.counting()
                        ));
        numOfStuInEachDepartment.forEach(
                (branch, count) -> System.out.println(branch + " : " + count)
        );

        System.out.println("==============================================");

        // Count number of students in each city
        Map<String, Long> numOfCity =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getCity,
                                Collectors.counting()
                        ));
        numOfCity.forEach((city, count) ->
                System.out.println(city + " : " + count));

        System.out.println("==============================================");

        // Calculate average age of students in each department
        Map<String, Double> avgAge =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getBranch,
                                Collectors.averagingDouble(Student::getAge)
                        ));
        avgAge.forEach((department, age) ->
                System.out.println(department + " : " + age));

        System.out.println("==============================================");

        // Calculate average rank of students based on gender
        Map<String, Double> avgRank =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGender,
                                Collectors.averagingDouble(Student::getRank)
                        ));
        avgRank.forEach((gender, rank) ->
                System.out.println(gender + " : " + rank));

        System.out.println("==============================================");

        // Count total number of students
        long total = students.stream().count();
        System.out.println(total);

        System.out.println("==============================================");

        // Find department with highest average rank
        Map.Entry<String, Double> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getBranch,
                                Collectors.averagingInt(Student::getRank)
                        ))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .get();
        System.out.println(result.getKey() + " has highest average rank: " + result.getValue());

        System.out.println("==============================================");

        // Find best student (lowest rank)
        Student bestStudent =
                students.stream()
                        .min(Comparator.comparingInt(Student::getRank))
                        .get();
        System.out.println("Best student (lowest rank): " + bestStudent);

        System.out.println("==============================================");

        // Find worst student (highest rank)
        Student worStudent =
                students.stream()
                        .max(Comparator.comparingInt(Student::getRank))
                        .get();
        System.out.println("Worst student (highest rank): " + worStudent);

        System.out.println("==============================================");

        // Find second best rank holder
        Student secbestStudent =
                students.stream()
                        .sorted(Comparator.comparingInt(Student::getRank))
                        .skip(1)
                        .findFirst()
                        .get();
        System.out.println(secbestStudent);

        System.out.println("==============================================");

        // Find third best rank holder
        Student thirdbestStudent =
                students.stream()
                        .sorted(Comparator.comparingInt(Student::getRank))
                        .skip(2)
                        .findFirst()
                        .get();
        System.out.println(thirdbestStudent);

        System.out.println("==============================================");

        // Find youngest student
        Student youngestStudent =
                students.stream()
                        .sorted(Comparator.comparingInt(Student::getAge))
                        .findFirst()
                        .get();
        System.out.println(youngestStudent);

        System.out.println("==============================================");

        // Find oldest student
        Student oldestStudent =
                students.stream()
                        .max(Comparator.comparingInt(Student::getAge))
                        .get();
        System.out.println(oldestStudent);

        System.out.println("==============================================");

        // Print all contact numbers
        students.stream()
                .map(Student::getContact)
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Count total contact numbers
        long toatalContact =
                students.stream()
                        .map(Student::getContact)
                        .count();
        System.out.println(toatalContact);

        System.out.println("==============================================");

        // Print unique contact numbers
        students.stream()
                .map(Student::getContact)
                .distinct()
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Check if any student belongs to Biotech branch
        boolean anyBiotechStudent =
                students.stream()
                        .anyMatch(s -> s.getBranch().equalsIgnoreCase("Biotech"));
        System.out.println("Any student from Biotech? " + anyBiotechStudent);

        System.out.println("==============================================");

        // Check if all students are above age 20
        boolean allAbove20 =
                students.stream()
                        .allMatch(s -> s.getAge() > 20);
        System.out.println("All students above age 20? " + allAbove20);

        System.out.println("==============================================");

        // Check if no student belongs to Civil branch
        boolean noCivilStudent =
                students.stream()
                        .noneMatch(s -> s.getBranch().equalsIgnoreCase("Civil"));
        System.out.println("No student from Civil? " + noCivilStudent);

        System.out.println("==============================================");

        // Count male and female students
        Map<String, Long> countByGender =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGender,
                                Collectors.counting()
                        ));
        countByGender.forEach((gender, count) ->
                System.out.println(gender + " : " + count));

        System.out.println("==============================================");

        // Calculate average age of female students
        double avgFeMaleAge =
                students.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("female"))
                        .collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(avgFeMaleAge);

        System.out.println("==============================================");

        // Calculate average age of male students
        double avgMaleAge =
                students.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("male"))
                        .collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(avgMaleAge);

        System.out.println("==============================================");

        // Find male student with highest rank
        Student highestMaleRank =
                students.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                        .max(Comparator.comparingInt(Student::getRank))
                        .get();
        System.out.println("Male student with highest rank: " + highestMaleRank);

        System.out.println("==============================================");

        // Find female student with highest rank
        Student highestFEMaleRank =
                students.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("female"))
                        .max(Comparator.comparingInt(Student::getRank))
                        .get();
        System.out.println("Female student with highest rank: " + highestFEMaleRank);

        System.out.println("==============================================");

        // List students department-wise with names only
        Map<String, List<String>> studentsByDept =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getBranch,
                                Collectors.mapping(
                                        Student::getName,
                                        Collectors.toList()
                                )
                        ));
        studentsByDept.forEach((dept, names) ->
                System.out.println(dept + " : " + names));

        System.out.println("==============================================");

        // Find youngest student in CS department
        Student youngestCSStudent =
                students.stream()
                        .filter(s -> s.getBranch().equalsIgnoreCase("CS"))
                        .min(Comparator.comparingInt(Student::getAge))
                        .get();
        System.out.println("Youngest CS student: " + youngestCSStudent);

        System.out.println("==============================================");

        // Find top-ranked student in Mechanical department
        Student topMechanicalStudent =
                students.stream()
                        .filter(s -> s.getBranch().equalsIgnoreCase("Mechanical"))
                        .min(Comparator.comparingInt(Student::getRank))
                        .get();
        System.out.println("Top-ranked Mechanical student: " + topMechanicalStudent);

        System.out.println("==============================================");

        // Count Electronics students from Karnataka cities
        long electronicsFromKarnataka =
                students.stream()
                        .filter(s -> s.getBranch().equalsIgnoreCase("Electronics"))
                        .filter(s -> s.getCity().equalsIgnoreCase("Bangalore")
                                || s.getCity().equalsIgnoreCase("Mysore"))
                        .count();
        System.out.println("Electronics students from Karnataka: " + electronicsFromKarnataka);

        System.out.println("==============================================");

        // Convert student list into Map<Id, Name>
        Map<Integer, String> idNameMap =
                students.stream()
                        .collect(Collectors.toMap(
                                Student::getId,
                                Student::getName
                        ));
        idNameMap.forEach((id, name) ->
                System.out.println(id + " : " + name));

        System.out.println("==============================================");

        // Convert student list into Map<Department, List<Student>>
        Map<String, List<Student>> studentsByDept1 =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getBranch));
        studentsByDept1.forEach((dept, list) ->
                System.out.println(dept + " : " + list));

        System.out.println("==============================================");

        // Find students whose name starts with 'S'
        students.stream()
                .filter(s -> s.getName().startsWith("S"))
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Find students whose name length is greater than 5
        students.stream()
                .filter(s -> s.getName().length() > 5)
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Find students whose rank is even
        students.stream()
                .filter(s -> s.getRank() % 2 == 0)
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Find students whose rank is odd
        students.stream()
                .filter(s -> s.getRank() % 2 != 0)
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Find top 3 youngest students
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .limit(3)
                .forEach(System.out::println);

        System.out.println("==============================================");

        // Partition students based on age > 25
        Map<Boolean, List<Student>> partitionByAge =
                students.stream()
                        .collect(Collectors.partitioningBy(
                                s -> s.getAge() > 25
                        ));
        partitionByAge.forEach((key, list) ->
                System.out.println(key + " : " + list));

        System.out.println("==============================================");

        // Partition students based on rank < 100
        Map<Boolean, List<Student>> partitionByRank =
                students.stream()
                        .collect(Collectors.partitioningBy(
                                s -> s.getRank() < 100
                        ));
        partitionByRank.forEach((key, list) ->
                System.out.println(key + " : " + list));

        System.out.println("==============================================");

        // Find city having maximum number of students
        Map.Entry<String, Long> maxCity =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getCity,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .get();
        System.out.println("City with maximum students: " +
                maxCity.getKey() + " (" + maxCity.getValue() + ")");

        System.out.println("==============================================");

        // Find department having minimum number of students
        Map.Entry<String, Long> minDept =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getBranch,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .min(Map.Entry.comparingByValue())
                        .get();
        System.out.println("Department with minimum students: " +
                minDept.getKey() + " (" + minDept.getValue() + ")");
    }
}

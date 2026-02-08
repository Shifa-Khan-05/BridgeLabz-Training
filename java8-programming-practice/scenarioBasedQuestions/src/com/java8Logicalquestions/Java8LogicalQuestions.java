package com.java8Logicalquestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Java8LogicalQuestions {

    // Employee class for Question 28
    static class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public String toString() {
            return id + " " + name + " " + salary;
        }
    }

    public static void main(String[] args) {

        // 1. Count vowels in a string
        String s1 = "programming";
        long vowelCount = s1.chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        System.out.println("1. Vowels count: " + vowelCount);

        // 2. Count number of words
        String sentence = "Java is very powerful";
        long wordCount = Arrays.stream(sentence.split("\\s+")).count();
        System.out.println("2. Word count: " + wordCount);

        // 3. Find even numbers
        List<Integer> list3 = List.of(2,5,7,8,10,13);
        System.out.println("3. Even numbers: " +
                list3.stream().filter(n -> n % 2 == 0).toList());

        // 4. Convert strings to uppercase
        List<String> list4 = List.of("java","spring","boot");
        System.out.println("4. Uppercase: " +
                list4.stream().map(String::toUpperCase).toList());

        // 5. Find string length list
        List<String> list5 = List.of("cat","elephant","dog");
        System.out.println("5. Length list: " +
                list5.stream().map(String::length).toList());

        // 6. Count strings starting with 'a'
        List<String> list6 = List.of("apple","banana","ant","car");
        long countA = list6.stream().filter(str -> str.startsWith("a")).count();
        System.out.println("6. Starts with 'a': " + countA);

        // 7. Remove empty strings
        List<String> list7 = List.of("java","","spring","","boot");
        System.out.println("7. Without empty: " +
                list7.stream().filter(str -> !str.isEmpty()).toList());

        // 8. Sum of all numbers
        List<Integer> list8 = List.of(1,2,3,4,5);
        int sum = list8.stream().mapToInt(Integer::intValue).sum();
        System.out.println("8. Sum: " + sum);

        // 9. Find max number
        List<Integer> list9 = List.of(10,25,3,99,45);
        int max = list9.stream().max(Integer::compare).get();
        System.out.println("9. Max: " + max);

        // 10. Reverse each string
        List<String> list10 = List.of("java","api");
        System.out.println("10. Reversed strings: " +
                list10.stream()
                        .map(str -> new StringBuilder(str).reverse().toString())
                        .toList());

        // 11. Remove duplicates
        List<Integer> list11 = List.of(1,2,2,3,4,4,5);
        System.out.println("11. Unique: " +
                list11.stream().distinct().toList());

        // 12. Sort descending
        List<Integer> list12 = List.of(5,1,9,3);
        System.out.println("12. Descending: " +
                list12.stream().sorted(Comparator.reverseOrder()).toList());

        // 13. Second highest number
        List<Integer> list13 = List.of(10,40,30,20);
        int secondMax = list13.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("13. Second highest: " + secondMax);

        // 14. Join strings with comma
        List<String> list14 = List.of("Java","Spring","Boot");
        String joined = list14.stream().collect(Collectors.joining(","));
        System.out.println("14. Joined: " + joined);

        // 15. Frequency of each character
        String s15 = "banana";
        Map<Character, Long> charFreq =
                s15.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));
        System.out.println("15. Character frequency: " + charFreq);

        // 16. Numbers greater than 50
        List<Integer> list16 = List.of(10,55,60,23,90);
        System.out.println("16. >50: " +
                list16.stream().filter(n -> n > 50).toList());

        // 17. Group strings by length
        List<String> list17 = List.of("a","bb","ccc","dd");
        Map<Integer, List<String>> grouped =
                list17.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("17. Grouped by length: " + grouped);

        // 18. First non-repeated character
        String s18 = "stress";
        Character firstNonRepeat =
                s18.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .get();
        System.out.println("18. First non-repeated: " + firstNonRepeat);

        // 19. Convert List<Integer> to List<String>
        List<Integer> list19 = List.of(1,2,3);
        System.out.println("19. Integer to String: " +
                list19.stream().map(String::valueOf).toList());

        // 20. Count occurrences of each word
        String s20 = "java is java and java is fast";
        Map<String, Long> wordFreq =
                Arrays.stream(s20.split("\\s+"))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));
        System.out.println("20. Word frequency: " + wordFreq);

        // 21. Partition even and odd
        List<Integer> list21 = List.of(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> partitioned =
                list21.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("21. Partitioned: " + partitioned);

        // 22. Find duplicate elements only
        List<Integer> list22 = List.of(1,2,3,2,4,5,1);
        Set<Integer> seen = new HashSet<>();
        System.out.println("22. Duplicates: " +
                list22.stream().filter(n -> !seen.add(n)).toList());

        // 23. Find longest string
        List<String> list23 = List.of("java","microservices","api");
        String longest =
                list23.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("23. Longest string: " + longest);

        // 24. Top 3 highest numbers
        List<Integer> list24 = List.of(10,90,30,70,50);
        System.out.println("24. Top 3: " +
                list24.stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(3)
                        .toList());

        // 25. Flatten list of lists
        List<List<Integer>> list25 = List.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5)
        );
        System.out.println("25. Flattened: " +
                list25.stream().flatMap(List::stream).toList());

        // 26. Sum of squares of even numbers
        List<Integer> list26 = List.of(1,2,3,4,5);
        int sumSquares =
                list26.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * n)
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println("26. Sum of squares: " + sumSquares);

        // 27. Sort map by value
        Map<String, Integer> map27 = Map.of("A",3,"B",1,"C",2);
        Map<String, Integer> sortedMap =
                map27.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (a,b) -> a,
                                LinkedHashMap::new));
        System.out.println("27. Sorted map: " + sortedMap);

        // 28. Employee with highest salary
        List<Employee> employees = List.of(
                new Employee(1,"A",50000),
                new Employee(2,"B",90000),
                new Employee(3,"C",70000)
        );
        Employee highestPaid =
                employees.stream()
                        .max(Comparator.comparingDouble(Employee::getSalary))
                        .get();
        System.out.println("28. Highest salary employee: " + highestPaid);

        // 29. Common elements between two lists
        List<Integer> l1 = List.of(1,2,3,4);
        List<Integer> l2 = List.of(3,4,5,6);
        System.out.println("29. Common elements: " +
                l1.stream().filter(l2::contains).toList());

        // 30. Kth smallest element
        List<Integer> list30 = List.of(9,1,5,3,7);
        int k = 2;
        int kthSmallest =
                list30.stream()
                        .sorted()
                        .skip(k - 1)
                        .findFirst()
                        .get();
        System.out.println("30. Kth smallest: " + kthSmallest);
    }
}

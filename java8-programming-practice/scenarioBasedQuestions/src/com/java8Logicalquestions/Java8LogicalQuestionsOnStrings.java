package com.java8Logicalquestions;

import java.util.*;
import java.util.stream.*;

public class Java8LogicalQuestionsOnStrings {

	public static void main(String[] args) {

		/* 1. Count vowels in a string */
		String s1 = "programming";
		long vowelCount = s1.chars().mapToObj(c -> (char) c).filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
		System.out.println("1. Vowel count: " + vowelCount);

		/* 2. Count number of words in a sentence */
		String s2 = "Java is very powerful";
		long wordCount = Arrays.stream(s2.split("\\s+")).count();
		System.out.println("2. Word count: " + wordCount);

		/* 3. Find even numbers from list */
		List<Integer> list3 = Arrays.asList(2, 5, 7, 8, 10, 13);
		List<Integer> evens = list3.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("3. Even numbers: " + evens);

		/* 4. Convert list of strings to uppercase */
		List<String> list4 = Arrays.asList("java", "spring", "boot");
		List<String> upper = list4.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("4. Uppercase strings: " + upper);

		/* 5. Find string length list */
		List<String> list5 = Arrays.asList("cat", "elephant", "dog");
		List<Integer> lengths = list5.stream().map(String::length).collect(Collectors.toList());
		System.out.println("5. String lengths: " + lengths);

		/* 6. Count strings starting with 'a' */
		List<String> list6 = Arrays.asList("apple", "banana", "ant", "car");
		long countA = list6.stream().filter(s -> s.startsWith("a")).count();
		System.out.println("6. Strings starting with 'a': " + countA);

		/* 7. Remove empty strings */
		List<String> list7 = Arrays.asList("java", "", "spring", "", "boot");
		List<String> nonEmpty = list7.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("7. Non-empty strings: " + nonEmpty);

		/* 8. Sum of all numbers */
		List<Integer> list8 = Arrays.asList(1, 2, 3, 4, 5);
		int sum = list8.stream().mapToInt(Integer::intValue).sum();
		System.out.println("8. Sum: " + sum);

		/* 9. Find max number */
		List<Integer> list9 = Arrays.asList(10, 25, 3, 99, 45);
		int max = list9.stream().max(Integer::compareTo).orElse(0);
		System.out.println("9. Max number: " + max);

		/* 10. Reverse each string in list */
		List<String> list10 = Arrays.asList("java", "api");
		List<String> reversed = list10.stream().map(s -> new StringBuilder(s).reverse().toString())
				.collect(Collectors.toList());
		System.out.println("10. Reversed strings: " + reversed);

		/* 11. Remove duplicate elements from list */
		List<Integer> list11 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		List<Integer> distinct = list11.stream().distinct().collect(Collectors.toList());
		System.out.println("11. Distinct elements: " + distinct);

		/* 12. Sort list in descending order */
		List<Integer> list12 = Arrays.asList(5, 1, 9, 3);
		List<Integer> desc = list12.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("12. Descending order: " + desc);

		/* 13. Find second highest number */
		List<Integer> list13 = Arrays.asList(10, 40, 30, 20);
		Integer secondHighest = list13.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println("13. Second highest: " + secondHighest);

		/* 14. Join strings with comma */
		List<String> list14 = Arrays.asList("Java", "Spring", "Boot");
		String joined = list14.stream().collect(Collectors.joining(","));
		System.out.println("14. Joined string: " + joined);

		/* 15. Frequency of each character */
		String s15 = "banana";
		Map<Character, Long> charFreq = s15.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		System.out.println("15. Character frequency: " + charFreq);

		/* 16. Find numbers greater than 50 */
		List<Integer> list16 = Arrays.asList(10, 55, 60, 23, 90);
		List<Integer> gt50 = list16.stream().filter(n -> n > 50).collect(Collectors.toList());
		System.out.println("16. Greater than 50: " + gt50);

		/* 17. Group strings by length */
		List<String> list17 = Arrays.asList("a", "bb", "ccc", "dd");
		Map<Integer, List<String>> groupedByLength = list17.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("17. Group by length: " + groupedByLength);

		/* 18. First non-repeated character */
		String s18 = "stress";
		Character firstUnique = s18.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println("18. First non-repeated character: " + firstUnique);

		/* 19. Convert List<Integer> to List<String> */
		List<Integer> list19 = Arrays.asList(1, 2, 3);
		List<String> stringList = list19.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println("19. Integer to String list: " + stringList);

		/* 20. Count occurrences of each word */
		String s20 = "java is java and java is fast";
		Map<String, Long> wordFreq = Arrays.stream(s20.split(" "))
				.collect(Collectors.groupingBy(w -> w, LinkedHashMap::new, Collectors.counting()));
		System.out.println("20. Word frequency: " + wordFreq);

		/* 21. Partition numbers into even and odd */
		List<Integer> list21 = Arrays.asList(1, 2, 3, 4, 5, 6);
		Map<Boolean, List<Integer>> evenOdd = list21.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("21. Even and Odd: " + evenOdd);

		/* 22. Find duplicate elements only */
		List<Integer> list22 = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
		Set<Integer> duplicates = list22.stream().filter(n -> Collections.frequency(list22, n) > 1)
				.collect(Collectors.toSet());
		System.out.println("22. Duplicate elements: " + duplicates);

		/* 23. Find longest string */
		List<String> list23 = Arrays.asList("java", "microservices", "api");
		String longest = list23.stream().max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println("23. Longest string: " + longest);

		/* 24. Find top 3 highest numbers */
		List<Integer> list24 = Arrays.asList(10, 90, 30, 70, 50);
		List<Integer> top3 = list24.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println("24. Top 3 highest: " + top3);

		/* 25. Flatten list of lists */
		List<List<Integer>> list25 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
		List<Integer> flatList = list25.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("25. Flattened list: " + flatList);

		/* 26. Sum of squares of even numbers */
		List<Integer> list26 = Arrays.asList(1, 2, 3, 4, 5);
		int sumOfSquares = list26.stream().filter(n -> n % 2 == 0).map(n -> n * n).mapToInt(Integer::intValue).sum();
		System.out.println("26. Sum of squares of even numbers: " + sumOfSquares);

		/* 27. Sort map by value */
		Map<String, Integer> map27 = new HashMap<>();
		map27.put("A", 3);
		map27.put("B", 1);
		map27.put("C", 2);

		Map<String, Integer> sortedMap = map27.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
		System.out.println("27. Map sorted by value: " + sortedMap);

		/* 28. Find employee with highest salary */
		List<Employee> employees = Arrays.asList(new Employee("A", 50000), new Employee("B", 70000),
				new Employee("C", 60000));

		Employee highestPaid = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		System.out.println("28. Highest paid employee: " + highestPaid);

		/* 29. Find common elements between two lists */
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> l2 = Arrays.asList(3, 4, 5, 6);
		List<Integer> common = l1.stream().filter(l2::contains).collect(Collectors.toList());
		System.out.println("29. Common elements: " + common);

		/* 30. Find kth smallest element */
		List<Integer> list30 = Arrays.asList(9, 1, 5, 3, 7);
		int k = 2;
		Integer kthSmallest = list30.stream().sorted().skip(k - 1).findFirst().orElse(null);
		System.out.println("30. Kth smallest element: " + kthSmallest);
	}

	/* Helper Employee class */
	static class Employee {
		private String name;
		private double salary;

		public Employee(String name, double salary) {
			this.name = name;
			this.salary = salary;
		}

		public double getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return name + " (" + salary + ")";
		}
	}
}

package com.smartuniversitymanagementsystem;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        // Factory Pattern
        Users student = UserFactory.createUser("student");
        student.functionality();

        // Singleton Catalog
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Observer Pattern
        catalog.registerObserver(new StudentObserver("Shifa"));
        catalog.registerObserver(new FacultyObserver("Dr. Rao"));

        // Builder Pattern
        Book book = new Book.BookBuilder("Data Structures by Cormen")
                .authors(Arrays.asList("Cormen", "Leiserson"))
                .edition("3rd Edition")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        catalog.addBook(book);
        
        
        String string= "java is java and java is fast";
        String s[]=string.split("\\s+");
        
        Map<String, Long> map =
                Arrays.stream(s)
                      .collect(Collectors.groupingBy(
                              word -> word,
                              Collectors.counting()
                      ));

        System.out.println(map);
    }
}

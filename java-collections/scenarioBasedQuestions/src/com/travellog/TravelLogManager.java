package com.travellog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogManager {

    public static void main(String[] args) throws Exception {

        List<Trip> trips = new ArrayList<>();

        // Create sample trips
        trips.add(new Trip("Paris", "France", 7, "Visited Eiffel Tower and cafes"));
        trips.add(new Trip("Rome", "Italy", 4, "Colosseum and Vatican City"));
        trips.add(new Trip("Paris", "France", 6, "Museums and street food"));

        // Serialize trips
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\travellog\\trips\\trip.ser"));
        oos.writeObject(trips);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("C:\\\\Users\\\\HP\\\\Desktop\\\\Java Programming Workspace\\\\java-collections\\\\scenarioBasedQuestions\\\\src\\\\com\\\\travellog\\\\trips\\\\trip.ser"));
        List<Trip> loadedTrips = (List<Trip>) ois.readObject();

        // Cities using regex
        Pattern cityPattern = Pattern.compile("\\bParis|Rome\\b");
        System.out.println("Cities visited:");
        for (Trip t : loadedTrips) {
            Matcher m = cityPattern.matcher(t.getExperience());
            if (m.find()) {
                System.out.println(t.getCity());
            }
        }

        // Trips > 5 days
        System.out.println("\nTrips longer than 5 days:");
        loadedTrips.stream()
                .filter(t -> t.getDurationDays() > 5)
                .forEach(t -> System.out.println(t.getCity()));

        // Unique countries
        Set<String> countries = new HashSet<>();
        loadedTrips.forEach(t -> countries.add(t.getCountry()));
        System.out.println("\nCountries visited: " + countries);

        // Top 3 cities
        Map<String, Integer> cityCount = new HashMap<>();
        for (Trip t : loadedTrips) {
            cityCount.put(t.getCity(), cityCount.getOrDefault(t.getCity(), 0) + 1);
        }

        cityCount.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(System.out::println);
    }
}

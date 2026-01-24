package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru<T> {

    public static void main(String[] args) {

        Map<String, List<String>> feedbackMap = new HashMap<>();
        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());

        Pattern ratingPattern = Pattern.compile("(\\d+)/10");

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\feedbackguru\\feedback.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    Matcher m = ratingPattern.matcher(line);
                    if (!m.find()) throw new Exception("No rating");

                    int rating = Integer.parseInt(m.group(1));

                    if (rating >= 8)
                        feedbackMap.get("Positive").add(line);
                    else if (rating >= 5)
                        feedbackMap.get("Neutral").add(line);
                    else
                        feedbackMap.get("Negative").add(line);

                } catch (Exception e) {
                    System.out.println("Skipping invalid feedback");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        feedbackMap.forEach((k, v) -> {
            System.out.println("\n" + k + ":");
            v.forEach(System.out::println);
        });
    }
}

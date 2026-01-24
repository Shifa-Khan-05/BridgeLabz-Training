package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    static List<String> answerKey =
            Arrays.asList("A", "B", "C", "D", "A", "B", "C");

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> rankQueue =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        Pattern validOption = Pattern.compile("[A-D]");

        String filePath ="C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\examscanner\\answers.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                if (data.length != answerKey.size() + 1) {
                    System.out.println("Invalid format: " + line);
                    continue;
                }

                int score = 0;
                for (int i = 1; i < data.length; i++) {

                    String answer = data[i].trim();

                    if (!validOption.matcher(answer).matches()) {
                        System.out.println("Invalid answer: " + answer);
                        continue;
                    }

                    if (answer.equals(answerKey.get(i - 1))) {
                        score++;
                    }
                }

                scores.put(data[0].trim(), score);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        rankQueue.addAll(scores.entrySet());

        System.out.println("\n Rank List:");
        while (!rankQueue.isEmpty()) {
            System.out.println(rankQueue.poll());
        }
    }
}

package com.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader<T> {

    public static void main(String[] args) {

        Map<String, List<Integer>> subjectMarks = new HashMap<>();

        Pattern validLine =
                Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d+");

        String filePath =
                "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\examresultuploader\\marks.csv";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (!validLine.matcher(line).matches()) {
                    throw new InvalidResultException(
                            "Invalid format: " + line);
                }

                String[] data = line.split(",");
                String subject = data[2];
                int marks = Integer.parseInt(data[3]);

                subjectMarks
                        .computeIfAbsent(subject,
                                k -> new ArrayList<>())
                        .add(marks);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        // Top scorer per subject
        System.out.println("\n📊 Top Scorers:");
        subjectMarks.forEach((subject, marksList) ->
                System.out.println(subject + " → " + Collections.max(marksList)));
    }
}

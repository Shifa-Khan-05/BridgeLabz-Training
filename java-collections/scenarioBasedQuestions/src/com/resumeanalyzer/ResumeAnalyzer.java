package com.resumeanalyzer;

import java.io.File;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    private static final List<String> KEYWORDS =
            Arrays.asList("Java", "Python", "Spring");

    public static void main(String[] args) {

        File folder = new File("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\resumeanalyzer\\resumes");
        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> resumeList = new ArrayList<>();

        for (File file : folder.listFiles()) {

            try {
                // Skip invalid formats
                if (!file.getName().endsWith(".txt") && !file.getName().endsWith(".pdf")) {
                    throw new IllegalArgumentException("Invalid file format: " + file.getName());
                }

                String content = ResumeReader.readFile(file);

                String email = extractEmail(content);
                String phone = extractPhone(content);
                List<String> matchedKeywords = extractKeywords(content);

                if (email != null) {
                    ResumeData data = new ResumeData(email, phone, matchedKeywords);
                    resumeMap.put(email, data);
                    resumeList.add(data);
                }

            } catch (Exception e) {
                System.out.println("Skipping file: " + e.getMessage());
            }
        }

        // Sort candidates by keyword match count (descending)
        resumeList.sort((a, b) -> b.getKeywordCount() - a.getKeywordCount());

        System.out.println("\n Sorted Candidates:");
        resumeList.forEach(System.out::println);
    }

    // Regex to extract email
    private static String extractEmail(String text) {
        Matcher matcher = Pattern.compile(
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
                .matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    // Regex to extract phone number
    private static String extractPhone(String text) {
        Matcher matcher = Pattern.compile("\\b\\d{10}\\b").matcher(text);
        return matcher.find() ? matcher.group() : "Not Found";
    }

    // Extract keywords using regex
    private static List<String> extractKeywords(String text) {
        List<String> found = new ArrayList<>();

        for (String keyword : KEYWORDS) {
            Pattern pattern = Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                found.add(keyword);
            }
        }
        return found;
    }
}

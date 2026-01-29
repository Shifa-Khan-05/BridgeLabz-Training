package com.csvandjson.markmate;

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MarkMate {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        String file = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\scenarioBasedQuestions\\src\\com\\csvandjson\\markmate\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                try {
                    students.add(parseStudent(line));
                } catch (Exception e) {
                    System.out.println("Invalid row skipped: " + line);
                }
            }

            generateJson(students);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Student parseStudent(String line) {
        String[] data = line.split(",");

        int roll = Integer.parseInt(data[0]);
        String name = data[1];
        int maths = Integer.parseInt(data[2]);
        int science = Integer.parseInt(data[3]);
        int english = Integer.parseInt(data[4]);

        return new Student(roll, name, maths, science, english);
    }

    private static void generateJson(List<Student> students) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new File("report-card.json"), students);
        System.out.println(" JSON report generated");
    }
}

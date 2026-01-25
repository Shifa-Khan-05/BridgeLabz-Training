package com.basiclevel.readcsv;

import java.io.*;
public class ReadStudentCSV {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\basiclevel\\readcsv\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                System.out.println("ID: " + data[0] +
                        ", Name: " + data[1] +
                        ", Age: " + data[2] +
                        ", Marks: " + data[3]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

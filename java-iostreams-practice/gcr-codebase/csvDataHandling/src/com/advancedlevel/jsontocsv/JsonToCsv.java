package com.advancedlevel.jsontocsv;

import java.io.*;

public class JsonToCsv {

    public static void main(String[] args) {

        String jsonFile = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\advancedlevel\\jsontocsv\\students.json";
        String csvFile = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\advancedlevel\\jsontocsv\\students.csv";

        try (
                BufferedReader br = new BufferedReader(new FileReader(jsonFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))
        ) {

            // CSV Header
            bw.write("ID,Name,Age,Marks");
            bw.newLine();

            String line;
            String id = "", name = "", age = "", marks = "";

            while ((line = br.readLine()) != null) {

                line = line.trim();

                if (line.startsWith("\"id\"")) {
                    id = line.split(":")[1].replace(",", "").trim();
                }
                else if (line.startsWith("\"name\"")) {
                    name = line.split(":")[1]
                            .replace(",", "")
                            .replace("\"", "")
                            .trim();
                }
                else if (line.startsWith("\"age\"")) {
                    age = line.split(":")[1].replace(",", "").trim();
                }
                else if (line.startsWith("\"marks\"")) {
                    marks = line.split(":")[1].replace(",", "").trim();

                    // Write row only after last field
                    bw.write(id + "," + name + "," + age + "," + marks);
                    bw.newLine();
                }
            }

            System.out.println("JSON converted to CSV successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

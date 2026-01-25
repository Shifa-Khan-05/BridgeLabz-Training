package com.advancedlevel.readlargecsv;

import java.io.*;
import java.util.*;

public class LargeCSVReader {

    private static final int BATCH_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\advancedlevel\\readlargecsv\\large.csv";

        int count = 0;
        List<String> batch = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.readLine(); // Skip header
            String line;

            while ((line = br.readLine()) != null) {
                batch.add(line);
                count++;

                if (batch.size() == BATCH_SIZE) {
                    // Process batch (example: just printing count)
                    System.out.println("Processed records: " + count);
                    batch.clear();
                }
            }

            // 🔹 Process remaining records
            if (!batch.isEmpty()) {
                System.out.println("Processed records: " + count);
            }

            System.out.println("Large CSV processing completed!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

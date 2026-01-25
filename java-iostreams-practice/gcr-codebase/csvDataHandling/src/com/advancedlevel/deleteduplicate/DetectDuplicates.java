package com.advancedlevel.deleteduplicate;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class DetectDuplicates {

    public static void main(String[] args) throws IOException {
        Set<String> ids = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\advancedlevel\\deleteduplicate\\duplicates.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String id = line.split(",")[0];

            if (!ids.add(id)) {
                System.out.println("Duplicate: " + line);
            }
        }
        br.close();
    }
}

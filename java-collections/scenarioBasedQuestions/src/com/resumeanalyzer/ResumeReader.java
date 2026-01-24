package com.resumeanalyzer;

import java.io.*;

public class ResumeReader {

    // Reads resume content from file
    public static String readFile(File file) throws IOException {

        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file)))) {

            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }
        }
        return content.toString();
    }
}

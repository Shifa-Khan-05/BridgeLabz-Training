package com.algoritmsruntimeanalysis;
import java.io.*;

public class LargeFileReading {
	// Read file using FileReader
    static void readUsingFileReader(String filePath) throws Exception {

        long start = System.nanoTime();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        while (br.readLine() != null) {
            // reading file line by line
        }
        br.close();

        long end = System.nanoTime();
        System.out.println("FileReader Time (ms): " + (end - start) / 1_000_000);
    }

    // Read file using InputStreamReader
    static void readUsingInputStreamReader(String filePath) throws Exception {

        long start = System.nanoTime();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), "UTF-8"));

        while (br.readLine() != null) {
            // reading file line by line
        }
        br.close();

        long end = System.nanoTime();
        System.out.println("InputStreamReader Time (ms): " + (end - start) / 1_000_000);
    }

    public static void main(String[] args) throws Exception {

        String filePath = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-dsa-practice\\gcr-codebase\\javaDsaConcepts\\src\\com\\algoritmsruntimeanalysis\\largefile.txt"; // path to large file

        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);
    }
    
}

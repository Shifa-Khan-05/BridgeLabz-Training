package com.intermediatelevel.filterstudent;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class FilterStudents {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\intermediatelevel\\filterstudent\\studentsmarks.csv"));
        br.readLine(); // header

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[3]);

            if (marks > 80) {
                System.out.println(Arrays.toString(data));
            }
        }
        br.close();
    }
}

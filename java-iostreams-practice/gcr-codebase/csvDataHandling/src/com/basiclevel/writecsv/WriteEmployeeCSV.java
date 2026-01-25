package com.basiclevel.writecsv;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class WriteEmployeeCSV {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\basiclevel\\writecsv\\employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // Write header
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            // Write records
            bw.write("1,John,IT,60000");
            bw.newLine();
            bw.write("2,Alice,HR,50000");
            bw.newLine();
            bw.write("3,Bob,Finance,70000");
            bw.newLine();
            bw.write("4,Eva,IT,80000");
            bw.newLine();
            bw.write("5,Tom,Sales,45000");

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

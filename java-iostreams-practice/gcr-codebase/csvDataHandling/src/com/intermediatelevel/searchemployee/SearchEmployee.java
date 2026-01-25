package com.intermediatelevel.searchemployee;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class SearchEmployee {

    public static void main(String[] args) throws IOException {
        String searchName = "Ravi";
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\intermediatelevel\\searchemployee\\employees_search.csv"));
        br.readLine(); // header

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + data[2]);
                System.out.println("Salary: " + data[3]);
                break;
            }
        }
        br.close();
    }
}

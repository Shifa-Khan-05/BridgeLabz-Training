package com.dealtracker;

import java.io.*;
import java.time.*;
import java.util.*;
import java.util.regex.*;

public class DealTracker {

    public static void main(String[] args) throws Exception {

        Map<String, Deal<?>> deals = new HashMap<>();
        Set<String> codes = new HashSet<>();

        BufferedReader br =
                new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\dealtracker\\deal.txt"));

        String line, code = "";
        int discount = 0;

        while ((line = br.readLine()) != null) {
            if (line.startsWith("DealCode"))
                code = line.split(": ")[1];
            if (line.startsWith("Discount"))
                discount = Integer.parseInt(
                        line.replaceAll("\\D", ""));
        }

        if (codes.add(code))
            deals.put(code, new Deal<>(code, discount));

        deals.values().stream()
                .sorted((a, b) -> b.discount - a.discount)
                .forEach(d -> System.out.println(d.code + " → " + d.discount + "%"));
    }
}

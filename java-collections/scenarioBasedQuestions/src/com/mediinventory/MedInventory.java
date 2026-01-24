package com.mediinventory;


import java.io.*;
import java.util.*;
import java.util.regex.*;

public class MedInventory {

    public static void main(String[] args) {

        Map<String, List<Item<?>>> categoryMap = new HashMap<>();
        Set<Item<?>> uniqueItems = new HashSet<>();

        Pattern datePattern =
                Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

        try (BufferedReader br =
                new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\mediinventory\\inventory.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                Item<?> item = new Item<>(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        data[3]);

                if (!datePattern.matcher(item.expiry).matches())
                    continue;

                if (item.quantity < 5)
                    throw new LowStockException(
                            "CRITICAL LOW STOCK: " + item.name);

                uniqueItems.add(item);

                categoryMap
                        .computeIfAbsent(item.name,
                                k -> new ArrayList<>())
                        .add(item);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total Unique Items: " + uniqueItems.size());
    }
}

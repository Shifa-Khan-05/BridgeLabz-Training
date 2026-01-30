package com.methodreference.invoiceobjectcreation;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(101, 102, 103, 104);

        // Constructor reference
        Function<Integer, Invoice> invoiceCreator = Invoice::new;

        // Create Invoice objects
        List<Invoice> invoices = transactionIds.stream()
                                                .map(invoiceCreator)
                                                .collect(Collectors.toList());

        // Print invoices
        invoices.forEach(System.out::println);
    }
}

package com.interfaces.staticmethodsininterface.dateformatutility;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("DD-MM-YYYY: " +
                DateFormatter.formatDate(today, "dd-MM-yyyy"));

        System.out.println("YYYY/MM/DD: " +
                DateFormatter.formatDate(today, "yyyy/MM/dd"));
    }
}

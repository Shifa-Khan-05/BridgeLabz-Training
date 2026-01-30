package com.streamapi.foreachmethod.emailnotification;


import java.util.Arrays;
import java.util.List;

public class EmailNotification {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "shifa@gmail.com",
                "abhay@gmail.com",
                "riya@gmail.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Sending notification email to: " + email);
    }
}

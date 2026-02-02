package com.optionalclass.systemutility;

import java.util.Optional;

public class SystemUtilityApp {

    public static void main(String[] args) {

        String config = null;
        String filePath = null;
        Optional<String> apiResponse = Optional.empty();
        Optional<String> userPreference = Optional.of("Dark Theme");

        System.out.println("==============================================");

        // 1. Config value
        String configValue =
                Optional.ofNullable(config).orElse("default-config");
        System.out.println("Config: " + configValue);

        System.out.println("==============================================");

        // 2. Environment variable
        String javaHome =
                Optional.ofNullable(System.getenv("JAVA_HOME"))
                        .orElse("Not Defined");
        System.out.println("JAVA_HOME: " + javaHome);

        System.out.println("==============================================");

        // 3. File path
        String finalPath =
                Optional.ofNullable(filePath)
                        .orElse("/default/path");
        System.out.println("File Path: " + finalPath);

        System.out.println("==============================================");

        // 4. API response
        System.out.println(
                apiResponse.orElse("No data from API")
        );

        System.out.println("==============================================");

        // 5. User preference
        userPreference.ifPresent(
                pref -> System.out.println("User Preference: " + pref)
        );
    }
}

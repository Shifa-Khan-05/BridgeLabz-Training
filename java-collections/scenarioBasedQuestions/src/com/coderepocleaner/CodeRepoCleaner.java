package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class CodeRepoCleaner {

    public static void main(String[] args) throws IOException {

        List<Path> javaFiles = new ArrayList<>();
        Files.walk(Paths.get("src"))
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(javaFiles::add);

        Pattern badMethod = Pattern.compile("void [A-Z].*\\(");
        Pattern unusedImport = Pattern.compile("import .*;");

        Map<String, List<File>> categories = new HashMap<>();
        categories.put("Valid", new ArrayList<>());
        categories.put("Warnings", new ArrayList<>());
        categories.put("Errors", new ArrayList<>());

        for (Path path : javaFiles) {
            List<String> lines = Files.readAllLines(path);
            boolean warning = false;

            for (String line : lines) {
                if (badMethod.matcher(line).find()) {
                    warning = true;
                }
            }

            if (warning)
                categories.get("Warnings").add(path.toFile());
            else
                categories.get("Valid").add(path.toFile());
        }

        categories.forEach((k, v) ->
                System.out.println(k + " files: " + v.size()));
    }
    
}

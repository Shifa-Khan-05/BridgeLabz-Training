package com.chatlogparser;
import java.util.*;
import java.util.regex.*;
import java.io.*;


public class ChatLogParser {

    public static void main(String[] args) throws Exception {

        TreeMap<String, List<String>> userMessages =
                new TreeMap<>();

        List<String> idleWords =
                Arrays.asList("lol", "brb");

        Pattern pattern = Pattern.compile(
                "\\[(.*?)\\] (.*?): (.*)");

        BufferedReader br =
                new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\chatlogparser\\chat.txt"));

        String line;
        while ((line = br.readLine()) != null) {

            Matcher m = pattern.matcher(line);
            if (m.matches()) {
                String user = m.group(2);
                String msg = m.group(3);

                boolean idle = idleWords.stream()
                        .anyMatch(msg.toLowerCase()::contains);

                if (!idle) {
                    userMessages
                            .computeIfAbsent(user,
                                    k -> new ArrayList<>())
                            .add(msg);
                }
            }
        }

        userMessages.forEach(
                (k, v) -> System.out.println(k + " → " + v));
    }
}

package com.java8Logicalquestions;

import java.util.*;
import java.util.stream.*;

public class StreamStringProblems {

    public static void main(String[] args) {

        /* -------------------------------------------------
         * 1. Character Frequency Count
         * Input : "banana"
         * Output: {b=1, a=3, n=2}
         * ------------------------------------------------- */
        String s1 = "banana";
        Map<Character, Long> charFrequency =
                s1.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println("1. Character Frequency Count: " + charFrequency);


        /* -------------------------------------------------
         * 2. Word Frequency Count
         * Input : "java is java and java is fast"
         * Output: {java=3, is=2, and=1, fast=1}
         * ------------------------------------------------- */
        String s2 = "java is java and java is fast";
        Map<String, Long> wordFrequency =
                Arrays.stream(s2.split(" "))
                      .collect(Collectors.groupingBy(
                              w -> w, LinkedHashMap::new, Collectors.counting()));
        System.out.println("2. Word Frequency Count: " + wordFrequency);


        /* -------------------------------------------------
         * 3. First Non-Repeating Character
         * Input : "stress"
         * Output: t
         * ------------------------------------------------- */
        String s3 = "stress";
        Character firstNonRepeating =
                s3.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          c -> c, LinkedHashMap::new, Collectors.counting()))
                  .entrySet()
                  .stream()
                  .filter(e -> e.getValue() == 1)
                  .map(Map.Entry::getKey)
                  .findFirst()
                  .orElse(null);
        System.out.println("3. First Non-Repeating Character: " + firstNonRepeating);


        /* -------------------------------------------------
         * 4. All Non-Repeating Characters
         * Input : "programming"
         * Output: p o g r a i n
         * ------------------------------------------------- */
        String s4 = "programming";
        String allNonRepeating =
                s4.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          c -> c, LinkedHashMap::new, Collectors.counting()))
                  .entrySet()
                  .stream()
                  .filter(e -> e.getValue() == 1)
                  .map(e -> String.valueOf(e.getKey()))
                  .collect(Collectors.joining(" "));
        System.out.println("4. All Non-Repeating Characters: " + allNonRepeating);


        /* -------------------------------------------------
         * 5. Remove Duplicate Characters
         * Input : "banana"
         * Output: "ban"
         * ------------------------------------------------- */
        String s5 = "banana";
        String removeDuplicates =
                s5.chars()
                  .distinct()
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
        System.out.println("5. Remove Duplicate Characters: " + removeDuplicates);


        /* -------------------------------------------------
         * 6. Remove Repeating Characters
         * (Keep only characters that appear once)
         * Input : "aabbccdde"
         * Output: "e"
         * ------------------------------------------------- */
        String s6 = "aabbccdde";
        String uniqueOnce =
                s6.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          c -> c, LinkedHashMap::new, Collectors.counting()))
                  .entrySet()
                  .stream()
                  .filter(e -> e.getValue() == 1)
                  .map(e -> String.valueOf(e.getKey()))
                  .collect(Collectors.joining());
        System.out.println("6. Remove Repeating Characters: " + uniqueOnce);


        /* -------------------------------------------------
         * 7. Remove Non-Alphanumeric Characters
         * Input : "ja@va#8!!"
         * Output: "java8"
         * ------------------------------------------------- */
        String s7 = "ja@va#8!!";
        String alphaNumericOnly =
                s7.chars()
                  .filter(Character::isLetterOrDigit)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
        System.out.println("7. Remove Non-Alphanumeric Characters: " + alphaNumericOnly);


        /* -------------------------------------------------
         * 8. Keep Only Alphabets
         * Input : "java8stream2025"
         * Output: "javastream"
         * ------------------------------------------------- */
        String s8 = "java8stream2025";
        String onlyAlphabets =
                s8.chars()
                  .filter(Character::isLetter)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
        System.out.println("8. Keep Only Alphabets: " + onlyAlphabets);


        /* -------------------------------------------------
         * 9. Keep Only Digits
         * Input : "orderId=AB123XZ9"
         * Output: "1239"
         * ------------------------------------------------- */
        String s9 = "orderId=AB123XZ9";
        String onlyDigits =
                s9.chars()
                  .filter(Character::isDigit)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
        System.out.println("9. Keep Only Digits: " + onlyDigits);


        /* -------------------------------------------------
         * 10. Count Each Character Except Spaces
         * Input : "java stream"
         * Output: Frequency map without space
         * ------------------------------------------------- */
        String s10 = "java stream";
        Map<Character, Long> frequencyWithoutSpace =
                s10.chars()
                   .filter(c -> c != ' ')
                   .mapToObj(c -> (char) c)
                   .collect(Collectors.groupingBy(
                           c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println("10. Character Count Without Spaces: " + frequencyWithoutSpace);
    }
}

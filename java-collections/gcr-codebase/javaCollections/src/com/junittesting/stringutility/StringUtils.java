package com.junittesting.stringutility;

//Utility class for String operations
public class StringUtils {

 // Reverses a given string
 public String reverse(String str) {
     if (str == null) return null;
     return new StringBuilder(str).reverse().toString();
 }

 // Checks whether a string is a palindrome
 public boolean isPalindrome(String str) {
     if (str == null) return false;
     return str.equalsIgnoreCase(reverse(str));
 }

 // Converts string to uppercase
 public String toUpperCase(String str) {
     if (str == null) return null;
     return str.toUpperCase();
 }
}

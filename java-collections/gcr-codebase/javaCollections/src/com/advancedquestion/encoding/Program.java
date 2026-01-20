package com.advancedquestion.encoding;

import java.util.Scanner;

public class Program {

    public String CleanseAndInvert(String input) {

        if (input == null || input.length() < 6 || !input.matches("^[a-zA-Z]+$")) {
           
        	System.out.println("Invalid input");
        	return "";
        }

        input = input.toLowerCase();
        StringBuilder sb = new StringBuilder();

        // Remove characters with even ASCII value
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!checkEvenAscii(ch)) {
                sb.append(ch);
            }
        }

        // Reverse the string
        sb.reverse();

        // Convert even index characters to uppercase
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                sb.setCharAt(i, (char) (sb.charAt(i) - 32));
            }
        }

        return sb.toString();
    }

    public boolean checkEvenAscii(char c) {
    	int value=(int) c;
		if(value%2==0)
		{
			return true;
		}
		return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String input = scanner.nextLine();

        Program program = new Program();
        System.out.println(program.CleanseAndInvert(input));
        scanner.close();
    }
}

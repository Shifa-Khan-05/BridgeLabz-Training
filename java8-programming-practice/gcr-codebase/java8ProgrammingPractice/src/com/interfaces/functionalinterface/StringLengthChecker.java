package com.interfaces.functionalinterface;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=scanner.next();
		
		Function<String, Integer> string= s-> s.length();
		int length = string.apply(input);
		
		if(length>20)
		{
			System.out.println("length limit exceeded!!!!!!!!!!!!!!!");
		}
		
		else {
			System.out.println();
		}
		
	}
}

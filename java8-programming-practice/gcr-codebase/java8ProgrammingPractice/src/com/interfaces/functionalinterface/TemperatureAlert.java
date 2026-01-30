package com.interfaces.functionalinterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {

	public static void main(String[] args) {
		System.out.println("enter temperature");
		Scanner sc=new Scanner(System.in);
		double temperature=sc.nextDouble();
		
		Predicate<Double> ishigh = temperatures -> temperature>38.5;
		if(ishigh.test(temperature))
		{
			System.out.println("Alert !!!!!!!! high temperature detected");
		}
		else {
			System.out.println("temperature is normal");
		}
	}
}

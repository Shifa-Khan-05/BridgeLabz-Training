package com.interfaces.staticmethodsininterface.unitconversiontest;

public class Main {
	public static void main(String[] args) {

        double km = 10;
        double kg = 5;

        System.out.println(km + " km = " + UnitConversion.kmToMiles(km) + " miles");
        System.out.println(kg + " kg = " + UnitConversion.kgToPounds(kg) + " pounds");
    }
}
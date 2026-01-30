package com.interfaces.staticmethodsininterface.unitconversiontest;

public interface UnitConversion {
	static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }
}
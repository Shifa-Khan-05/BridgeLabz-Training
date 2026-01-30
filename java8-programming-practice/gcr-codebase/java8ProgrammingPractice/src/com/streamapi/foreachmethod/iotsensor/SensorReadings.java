package com.streamapi.foreachmethod.iotsensor;


import java.util.Arrays;
import java.util.List;

public class SensorReadings {

    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(22.5, 35.0, 18.2, 40.6, 28.9);

        double threshold = 30.0;

        readings.stream()
                .filter(reading -> reading > threshold) // filter high readings
                .forEach(reading ->
                        System.out.println("High reading detected: " + reading)
                );
    }
}

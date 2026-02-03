package com.workshop.smartcitytransport;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distanceKm);
}

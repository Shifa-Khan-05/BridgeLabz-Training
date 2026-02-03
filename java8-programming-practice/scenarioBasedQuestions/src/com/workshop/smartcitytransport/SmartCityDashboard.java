package com.workshop.smartcitytransport;

import java.util.*;
import java.util.stream.Collectors;

public class SmartCityDashboard {

    public static void main(String[] args) {

        List<TransportService> services = List.of(
                new BusService("A-B", 30, 40),
                new MetroService("A-C", 50, 120),
                new TaxiService("B-D", 120, 2),
                new BusService("A-B", 25, 35),
                new AmbulanceService()
        );

        System.out.println("==============================================");
        System.out.println("LIVE TRANSPORT DASHBOARD");

        //  forEach() + Method Reference
        services.forEach(TransportService::printServiceDetails);

        System.out.println("==============================================");

        // Lambda – filter & sort by fare
        System.out.println("Sorted by Lowest Fare:");
        services.stream()
                .filter(s -> s.getFare() > 0)
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        System.out.println("==============================================");

        //  Functional Interface – Fare Calculator
        FareCalculator taxiFare =
                distance -> distance * 15;

        double distance =
                GeoUtils.calculateDistance(18.5, 73.9, 18.6, 74.0);

        System.out.println("Taxi Fare for distance: " +
                taxiFare.calculateFare(distance));

        System.out.println("==============================================");

        // Collectors – groupingBy route
        Map<String, List<TransportService>> byRoute =
                services.stream()
                        .collect(Collectors.groupingBy(
                                TransportService::getRoute));

        byRoute.forEach((route, list) ->
                System.out.println(route + " -> " + list.size() + " services")
        );

        System.out.println("==============================================");

        //  partitioningBy – peak vs non-peak
        Map<Boolean, List<TransportService>> peakPartition =
                services.stream()
                        .collect(Collectors.partitioningBy(
                                s -> s.getPassengers() > 50
                        ));

        System.out.println("Peak Services: " + peakPartition.get(true).size());
        System.out.println("Non-Peak Services: " + peakPartition.get(false).size());

        System.out.println("==============================================");

        //  summarizingDouble – revenue summary
        DoubleSummaryStatistics revenueStats =
                services.stream()
                        .collect(Collectors.summarizingDouble(
                                s -> s.getFare() * s.getPassengers()
                        ));

        System.out.println("Total Revenue: " + revenueStats.getSum());
        System.out.println("Average Revenue: " + revenueStats.getAverage());

        System.out.println("==============================================");

        //  Marker Interface Detection
        System.out.println("Emergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(TransportService::printServiceDetails);
    }
}

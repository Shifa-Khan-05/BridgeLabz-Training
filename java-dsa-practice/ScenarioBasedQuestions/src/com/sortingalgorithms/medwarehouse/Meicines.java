package com.sortingalgorithms.medwarehouse;

import java.time.LocalDate;

/**
 * Represents a medicine with expiry date
 */
public class Meicines {

    private String name;
    private LocalDate expiryDate;

    public Meicines(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Medicine: " + name + " | Expiry Date: " + expiryDate;
    }
}

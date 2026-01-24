package com.travellog;

import java.io.Serializable;

public class Trip implements Serializable {

    private String city;
    private String country;
    private int durationDays;
    private String experience;

    public Trip(String city, String country, int durationDays, String experience) {
        this.city = city;
        this.country = country;
        this.durationDays = durationDays;
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public String getExperience() {
        return experience;
    }
}

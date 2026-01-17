package com.sortingalgorithms.artexpo;

public class Artist {
	private String name;
    private java.time.LocalTime registrationTime;

    public Artist(String name, String time) {
        this.name = name;
        this.registrationTime = java.time.LocalTime.parse(time);
    }

    public java.time.LocalTime getRegistrationTime() {
        return registrationTime;
    }

    @Override
    public String toString() {
        return name + " registered at " + registrationTime;
    }
}

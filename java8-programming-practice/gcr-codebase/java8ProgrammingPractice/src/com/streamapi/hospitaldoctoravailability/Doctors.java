package com.streamapi.hospitaldoctoravailability;

public class Doctors {

    String name;
    String speciality;
    boolean isAvailableOnWeekend;

    public Doctors(String name, String speciality, boolean isAvailableOnWeekend) {
        this.name = name;
        this.speciality = speciality;
        this.isAvailableOnWeekend = isAvailableOnWeekend;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean isAvailableOnWeekend() {
        return isAvailableOnWeekend;
    }

    @Override
    public String toString() {
        return "Doctor Name: " + name +
               " | Speciality: " + speciality +
               " | Available on Weekend: " + isAvailableOnWeekend;
    }
}

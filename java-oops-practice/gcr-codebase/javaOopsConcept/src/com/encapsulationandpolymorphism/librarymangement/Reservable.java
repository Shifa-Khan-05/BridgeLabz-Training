package com.encapsulationandpolymorphism.librarymangement;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

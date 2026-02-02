package com.optionalclass.officesystem;

import java.util.List;
import java.util.Optional;

public class Employee {

    private int id;
    private String name;
    private Optional<String> middleName;
    private String email;
    private Optional<String> manager;
    private Optional<Integer> bonus;
    private List<String> insuranceDetails;

    public Employee(int id,
                    String name,
                    Optional<String> middleName,
                    String email,
                    Optional<String> manager,
                    Optional<Integer> bonus,
                    List<String> insuranceDetails) {

        this.id = id;
        this.name = name;
        this.middleName = middleName;
        this.email = email;
        this.manager = manager;
        this.bonus = bonus;
        this.insuranceDetails = insuranceDetails;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getMiddleName() {
        return middleName;
    }

    public String getEmail() {
        return email;
    }

    public Optional<String> getManager() {
        return manager;
    }

    public Optional<Integer> getBonus() {
        return bonus;
    }

    public List<String> getInsuranceDetails() {
        return insuranceDetails;
    }
}

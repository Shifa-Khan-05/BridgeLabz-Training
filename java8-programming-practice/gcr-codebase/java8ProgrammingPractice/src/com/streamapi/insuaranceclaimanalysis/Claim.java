package com.streamapi.insuaranceclaimanalysis;

public class Claim {

    private String claimType;
    private double claimAmount;

    public Claim(String claimType, double claimAmount) {
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}
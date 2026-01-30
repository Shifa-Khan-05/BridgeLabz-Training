package com.interfaces.interfaceimplementation.multivehiclerentalsystem;


public class Bus implements Vehicle {

    @Override
    public void rent() {
        System.out.println("Bus has been rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned");
    }
}

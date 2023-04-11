package com.nayab.parkinglot.model;

public class Truck extends Vehicle {
    public Truck(String vehicleNumber) {
        super(VehicleType.HEAVY, vehicleNumber);
    }
}

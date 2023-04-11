package com.nayab.parkinglot.model;

public class EV extends Vehicle {
    public EV(String vehicleNumber) {
        super(VehicleType.ELECTRIC, vehicleNumber);
    }
}

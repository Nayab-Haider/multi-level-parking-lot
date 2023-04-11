package com.nayab.parkinglot.model;

public class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(VehicleType.LIGHT, vehicleNumber);
    }
}

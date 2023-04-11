package com.nayab.parkinglot.model;

public abstract class Vehicle {
    private VehicleType vehicleType;
    private String vehicleNumber;
    private ParkingTicket parkingTicket;

    public Vehicle(VehicleType vehicleType, String vehicleNumber) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }
}

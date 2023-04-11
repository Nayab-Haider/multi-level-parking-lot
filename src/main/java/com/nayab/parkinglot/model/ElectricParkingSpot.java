package com.nayab.parkinglot.model;

import java.util.UUID;

public class ElectricParkingSpot extends ParkingSpot {
    public ElectricParkingSpot(String assignedVehicleId) {
        super(UUID.randomUUID().toString(), ParkingSpotType.ELECTRIC, assignedVehicleId);
    }
}

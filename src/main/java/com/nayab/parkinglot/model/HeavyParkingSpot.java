package com.nayab.parkinglot.model;

import java.util.UUID;

public class HeavyParkingSpot extends ParkingSpot {
    public HeavyParkingSpot(String assignedVehicleId) {
        super(UUID.randomUUID().toString(), ParkingSpotType.HEAVY, assignedVehicleId);
    }
}

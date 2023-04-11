package com.nayab.parkinglot.model;

import java.util.UUID;

public class LightParkingSpot extends ParkingSpot {
    public LightParkingSpot(String assignedVehicleId) {
        super(UUID.randomUUID().toString(), ParkingSpotType.LIGHT, assignedVehicleId);
    }
}

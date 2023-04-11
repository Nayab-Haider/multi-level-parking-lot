package com.nayab.parkinglot.model;

import java.util.UUID;

public class MoterBikeParkingSpot extends ParkingSpot {
    public MoterBikeParkingSpot(String assignedVehicleId) {
        super(UUID.randomUUID().toString(), ParkingSpotType.MOTERBIKE, assignedVehicleId);
    }
}

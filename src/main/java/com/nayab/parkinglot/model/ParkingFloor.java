package com.nayab.parkinglot.model;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ParkingFloor {
    private String parkingFloorId;
    private Map<ParkingSpotType, Deque<ParkingSpot>> parkingSpot;
    private Map<String, ParkingSpot> usedParkingSpot;
    private static final int SIZE = 10;

    ParkingFloor() {
        parkingSpot.put(ParkingSpotType.ELECTRIC, new ConcurrentLinkedDeque<>());
        parkingSpot.put(ParkingSpotType.HEAVY, new ConcurrentLinkedDeque<>());
        parkingSpot.put(ParkingSpotType.LIGHT, new ConcurrentLinkedDeque<>());
        parkingSpot.put(ParkingSpotType.MOTERBIKE, new ConcurrentLinkedDeque<>());
        parkingSpot = new HashMap<>();
        usedParkingSpot = new HashMap<>();
    }

    public boolean isFull() {
        int count = 0;
        for (Map.Entry<ParkingSpotType, Deque<ParkingSpot>> entry : parkingSpot.entrySet()) {
            if (entry.getValue().size() == 0) {
                count++;
            }
        }
        return count == parkingSpot.entrySet().size();
    }

    public synchronized ParkingSpot getSpot(VehicleType vehicleType) {
        if (!canPark(vehicleType)) return null;
        ParkingSpotType parkingSpotType = mapVehicleTypeToParkingSpotType(vehicleType);
        ParkingSpot parkingSpot = this.parkingSpot.get(parkingSpotType).remove();
        usedParkingSpot.put(parkingSpot.getParkingSpotId(), parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot freeParkingSpot(ParkingSpot parkingSpot) {
        usedParkingSpot.remove(parkingSpot.getAssignedVehicleId());
        parkingSpot.vacateSpot();
        this.parkingSpot.get(parkingSpot.getParkingSpotType()).addFirst(parkingSpot);
        return parkingSpot;
    }

    public boolean canPark(VehicleType vehicleType) {
        ParkingSpotType parkingSpotType = mapVehicleTypeToParkingSpotType(vehicleType);
        return parkingSpot.get(parkingSpotType).size() > 0;
    }

    public ParkingSpotType mapVehicleTypeToParkingSpotType(VehicleType vehicleType) {
        switch (vehicleType) {
            case HEAVY:
                return ParkingSpotType.HEAVY;
            case ELECTRIC:
                return ParkingSpotType.ELECTRIC;
            case LIGHT:
                return ParkingSpotType.LIGHT;
            default:
                return ParkingSpotType.MOTERBIKE;

        }
    }
}

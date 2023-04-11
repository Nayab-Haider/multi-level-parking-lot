package com.nayab.parkinglot.model;

public abstract class ParkingSpot {
    public String parkingSpotId;
    public ParkingSpotType parkingSpotType;
    private String assignedVehicleId;
    private Boolean isFree;

    public void vacateSpot() {
        this.isFree = true;
        this.assignedVehicleId = null;
    }

    public void assignVehicle(String vehicleNumber) {
        this.assignedVehicleId = vehicleNumber;
    }

    public ParkingSpot(String parkingSpotId, ParkingSpotType parkingSpotType, String assignedVehicleId) {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.assignedVehicleId = assignedVehicleId;
    }

    public String getAssignedVehicleId() {
        return assignedVehicleId;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public String getParkingSpotId() {
        return parkingSpotId;
    }
}

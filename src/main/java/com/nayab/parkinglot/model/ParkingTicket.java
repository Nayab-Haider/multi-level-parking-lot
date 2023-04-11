package com.nayab.parkinglot.model;

import java.time.LocalDateTime;

public class ParkingTicket {
    private String parkingTicketId;
    private Double cost;
    private String parkingSpotId;
    private String vehicleNumber;
    private LocalDateTime issueTime;
    private LocalDateTime exitTime;
}

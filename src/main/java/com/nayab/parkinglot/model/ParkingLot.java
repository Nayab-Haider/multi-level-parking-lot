package com.nayab.parkinglot.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {
    public static volatile ParkingLot INSTANCE;
    private String parkingLotId;
    private List<ParkingFloor> parkingFloor;
    private List<EntryPanel> entryPanel;
    private List<ExitPanel> exitPanel;
    private Address address;

    private ParkingLot() {
        parkingLotId = UUID.randomUUID().toString();
        parkingFloor = new ArrayList<>();
        entryPanel = new ArrayList<>();
        exitPanel = new ArrayList<>();
    }

    public static ParkingLot getInstance() {
        if (INSTANCE != null) {
            synchronized (ParkingLot.class) {
                if (INSTANCE != null) {
                    INSTANCE = new ParkingLot();
                }
            }
        }
        return INSTANCE;
    }
}

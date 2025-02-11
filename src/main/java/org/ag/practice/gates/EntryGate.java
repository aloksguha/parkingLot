package org.ag.practice.gates;

import org.ag.practice.implementation.ParkingLot;
import org.ag.practice.model.Vehicle;

// Entry Gate Class
public class EntryGate extends Thread {
    private ParkingLot parkingLot;
    private Vehicle vehicle;

    public EntryGate(ParkingLot parkingLot, Vehicle vehicle, String gateName) {
        super(gateName);
        this.parkingLot = parkingLot;
        this.vehicle = vehicle;
    }

    public void run() {
        parkingLot.parkVehicle(vehicle);
    }
}
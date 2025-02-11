package org.ag.practice.gates;

import org.ag.practice.implementation.ParkingLot;
import org.ag.practice.model.Vehicle;

public class ExitGate extends Thread {
    private ParkingLot parkingLot;
    private Vehicle vehicle;

    public ExitGate(ParkingLot parkingLot, Vehicle vehicle, String gateName) {
        super(gateName);
        this.parkingLot = parkingLot;
        this.vehicle = vehicle;
    }

    public void run() {
        parkingLot.leaveVehicle(vehicle);
    }
}

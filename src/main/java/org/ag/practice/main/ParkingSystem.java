package org.ag.practice.main;

import org.ag.practice.gates.EntryGate;
import org.ag.practice.gates.ExitGate;
import org.ag.practice.implementation.ParkingLot;
import org.ag.practice.model.Vehicle;
import org.ag.practice.model.VehicleSize;

public class ParkingSystem {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(1, 1, 1); // S=1, M=1, L=1

        // Creating vehicles
        Vehicle car1 = new Vehicle("MH14EY1000", VehicleSize.L);
        Vehicle car2 = new Vehicle("MH14EY1001", VehicleSize.M);
        Vehicle car3 = new Vehicle("MH14EY1002", VehicleSize.L);
        Vehicle car4 = new Vehicle("MH14EY1004", VehicleSize.M);

        // Simulating multiple vehicles entering
        new EntryGate(parkingLot, car1, "Entry-Gate-East").start();
        new EntryGate(parkingLot, car2, "Entry-Gate-West").start();
        new EntryGate(parkingLot, car3, "Entry-Gate-South").start();
        new EntryGate(parkingLot, car4, "Entry-Gate-South").start();


        new ExitGate(parkingLot, car1, "Exit-Gate-East").start();
        new EntryGate(parkingLot, car3, "Entry-Gate-South").start();




//        new EntryGate(parkingLot, truck, "Entry-Gate-Central").start(); // L slot
//          // M slot full → should wait
//        new EntryGate(parkingLot, bike2, "Entry-Gate-North").start(); // S slot full → should park in M
//
//        new ExitGate(parkingLot, bike1, "Exit-Gate-East").start();
//        new ExitGate(parkingLot, truck, "Exit-Gate-West").start();
    }
}
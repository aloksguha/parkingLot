package org.ag.practice.implementation;

import org.ag.practice.interfaces.AbstractParkingLot;
import org.ag.practice.model.Vehicle;

public class ParkingLot extends AbstractParkingLot {
    public ParkingLot(int smallSlots, int mediumSlots, int largeSlots) {
        super(smallSlots, mediumSlots, largeSlots);
    }

    @Override
    public synchronized boolean parkVehicle(Vehicle vehicle) {
        boolean parked = false;
        switch (vehicle.getSize()) {
            case S:
                if (occupiedSmall < smallSlots) {
                    occupiedSmall++;
                    parked = true;
                } else if (occupiedMedium < mediumSlots) {
                    occupiedMedium++;
                    parked = true;
                } else if (occupiedLarge < largeSlots) {
                    occupiedLarge++;
                    parked = true;
                }
                break;
            case M:
                if (occupiedMedium < mediumSlots) {
                    occupiedMedium++;
                    parked = true;
                } else if (occupiedLarge < largeSlots) {
                    occupiedLarge++;
                    parked = true;
                }
                break;
            case L:
                if (occupiedLarge < largeSlots) {
                    occupiedLarge++;
                    parked = true;
                }
                break;
        }

        if (parked) {
            System.out.println(Thread.currentThread().getName() + " parked " + vehicle.getVehicleNumber() +
                    " (" + vehicle.getSize() + "). Available slots: S-" + (smallSlots - occupiedSmall) +
                    ", M-" + (mediumSlots - occupiedMedium) + ", L-" + (largeSlots - occupiedLarge));
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " waiting for parking...");
            return false;
        }
    }

    @Override
    public synchronized void leaveVehicle(Vehicle vehicle) {
        switch (vehicle.getSize()) {
            case S:
                if (occupiedSmall > 0) occupiedSmall--;
                else if (occupiedMedium > 0) occupiedMedium--;
                else if (occupiedLarge > 0) occupiedLarge--;
                break;
            case M:
                if (occupiedMedium > 0) occupiedMedium--;
                else if (occupiedLarge > 0) occupiedLarge--;
                break;
            case L:
                if (occupiedLarge > 0) occupiedLarge--;
                break;
        }
        System.out.println(Thread.currentThread().getName() + " vehicle " + vehicle.getVehicleNumber() +
                " left. Available slots: S-" + (smallSlots - occupiedSmall) +
                ", M-" + (mediumSlots - occupiedMedium) +
                ", L-" + (largeSlots - occupiedLarge));
    }
}
package org.ag.practice.interfaces;

import org.ag.practice.model.Vehicle;

interface IParkingLot {
    boolean parkVehicle(Vehicle vehicle);
    void leaveVehicle(Vehicle vehicle);
}
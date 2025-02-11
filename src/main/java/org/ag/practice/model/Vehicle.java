package org.ag.practice.model;

public class Vehicle {
    private String vehicleNumber;
    private VehicleSize size;

    public Vehicle(String vehicleNumber, VehicleSize size) {
        this.vehicleNumber = vehicleNumber;
        this.size = size;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleSize getSize() {
        return size;
    }
}
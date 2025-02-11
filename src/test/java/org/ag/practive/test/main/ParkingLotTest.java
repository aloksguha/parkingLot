package org.ag.practive.test.main;

import org.ag.practice.implementation.ParkingLot;
import org.ag.practice.model.Vehicle;
import org.ag.practice.model.VehicleSize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {
    private ParkingLot parkingLot;

    @BeforeEach
    void setUp() {
        parkingLot = new ParkingLot(1, 1, 1); // One slot each for S, M, L
    }

    @Test
    void testParkVehicle_Success() {
        Vehicle car = new Vehicle("MH14EY1000", VehicleSize.M);
        assertTrue(parkingLot.parkVehicle(car), "Vehicle should be parked successfully.");

    }

    @Test
    void testParkVehicle_WhenFull() {
        Vehicle car1 = new Vehicle("MH14EY1001", VehicleSize.L);
        Vehicle car2 = new Vehicle("MH14EY1002", VehicleSize.L);

        assertTrue(parkingLot.parkVehicle(car1), "First vehicle should be parked.");
        assertFalse(parkingLot.parkVehicle(car2), "Second vehicle should not be parked (no available slot).");
    }

    @Test
    void testParkVehicle_FallbackParking() {
        Vehicle smallCar1 = new Vehicle("MH14EY1003", VehicleSize.S);
        Vehicle smallCar2 = new Vehicle("MH14EY1004", VehicleSize.S);

        assertTrue(parkingLot.parkVehicle(smallCar1), "First small vehicle should be parked.");
        assertTrue(parkingLot.parkVehicle(smallCar2), "Second small vehicle should be parked in M slot.");
    }

    @Test
    void testLeaveVehicle() {
        Vehicle car = new Vehicle("MH14EY1000", VehicleSize.M);
        parkingLot.parkVehicle(car);
        parkingLot.leaveVehicle(car);
       // assertEquals(0, parkingLot.getOccupiedSlots(), "Vehicle should have left the parking lot.");
    }
}


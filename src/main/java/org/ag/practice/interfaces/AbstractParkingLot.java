package org.ag.practice.interfaces;

public abstract class AbstractParkingLot implements IParkingLot {
    protected int smallSlots, mediumSlots, largeSlots;
    protected int occupiedSmall, occupiedMedium, occupiedLarge;

    public AbstractParkingLot(int smallSlots, int mediumSlots, int largeSlots) {
        this.smallSlots = smallSlots;
        this.mediumSlots = mediumSlots;
        this.largeSlots = largeSlots;
        this.occupiedSmall = 0;
        this.occupiedMedium = 0;
        this.occupiedLarge = 0;
    }
}
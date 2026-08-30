package Parking;

import Vehicle.Vehicle;

public interface ParkingStrategy {
    ParkingSpot findSpot(Vehicle vehicle);
}

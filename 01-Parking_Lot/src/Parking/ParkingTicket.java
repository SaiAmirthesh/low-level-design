package Parking;

import Vehicle.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingTicket {
    private Vehicle vehicle;
    private int parkingLotId;
    private int parkingSpotId;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private Duration duration;
    private double parkingFee;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public double getParkingFee() {
        return parkingFee;
    }

    void markCheckIn(Vehicle vehicle, int parkingLotId, int parkingSpotId) {
        this.vehicle = vehicle;
        this.parkingLotId = parkingLotId;
        this.parkingSpotId = parkingSpotId;
        this.checkInTime = LocalDateTime.now();
    }

    void markCheckOut() {
        this.checkOutTime = LocalDateTime.now();
        this.duration = Duration.between(checkInTime, checkOutTime);
        this.parkingFee = vehicle.getPricingStrategy().calculatePrice(vehicle, duration);
    }
}

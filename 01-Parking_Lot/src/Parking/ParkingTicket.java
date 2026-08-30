package Parking;

import Vehicle.Vehicle;
import Parking.ParkingLot;
import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingTicket {
    Vehicle vehicle;
    int parkingSpotId;
    LocalDateTime checkInTime;
    LocalDateTime checkOutTime;
    Duration time;
    double parkingFee;

    public void calculateDuration(){
        this.time = Duration.between(checkInTime,checkOutTime);
    }

    public double calculateParkingFee() {
        if (vehicle == null || time == null) {
            throw new IllegalStateException("Vehicle and duration must be available before calculating fee");
        }
        this.parkingFee = vehicle.getPricingStrategy().calculatePrice(vehicle, time);
        return parkingFee;
    }

    public void checkIn(Vehicle vehicle){
        this.vehicle = vehicle;
        this.checkInTime = LocalDateTime.now();
        this.parkingSpotId = ParkingLot.checkIn(this.vehicle);
        System.out.println(vehicle+" Parked in "+ this.parkingSpotId);
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void checkOut(int parkingSpotId){
        ParkingLot.checkOut(parkingSpotId);
        this.checkOutTime = LocalDateTime.now();
        calculateDuration();
        calculateParkingFee();
        System.out.println("Parking fee: " + this.parkingFee);
        System.out.println(this.vehicle+" Checked Out");
    }

}

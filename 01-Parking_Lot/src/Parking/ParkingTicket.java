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

    public void calculateDuration(){
        this.time = Duration.between(checkInTime,checkOutTime);
    }

    public void checkIn(Vehicle vehicle){
        this.vehicle = vehicle;
        this.checkInTime = LocalDateTime.now();
        this.parkingSpotId = ParkingLot.checkIn(this.vehicle);
        System.out.println("Car Parked in "+ this.parkingSpotId);
    }

    public void checkOut(int parkingSpotId){
        ParkingLot.checkOut(parkingSpotId);
        this.checkOutTime = LocalDateTime.now();
        System.out.println("Car Checked Out");
    }

}

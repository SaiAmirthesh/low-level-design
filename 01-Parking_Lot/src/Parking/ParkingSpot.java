package Parking;

import Vehicle.Vehicle;

public class ParkingSpot {
    int parkingSpotId;
    boolean occupied;
    Vehicle vehicle;

    ParkingSpot(int id){
        this.parkingSpotId = id;
        this.occupied = false;
        this.vehicle = null;
    }

    public int getParkingSpotId(){
        return parkingSpotId;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void assignParking(Vehicle vehicle){
        setVehicle(vehicle);
        setOccupied(true);
    }

    public void removeParking(){
        setVehicle(null);
        setOccupied(false);
    }

}

package Parking;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class ParkingLot {
    private final int parkingLotId;
    ArrayList<ParkingSpot> spots;

    public ParkingLot(int parkingLotId, int capacity){
        this.parkingLotId = parkingLotId;
        spots = new ArrayList<>(capacity);
        for (int i = 1; i <= capacity; i++) {
            spots.add(new ParkingSpot(i));
        }
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public ParkingSpot findspot(){
        ParkingSpot found = null;
        for(ParkingSpot parking : spots) {
            if (!parking.occupied) {
                found = parking;
                break;
            }
        }
        if(found==null){
            throw new IllegalStateException("No parking spot found");
        }
        return found;
    }

    public int checkIn(Vehicle vehicle){
        ParkingSpot toPark = findspot();
        toPark.assignParking(vehicle);
        System.out.println("Vehicle has been parked in "+toPark.parkingSpotId);
        return toPark.getParkingSpotId();
    }

    public void checkOut(int parkingSpotId){
        ParkingSpot park = spots.get(parkingSpotId-1);
        park.removeParking();
        System.out.println("Parking spot "+ parkingSpotId +" cleared");
    }

}

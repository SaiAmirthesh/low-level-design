package Parking;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class ParkingLot {
    //lets first take the capacity to be 10
    static ArrayList<ParkingSpot> spots = new ArrayList<>(10);

    static {
        for (int i = 1; i <= 10; i++) {
            spots.add(new ParkingSpot(i));
        }
    }

    public static ParkingSpot findspot(){
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

    public static int checkIn(Vehicle vehicle){
        ParkingSpot toPark = findspot();
        toPark.assignParking(vehicle);
        System.out.println("Vehicle has been parked in "+toPark.parkingSpotId);
        return toPark.getParkingSpotId();
    }

    public static void checkOut(int parkingSpotId){
        ParkingSpot park = spots.get(parkingSpotId-1);
        park.removeParking();
        System.out.println("Parking spot "+ parkingSpotId +" cleared");
    }

}

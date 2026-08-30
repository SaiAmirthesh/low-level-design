import Parking.ParkingLot;
import Parking.ParkingService;
import Parking.ParkingTicket;
import Vehicle.Vehicle;
import Vehicle.VehicleFactory;
import Vehicle.VehicleType;

import java.util.List;

class Main{
    public static void main(String[] args){

        ParkingLot lot1 = new ParkingLot(1, 10);
        ParkingLot lot2 = new ParkingLot(2, 20);
        ParkingService parkingService = new ParkingService(List.of(lot1, lot2));

        Vehicle vehicle = VehicleFactory.createVehicle(VehicleType.CAR);
        ParkingTicket ticket = parkingService.parkVehicle(vehicle);
        parkingService.unparkVehicle(ticket);

        Vehicle vehicle1 = VehicleFactory.createVehicle(VehicleType.BUS);
        ParkingTicket ticket1 = parkingService.parkVehicle(vehicle1);
        parkingService.unparkVehicle(ticket1);

        Vehicle vehicle2 = VehicleFactory.createVehicle(VehicleType.BIKE);
        ParkingTicket ticket2 = parkingService.parkVehicle(vehicle2);

        Vehicle vehicle3 = VehicleFactory.createVehicle(VehicleType.TRUCK);
        ParkingTicket ticket3 = parkingService.parkVehicle(vehicle3);

        parkingService.unparkVehicle(ticket2);
        parkingService.unparkVehicle(ticket3);

    }
}

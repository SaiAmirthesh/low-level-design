import Parking.ParkingTicket;
import Vehicle.Vehicle;
import Vehicle.VehicleFactory;
import Vehicle.VehicleType;

class Main{
    public static void main(String[] args){
        Vehicle vehicle = VehicleFactory.createVehicle(VehicleType.CAR);
        ParkingTicket ticket = new ParkingTicket();
        ticket.checkIn(vehicle);
        ticket.checkOut(ticket.getParkingSpotId());

        Vehicle vehicle1 = VehicleFactory.createVehicle(VehicleType.BUS);
        ParkingTicket ticket1 = new ParkingTicket();
        ticket1.checkIn(vehicle1);
        ticket1.checkOut(ticket1.getParkingSpotId());

        Vehicle vehicle2 = VehicleFactory.createVehicle(VehicleType.BIKE);
        ParkingTicket ticket2 = new ParkingTicket();
        ticket2.checkIn(vehicle2);

        Vehicle vehicle3 = VehicleFactory.createVehicle(VehicleType.TRUCK);
        ParkingTicket ticket3 = new ParkingTicket();
        ticket3.checkIn(vehicle3);

        ticket2.checkOut(ticket2.getParkingSpotId());
        ticket3.checkOut(ticket3.getParkingSpotId());

    }
}

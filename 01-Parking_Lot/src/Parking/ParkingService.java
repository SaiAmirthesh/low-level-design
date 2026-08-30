package Parking;

import Vehicle.Vehicle;

import java.util.List;

public class ParkingService {
    private final List<ParkingLot> parkingLots;

    public ParkingService(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {
        ParkingLot lot = findAvailableLot();
        int parkingSpotId = lot.checkIn(vehicle);

        ParkingTicket ticket = new ParkingTicket();
        ticket.markCheckIn(vehicle, lot.getParkingLotId(), parkingSpotId);
        return ticket;
    }

    public double unparkVehicle(ParkingTicket ticket) {
        ParkingLot lot = findLot(ticket.getParkingLotId());
        lot.checkOut(ticket.getParkingSpotId());
        ticket.markCheckOut();
        return ticket.getParkingFee();
    }

    private ParkingLot findAvailableLot() {
        for (ParkingLot lot : parkingLots) {
            try {
                lot.findspot();
                return lot;
            } catch (IllegalStateException ignored) {
                // try next lot
            }
        }
        throw new IllegalStateException("No parking spot available in any parking lot");
    }

    private ParkingLot findLot(int parkingLotId) {
        for (ParkingLot lot : parkingLots) {
            if (lot.getParkingLotId() == parkingLotId) {
                return lot;
            }
        }
        throw new IllegalArgumentException("Unknown parking lot id: " + parkingLotId);
    }
}

package Vehicle;

public final class VehicleFactory {
    private VehicleFactory() {
    }

    public static Vehicle createVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case BIKE:
                return new Bike();
            case CAR:
                return new Car();
            case BUS:
                return new Bus();
            case TRUCK:
                return new Truck();
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }
    }
}

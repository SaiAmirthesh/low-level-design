package Pricing;

import Vehicle.Vehicle;

import java.time.Duration;

public interface PricingStrategy {
    double calculatePrice(Vehicle vehicle, Duration duration);

    default double caluculatePrice(Vehicle vehicle, Duration duration) {
        return calculatePrice(vehicle, duration);
    }
}

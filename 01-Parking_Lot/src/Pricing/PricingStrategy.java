package Pricing;

import Vehicle.Vehicle;

import java.time.Duration;

public interface PricingStrategy {
    double caluculatePrice(Vehicle vehicle, Duration duration);
}

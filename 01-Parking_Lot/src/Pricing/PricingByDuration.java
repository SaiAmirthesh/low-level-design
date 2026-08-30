package Pricing;

import Vehicle.Vehicle;

import java.time.Duration;

public class PricingByDuration implements PricingStrategy{
    @Override
    public double caluculatePrice(Vehicle vehicle, Duration duration) {
        return 0;
    }
}

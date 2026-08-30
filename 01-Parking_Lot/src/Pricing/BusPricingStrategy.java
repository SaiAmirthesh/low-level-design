package Pricing;

import Vehicle.Vehicle;

import java.time.Duration;

public class BusPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Vehicle vehicle, Duration duration) {
        long hours = Math.max(1, (duration.toMinutes() + 59) / 60);
        return hours * 50;
    }
}

package Vehicle;

import Pricing.BusPricingStrategy;
import Pricing.PricingStrategy;

public class Bus implements Vehicle {
    private static final PricingStrategy PRICING_STRATEGY = new BusPricingStrategy();

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.BUS;
    }

    @Override
    public PricingStrategy getPricingStrategy() {
        return PRICING_STRATEGY;
    }
}

package Vehicle;

import Pricing.BikePricingStrategy;
import Pricing.PricingStrategy;

public class Bike implements Vehicle {
    private static final PricingStrategy PRICING_STRATEGY = new BikePricingStrategy();

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.BIKE;
    }

    @Override
    public PricingStrategy getPricingStrategy() {
        return PRICING_STRATEGY;
    }
}

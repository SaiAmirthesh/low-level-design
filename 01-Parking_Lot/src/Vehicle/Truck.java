package Vehicle;

import Pricing.PricingStrategy;
import Pricing.TruckPricingStrategy;

public class Truck implements Vehicle {
    private static final PricingStrategy PRICING_STRATEGY = new TruckPricingStrategy();

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.TRUCK;
    }

    @Override
    public PricingStrategy getPricingStrategy() {
        return PRICING_STRATEGY;
    }
}

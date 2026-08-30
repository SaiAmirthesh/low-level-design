package Vehicle;

import Pricing.PricingStrategy;
import Pricing.CarPricingStrategy;

public class Car implements Vehicle {
    private static final PricingStrategy PRICING_STRATEGY = new CarPricingStrategy();

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.CAR;
    }

    @Override
    public PricingStrategy getPricingStrategy() {
        return PRICING_STRATEGY;
    }
}

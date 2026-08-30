package Vehicle;

import Pricing.PricingStrategy;

public interface Vehicle {
    VehicleType getVehicleType();

    PricingStrategy getPricingStrategy();
}

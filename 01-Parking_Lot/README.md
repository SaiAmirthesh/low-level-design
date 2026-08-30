# Parking Lot

## Requirements:

1. Support different vehicle types:
   Car, Bike, Bus, Truck, Lorry

2. Parking lot contains multiple parking spots.

3. Each parking spot can hold a vehicle.

4. When a vehicle enters:
    - Find an appropriate vacant spot.
    - Assign the spot.
    - Generate a parking ticket.

5. When a vehicle exits:
    - Calculate parking fee.
    - Process payment.
    - Free the parking spot.

6. Parking fee depends on vehicle type / duration.

7. Users should be able to check parking availability.


## Actors

1) User
2) Operator
3) Admin

## Use Case

### User

```
Park vehicle
Remove vehicle
Pay
```

### Operator

```
Assign spot
Generate ticket
Process exit
```

### Admin

```
Configure parking lot
Configure rates
Add/remove parking spots
```


## Entities

1) Interface Vehicle and Vehicle Factory
    1) Car
    2) Bus
    3) truck
    4) Bike
2) Parking spot
    1) id
    2) bool occupied
    3) setParkingSpot()
    4) removeParkingSpot()
3) Parking Ticket
    1) Parking Lot id
    2) time
    3) Calculate duration
4) Parking lot
    1) id
    2) Array of Parking spot
    3) findAvailable()
5) Pricing Staratgy
    1) Car Pricing
    2) Bike Pricing
    3) Truck pricing

## Design Patterns used

1) Factor Pattern - Vehicle
2) Strategy - Pricing (Vehicle Based)



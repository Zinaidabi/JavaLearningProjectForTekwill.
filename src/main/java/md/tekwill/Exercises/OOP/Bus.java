package md.tekwill.Exercises.OOP;

class Bus extends Vehicle {

    private int passengerCapacity;  // Buses have an additional property

    public Bus(String licensePlate, double motorCapacity, int yearOfProduction, int passengerCapacity) {
        super(licensePlate, motorCapacity, yearOfProduction);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateTheLegalizationCosts() {
        // Example cost calculation
        double baseCost = 1000;  // Base cost in MDL for buses
        double motorCapacityCost = motorCapacity * 300;  // Higher cost based on motor capacity for buses
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - yearOfProduction;
        double ageCost = (age > 10) ? 500 : 200;  // Higher additional fee if bus is older than 10 years
        double capacityCost = passengerCapacity * 10;  // Additional cost based on passenger capacity

        return baseCost + motorCapacityCost + ageCost + capacityCost;
    }
}


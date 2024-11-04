package md.tekwill.Exercises.OOP;

class Car extends Vehicle {

    public Car(String licensePlate, double motorCapacity, int yearOfProduction) {
        super(licensePlate, motorCapacity, yearOfProduction);
    }

    @Override
    public double calculateTheLegalizationCosts() {
        // Example cost calculation
        double baseCost = 500;  // Base cost in MDL
        double motorCapacityCost = motorCapacity * 200;  // Cost based on motor capacity
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - yearOfProduction;
        double ageCost = (age > 10) ? 300 : 100;  // Additional fee if car is older than 10 years

        return baseCost + motorCapacityCost + ageCost;
    }
}


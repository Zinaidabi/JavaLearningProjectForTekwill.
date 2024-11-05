package md.tekwill.Exercises.OOP;

abstract class Vehicle {
    protected String licensePlate;
    protected double motorCapacity;  // in liters (e.g., 2.0L)
    protected int yearOfProduction;

    // Constructor
    public Vehicle(String licensePlate, double motorCapacity, int yearOfProduction) {
        this.licensePlate = licensePlate;
        this.motorCapacity = motorCapacity;
        this.yearOfProduction = yearOfProduction;
    }

    // Abstract method to calculate legalization costs, which will be overridden in subclasses
    public abstract double calculateTheLegalizationCosts();

    // Additional properties can be added if needed, such as type of fuel, number of seats, etc.
}


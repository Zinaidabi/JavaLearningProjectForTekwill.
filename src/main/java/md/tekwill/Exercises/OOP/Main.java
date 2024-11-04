package md.tekwill.Exercises.OOP;

public class Main {
    public static void main(String[] args) {
        // Creating a Car instance
        Car car1 = new Car("MD-1234", 1.8, 2015);
        System.out.printf("Legalization cost for car1: %.2f MDL%n", car1.calculateTheLegalizationCosts());

        // Creating a Bus instance
        Bus bus1 = new Bus("MD-5678", 3.5, 2008, 50);
        System.out.printf("Legalization cost for bus1: %.2f MDL%n", bus1.calculateTheLegalizationCosts());
    }
}


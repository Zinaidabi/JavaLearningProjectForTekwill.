package md.tekwill.Exercises;

public class CreditCalculator {

    public static double calculateTotalAmount(int requestedAmount, int months) {
        // Determine the annual interest rate based on the requested amount
        double annualInterestRate = (requestedAmount < 10000) ? 0.05 : 0.04;

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;

        // Calculate total amount using compound interest formula
        double totalAmount = requestedAmount * Math.pow(1 + monthlyInterestRate, months);

        return totalAmount;
    }

    public static void main(String[] args) {
        int requestedAmount = 12000; // Requested loan amount in MDL
        int months = 12;             // Loan term in months

        double totalAmountToRepay = calculateTotalAmount(requestedAmount, months);
        System.out.printf("Total amount to be repaid: %.2f MDL%n", totalAmountToRepay);
    }
}


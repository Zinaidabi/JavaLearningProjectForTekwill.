package md.tekwill.Exercises;

public class PrimeSumCalculator {

    public static void main(String[] args) {
        int n = 10;
        int m = 30;
        int sum = calculateSumOfPrimes(n, m);
        System.out.println("Sum of primes between " + n + " and " + m + " is: " + sum);
    }

    public static int calculateSumOfPrimes(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true; // 2 is the only even prime number
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

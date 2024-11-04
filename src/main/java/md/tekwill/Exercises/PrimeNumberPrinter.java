package md.tekwill.Exercises;

public class PrimeNumberPrinter {

    public static void main(String[] args) {
        int N = 50; // You can set N to any desired value
        printPrimesUpTo(N);
    }

    public static void printPrimesUpTo(int N) {
        System.out.println("Prime numbers from 0 to " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

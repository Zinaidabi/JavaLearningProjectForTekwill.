package md.tekwill.Exercises;

public class FactorialCalculator {
    public static void main(String[] args) {
        int N = 5; // You can set N to any positive integer
        long result = factorial(N);
        System.out.println(N + "! = " + result);
    }

    public static long factorial(int N) {
        if (N <= 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        }
        return N * factorial(N - 1); // Recursive case: N! = N * (N-1)!
    }
}

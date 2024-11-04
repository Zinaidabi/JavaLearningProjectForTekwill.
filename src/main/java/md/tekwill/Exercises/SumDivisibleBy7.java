package md.tekwill.Exercises;

public class SumDivisibleBy7 {
    public static int sumDivisibleBy7(int n, int m) {
        // Ensure n is the smaller number
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        // Find the first number divisible by 7 that is >= n
        int start = (n % 7 == 0) ? n : n + (7 - n % 7);

        // Find the last number divisible by 7 that is <= m
        int end = (m % 7 == 0) ? m : m - (m % 7);

        // Calculate the sum of the arithmetic sequence of numbers divisible by 7
        if (start > end) {
            return 0;
        }

        int count = (end - start) / 7 + 1;
        int totalSum = count * (start + end) / 2;

        return totalSum;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 50;
        System.out.println("Sum of numbers divisible by 7 between " + n + " and " + m + " is: " + sumDivisibleBy7(n, m));
    }
}


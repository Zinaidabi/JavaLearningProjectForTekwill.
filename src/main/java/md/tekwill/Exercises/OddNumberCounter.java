package md.tekwill.Exercises;

import java.util.ArrayList;
import java.util.List;

public class OddNumberCounter {

    public static void main(String[] args) {
        int n = 10;
        int m = 30;
        List<Integer> oddNumbers = getOddNumbers(n, m);

        System.out.println("Number of odd numbers between " + n + " and " + m + " is: " + oddNumbers.size());
        System.out.println("Odd numbers between " + n + " and " + m + " are: " + oddNumbers);
    }

    public static List<Integer> getOddNumbers(int n, int m) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) {  // Check if the number is odd
                oddNumbers.add(i);
            }
        }

        return oddNumbers;
    }
}

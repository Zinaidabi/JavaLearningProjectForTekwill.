package md.tekwill.Exercises;

public class MaxNumberFinder {

    public static void main(String[] args) {
        int[] numbers = {3, 6, 1, 75, 34, 21, 43};
        int max = findMax(numbers);
        System.out.println("The maximum number in the array is: " + max);
    }

    public static int findMax(int[] array) {
        int max = array[0]; // Assume the first element is the maximum initially

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}

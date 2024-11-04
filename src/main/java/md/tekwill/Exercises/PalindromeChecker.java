package md.tekwill.Exercises;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ABBA")); // true
        System.out.println(isPalindrome("ANA"));  // true
        System.out.println(isPalindrome("IOI"));  // true
        System.out.println(isPalindrome("Hello")); // false
    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

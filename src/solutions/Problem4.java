package solutions;

/**
 * @author Mushif Ali Nawaz
 * Date    February 21, 2019
 * <p>
 * Problem 4: Largest palindrome product
 */
public class Problem4 {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                if (i * j < largestPalindrome) {
                    break; // since it won't be greater after that
                } else if (isPalindrome(i * j)) {
                    largestPalindrome = i * j;
                }
            }
        }

        System.out.println(largestPalindrome);
    }

    private static boolean isPalindrome(int number) {
        int temp = number;
        int reversed = 0;

        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        return reversed == number;
    }
}

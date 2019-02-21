package solutions;

/**
 * @author Mushif Ali Nawaz
 * Date    February 21, 2019
 * <p>
 * Problem 5: Smallest multiple
 */
public class Problem5 {
    public static void main(String[] args) {
        int number = 20;
        while (!isSmallestMultiple(number))
            number += 20;

        System.out.println(number);
    }

    private static boolean isSmallestMultiple(int number) {
        for (int i = 20; i > 1; i--) {
            if (number % i != 0)
                return false;
        }

        return true;
    }
}

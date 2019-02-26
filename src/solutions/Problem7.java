package solutions;

/**
 * @author Mushif Ali Nawaz
 * Date    February 26, 2019
 * <p>
 * Problem 7: 10001st Prime
 */
public class Problem7 {
    public static void main(String[] args) {
        int counter = 1;
        long i = 1;

        while (counter < 10001) {
            i += 2;
            if (isPrime(i)) {
                counter++;
            }
        }

        System.out.println(i);
    }

    private static boolean isPrime(long number) {
        if (number == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(number); i = i == 2 ? i + 1 : i + 2) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}

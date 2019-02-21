package solutions;

/**
 * @author Mushif Ali Nawaz
 * Date    February 20, 2019
 * <p>
 * Problem 3: Largest prime factor
 */
public class Problem3 {
    public static void main(String[] args) {
        long n = 600851475143L;
        long primeFactor = 2;
        long largestPrimeFactor = 0;

        while (n > 1) {
            while (n % primeFactor == 0) {
                n /= primeFactor;
                largestPrimeFactor = primeFactor;
            }

            primeFactor += primeFactor == 2 ? 1 : 2;

            if (primeFactor * primeFactor > n) {
                if (n > 1)
                    largestPrimeFactor = n;
                break;
            }
        }

        System.out.println(largestPrimeFactor);
    }
}

package solutions;

/**
 * @author Mushif Ali Nawaz
 * Date    February 26, 2019
 * <p>
 * Problem 6: Sum square difference
 */
public class Problem6 {
    public static void main(String[] args) {
        int limit = 100;

        int sum = limit * (limit + 1) / 2; // n(n + 1)/2

        int squaredSum = (2 * limit + 1) * (limit + 1) * limit / 6; // (2n + 1)(n + 1)n/6

        System.out.println(sum * sum - squaredSum);
    }
}

package solutions;

/**
 * @author Mushif Ali Nawaz
 * Date    February 26, 2019
 * <p>
 * Problem 9: Special Pythagorean Triplet
 */
public class Problem9 {
    public static void main(String[] args) {
        final int sum = 1000;

        int a;
        for (a = 1; a <= sum / 3; a++) {
            int b;
            for (b = a + 1; b <= sum / 2; b++) {
                int c = sum - a - b;
                if (a * a + b * b == c * c) {
                    // There is only one Special Pythagorean Triplet for which a + b + c = 1000
                    System.out.println(a * b * c);
                }
            }
        }
    }
}

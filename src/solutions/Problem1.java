package solutions;

import java.util.stream.IntStream;

/**
 * @author Mushif Ali Nawaz
 * Date    February 20, 2019
 * <p>
 * Problem 1: Multiples of 3 and 5
 */
public class Problem1 {
    public static void main(String[] args) {
        int result = IntStream.range(3, 1000).parallel().filter(i -> i % 3 == 0 || i % 5 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println(result);
    }
}

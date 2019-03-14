package solutions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.LongStream;

/**
 * @author Mushif Ali Nawaz
 * Date    March 14, 2019
 * <p>
 * Problem 10: Summation of primes
 */
public class Problem10 {
    public static void main(String[] args) {
        final int range = 20000000;

        AtomicLong sum = new AtomicLong(2); // initialized with only even prime number (2)
        LongStream.range(3, range).parallel()
                .filter(x -> x % 2 != 0)
                .filter(x -> {
                     for (int i = 3; i <= Math.sqrt(x); i += 2) {
                        if (x % i == 0)
                            return false;
                    }
                    return true;
                })
                .forEach(sum::addAndGet);

        System.out.println(sum);
    }
}

package solutions;

/**
 * @author Mushif Ali Nawaz
 * Date    February 20, 2019
 * <p>
 * Problem 2: Even Fibonacci numbers
 */
public class Problem2 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        int b = 1;
        int fib = a + b;

        while (fib < 4000000) { // calculate only the 3rd value (i.e. even) in the sequence
            sum += fib;
            a = b + fib;
            b = fib + a;
            fib = a + b;
        }

        System.out.println(sum);
    }
}

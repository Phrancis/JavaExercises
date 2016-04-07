package chapter05;
import java.util.Random;
/**
 * Generates an array containing `n` pseudo-random integers.
 */
public class RandomIntArray {
    static int[] generate(int numOfInts) {
        return new Random().ints().limit(numOfInts).toArray();
    }
}

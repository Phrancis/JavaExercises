package Chapter5;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Generates an array containing `n` pseudo-random integers.
 */
public class RandomIntArray {
    static int[] generate(int numOfInts) {
        int[] randomIntArray = new int[numOfInts];
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = ThreadLocalRandom.current().nextInt();
        }
        return randomIntArray;
    }
}

package Chapter5;
import java.util.Random;
/**
 * Create an array of given length which is comprised of inner arrays of random integers.
 */
public class Random2dIntArray {
    int numberOfInnerArrays;
    private int[][] random2dIntArray;
    private Random random = new Random();

    /**
     *
     * @param numberOfInnerArrays The number of inner arrays which will be seeded with random integers,
     *                            as well as the length of the longest inner array of random integers.
     */
    public Random2dIntArray(int numberOfInnerArrays) {
        this.numberOfInnerArrays = numberOfInnerArrays;
        this.random2dIntArray = new int[numberOfInnerArrays][];
        generate();
    }

    /**
     * Creates the Random2dIntArray.
     * @return random2dIntArray A shuffled array of arrays of random integers.
     */
    private int[][] generate()  {
        createInnerArrays(random2dIntArray);
        shuffle(random2dIntArray);
        addRandomInts(random2dIntArray);
        return random2dIntArray;
    }

    /**
     * Creates each inner array with a length based on the input parameter numberOfInnerArrays,
     *   which will also be the length of the longest inner array within the outer array.
     * @param randomIrregularArray The outer array based on which the inner arrays will be created.
     */
    private void createInnerArrays(int[][] randomIrregularArray) {
        for (int i = randomIrregularArray.length, j = 0; i > 0; i--, j++) {
            randomIrregularArray[j] = new int[i];
        }
    }

    /**
     * Shuffles the indexes of the array to change their order. Fisher–Yates shuffle array function
     * inspired by: http://stackoverflow.com/a/18456998/3626537
     * @param sorted2dIntArray The array to be shuffled.
     */
    private void shuffle(int[][] sorted2dIntArray) {
        int randomIndex;
        int[] temp;
        for (int index = sorted2dIntArray.length - 1; index > 0; index--) {
            randomIndex = random.nextInt(index + 1);
            // Swap index values:
            temp = sorted2dIntArray[randomIndex];
            sorted2dIntArray[randomIndex] = sorted2dIntArray[index];
            sorted2dIntArray[index] = temp;
        }
    }
    /**
     * Seeds the inner arrays with random integers.
     * @param randomIrregularArray Iterates over the inner arrays and seeds random integers as values for each index.
     */
    private void addRandomInts(int[][] randomIrregularArray) {
        for (int i = 0; i < randomIrregularArray.length; i++) {
            for (int j = 0; j < randomIrregularArray[i].length; j++) {
                randomIrregularArray[i][j] = random.nextInt();
            }
        }
    }

    public String toString() {
        String arrayAsString = "";
        for (int outerIdx = 0; outerIdx < random2dIntArray.length; outerIdx++) {
            arrayAsString = arrayAsString.concat(String.format("outer[%d]: ", outerIdx));
            for (int innerIdx = 0; innerIdx < random2dIntArray[outerIdx].length; innerIdx++) {
                arrayAsString = arrayAsString.concat(String.format("inner[%d]: %d ",
                        innerIdx, random2dIntArray[outerIdx][innerIdx]));
            }
            arrayAsString = arrayAsString.concat(System.lineSeparator());
        }
        return arrayAsString;
    }

}

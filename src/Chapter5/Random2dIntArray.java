package Chapter5;
import java.util.Random;
/**
 * An irregular array is a 2+ dimensional array where the inner arrays are not allocated the same number of elements.
 */
public class Random2dIntArray {
    public int numberOfInnerArrays;
    private int[][] random2dIntArray;
    private Random random = new Random();

    public Random2dIntArray(int numberOfInnerArrays) {
        this.numberOfInnerArrays = numberOfInnerArrays;
        this.random2dIntArray = new int[numberOfInnerArrays][];
        generateArray();
    }

    private int[][] generateArray()  {
        createInnerArrays(random2dIntArray);
        addRandomInts(random2dIntArray);
        return random2dIntArray;
    }

    private void createInnerArrays(int[][] randomIrregularArray) {
        for (int i = randomIrregularArray.length, j = 0; i > 0; i--, j++) {
            randomIrregularArray[j] = new int[i];
        }
    }

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
                arrayAsString = arrayAsString.concat(String.format("[%d]: %d ",
                        innerIdx, random2dIntArray[outerIdx][innerIdx]));
            }
            arrayAsString = arrayAsString.concat(System.lineSeparator());
        }
        return arrayAsString;
    }




    public static void main(String[] args) {
        System.out.println("Random2dIntArray");
        Random2dIntArray jaggedArray = new Random2dIntArray(5);
        System.out.print(jaggedArray.toString());
    }
}

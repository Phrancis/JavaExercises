package Chapter5;
import java.util.Arrays;

public class ArrayDemo {
    static void squaresArray(int max) {
        System.out.format("squaresArray(%d)%n", max);
        //Add 1 because array is zero-indexed:
        max++;
        int[] squaresArray = new int[max];
        //Populate array:
        for (int i = 0; i < max; i++) {
            squaresArray[i] = i * i;
        }
        //Print value at each index:
        for (int i = 0; i < squaresArray.length; i++) {
            System.out.format("squaresArray[%d] : %d%n", i, squaresArray[i]);
        }
    }
    static void minAndMaxInArray(int nums) {
        System.out.format("minAndMaxInArray(%d)%n", nums);
        int[] randomInts = RandomIntArray.generate(nums);
        //Find min and max nums:
        int min = 0, max = 0;
        for (int i = 0; i < nums; i++) {
            System.out.format("randomInts[%d] : %d%n", i, randomInts[i]);
            if (randomInts[i] < min) { min = randomInts[i]; }
            if (randomInts[i] > max) { max = randomInts[i]; }
        }
        System.out.format("Min: %d%nMax: %d%n", min, max);
    }
    static void arrayWithInitializer() {
        System.out.println("arrayWithInitializer()");
        //Initializer automatically sets the correct array length, e.g. 6:
        String[] words = {"hello", "world", "how",
                "are", "you", "today?"};
        for (String word : words) {
            System.out.format("%s ", word);
        }
    }

    public static void main(String[] args) {
        System.out.println("**ArrayDemo**");
        squaresArray(13);
        minAndMaxInArray(10);
        arrayWithInitializer();
    }
}

package Chapter5;
import java.util.Arrays;

/**
 * Demo of using length to help copy an array.
 */
public class ArrayCopy {
    //Same method name is used with different signatures to allow different kinds of arrays to be copied

    private static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
    private static String[] copyArray(String[] original) {
        String[] copy = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        System.out.println("ArrayCopy()");
        int[] intArr1 = {1,2,0,3,4};
        int[] intArr2 = copyArray(intArr1);
        System.out.println("Original: " + Arrays.toString(intArr1));
        System.out.println("Copy: " + Arrays.toString(intArr2));
        String[] stArr1 = {"My", "name", "is", "Slim", "Shady", "wot"};
        String[] stArr2 = copyArray(stArr1);
        System.out.println("Original: " + Arrays.toString(stArr1));
        System.out.println("Copy: " + Arrays.toString(stArr2));
    }
}

package chapter05;

/**
 * Like any other data type, Strings can be assembled into arrays.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] strs = {"One", "Two", "Three", "Four"};

        // foreach iteration
        System.out.println("Original array:");
        for(String s : strs) {
            System.out.print(s +" ");
        }
        System.out.println();

        // change values
        strs[0] = "Un";
        strs[1] = "Deux";
        strs[2] = "Trois";
        strs[3] = "Quatre";

        System.out.println("Modified array:");
        for(String s : strs) {
            System.out.print(s +" ");
        }
        System.out.println();
    }
}

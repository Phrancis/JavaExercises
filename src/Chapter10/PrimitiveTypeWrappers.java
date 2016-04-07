package chapter10;
import java.io.*;
/**
 * This class demonstrates Java's type wrappers to convert numeric strings.
 * Java's type wrappers are classes that encapsulate, or "wrap", the primitive types. Type wrappers are needed
 * because primitive types are not objects. This limits their use to some extent. For example, a primitive type
 * cannot be passed by reference.
 * Java provides classes that correspond to each of the primitive types:
 * - Double, Float
 * - Long, Integer, Short
 * - Byte
 * - Character
 * - Boolean
 */
public class PrimitiveTypeWrappers {
    /**
     * Averages numbers entered on System.in
     */
    public static void averageNumbers() throws IOException {
        String str;
        int n = 0;
        double sum = 0;
        double average = 0;
        double thisVal = 0;
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many numbers will you enter?");
        try {
            System.out.print("=> ");
            str = consoleReader.readLine();
            // Convert String to Integer:
            n = Integer.parseInt(str);
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid format");
            n = 0;
        }
        System.out.printf("Enter %d values:%n", n);
        for(int i = 1; i <= n; i++) {
            System.out.printf("Val %d => ", i);
            try {
                str = consoleReader.readLine();
                // Convert String to Double
                thisVal = Double.parseDouble(str);
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid format");
                n = 0;
            }
            sum += thisVal;
        }
        average = sum / n;
        System.out.printf("Average is %f", average);
    }
    // DEMO
    public static void main(String[] args) {
        try {
            PrimitiveTypeWrappers.averageNumbers();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}

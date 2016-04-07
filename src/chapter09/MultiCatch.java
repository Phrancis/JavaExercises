package chapter09;

/**
 * Demonstrates the use of multi-catch, i.e., catching multiple error types in one catch declaration.
 */
public class MultiCatch {
    static void multiCatch() {
        for (int i = 0; i <= 2; i++) {
            try {
                if (i == 0) {
                    throw new ArithmeticException();
                } else if (i == 1) {
                    throw new ArrayIndexOutOfBoundsException();
                } else {
                    throw new NullPointerException();
                }
            }
            // multi-catch:
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException exc) {
                System.out.println("Exception caught: " + exc);
            }
        }
    }
    public static void main(String[] args) {
        MultiCatch.multiCatch();
    }
}

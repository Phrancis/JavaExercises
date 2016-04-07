package chapter09;

/**
 * Demo throwing an exception.
 */
public class ThrowException {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw");
            throw new NullPointerException();
        }
        catch (NullPointerException e) {
            System.out.println("Exception caught");
        }
        System.out.println("After try/catch block");
    }
}

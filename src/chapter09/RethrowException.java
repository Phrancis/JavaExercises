package chapter09;

/**
 * An exception caught by a catch statement can be rethrown so that it can be caught by an outer catch.
 * The most likely reason for rethrowing  this way is to allow multiple handlers access to the exception.
 */
public class RethrowException {
    static void rethrow() {
        try {
            System.out.println("Before throw");
            throw new NullPointerException();
        }
        catch (NullPointerException exc) {
            System.out.println("Exception caught");
            // rethrow the exception to propagate to an outer catch
            throw exc;
        }
    }
    public static void main(String[] args) {
        try {
            RethrowException.rethrow();
        }
        // recatch the exception
        catch (NullPointerException exc) {
            System.out.println("Fatal error");
        }
    }
}


package Chapter9;

/**
 * Demonstrate different built-in methods of Throwable
 */
public class ThrowableDemo {
    public static void main(String[] args) {
        try {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException exc) {
                System.out.println("getLocalizedMessage():");
                System.out.println(exc.getLocalizedMessage());
                System.out.println("getMessage():");
                System.out.println(exc.getMessage());
                // use fillInStackTrace() to return a throwable object that contains a completed stack trace:
                System.out.println("fillInStackTrace()");
                throw exc.fillInStackTrace();
            }
        }
        catch (Throwable exc) {
            System.out.println("Rethrown:");
            System.out.println(exc.toString());
            System.out.println("printStackTrace():");
            exc.printStackTrace();
        }
    }
}

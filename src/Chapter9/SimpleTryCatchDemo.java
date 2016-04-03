package Chapter9;

/**
 * Demonstrate the basic structure of try/catch exception handling.
 */
public class SimpleTryCatchDemo {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            System.out.println("Before exception is generated");
            // generate Index out of bounds:
            nums[7] = 10;
            System.out.println("This won't print");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
        finally {
            System.out.println("Inside finally block");
        }
        System.out.println("After catch statement");
    }
}

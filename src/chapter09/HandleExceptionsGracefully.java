package chapter09;

/**
 * Demo handling exceptions.
 */
public class HandleExceptionsGracefully {
    public static void main(String[] args) {
        int[] numer = {4,8,16,32,64,128,256, 512};
        int[] denom = {2,0,4,4,0,8};

        for(int i = 0; i < numer.length; i++) {
            try {
                System.out.printf("%d / %d = %d%n", numer[i], denom[i], numer[i] / denom[i]);
            }
            catch(ArithmeticException e) {
                System.out.println("Can't divide by zero");
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("No matching element found");
            }
        }
    }
}

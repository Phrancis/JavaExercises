package chapter09;

/**
 * Demonstrate the creation of a custom exception.
 * In this case, this exception evaluates if the result of a division results in fractional result.
 */
public class FractionalResultException extends Exception {
    private int numer, denom;
    FractionalResultException(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }
    @Override
    public String toString() {
        return String.format("Result of %d / %d is fractional.", numer, denom);
    }
    // DEMO
    public static void main(String[] args) {
        int[] numer = {4,8,16,32,64,127,256, 512};
        int[] denom = {2,0,4,4,0,8};

        for(int i = 0; i < numer.length; i++) {
            try {
                // use custom exception:
                if(numer[i] % 2 != 0) {
                    throw new FractionalResultException(numer[i], denom[i]);
                }
                System.out.printf("%d / %d = %d%n", numer[i], denom[i], numer[i] / denom[i]);
            }
            catch(ArithmeticException e) {
                System.out.println("Can't divide by zero");
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("No matching element found");
            }
            // catch custom exception:
            catch(FractionalResultException e) {
                System.out.println(e.toString());
            }
        }
    }
}

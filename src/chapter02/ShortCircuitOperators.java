package chapter02;

public class ShortCircuitOperators {
	public static void main(String args[]) {
		int n = 10;
		int digits = 2;

		// short-circuit AND && only evaluates second condition if the first is true
		if(digits != 0 && (n % digits) == 0) {
			System.out.format("%d is a factor of %d%n", digits, n);
		}

		digits = 0;                                                 //Always false

		// in this case && is used to prevent dividing by zero
		if (digits != 0 && (n % digits) == 0) {                     //Always false
			System.out.format("%d is a factor of %d%n", digits, n);
		} else {
			System.out.format("cannot divide %d by %d%n", n, digits);
		}

		// using the regular AND & operator does not prevent dividing by zero, resulting in error
		//// Exception in thread "main" java.lang.ArithmeticException: / by zero
		try {
            if (digits != 0 & (n % digits) == 0) {
                System.out.format("%d is a factor of %d%d%n", n);
            } else {
                System.out.format("Avoiding division by zero%n");
            }
        } catch (Exception e) {
            System.out.format("An exception occurred:%n");
            e.printStackTrace();
        }
	}
}

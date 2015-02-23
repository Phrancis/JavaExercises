package Chapter2;

public class ShortCircuitOperators {
	public static void main(String args[]) {
		int n = 10, d =2, q;
		
		// short-circuit AND && only evaluates second condition if the first is true
		if(d != 0 && (n % d) == 0) {
			System.out.println(d + " is a factor of " + n);
		}
		
		d = 0;
		
		// in this case && is used to prevent dividing by zero
		if(d != 0 && (n % d) == 0) {
			System.out.println(d + " is a factor of " + n);
		} else {
			System.out.println("cannot divide by " + d);
		}
		
		// using the regular AND & operator does not prevent dividing by zero, resulting in error
		if(d != 0 & (n % d) == 0) {
			System.out.println(d + " is a factor of " + n);
		}
	}
}

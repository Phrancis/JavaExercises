package Chapter1;
/*
 * Prints the following output:
 * a is less than b
 * c contains -1
 * c is negative.
 * d is non-negative.
 */

class IfDemo {
	public static void main(String args[]) {
		int a, b, c, d;
		a = 2;
		b = 3;

		if(a < b) {
			System.out.println("a is less than b");
		}
		if(a == b) {
			System.out.println("You won't see this");
		}

		c = a - b;
		d = b - a;
		System.out.println("c contains " + c);

		if(c >= 0) {
			System.out.println("c is non-negative.");
		} else {
			System.out.println("c is negative.");
		}
		if(d >= 0) {
			System.out.println("d is non-negative.");
		} else {
			System.out.println("d is negative.");
		}
	}
}
package Chapter2;

class ScopeDemo {
	public static void main(String args[]) {
		int x = 10;

		if(x == 10) {
			int y = 20;
			System.out.format("x and y: %d %d%n", x, y);
			x = y * 2;
		}
		// y = 100; // Error! y not known here
		System.out.println("x is: " + x);
	}
}
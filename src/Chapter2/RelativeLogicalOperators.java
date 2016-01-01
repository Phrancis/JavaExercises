package Chapter2;

class RelativeLogicalOperators {
	public static void main(String args[]) {
		int i = 10;
        int j = 11;
		System.out.format(
                "Using numbers:%n" +
                "\tInput: i = %d%n" +
                "\tInput: j = %d%n",
                i, j);

		System.out.format("i < j  : %b%n", (i < j));
		System.out.format("i <= j : %b%n", (i <= j));
		System.out.format("i != j : %b%n", (i != j));
		System.out.format("i == j : %b%n", (i == j));
		System.out.format("i >= j : %b%n", (i >= j));
        System.out.format("i > j  : %b%n", (i > j));
        System.out.println(); //blank line

        boolean b1 = true;
        boolean b2 = false;
        System.out.format(
                "Using booleans:%n" +
                "\tInput: b1 = %b%n" +
                "\tInput: b2 = %b%n",
                b1, b2);
		System.out.format("b1 & b2   : %b%n", (b1 & b2));
        System.out.format("!(b1 & b2): %b%n", !(b1 & b2));
        System.out.format("b1 | b2   : %b%n", (b1 | b2));
        System.out.format("b1 ^ b2   : %b%n", (b1 ^ b2));
	}
}
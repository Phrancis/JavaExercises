package chapter02;
/* This class is for demonstrating logical operations and prints the following to stdout:
1st	    2nd	    AND	    OR	    XOR	    NOT
true	true	true	true	false	false
true	false	false	true	true	false
false	true	false	true	true	true
false	false	false	false	false	true
*/

class LogicalOperationsTable {

    public static void main(String[] args) {

        System.out.println("1st\t2nd\tAND\tOR\tXOR\tNOT");
        boolean first;
        boolean second;

        // Logical Test 1
        first = true;
        second = true;
        System.out.print(
        	first + "\t" +
			second + "\t" +
			(first&second) + "\t" +
			(first|second) + "\t" +
			(first^second) + "\t" +
			(!first) + "\n"
		);

        // Logical test 2
        first = true;
        second = false;
        System.out.print(
			first + "\t" +
			second + "\t" +
			(first&second) + "\t" +
			(first|second) + "\t" +
			(first^second) + "\t" +
			(!first) + "\n"
		);

        // Logical test 3
        first = false;
        second = true;
        System.out.print(
			first + "\t" +
			second + "\t" +
			(first&second) + "\t" +
			(first|second) + "\t" +
			(first^second) + "\t" +
			(!first) + "\n"
		);

        // Logical test 4
        first = false;
        second = false;
        System.out.print(
			first + "\t" +
			second + "\t" +
			(first&second) + "\t" +
			(first|second) + "\t" +
			(first^second) + "\t" +
			(!first) + "\n"
		);
    }
}

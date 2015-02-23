package Chapter2;

class RelLogOps {
	public static void main(String args[]) {
		
		int  i = 10, j = 11;
		if(i < j) { System.out.println("i < j"); }
		if(i <= j) { System.out.println("i <= j"); }
		if(i != j) { System.out.println("i != j"); }
		if(i == j) { System.out.println("i == j"); } // this won't execute
		if(i >= j) { System.out.println("i >= j"); } // this won't execute
		if(i > j) { System.out.println("i > j"); } // this won't execute
		
		boolean b1 = true, b2 = false;
		if(b1 & b2) { System.out.println("b1 & b2"); } // this won't execute
		if(!(b1 & b2)) { System.out.println("!(b1 & b2) is true"); }
		if(b1 | b2) { System.out.println("b1 | b2 is true"); }
		if(b1 ^ b2) { System.out.println("b1 ^ b2 is true"); }
	}
}
// GallonToLiterTable.java
package Chapter1;

public class GallonToLiterTable {
	public static void main(String args[]) {
		GallonToLiter gallonToLiter = new GallonToLiter();
		for (double counter = 0; counter <= 100; counter++) {
			gallonToLiter.gallons = counter / 10;
			System.out.println(gallonToLiter.gallons + " gal. = " + gallonToLiter.getResult() + " l.");
		}
	}
}
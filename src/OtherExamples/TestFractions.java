package OtherExamples;

public class TestFractions {
	public static void main(String[] args) {
		Fractions fraction = new Fractions(3,4);
		System.out.println("Numerator: "   + fraction.getNumerator());
		System.out.println("Denominator: " + fraction.getDenominator());
		System.out.println("Fraction: "    + fraction.getFraction());
	}
}
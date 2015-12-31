package Chapter1;

public class PowerOfTest {
	public static void main(String arg[]) {
		PowerOf p = new PowerOf();
		p.base = 100;
		p.exponent = 3;
		System.out.format("%f to the power of %f equals %f%n", p.base, p.exponent, p.getResult());
	}
}
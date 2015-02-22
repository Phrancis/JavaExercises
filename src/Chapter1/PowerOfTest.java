package Chapter1;

public class PowerOfTest {
	public static void main(String arg[]) {
		PowerOf p = new PowerOf();
		p.base = 100;
		p.exponent = 3;
		System.out.println(p.base + " to the power of " + p.exponent + " equals " + p.getResult());
	}
}
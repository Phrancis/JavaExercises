package chapter01;

public class PowerOfTest {
	public static void main(String arg[]) {
		PowerOf.base = 100;
		PowerOf.exponent = 3;
		System.out.format("%f to the power of %f equals %f%n", PowerOf.base, PowerOf.exponent, PowerOf.getResult());
	}
}
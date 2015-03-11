package OtherExamples.Fractions;

/*
 * Problem statement: Create a class named Fractions having two integer data members
 * named for a fraction's numerator and denominator. The class' default constructor should
 * provide both data members with default values of 1 if no explicit initialization is
 * provided. The constructor must also prohibit a 0 denominator value. Include member
 * functions for displaying an object's data values and mathematical functions capable of
 * adding, subtracting, multiplying, and dividing two Fraction objects according to the
 * following formulas:
 * 
 * Sum:        a/b + c/d = (ad + cb)/bd
 * Difference: a/b - c/d = (ad-cb)/bd
 * Product:    a/b * c/d = ac/bd
 * Division:   (a/b) / (c/d) = ad/bc
 */
 
 class Fractions {
 	private final int numerator;
 	private final int denominator;
 	
 	// Default constructor if no values are provided
 	Fractions() {
 		numerator = 1;
 		denominator = 1;
 	}
 	
 	// Constructor using explicit values
 	Fractions (int numerator, int denominator) {
 		this.numerator = numerator;
 		// Preventing zero value for denominator
 		if (denominator == 0) {
 			throw new IllegalArgumentException("denominator cannot be zero.");
 		} else {
 			this.denominator = denominator;
 		}
 	}
 	
 	// Getters for checking values
 	public int getNumerator() {
 		return numerator;
 	}
 	public int getDenominator() {
 		return denominator;
 	}
 	public String getFraction() {
 		return numerator + "/" + denominator;
 	}
}
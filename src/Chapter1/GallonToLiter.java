package Chapter1;

/**
 * Converts gallon values to their liter equivalent.
 */
public class GallonToLiter {
    static final double CONVERSION_RATIO = 3.7854;

    public static double convert(double gallons) {
        return gallons * CONVERSION_RATIO;
    }
}
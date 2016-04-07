package chapter01;

/**
 * Converts gallon values to their liter equivalent.
 */
public class GallonToLiter {
    private static final double CONVERSION_RATIO = 3.7854;

    static double convert(double gallons) {
        return gallons * CONVERSION_RATIO;
    }

    public static void main(String[] args) {
        int numGallons;
        for(numGallons = 1; numGallons <= 10; numGallons++) {
            System.out.printf("%d gallons = %f liters%n",numGallons, convert(numGallons));
        }
    }
}
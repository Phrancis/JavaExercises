package chapter01;

/**
 * Iterates through multiple gallon values and prints it with its liter conversion.
 */
public class GallonToLiterTable {
    private static void printTable(
            double min,
            double max,
            double incrementBetweenValues) {
        double gallons;
        for ( ; min <= max; min += incrementBetweenValues) {
            gallons = min; //* incrementBetweenValues;
            System.out.format("%f gal. = %f l.%n", gallons, GallonToLiter.convert(gallons));
        }
    }
    // In action:
    public static void main(String[] args) {
        GallonToLiterTable.printTable (0, 10, 0.1);
    }
}

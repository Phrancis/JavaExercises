package Chapter7.TwoDimShapes;

/**
 * Extends TwoDimShape to Rectangle.
 */
public class Rectangle extends TwoDimShape {
    /**
     * Constructs a rectangle two-dimensional shape with no arguments.
     */
    Rectangle() { super(); }

    /**
     * Constructs a rectangle two-dimensional shape.
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    Rectangle(double width, double height) {
        super(width, height);
    }

    /**
     * Calculates the area.
     * @return the area
     */
    double area() {
        return getWidth() * getHeight();
    }

    /**
     * Evaluates if rectangle is a square.
     * @return whether or not the rectangle is a square
     */
    boolean isSquare() {
        return getWidth() == getHeight();
    }
    // DEMO
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.setWidth(3.5);
        r1.setHeight(5);
        r2.setWidth(4);
        r2.setHeight(4);
        System.out.println("Info about r1:");
        r1.showDims();
        System.out.println("area: " + r1.area());
        System.out.println("square? " + r1.isSquare());
        System.out.println("Info about r2:");
        r2.showDims();
        System.out.println("area: " + r2.area());
        System.out.println("square? " + r2.isSquare());
        // Using constructor with arguments
        Rectangle r3 = new Rectangle(6.5,8);
        System.out.println("Info about r3:");
        r3.showDims();
        System.out.println("area: " + r3.area());
        System.out.println("square? " + r3.isSquare());
    }
}

package Chapter7.TwoDimShapes;

/**
 * Extends TwoDimShape to Rectangle.
 */
public class Rectangle extends TwoDimShape {
    double area() {
        return getWidth() * getHeight();
    }
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
    }
}

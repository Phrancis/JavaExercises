package Chapter7.TwoDimShapes;

/**
 * Extends TwoDimShape to Triangle.
 */
public class Triangle extends TwoDimShape {
    String style;

    /**
     * Constructs a triangle two-dimensional shape with no arguments.
     */
    Triangle() { }

    /**
     * Constructs a triangle two-dimensional shape.
     * @param style the style of the Triangle
     * @param width the width of the Triangle
     * @param height the height of the Triangle
     */
    Triangle(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }

    /**
     * Calculates the area of the triangle.
     * @return the area of the triangle
     */
    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    /**
     * Prints the style to stdout.
     */
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
    // DEMO
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        // All members of Triangle are available to Triangle, including those inherited from TwoDimShape:
        t1.setWidth(4);
        t1.setHeight(4);
        t1.style = "filled";
        t2.setWidth(8);
        t2.setHeight(12);
        t2.style = "outlined";
        // Same goes for member methods:
        System.out.println("Info about t1:");
        t1.showStyle();
        t1.showDims();
        System.out.println("Area: " + t1.area());
        System.out.println("Info about t2:");
        t2.showStyle();
        t2.showDims();
        System.out.println("Area: " + t2.area());
        // Using constructor with arguments:
        Triangle t3 = new Triangle("dotted", 7, 8);
        System.out.println("Info about t3:");
        t3.showStyle();
        t3.showDims();
        System.out.println("Area: " + t3.area());
    }
}

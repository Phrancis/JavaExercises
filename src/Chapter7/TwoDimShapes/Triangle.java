package Chapter7.TwoDimShapes;

/**
 * Extends TwoDimShape as Triangle.
 */
public class Triangle extends TwoDimShape {
    String style;
    double area() {
        return (width * height) / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
    // DEMO
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        // All members of Triangle are available to Triangle, including those inherited from TwoDimShape:
        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";
        t2.width = 8.0;
        t2.height = 12.0;
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

    }
}

package Chapter7.TwoDimShapes;

/**
 * Created by francisveilleux-gaboury on 4/2/16.
 */
public class Rectangle extends TwoDimShape {
    double area() {
        return width * height;
    }
    boolean isSquare() {
        return width == height;
    }
    // DEMO
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.width = 3.0;
        r1.height = 5.0;
        r2.width = r2.height = 4.0;
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

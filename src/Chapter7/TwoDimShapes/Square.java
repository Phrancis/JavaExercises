package Chapter7.TwoDimShapes;

/**
 * Created by francisveilleux-gaboury on 4/2/16.
 */
public class Square extends Rectangle {
    /**
     * Constructs a square two-dimensional shape with no arguments.
     */
    Square() {
        super();
    }

    Square(double side) {
        super(side, side);
    }

    void setSides(double side) {
        setWidth(side);
        setHeight(side);
    }
    // DEMO
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSides(4.5);
        System.out.println("Info about s1:");
        s1.showDims();
        System.out.println("area: " + s1.area());
        System.out.println("square? " + s1.isSquare());
        Square s2 = new Square(5);
        System.out.println("Info about s2:");
        s2.showDims();
        System.out.println("area: " + s2.area());
        System.out.println("square? " + s2.isSquare());
    }
}

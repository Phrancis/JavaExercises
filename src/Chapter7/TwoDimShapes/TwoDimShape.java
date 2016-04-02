package Chapter7.TwoDimShapes;

/**
 * Basic two-dimensional template.
 */
public abstract class TwoDimShape {
    private double width;
    private double height;

    /**
     * Constructs a two-dimensional shape. with no arguments.
     */
    TwoDimShape() { }

    /**
     * Constructs a two-dimensional shape.
     * @param width the width of the shape
     * @param height the height of the shape
     */
    TwoDimShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Prints dimensions of the shape to stdout.
     */
    void showDims() {
        System.out.format("width: %f%nheight: %f%n", width, height);
    }
    // Getters and setters:
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

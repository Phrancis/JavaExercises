package Chapter7.TwoDimShapes;

/**
 * Basic two-dimensional template.
 */
public abstract class TwoDimShape {
    private double width;
    private double height;
    void showDims() {
        System.out.format("width: %f%nheight: %f%n", width, height);
    }

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

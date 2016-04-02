package Chapter7.TwoDimShapes;

/**
 * Basic two-dimensional template.
 */
public abstract class TwoDimShape {
    double width;
    double height;
    void showDims() {
        System.out.format("width: %f%nheight: %f%n", width, height);
    }
}

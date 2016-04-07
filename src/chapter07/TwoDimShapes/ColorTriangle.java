package chapter07.TwoDimShapes;

/**
 * Demonstrates multilevel inheritance. Extends Triangle, which extends TwoDimShape.
 */
public class ColorTriangle extends Triangle {
    String color;
    ColorTriangle() {
        super();
        color = "";
    }
    ColorTriangle(String color, String style, double width, double height) {
        super(style, width, height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // DEMO
    public static void main(String[] args) {
        ColorTriangle colorTriangle = new ColorTriangle("blue", "filled", 4, 5);
        System.out.println(colorTriangle.getColor());
        colorTriangle.setColor("green");
        System.out.println(colorTriangle.getColor());
        colorTriangle.showDims();
    }
}

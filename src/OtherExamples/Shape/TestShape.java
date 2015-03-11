package OtherExamples.Shape;

public class TestShape {
	public static void main(String[] args) {
		
		// Rectangle test
		double width = 5, length = 7;
		Shape rectangle = new Rectangle(width, length);
		System.out.println("Rectangle width: " + width + " and length: " + length
				+ "\nResulting area: " + rectangle.area()
				+ "\nResulting perimeter: " + rectangle.perimeter() + "\n");
		
		// Circle test
		double radius = 5;
		Shape circle = new Circle(radius);
		System.out.println("Circle radius: " + radius
			+ "\nResulting Area: " + circle.area()
			+ "\nResulting Perimeter: " + circle.perimeter() + "\n");
		
		// Triangle test
		double a = 5, b = 3, c = 4;
		Shape triangle = new Triangle(a,b,c);
		System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
				+ "\nResulting Area: " + triangle.area()
				+ "\nResulting Perimeter: " + triangle.perimeter() + "\n");
	}
}
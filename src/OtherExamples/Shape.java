package OtherExamples;

/* nhgrif says:
 * Phrancis ready for inheritance/polymorphism?
 * Given the following abstract class:
 *
 *	public abstract class Shape {
 *	    public abstract double area();
 *	    public abstract double perimeter();
 *	}
 *
 * Implement a Circle, Triangle, and Rectangle class which extend the class Shape.
 * Ex: public class Circle extends Shape ... etc
 */

public abstract class Shape {
	public abstract double area();
	public abstract double perimeter();
}
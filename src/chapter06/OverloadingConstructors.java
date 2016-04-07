package chapter06;

/**
 * This class demonstrates constructor overloading, which allows to construct different versions of an
 * object based on the arguments passed while instantiating.
 */
public class OverloadingConstructors {
    public OverloadingConstructors() {
        System.out.println("Constructed with no arguments.");
    }
    public OverloadingConstructors(int a) {
        System.out.printf("Constructed with 1 int argument: %d%n", a);
    }
    public OverloadingConstructors(int a, int b) {
        System.out.printf("Constructed with 2 int arguments: %d, %d%n", a, b);
    }
    public OverloadingConstructors(double d) {
        System.out.printf("Constructed with 1 double arguments: %f%n", d);
    }
    public OverloadingConstructors(String s) {
        System.out.printf("Constructed with 1 String argument: %s%n", s);
    }
    public OverloadingConstructors(Object obj) {
        System.out.println("Constructed with 1 Object argument: " + obj);
    }
    public static void main(String[] args) {
        OverloadingConstructors a = new OverloadingConstructors();
        OverloadingConstructors b = new OverloadingConstructors(42);
        OverloadingConstructors c = new OverloadingConstructors(42, 99);
        OverloadingConstructors d = new OverloadingConstructors(3.14159);
        OverloadingConstructors e = new OverloadingConstructors("hello");
        Object obj = new Object();
        OverloadingConstructors f = new OverloadingConstructors(obj);
    }
}

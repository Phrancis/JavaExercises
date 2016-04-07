package chapter01;
/*
 * Prints "Hello, Java!" to console.
 */
public class HelloJava {
    private static void sayHello(String name) {
        System.out.format("Hello, %s!%n", name);
    }

    public static void main(String args[]) {
        sayHello("Java");
    }
}

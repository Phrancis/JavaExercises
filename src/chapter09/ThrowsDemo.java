package chapter09;

/**
 * Demonstrate the use of throws for methods that can throw an exception but do not handle them.
 */
public class ThrowsDemo {
    public static char prompt(String msg)
            throws java.io.IOException {
        System.out.printf("%s: ", msg);
        return (char) System.in.read();
    }
    public static void main(String[] args) {
        char ch = (char) 0;
        try {
            ch = prompt("Enter a letter");
        }
        catch(java.io.IOException exc) {
            System.out.println("I/O exception occurred");
        }
        System.out.printf("You pressed: %s", ch);
    }
}

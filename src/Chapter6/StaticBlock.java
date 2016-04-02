package Chapter6;

import java.util.concurrent.TimeUnit;

/**
 * Demonstrate the use of a static block.
 * Sometimes a class will require some sort of initialization before it is ready to create objects.
 * A static block is executed when a class is first loaded. Thus, it is executed before the class
 * can be used for any other purpose.
 */
public class StaticBlock {
    static double rootOf2;
    double rootOf3;

    // This block is executed only once, when the class is first loaded:
    static {
        System.out.println("Inside static block...");
        rootOf2 = Math.sqrt(2.0);
    }

    StaticBlock() {
        System.out.println("Inside constructor...");
        rootOf3 = Math.sqrt(3.0);
    }
    // DEMO
    public static void main(String[] args) throws InterruptedException {
        // Static block is executed right at the beginning of the program when classes are loaded
        // Thus, the message will appear before this is printed:
        System.out.printf("rootOf2: %f%n", StaticBlock.rootOf2);

        System.out.println("> Constructing object:");
        StaticBlock obj1 = new StaticBlock();
        System.out.printf("rootOf3: %f%n", obj1.rootOf3);
    }
}

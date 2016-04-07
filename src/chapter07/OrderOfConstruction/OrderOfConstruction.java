package chapter07.OrderOfConstruction;

/**
 * Demonstrates the order in which constructors are executed with inherited classes.
 */
public class OrderOfConstruction {
    public static void main(String[] args_) {
        C c = new C();
        /*
        Constructing A.
        Constructing B.
        Constructing C.
         */
        c.print();
        /*
        Printing A.
        Printing B.
        Printing C.
         */
    }
}

package Chapter7.OrderOfConstruction;

/**
 * Created by francisveilleux-gaboury on 4/2/16.
 */
public class C extends B {
    C() {
        super();
        System.out.println("Constructing C.");
    }
    @Override
    void print() {
        super.print();
        System.out.println("Printing C.");
    }
}

package chapter07.OrderOfConstruction;

public class B extends A {
    B() {
        super();
        System.out.println("Constructing B.");
    }
    @Override
    void print() {
        super.print();
        System.out.println("Printing B.");
    }
}

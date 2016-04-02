package Chapter8.Interfaces;

/**
 * Demonstrates the use of an interface reference variable.
 * Such a variable can refer to any object that implements its interface.
 * When you call a method on an object through an interface reference, it is the version of the method implemented
 * by the object that is executed.
 */
public class InterfaceReference {
    public static void main(String[] args) {
        ByTwos twoObj = new ByTwos();
        ByThrees threeObj = new ByThrees();
        // This is an interface reference:
        Series series;

        for(int i = 0; i < 5; i++) {
            // access an object via interface reference:
            series = twoObj;
            System.out.printf("Next ByTwos value is %d%n", series.getNext());
            series = threeObj;
            System.out.printf("Next ByThrees value is %d%n", series.getNext());
        }
    }
}

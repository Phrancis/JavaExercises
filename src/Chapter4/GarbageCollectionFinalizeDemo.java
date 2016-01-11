package Chapter4;

/**
 * This class is for demonstrating the Java garbage collection, which collects unused objects if more memory
 * is needed for new objects. It also demonstrates the use of `finalize()` which is a method that can be used
 * on objects to execute just before being garbage-collected.
 *
 * Note the `numberOfObjects` value may need to be increased depending on the memory of the machine it is ran on.
 */
public class GarbageCollectionFinalizeDemo {
    int n;
    GarbageCollectionFinalizeDemo(int n) {
        this.n = n;
    }
    protected void finalize() {
        System.out.format("Finalizing %d%n", n);
    }
    //generators an object that is immediately destroyed (by going out of scope)
    void generator (int n) {
        GarbageCollectionFinalizeDemo demo = new GarbageCollectionFinalizeDemo(n);
    }

    public static void main (String[] args) {
        GarbageCollectionFinalizeDemo demo = new GarbageCollectionFinalizeDemo(0);
        for (int i = 1; i < 1000000; i++) {
            demo.generator(i);
        }
        System.out.print("done");
    }
}

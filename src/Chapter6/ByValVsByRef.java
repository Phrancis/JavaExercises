package Chapter6;

/**
 * This class demonstrates passing arguments by value (primitives) vs. by reference (Objects).
 */
public class ByValVsByRef {
    int a, b;

    ByValVsByRef(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // This method causes no change to the arguments used in the call:
    void noChange(int a, int b) {
        a = a + b;
        b = -b;
    }
    // Pass an object. Now obj.a and obj.b used in the call will be changed:
    void change(ByValVsByRef obj) {
        obj.a = obj.a + obj.b;
        obj.b = -obj.b;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        ByValVsByRef obj = new ByValVsByRef(a, b);

        System.out.format("By Value before call: a = %d, b = %d%n", obj.a, obj.a);
        obj.noChange(a, b);
        System.out.format("By Value after call: a = %d, b = %d%n", obj.a, obj.a);

        System.out.format("By Reference before call: a = %d, b = %d%n", obj.a, obj.a);
        obj.change(obj);
        System.out.format("By Reference after call: a = %d, b = %d%n", obj.a, obj.b);

    }
}

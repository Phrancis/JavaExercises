package Chapter6;

/**
 * Demonstrate the use of a static variable. Static variables are, essentially, global variables.
 * A static member can be accessed before any object of its class are created, and without reference to any object.
 */
public class StaticVariable {
    int x;          // regular instance variable
    static int y;   // static variable is "global"

    int sum() {
        return x + y;
    }
    // DEMO
    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        // Each object has its own copy of instance variable x
        obj1.x = 10;
        obj2.x = 20;
        // obj1.x and obj2.x are independent
        System.out.printf("obj1.x = %d%nobj2.x = %d%n", obj1.x, obj2.x);
        // Each object shares one copy of static variable
        obj1.y = 19;
        if(obj1.y == obj2.y) {
            System.out.printf("Set static variable y to %d...%n", obj1.y);
            System.out.printf("obj1.sum() = %d%nobj2.sum() = %d%n", obj1.sum(), obj2.sum());
        }
        // Changing y affects all instances
        obj2.y = 100;
        if(obj1.y == obj2.y) {
            System.out.printf("Set static variable y to %d...%n", obj1.y);
            System.out.printf("obj1.sum() = %d%nobj2.sum() = %d%n", obj1.sum(), obj2.sum());

        }
    }
}

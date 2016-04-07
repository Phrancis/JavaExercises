package chapter02;

/**
 * Demonstrate type casting/conversions.
 */
public class TypeCastingDemo {
    static final int INT_INPUT = 42;
    static final long LONG_INPUT = 123456789000L;
    static final float FLOAT_INPUT = 123.456789F;

    /**
     * An automatic type conversion can take place if:
     * 1. The two types are compatible, and;
     * 2. The destination type is larger than the source type.
     */
    static void automaticConversions() {
        System.out.println("automaticConversions:");
        double d1 = INT_INPUT;
        System.out.format("int %d can be automatically converted to double %f%n", INT_INPUT, d1);
        float f1 = INT_INPUT;
        System.out.format("int %d can be automatically converted to float %f%n", INT_INPUT, f1);
        long l1 = INT_INPUT;
        System.out.format("int %d can be automatically converted to long %d%n", INT_INPUT, l1);
        double d2 = FLOAT_INPUT;
        System.out.format("float %f can be automatically converted to double %f%n", FLOAT_INPUT, d2);
        System.out.println("End automaticConversions.");
    }

    /**
     * An explicit cast must be used to convert between incompatible types where an automatic conversion is not possible.
     */
    static void explicitCasts() {
        System.out.println("explicitCasts:");
        char c1 = (char) INT_INPUT;
        System.out.format("int %d can be cast to char %c%n", INT_INPUT, c1);
        int i1 = (int) FLOAT_INPUT;
        System.out.format("float %f can be cast to int %d%n", FLOAT_INPUT, i1);
        int i2 = (int) LONG_INPUT;
        System.out.format("long %d can be cast to int %d%n", LONG_INPUT, i2);
        System.out.println("End explicitCasts.");
    }

    public static void main(String[] args) {
        automaticConversions();
        explicitCasts();
    }
}

package Chapter6;

/**
 * Demonstrate the use of an inner (non-static) class.
 * A nested class does not exist independently of its enclosing class. Thus, the scope of a nested class is bound by
 * its outer class. A nested class that is declared directly within its enclosing class scope is a member of its
 * enclosing class. It is also possible to declare a nested class that is local to a block. (not shown here)
 */
public class NestingClasses {
    int[] nums;

    NestingClasses(int[] nums) {
        this.nums = nums;
    }

    void analyze() {
        // Instantiate inner object:
        Nested inner = new Nested();
        // Use inner object's members:
        System.out.printf("Minimum: %d%n", inner.min());
        System.out.printf("Maximum: %d%n", inner.max());
        System.out.printf("Average: %d%n", inner.avg());
    }

    // Inner class:
    class Nested {
        int min() {
            int min = nums[0];
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] < min) { min = nums[i]; }
            }
            return min;
        }
        int max() {
            int max = nums[0];
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] > max) { max = nums[i]; }
            }
            return max;
        }
        int avg() {
            int avg = 0;
            for(int i = 1; i < nums.length; i++) {
                avg += nums[i];
            }
            return avg / nums.length;
        }
    }
    // DEMO
    public static void main(String[] args) {
        int[] nums = {1,5,7,3,4,9,7,2,6};
        NestingClasses outer = new NestingClasses(nums);
        outer.analyze();
    }
}

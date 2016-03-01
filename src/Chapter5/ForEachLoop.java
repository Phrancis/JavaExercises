package Chapter5;

/**
 * Demo of ForEach loop (a.k.a. enhanced For loop) which can be used on Collections.
 */
public class ForEachLoop {
    static int[] nums = {1,2,3,4,5,6,7,8,9,10};
    static int sum = 0;

    public static void main(String[] args) {
        for(int n : nums) {
            sum += n;
            System.out.format("Sum at index %d is %d%n", n, sum);
        }
    }
}

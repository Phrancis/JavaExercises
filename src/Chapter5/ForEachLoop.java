package Chapter5;

/**
 * Demo of ForEach loop (a.k.a. enhanced For loop) which can be used on Collections.
 */
public class ForEachLoop {
    static int[] nums = {1,2,3,4,5,6,7,8,9,10};
    static int sum = 0;
    static int[][] nums2d = new int[3][5];
    static int sum2d = 0;


    public static void main(String[] args) {
        // ForEach iteration over simple 1D array
        System.out.println("ForEach over simple 1D array:");
        for(int n : nums) {
            sum += n;
            System.out.format("Sum at index %d is %d%n", n, sum);
        }
        // Populate numbers in 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums2d[i][j] = (i + 1) * (j + 1);
            }
        }
        // ForEach iterations over 2D array
        System.out.println("ForEach over 2D array:");
        for (int xArr[] : nums2d) {
            for (int y : xArr) {
                sum2d += y;
                System.out.format("y: %d sum: %d%n", y, sum2d);
            }
        }

    }
}

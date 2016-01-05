package Chapter3;

public class NestedLoops {

    private static void findFactorials(int start, int limit) {
            for (int i = start ; i <= limit; i++) {
                System.out.format("%nFactorials of %d: ", i);
                for (int j = start; j <= i; j++) {
                    if (i != j && i % j == 0) {
                        System.out.format("%d ", j);
                    }
                }
            }
    }

    public static void main (String[] args) {
        System.out.format("NestedLoops%n");
        findFactorials(2, 500);
    }
}

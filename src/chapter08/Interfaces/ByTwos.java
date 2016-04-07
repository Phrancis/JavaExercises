package chapter08.Interfaces;

/**
 * ByTwos and ByThrees implement Series in different ways.
 */
public class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        return val += 2;
    }

    @Override
    public void reset() {
        val = start = 0;
        prev = start - 2;
    }

    @Override
    public void setStart(int n) {
        start = val = n;
        prev = n - 2;
    }

    // Method not defined by Series interface:
    int getPrevious() {
        val = prev;
        prev -= 2;
        return val;
    }
    // DEMO
    public static void main(String[] args) {
        ByTwos b = new ByTwos();

        for(int i = 0; i < 5; i++) {
            System.out.printf("Next value is %d%n", b.getNext());
        }

        System.out.println("Resetting...");
        b.reset();

        System.out.println("Starting at 100...");
        b.setStart(100);
        for(int i = 0; i < 5; i++) {
            System.out.printf("Next value is %d%n", b.getNext());
        }
        for(int i = 0; i < 7; i++) {
            System.out.printf("Previous value is %d%n", b.getPrevious());
        }
    }
}

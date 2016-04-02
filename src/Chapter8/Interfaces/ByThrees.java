package Chapter8.Interfaces;

/**
 * ByTwos and ByThrees implement Series in different ways.
 */
public class ByThrees implements Series {
    int start;
    int val;
    int prev;

    ByThrees() {
        start = 0;
        val = 0;
        prev = -3;
    }

    @Override
    public int getNext() {
        prev = val;
        return val += 3;
    }

    @Override
    public void reset() {
        val = start = 0;
        prev = start - 3;
    }

    @Override
    public void setStart(int n) {
        start = val = n;
        prev = n - 3;
    }

    // Method not defined by Series interface:
    int getPrevious() {
        val = prev;
        prev -= 3;
        return val;
    }
    // DEMO
    public static void main(String[] args) {
        ByThrees b = new ByThrees();

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

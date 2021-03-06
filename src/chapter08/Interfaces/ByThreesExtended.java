package chapter08.Interfaces;

/**
 * Implements additional method from SeriesExtended interface.
 */
public class ByThreesExtended extends ByThrees implements SeriesExtended {

    @Override
    public int[] getNext3() {
        int[] ints = new int[3];
        ints[0] = super.getNext();
        ints[1] = super.getNext();
        ints[2] = super.getNext();
        return ints;
    }
    // Demo
    public static void main(String[] args) {
        ByThreesExtended b = new ByThreesExtended();
        System.out.println(b.getNext());
        int[] nums = b.getNext3();
        for(int i : nums) System.out.print(i + " ");
    }
}

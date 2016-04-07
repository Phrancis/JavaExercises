package chapter06;

/**
 * This class implements a "fail-soft" array which prevents runtime errors.
 */
public class FailSoftArray {
    private int[] arr;
    private int errVal = -1;
    public int length;

    /**
     * Constructor array given its size and the value to return if get() fails.
     */
    public FailSoftArray(int length, int errVal) {
        arr = new int[length];
        this.length = length;
        this.errVal = errVal;
    }
    /**
     * Checks if a given index is within bounds of the array.
     * @param index the index to check
     * @return whether the index is within bounds
     */
    private boolean indexOk(int index) {
        return (index >= 0 & index < length);
    }
    /**
     * Get the value at a given index.
     * @param index the index to get the value from
     * @return the value
     */
    public int get(int index) {
        return (indexOk(index)) ? arr[index] : errVal;
    }
    /**
     * Put a value at a given index.
     * @param index the index to put the value at
     * @param value the value to put at the index
     * @return whether the value was put at the index
     */
    public boolean put(int index, int value) {
        if(indexOk(index)) {
            arr[index] = value;
            return true;
        }
        return false;
    }
}

package Chapter6;

/**
 * Try This 6-3: Quicksort is one of the best all-around sorting algorithms. The best implementations rely on recursion.
 * The general principle is to select a value, called the "comparand", and then partition the array into 2 sections.
 * All the values greater or equal to the partition value are put on one side, and those less than the value
 * are put on the other side.
 * This process is then repeated for each remaining section until the array is sorted.
 */
public class Quicksort {

    /**
     * Call to sort an array of chars.
     * @param items the array to sort
     */
    static char[] sort(char[] items) {
        return quickSort(items, 0, items.length - 1);
    }

    private static char[] quickSort(char[] items, int left, int right) {
        int L = left;
        int R = right;
        // we pick the middle item as comparand; other methods can be used as well.
        char comparand = items[(left + right) / 2];
        char comparated;

        do {
            while(items[L] < comparand && L < right) { L++; }
            while(comparand < items[R] && R > left) { R--; }

            if(L <= R) {
                comparated = items[L];
                items[L] = items[R];
                items[R] = comparated;
                L++;
                R--;
                // Print to console to show how the array is being sorted at each step
                System.out.printf("L: %d | R: %d | comparand: %s | compared: %s%n", L, R, comparand, comparated);
                printArr(items);
            }

        } while(L <= R);

        if(left < R) {
            quickSort(items, left, R);
        }
        if(L < right) {
            quickSort(items, L, right);
        }
        return items;
    }
    // Utility to print array
    static void printArr(char[] arr) {
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    // DEMO
    public static void main(String[] args) {
        char[] arrEven = {'f','e','d','a','c','b'};
        System.out.print("> arrEven : ");
        Quicksort.printArr(arrEven);
        char[] resultEven = Quicksort.sort(arrEven);
        System.out.print("Result arrEven: ");
        Quicksort.printArr(resultEven);

        char[] arrOdd = {'e','d','a','c','b'};
        System.out.print("> arrOdd :");
        Quicksort.printArr(arrOdd);
        char[] resultOdd = Quicksort.sort(arrOdd);
        System.out.print("Result arrOdd: ");
        Quicksort.printArr(resultOdd);
    }
}

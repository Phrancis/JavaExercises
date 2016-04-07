package chapter05;

import java.util.Arrays;

public class ArrayBubbleSort {

    static void arrayBubbleSort(int nums) {
//        System.out.println("arrayBubbleSort()");
        int[] randomInts = RandomIntArray.generate(nums);
        int iterator, comparator, temp;
        final int SIZE = randomInts.length;
        for (iterator = 1; iterator < SIZE; iterator++) {
            //Start from last index and loop backwards
            for (comparator = SIZE - 1; comparator >= iterator; comparator--) {
                // if out of order...
                if (randomInts[comparator - 1] > randomInts[comparator]) {
                    // exchange elements:
                    temp = randomInts[comparator - 1];
                    randomInts[comparator - 1] = randomInts[comparator];
                    randomInts[comparator] = temp;
                }
            }
        }
//        System.out.println("Sorted array:");
//        for (int i = 0; i < randomInts.length; i++) {
//            System.out.format("randomInts[%d] : %d%n", i, randomInts[i]);
//        }
    }
    public static void main(String[] args) {
        /**execution time of arrayBubbleSort()*/
        long startTime = System.currentTimeMillis();
        arrayBubbleSort(10000);
        long endTime = System.currentTimeMillis();
        System.out.format("chapter05.ArrayDemo.arrayBubbleSort() duration: %d ms.%n", endTime - startTime);
        /**comparison with java.util.Arrays.sort()*/
        startTime = System.currentTimeMillis();
        int[] randomInts = RandomIntArray.generate(10000);
        Arrays.sort(randomInts);
        endTime = System.currentTimeMillis();
        System.out.format("Arrays.sort() duration: %d ms.%n", endTime - startTime);
    }
}

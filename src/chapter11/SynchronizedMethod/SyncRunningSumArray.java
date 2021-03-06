package chapter11.SynchronizedMethod;

/**
 * Running sum numbers of an array with synchronized method.
 * Running sum in this context is that it adds the current element with all elements before it on each iteration.
 * Example:
 * For an array {1, 2, 3, 4, 5}, it sums as 1, 3, 6, 10, 15, and finally returns 15 as result.
 */
class SyncRunningSumArray {
    /*
     * SynchronizedMethod method that will lock this object while in use by a thread so that only one thread may use it at one time
     */
    synchronized  int sumArray(int nums[]) {
        //reset sum
        int sum = 0;

        for (int num : nums) {
            sum += num;
            System.out.printf("Running total for %s = %d%n", Thread.currentThread(), sum);
            try {
                //allow task-switch:
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
        return sum;
    }
}

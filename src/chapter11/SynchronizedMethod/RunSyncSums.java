package chapter11.SynchronizedMethod;

/**
 * Sums arrays using synchronized methods
 */
class RunSyncSums {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        SumThread st1 = new SumThread("Child #1", ints);
        SumThread st2 = new SumThread("Child #2", ints);

        try {
            st1.thread.join();
            st2.thread.join();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}

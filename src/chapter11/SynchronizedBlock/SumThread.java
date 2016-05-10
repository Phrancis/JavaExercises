package chapter11.SynchronizedBlock;

/**
 * Simple thread that prints out sums of arrays
 */
class SumThread implements Runnable {
    Thread thread;
    private static RunningSumArray runningSumArray = new RunningSumArray();
    private int[] ints;

    SumThread(String name, int[] nums) {
        thread = new Thread(this, name);
        ints = nums;
        thread.start();
    }

    public void run() {
        int answer;
        System.out.printf("%s starting%n", thread.getName());

        // Synchronize calls to method using synchronized block:
        synchronized (runningSumArray) {
            answer = runningSumArray.sumArray(ints);
        }

        System.out.printf("Sum for %s is %d%n", thread.getName(), answer);
        System.out.printf("%s terminating%n", thread.getName());
    }
}

package chapter11.SynchronizedMethod;

/**
 * Simple thread that prints out sums of arrays
 */
class SumThread implements Runnable {
    Thread thread;
    private static SyncRunningSumArray syncRunningSumArray = new SyncRunningSumArray();
    private int[] ints;

    SumThread(String name, int[] nums) {
        thread = new Thread(this, name);
        ints = nums;
        thread.start();
    }

    public void run() {
        int answer;
        System.out.printf("%s starting%n", thread.getName());
        answer = syncRunningSumArray.sumArray(ints);
        System.out.printf("Sum for %s is %d%n", thread.getName(), answer);
        System.out.printf("%s terminating%n", thread.getName());
    }
}

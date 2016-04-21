package chapter11;

import java.lang.Thread;

/**
 * Generic class that creates a thread and then loops and prints numbers to stdout.
 * Improved after Code Review: http://codereview.stackexchange.com/questions/126289/thread-class-for-exercises/126290#126290
 * Thx Mug
 */
class NumLoopThread implements Runnable {
    Thread thread;
    private String threadName;

    private static final int defaultSleepTime = 400;
    private int sleepTime;
    private static final int defaultNumLoops = 10;
    private int numberLoops;

    /**
     * Constructor.
     * @param threadName the name of the thread
     */
    public NumLoopThread(String threadName) {
        this(threadName, defaultSleepTime, defaultNumLoops);
    }
    /**
     * Constructor.
     * @param threadName the name of the thread
     * @param sleepTime the number of milliseconds for the thread to sleep between iterations
     */
    public NumLoopThread(String threadName, int sleepTime) {
        this(threadName, sleepTime, defaultNumLoops);
    }
    /**
     * Constructor.
     * @param threadName the name of the thread
     * @param sleepTime the number of milliseconds for the thread to sleep between iterations
     * @param numberLoops the number of iterations (or loops)
     */
    public NumLoopThread(String threadName, int sleepTime, int numberLoops) {
        this.sleepTime = sleepTime;
        this.numberLoops = numberLoops;
        this.threadName = threadName;
        thread = new Thread(this, threadName);
        thread.start();
    }

    /**
     * Run the thread from start()
     */
    public void run() {
        System.out.printf("%s starting%n", threadName);
        try {
            for(int i = 0; i < numberLoops; i++) {
                Thread.sleep(sleepTime);
                System.out.printf("%s, i = %d%n", threadName, i);
            }
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.printf("%s ending%n", threadName);
    }
}

package chapter11;

import java.lang.Thread;

/**
 * Generic class that creates a thread and then loops and prints numbers to stdout.
 */
public class NumLoopThread implements Runnable {
    Thread thread;
    private String threadName;
    private int sleepTime = 400;
    private int numLoops = 10;

    /** Default constructor with threadName */
    public NumLoopThread(String threadName) {
        this.threadName = threadName;
        thread = new Thread(this, threadName);
        thread.start();
    }
    /** Extra constructor with threadName and sleepTime */
    public NumLoopThread(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
        this.threadName = threadName;
        thread = new Thread(this, threadName);
        thread.start();
    }
    /** Extra constructor with threadName, sleepTime, and numberLoops */
    public NumLoopThread(int sleepTime, String threadName, int numberLoops) {
        this.sleepTime = sleepTime;
        this.threadName = threadName;
        this.numLoops = numberLoops;
        thread = new Thread(this, threadName);
        thread.start();
    }
    /** Run the thread from start() */
    public void run() {
        System.out.printf("%s starting%n", threadName);
        try {
            for(int i = 0; i < numLoops; i++) {
                Thread.sleep(sleepTime);
                System.out.printf("%s, i = %d%n", threadName, i);
            }
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.printf("%s ending%n", threadName);
    }
}

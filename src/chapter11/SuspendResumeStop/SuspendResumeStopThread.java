package chapter11.SuspendResumeStop;

/**
 * Thread that can be suspended, resumed and stopped.
 */
public class SuspendResumeStopThread implements Runnable {
    Thread thread;
    private boolean suspended;
    private boolean stopped;

    SuspendResumeStopThread(String name) {
        thread = new Thread(this, name);
        suspended = false;
        stopped = false;
        thread.start();
    }

    /**
     * Entry point for thread
     */
    public void run() {
        System.out.printf("%s starting%n", thread.getName());
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if(i% 10 == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                // Use synchronized block to check suspended and stopped
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) {
                        break;
                    }
                }
            }
        }
        catch(InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.printf("%s exiting%n", thread.getName());
    }

    synchronized void stopThread() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void suspendThread() {
        suspended = true;
    }

    synchronized void resumeThread() {
        suspended = false;
        notify();
    }

}

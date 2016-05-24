package chapter11.ThreadCommunication;

/**
 * Runs TickTockClock
 */
public class RunTickTockClock {
    public static void main(String[] args) {
        TickTockClock clock = new TickTockClock();
        TickTockThread t1 = new TickTockThread("Tick", clock);
        TickTockThread t2 = new TickTockThread("Tock", clock);
        try {
            t1.thread.join();
            t2.thread.join();
            //System.exit(0);
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
    }

}

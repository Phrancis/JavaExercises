package chapter11.ThreadCommunication;

/**
 * Use wait() and notify() to create a ticking clock
 */
public class TickTockClock {

    private ClockState clockState = new ClockState();

    synchronized void tick(boolean running) {
        //stop the clock if not running
        if(!running) {
            clockState.state = ClockState.State.TICK.getState();
            notify();   // notify any waiting threads
        }

        clockState.state = ClockState.State.TICK.getState();
        System.out.print(clockState.state + " ");
        notify();   // notify tock() to let it run

        try {
            while(!clockState.state.equals(ClockState.State.TOCK.getState())) {
                wait(); // wait for tock() to complete
            }
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
    }

    synchronized void tock(boolean running) {
        //stop the clock if not running
        if(!running) {
            clockState.state = ClockState.State.TOCK.getState();
            notify();   // notify any waiting threads
        }

        clockState.state = ClockState.State.TOCK.getState();
        System.out.print(clockState.state + " ");
        notify();   // notify tick() to let it run

        try {
            while(!clockState.state.equals(ClockState.State.TICK.getState())) {
                wait(); // wait for tick() to complete
            }
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
    }

}

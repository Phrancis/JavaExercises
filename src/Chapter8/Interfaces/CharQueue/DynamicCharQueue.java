package Chapter8.Interfaces.CharQueue;

/**
 * A queue that expands in size when space is exhausted.
 */
public class DynamicCharQueue implements  ICharQueue {
    private char[] queue;
    private int putIx;
    private int getIx;

    DynamicCharQueue(int size) {
        this.queue = new char[size];
        this.putIx = this.getIx = 0;
    }

    @Override
    public void put(char ch) {
        if(putIx == queue.length) {
            // increase queue size:
            char[] biggerQueue = new char[queue.length * 2];
            // copy elements into new queue:
            for(int i = 0; i < queue.length; i++) {
                biggerQueue[i] = queue[i];
            }
            // overwrite original queue with bigger one:
            queue = biggerQueue;
        }
        queue[putIx++] = ch;
    }

    @Override
    public char get() {
        if(getIx == putIx) {
            System.out.println("Queue is empty.");
            return (char) 0;
        }
        return queue[getIx++];
    }
}

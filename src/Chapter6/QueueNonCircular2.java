package Chapter6;

/**
 * Try This 6-2 (expansion on Try This 5-2)
 * QueueNonCircular2 expands on original QueueNonCircular from Chapter5 by adding new constructors.
 * From QueueNonCircular2 in Chapter5:
 * This class implements a non-circular queue using an array. A queue is First In, First Out (FIFO),
 * and non-circular means the queue can become exhausted.
 */
public class QueueNonCircular2 {
    // This array holds the queue:
    char[] queue;
    // The put and get indices:
    int putIx;
    int getIx;

    /**
     * Construct a QueueNonCircular2 of a given size.
     * @param size the maximum size of the queue
     */
    public QueueNonCircular2(int size) {
        // Allocate memory for the queue:
        queue = new char[size];
        putIx = getIx = 0;
    }
    /**
     * Construct a QueueNonCircular2 by copying another QueueNonCircular2 object.
     * @param sourceQueue the QueueNonCircular2 to copy
     */
    public QueueNonCircular2(QueueNonCircular2 sourceQueue) {
        putIx = sourceQueue.putIx;
        getIx = sourceQueue.getIx;
        queue = new char[sourceQueue.queue.length];
        // copy elements:
        for(int i = getIx; i < putIx; i++) {
            queue[i] = sourceQueue.queue[i];
        }
    }
    /**
     * Construct a QueueNonCircular2 by copying a char array.
     * @param arr the char array to copy
     */
    public QueueNonCircular2(char[] arr) {
        putIx = 0;
        getIx = 0;
        queue = new char[arr.length];
        // copy elements
        for(int i = 0; i < arr.length; i++) {
            put(arr[i]);
        }
    }

    /**
     * Puts a char at the current `put` index, and increments to the next index.
     * @param ch the char to put at the current index
     */
    void put(char ch) {
        if(putIx == queue.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        queue[putIx++] = ch;
    }

    /**
     * Gets the char at the current `get` index, and increments to the next index.
     * @return the char at the current index
     */
    char get() {
        if(getIx == putIx) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return queue[getIx++];
    }
    // DEMO
    public static void main(String[] args) {
        // construct a 10-element empty queue:
        QueueNonCircular2 q1 = new QueueNonCircular2(10);

        // construct a queue from array:
        char[] hello = {'H', 'e', 'l', 'l', 'o'};
        QueueNonCircular2 q2 = new QueueNonCircular2(hello);

        char ch;
        int i;
        // put some characters into q1:
        for(i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // construct queue from another queue:
        QueueNonCircular2 q3 = new QueueNonCircular2(q1);

        // show the queues:
        System.out.print("q1: ");
        for(i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println();
        System.out.print("q2: ");
        for(i = 0; i < 5; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println();
        System.out.print("q3: ");
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}

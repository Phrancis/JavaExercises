package Chapter5;

/**
 * A FiniteArrayQueue can enqueue 0..N Objects, after which it must dequeue Objects to make room to enqueue
 * more Objects. Objects may be dequeued from it until the queue is empty. The size of the queue cannot be changed
 * after instantiation.
 */
public class FiniteArrayQueue implements Queue {
    private Object[] queue;
    private int capacity;
    private int head;
    private int tail;

    /**
     * Constructor.
     * <p>
     *     Note that in order for a FiniteArrayQueue to have a "true" capacity of N items,
     *     its array size must be of (N + 1) to account for not being able to overlap
     *     the head and tail pointers of the queue (unless the queue is empty).
     * <p>
     *     Also note that negative capacity is not supported, therefore any (N < 0) will become (N = 0).
     * @param desiredCapacity : The maximum number of items that can be in the queue
     */
    public FiniteArrayQueue(int desiredCapacity) {
        if (desiredCapacity < 0) {
            desiredCapacity = 0;
        }
        capacity = desiredCapacity + 1;
        queue = new Object[capacity];
        head = tail = 0;
    }

    /**
     * Get the Object at head pointer without dequeueing it.
     * @return Object : the Object at head pointer
     */
    public Object peekAtHead() {
        return queue[head];
    }
    /**
     * Get null (empty array slot) at tail pointer without queuing (or dequeueing) anything.
     * <p>
     *     Note that if the queue logic functions correctly, this should always return null.
     *     The unit tests check for this in multiple scenarios.
     * </p>
     * @return Object : null if there is no Object at the tail, Object otherwise (abnormal behavior)
     */
    public Object peekAtTail() {
        return queue[tail];
    }
    /**
     * Indicates whether the queue is empty.
     * <p>
     * Note that when the head and tail are at same index, the queue is empty.
     * @return boolean : true if queue is empty
     */
    public boolean isEmpty() {
        return(tail == head) ? true : false;
    }
    /**
     * If the head is one index higher than the tail, the queue is full.
     * <p>
     * Note that the 2nd condition is added to "wrap around" the array in case
     * the tail is at the last index and the head is at index 0.
     * @return boolean : true if queue is full
     */
    public boolean isFull() {
        int diff = tail - head;
        if(diff == -1 || diff == (capacity - 1)) {
            return true;
        }
        return false;
    }
    /**
     * The current size of the queue, i.e. the number of items present in it.
     * @return int : the size of the queue
     */
    public int getSize() {
        if(isEmpty()) {
            return 0;
        } else {
            if (tail > head) {
                return tail - head;
            }
            return capacity - head + tail;
        }
    }
    /**
     * Add/insert an Object at the tail index (or "back") of the queue, if the queue is not full.
     * <p>
     * Note modulo operator is used to "wrap around" the array.
     * @param obj : The object to add/insert at the tail index
     */
    public void enqueue(Object obj) throws QueueFullException {
        if(isFull()) {
            throw new QueueFullException("Queue is full.");
        } else {
            queue[tail] = obj;
            tail = (tail + 1) % capacity;
        }
    }
    /**
     * Removes the Object at the head index (or "front") of the queue, if the queue is not empty.
     * <p>
     * Note modulo operator is used to "wrap around" the array.
     * @return obj : the object at the head index
     */
    public Object dequeue() throws QueueEmptyException {
        Object item;
        if(isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        } else {
            item = queue[head];
            queue[head] = null;
            head = (head + 1) % capacity;
        }
        return item;
    }
    /** Getters */
    public Object[] getQueue() {
        return queue;
    }
    public int getCapacity() {
        return capacity - 1;
    }
    public int getHead() {
        return head;
    }
    public int getTail() {
        return tail;
    }
}
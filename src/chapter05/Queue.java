package chapter05;

public interface Queue {
    public int getSize();
    public boolean isEmpty();
    public boolean isFull();
    public void enqueue(Object obj) throws QueueFullException;
    public Object dequeue() throws QueueEmptyException;
}

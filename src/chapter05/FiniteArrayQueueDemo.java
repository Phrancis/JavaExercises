package chapter05;

/**
 * Demo/test for FiniteArrayQueue class.
 */
public class FiniteArrayQueueDemo {
    static final int CAPACITY = 4;

    // demo/test CircularArrayQueue:
    public static void main(String[] args) {
        System.out.println("** FiniteArrayQueueDemo **");
        Queue finiteArrayQueue = new FiniteArrayQueue(CAPACITY);
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.println("finiteArrayQueue.enqueue(\"A\")");
        finiteArrayQueue.enqueue("A");

        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.println("finiteArrayQueue.enqueue(\"B\")");
        finiteArrayQueue.enqueue("B");
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.println("finiteArrayQueue.enqueue(\"C\")");
        finiteArrayQueue.enqueue("C");
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.println("finiteArrayQueue.enqueue(\"D\")");
        finiteArrayQueue.enqueue("D");
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        // this should throw QueueFullException:
        try {
            finiteArrayQueue.enqueue("E");
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.format("finiteArrayQueue.dequeue() : %s%n", finiteArrayQueue.dequeue());
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.format("finiteArrayQueue.dequeue() : %s%n", finiteArrayQueue.dequeue());
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.println("\"Wrap around\" the queue...");
        System.out.println("finiteArrayQueue.enqueue(\"E\")");
        finiteArrayQueue.enqueue("E");
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.println("finiteArrayQueue.enqueue(\"F\")");
        finiteArrayQueue.enqueue("F");
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.format("finiteArrayQueue.dequeue() : %s%n", finiteArrayQueue.dequeue());
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.format("finiteArrayQueue.dequeue() : %s%n", finiteArrayQueue.dequeue());
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.format("finiteArrayQueue.dequeue() : %s%n", finiteArrayQueue.dequeue());
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        System.out.format("finiteArrayQueue.dequeue() : %s%n", finiteArrayQueue.dequeue());
        System.out.format("finiteArrayQueue size : %d%n", finiteArrayQueue.getSize());
        //this should throw QueueEmptyException:
        try {
            System.out.format("finiteArrayQueue.dequeue() : %s%n", finiteArrayQueue.dequeue());
        } catch(QueueEmptyException e) {
            System.out.println(e);
        }
    }
}

package Chapter8.Interfaces.CharQueue;

/**
 * Interface to be implemented by subclasses.
 */
public interface ICharQueue {
    // Put a character into the queue.
    void put(char ch);
    // Get a character from the queue.
    char get();
}

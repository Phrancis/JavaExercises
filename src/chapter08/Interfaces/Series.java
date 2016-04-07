package chapter08.Interfaces;

/**
 * An interface containing empty methods that must be implemented by subclasses.
 */
public interface Series {
    int getNext();
    void reset();
    void setStart(int n);
}

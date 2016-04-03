package Chapter8.Interfaces;

/**
 * An interface can inherit another by use of the "extends" keyword. When a class implements an interface
 * that inherits another interface, it must provide implementations for all the methods required by the
 * interface inheritance chain.
 */
public interface SeriesExtended extends Series {
    int[] getNext3();
}

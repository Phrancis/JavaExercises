package chapter08.BookPackage;

/**
 * Demonstrates the use of packages.
 */
public class Book {
    private String title;
    private String author;
    private int pubYear;

    public Book(String title, String author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }

    public void show() {
        System.out.printf("\"%s\", %s (%d)%n", title, author, pubYear);
    }
}

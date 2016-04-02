package Chapter8.BookPackageExt;

import Chapter8.BookPackage.Book;

/**
 * Demonstrate usage of a class from another package.
 * In this case the other package will be imported at the top.
 */
public class UseBookImport {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new Book("Java: The Complete Reference", "Schildt", 2014);
        books[2] = new Book("The Art of Java", "Schildt & Holmes", 2003);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On The Road", "Kerouac", 1955);

        for(Book b : books) {
            b.show();
        }
    }
}

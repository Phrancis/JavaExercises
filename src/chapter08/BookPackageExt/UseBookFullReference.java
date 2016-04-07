package chapter08.BookPackageExt;


/**
 * Demonstrate usage of a class from another package.
 * In this case the other package will be fully referenced.
 */
class UseBookFullReference {
    public static void main(String[] args) {
        chapter08.BookPackage.Book books[] = new chapter08.BookPackage.Book[5];
        books[0] = new chapter08.BookPackage.Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new chapter08.BookPackage.Book("Java: The Complete Reference", "Schildt", 2014);
        books[2] = new chapter08.BookPackage.Book("The Art of Java", "Schildt & Holmes", 2003);
        books[3] = new chapter08.BookPackage.Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new chapter08.BookPackage.Book("On The Road", "Kerouac", 1955);

        for(chapter08.BookPackage.Book b : books) {
            b.show();
        }
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(100);
        book = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test public void libraryBooksCount() {
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(2, library.bookCount());
    }

    @Test public void libraryCapacityReached() {
        Library smallLibrary = new Library(2);
        smallLibrary.addBookToLibrary(book);
        smallLibrary.addBookToLibrary(book);
        smallLibrary.addBookToLibrary(book);
        assertEquals(2, smallLibrary.bookCount());
    }

}

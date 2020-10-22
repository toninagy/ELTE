import org.junit.*;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void test_ctor() {
        Book book1 = Book.make("dsn", "dcd", "FANTASY", "70");
        Book book2 = Book.make("dsn", "dcd", "FANTASY", "60");

        assertEquals(70, book1.getReservePrice());
        assertEquals(book1.getAuthor(), book2.getAuthor());
        // assertEquals(0, book1.getId());
        // assertEquals(1, book2.getId());
    }

    @Test
    public void test_err_ctor() {
        Book book1 = Book.make(null, "dcd", "FANTASY", "70");
        Book book2 = Book.make("dsn", "d", "FANTASY", "60");
        Book book3 = Book.make("dsn", "dcd", "FUN", "60");
        Book book4 = Book.make("dsn", "dcd", "FANTASY", "twenty");
        Book book5 = Book.make("dsn", "dcd", "FANTASY", "20");

        // assertEquals(null, book1);
        assertNull(book1); //!
        assertNull(book2); //!
        assertNull(book3); //!
        assertNull(book4); //!
        assertNotNull(book5);
    }

    @Test
    public void test_isSameGenre() {
        Book book5 = Book.make("dsn", "dcd", "FANTASY", "20");
        Book book6 = Book.make("dsn", "dcd", "FANTASY", "20");
        Book book7 = Book.make("dsn", "dcd", "SCIFI", "20");
        assertTrue(Book.isSameGenre(book5, book6));
        assertFalse(Book.isSameGenre(book6, book7));
    }

    @Test(expected = IllegalArgumentException.class) 
    public void test_exception() {
        Book book5 = Book.make("dsn", "dcd", "FANTASY", "20");
        Book book6 = Book.make("dsn", "dcd", "SCIFI", "20");
        book5.compare(book6);
    }
}

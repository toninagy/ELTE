import org.junit.*;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testCtor() {
        Book b1 = Book.make("abcd", "def", "500", "SCIFI");
        Book b2 = Book.make("abcd", "def", "400", "SATIRE");

        // assertEquals(0,b1.getId());
        // assertEquals(1,b2.getId());

        assertEquals("abcd", b1.getAuthor());
    }

    @Test
    public void testErrCtor() {
        assertEquals(null, Book.make("a","b","x","SCIFI"));
        assertEquals(null, Book.make("a","b","100","SCI"));
        assertEquals(null, Book.make("a","b%","100","SCIFI"));
        assertNotNull(Book.make("abc","bcd","50","FANTASY"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompare() {
        Book b1 = Book.make("abcd", "def", "500", "SCIFI");
        Book b2 = Book.make("abcd", "def", "400", "SATIRE");
        b1.compare(b2);
    }

    @Test
    public void testIsSameGenre() {
        Book b1 = Book.make("abcd", "def", "500", "SCIFI");
        Book b2 = Book.make("abcd", "def", "400", "SATIRE");
        Book b3 = Book.make("abf", "ggg", "100", "SATIRE");

        assertFalse(Book.isSameGenre(b1, b2));
        assertTrue(Book.isSameGenre(b2, b3));
    }
}

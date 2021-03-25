import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BookTest {
    @Before 
    public void setUp() {
        Book.resetID();
    }

    @After 
    public void tearDown() {
        Book.resetID();
    }

    @Test 
    public void setParams() {
        Book b1 = Book.make("abc", "def", "SCIFI", "50");
        Book b2 = Book.make("abc", "def", "SCIFI", "50");

        assertEquals(1, b1.getID());
        assertEquals(2, b2.getID());
    }

    @Test 
    public void makeParsesTypes() {
        assertEquals(null, Book.make("abc", "d", "SCIFI", "50"));
        assertEquals(null, Book.make(null, "dsda", "SCIFI", "50"));
        assertEquals(null, Book.make("dsdibs", "dsda", "SCIFI", "-10"));
    }

    @Test 
    public void compareIsSameGenre() {
        Book b1 = Book.make("abc", "def", "SCIFI", "50");
        Book b2 = Book.make("abc", "def", "SCIFI", "50");
        Book b3 = Book.make("abc", "def", "EDUCATIONAL", "500");
        Book b4 = Book.make("abc", "def", "SCIFI", "500");

        assertEquals(1, b1.getID());
        assertTrue(Book.isSameGenre(b1, b2));
        assertFalse(Book.isSameGenre(b1, b3));

        assertEquals(0, b1.compare(b2));
        assertEquals(-1, b1.compare(b4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void compareThrows() {
        Book b1 = Book.make("abc", "def", "SCIFI", "50");
        Book b2 = Book.make("abc", "def", "EDUCATIONAL", "500");
        b1.compare(b2);
    }

}

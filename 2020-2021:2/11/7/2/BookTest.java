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
    public void testMake() {
        Book b1 = Book.make("abc", "def", "EDUCATIONAL", "10");
        Book b2 = Book.make("abc", "def", "SCIFI", "10");
        Book b3 = Book.make("abc", "def", "EDUCATIONAL", "50");

        assertTrue(Book.isSameGenre(b1, b3));
        assertFalse(Book.isSameGenre(b1, b2));
        assertEquals(1, b3.compare(b1));
    }
}

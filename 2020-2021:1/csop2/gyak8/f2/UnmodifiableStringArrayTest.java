import org.junit.*;
import static org.junit.Assert.*;

public class UnmodifiableStringArrayTest {
    private UnmodifiableStringArray usa;

    @Before
    public void init() {
        usa = new UnmodifiableStringArray(new String[]{"fe", "abc", "aaa", "z", "longword", "abc def"});
    }

    @Test 
    public void get_Test() {
        assertEquals("abc", usa.get(1));
    }

    @Test(expected = IllegalArgumentException.class) 
    public void get_Test_Throws() {
        usa.get(100);
    }

    @Test
    public void immutable_Test() {
        String[] strArr = {"abc","def"};
        UnmodifiableStringArray usaTest = new UnmodifiableStringArray(strArr);
        strArr[1] = "x";
        assertNotEquals("x", usaTest.get(1));
        assertEquals("def", usaTest.get(1));
        assertEquals("x", strArr[1]);
    }

    @Test
    public void sort_Test() {
        String[] sortedUsa = usa.sort();
        assertEquals("aaa", sortedUsa[0]);
        assertNotEquals("fe", sortedUsa[0]);
    }

    @Test
    public void contains_Test() {
        assertTrue(usa.contains("z"));
        assertFalse(usa.contains("zz"));
    }

    @Test
    public void length_Test() {
        assertEquals(1, usa.minLength());
        assertEquals(8, usa.maxLength());
        assertEquals(24, usa.allLength());
    }
}

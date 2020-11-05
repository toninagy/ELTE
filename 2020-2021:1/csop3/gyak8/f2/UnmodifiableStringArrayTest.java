import org.junit.*;

import static org.junit.Assert.*;

public class UnmodifiableStringArrayTest {
    private UnmodifiableStringArray usa;

    @Before
    public void init() {
        if(usa == null) {
            usa = new UnmodifiableStringArray(new String[] {"sadas", "aaa", "x", "hht", "long word"});
        }
    }

    @Test
    public void empty_Test() {
        UnmodifiableStringArray usaEmpty = UnmodifiableStringArray.empty();
        assertTrue(usaEmpty.size() == 0);
    }

    @Test
    public void get_Test() {
        assertEquals("x", usa.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegal_get_Test() {
        usa.get(-10);
    }

    @Test
    public void contains_Test() {
        assertTrue(usa.contains("aaa"));
    }

    @Test 
    public void immutability_Test() {
        String[] strArr = new String[] {"word1", "word2"};
        UnmodifiableStringArray arr = new UnmodifiableStringArray(strArr);
        strArr[0] = "word2";
        assertEquals("word2", strArr[0]);
        assertEquals("word1", arr.get(0));
        assertNotEquals("word2", arr.get(0));
    }

    @Test
    public void sort_Test() {
        String[] sortedArr = usa.sort();
        assertEquals("aaa", sortedArr[0]);
        assertEquals("x", sortedArr[sortedArr.length-1]);
    }

    @Test
    public void length_size_Test() {
        assertTrue(5 == usa.size());
        assertEquals(5, usa.size());
        assertEquals(1, usa.minLength());
        assertEquals(9, usa.maxLength());
        assertEquals(21, usa.allLength());
    }

}

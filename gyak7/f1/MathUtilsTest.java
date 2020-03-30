import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathUtilsTest {
    @Test 
    public void testPositive() {
        int res = MathUtils.Increment(16);
        assertEquals(17,res);
    }
    @Test 
    public void testNegative() {
        int res = MathUtils.Increment(-100);
        assertEquals(-99,res);
    }
    @Test 
    public void testLimit() {
        int res = MathUtils.Increment(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, res);
    } 
} 
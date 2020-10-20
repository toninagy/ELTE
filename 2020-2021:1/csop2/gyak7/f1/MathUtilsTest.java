import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathUtilsTest {
    @Test
    public void testPositive() {
        assertEquals(10, MathUtils.Increment(9)); //expected, actual
    }
    @Test
    public void testNegative() {
        assertEquals(-10, MathUtils.Increment(-11)); //expected, actual
    }
    @Test
    public void testMaxValue() {
        assertEquals(Integer.MAX_VALUE, MathUtils.Increment(Integer.MAX_VALUE)); //expected, actual
    }
}

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {
    @Test
    public void test_positive(){
        assertEquals(400, MathUtils.Increment(399)); //first - expected value, second - actual
    }

    @Test
    public void test_negative() {
        int result = MathUtils.Increment(-100);
        assertEquals(-99, result);
    }

    @Test
    public void test_max_value() {
        int result = MathUtils.Increment(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, result);
    }
}

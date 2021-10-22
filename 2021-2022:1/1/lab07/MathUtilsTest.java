import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class MathUtilsTest {

    private static final double EPSILON = 0.01;

    @Test 
    public void posToPosTest() {
        assertEquals(8, MathUtils.pow(2, 3), EPSILON);
    }

    @Test 
    public void posToNeg() {
        assertEquals(0.25, MathUtils.pow(2, -2), EPSILON);
    }

    @Test 
    public void posToOne() {
        assertEquals(323214, MathUtils.pow(323214, 1), EPSILON);
    }

    @Test
    public void oneToPos() {
        assertEquals(1, MathUtils.pow(1, 1000), EPSILON);
    }

    @Test
    public void posToZero() {
        assertEquals(1, MathUtils.pow(1, 0), EPSILON);
    }

    @Test
    public void zeroToZero() {
        assertEquals(1, MathUtils.pow(0, 0), EPSILON);
    }

    @Test
    public void negToPost() {
        assertEquals(4, MathUtils.pow(-2, 2), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class) 
    public void testThrows() {
        MathUtils.pow(0, -2);
    }
}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    //javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar 1/MathUtils.java 1/MathUtilsTest.java
    //java -cp ./1:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore MathUtilsTest

    public static final double EPSILON = 0.01;
    
    @Test 
    public void testPosRaisedToPos() {
        assertEquals(16, MathUtils.power(4,2), EPSILON);
    }

    @Test 
    public void testPosRaisedToZero() {
        assertEquals(1, MathUtils.power(4,0), EPSILON);
    }

    @Test 
    public void testZeroRaisedToZero() {
        assertEquals(1, MathUtils.power(0,0), EPSILON);
    }

    @Test 
    public void testPosRaisedToNeg() {
        assertEquals(0.25, MathUtils.power(2,-2), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class) 
    public void zeroRaisedToNeg() {
        MathUtils.power(0,-2);
    }

}

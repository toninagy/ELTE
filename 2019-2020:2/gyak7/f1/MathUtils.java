public class MathUtils {
    public static int Increment(int x) {
        if(x == Integer.MAX_VALUE) {
            return x;
        }
        return x+1;
    }
}
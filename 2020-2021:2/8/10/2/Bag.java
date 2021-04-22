import java.util.HashMap;
import java.util.Map;

public class Bag<T> {
    private final Map<T, Integer> map = new HashMap<>();

    // public static <E> void x() { static methods can have type parameters too
    //     T x = 
    // }
    
    public void add(T element) {
        // Integer currentCount = map.get(element);
        // if(currentCount != null) {
        //     count = currentCount + 1;
        // }
        // map.put(element, count);
        
        map.merge(element, 1, (i1, i2) -> i1 + i2);
        // map.merge(element, 1, Integer::sum);
    }

    public int countOf(T element) {
        Integer currentCount = map.get(element);
        if(currentCount == null) {
            return 0;
        }
        return currentCount;
    }

    public void remove(T element) {
        Integer currentCount = map.get(element);
        if(currentCount == null) {
            throw new NotInBagException("Element " + element + " not in bag");
        }
        if(currentCount == 1) {
            map.remove(currentCount);
        }
        else {
            map.put(element, currentCount - 1);
        }
    }

    @Override
    public String toString() {
        return map.toString();
    }
    
}

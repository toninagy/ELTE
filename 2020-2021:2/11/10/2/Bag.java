import java.util.HashMap;
import java.util.Map;

public class Bag<T> {
    private final Map<T, Integer> map = new HashMap<>();

    public void add(T element) {
        // int count = 1;
        // Integer currentCount = map.get(element);
        // if(currentCount != null) {
        //     count = currentCount + 1;
        // }
        // map.put(element, count);
        
        // map.merge(element, 1, (i1, i2) -> i1 + i2);
        map.merge(element, 1, Integer::sum);
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
            throw new NotInBagException("Element " + element + " doesn't exist");
        }
        if(currentCount == 1) {
            map.remove(element);
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

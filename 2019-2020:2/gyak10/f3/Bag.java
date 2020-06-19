import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bag<T> {
    private final Map<T, Integer> map = new HashMap<>();

    public void add(T element) {
        int count = 1;
        Integer currentCount = map.get(element);
        if(currentCount != null) {
            count = currentCount + 1;
        }
        map.put(element, count);
    }

    public int countOf(T element) {
        Integer count = map.get(element);
        if(count != null) {
            return count;
        }
        return 0;
    }

    public void remove(T element) throws NotInBagException {
        Integer count = map.get(element);
        if(count == null) {
            throw new NotInBagException("Element is not in bag");
        }
        if(count == 1) {
            map.remove(element);
        }
        else {
            map.put(element, count-1);
        }
    }

    public Map<T, Integer> getMap() {
        return new HashMap<>(map);
    }

}
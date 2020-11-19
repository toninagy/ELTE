import java.util.HashMap;
import java.util.Map;

public class Bag<T> {
    private final Map<T, Integer> map = new HashMap<>();

    public void add(T element) {
        int count = 1;
        Integer currentCount = map.get(element);
        if(currentCount != null) {
            count = currentCount + 1;
        }
        map.put(element, count);
        // map.merge(element, 1, Integer::sum)
    }

    public int countOf(T element) {
        Integer currentCount = map.get(element);
        if(currentCount != null) {
            return currentCount;
        }
        return 0;
    } 

    public void remove(T element) throws NotInBagException {
        Integer currentCount = map.get(element);
        if(currentCount == null) {
            throw new NotInBagException("Element is not in the bag");
        }
        if(currentCount == 1) {
            map.remove(element);
        }
        else {
            map.put(element, currentCount - 1);
        }
    }

    public Map<T, Integer> getMap() {
        return new HashMap<>(map);
    }

}

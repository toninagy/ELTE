import java.util.Map;
import java.util.HashMap;

public class Bag<T> {

    private final Map<T, Integer> map = new HashMap<>();

    public void add(T element) {
        int c = 1;
        Integer currentCount = map.get(element);
        if(currentCount != null) {
            c = currentCount + 1;
        }
        map.put(element, c);
        // map.merge(element, 1, Integer::sum);
    }

    public int countOf(T element) {
        Integer c = map.get(element);
        if(c != null) {
            return c;
        }
        return 0;
    }

    public void remove(T element) throws NotInBagException {
        Integer c = map.get(element);
        if(c == null) {
            throw new NotInBagException("Element can't be found in the bag");
        }
        if(c == 1) {
            map.remove(element);
        }
        else {
            map.put(element, c-1);
        }
    }

    public Map<T, Integer> getMap() {
        return new HashMap<>(map);
    }
}

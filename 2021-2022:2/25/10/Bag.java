import java.util.HashMap;

public class Bag<T> {
    HashMap<T, Integer> data;

    public Bag() {
        data = new HashMap<>();
    }

    public void add(T element) {
        // Integer count = data.get(element);
        // if(count == null) {
        //     data.put(element, 1);
        // }
        // else {
        //     data.put(element, ++count);
        // }
        // data.merge(element, 1, (e1, e2) -> e1 + e2);
        data.merge(element, 1, Integer::sum);
    }

    public int countOf(T element) {
        Integer count = data.get(element);
        if(count == null) {
            return 0;
        }
        return count;
    }

    public void remove(T element) {
        Integer count = data.get(element);
        if(count == null) {
            throw new NotInBagException("Element is non-existent!");
        }
        if(count == 1) {
            data.remove(element);
        }
        else {
            data.put(element, --count);
        }
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

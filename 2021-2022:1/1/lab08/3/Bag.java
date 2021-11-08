import java.util.HashMap;

public class Bag<T> {
    private HashMap<T, Integer> map = new HashMap<>();

    public void add(T element) {
        int count = 1;

        Integer currentCount = map.get(element);
        if (currentCount != null) {
            count = currentCount + 1;
        }

        map.put(element, count);
        
        // map.merge(element, 1, Integer::sum);
        // map.merge(element, 1, (a,b) -> a+b);
    }

    public int countOf(T element) {
        Integer currentCount = map.get(element);
        if(currentCount == null) {
            return 0;
        }
        return currentCount;
    }

    public void remove(T element) throws NotInBagException {
        if(!map.containsKey(element)) {
            throw new NotInBagException("Element " + element + " not found in bag!");
        }
        Integer currentCount = map.get(element);
        if(currentCount == 1) {
            map.remove(element);
        }
        else {
            map.replace(element, currentCount-1);
        }
    }

    @Override
    public String toString() {
        return map.toString();
    }

}

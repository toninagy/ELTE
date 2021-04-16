import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        MultiSet set1 = new MultiSet();
        set1.put("java");
        set1.put("java");
        set1.put("javascript");
        set1.put("c++");
        System.out.println("set1 = " + set1.getData());

        MultiSet set2 = new MultiSet();
        set2.put("java");
        set2.put("python");
        set2.put("python");
        set2.put("c++");
        set2.put("java");
        set2.put("c++");
        set2.put("bash");
        System.out.println("set2 = " + set2.getData());

        MultiSet intersect = set1.intersect(set2);
        System.out.println("intersect = " + intersect.getData());

        HashMap<String, Integer> intersectData = intersect.getData();
        intersectData.put("rust", 10);
        System.out.println("intersectData = " + intersectData);
        System.out.println("intersect = " + intersect.getData());

    }
}

class MultiSet {
    private HashMap<String, Integer> data;

    public MultiSet() {
        data = new HashMap<>();
    }

    public MultiSet(HashMap<String, Integer> data) {
        this.data = new HashMap<>(data);
    }

    public HashMap<String, Integer> getData() {
        return new HashMap<>(data);
    }

    public void put(String key) {
        if(!data.containsKey(key)) {
            data.put(key, 1);
        }
        else {
            int value = data.get(key) + 1;
            data.replace(key, value);
        }
    }

    public MultiSet intersect(MultiSet other) {
        HashMap<String, Integer> resultData = new HashMap<>();

        for(Map.Entry<String, Integer> entry : data.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(other.data.containsKey(key)) {
                resultData.put(key, Math.min(value, other.data.get(key)));
            }
        }
        return new MultiSet(resultData);
    }

}

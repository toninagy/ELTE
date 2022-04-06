import java.util.HashMap;
import java.util.Map;

class MultiSet {
    HashMap<String, Integer> data;

    public MultiSet() {
        data = new HashMap<>();
    }

    public MultiSet(HashMap<String, Integer> data) {
        // this.data = data;
        this.data = new HashMap<>(data); //defensive copying
    }

    public HashMap<String, Integer> getData() {
        return this.data;
    }

    public void put(String key) {
        if(data.containsKey(key)) {
            Integer value = data.get(key); 
            data.replace(key, ++value);
        }
        else {
            data.put(key, 1);
        }
    }

    public MultiSet intersect(MultiSet multiSet) {
        HashMap<String, Integer> resultMap = new HashMap<>();

        for(Map.Entry<String, Integer> entry : multiSet.data.entrySet()) {
            if(this.data.containsKey(entry.getKey())) {
                resultMap.put(entry.getKey(), Math.min(entry.getValue(), this.data.get(entry.getKey())));
            }
        }

        return new MultiSet(resultMap);
    }
}

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

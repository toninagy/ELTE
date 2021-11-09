import java.util.*;

public class MultiSet {

    private HashMap<String, Integer> map; 

    public MultiSet() {
        map = new HashMap<>();
    }

    public MultiSet(HashMap<String, Integer> map) {
        this.map = new HashMap<>(map); //defensive copying
    }

    public HashMap<String, Integer> getData() {
        return new HashMap<>(map);
    }

    public void put(String key) {
        if(map.containsKey(key)) {
            int mult = map.get(key);
            map.replace(key, mult + 1);
        }
        else {
            map.put(key, 1);
        }
    }

    public MultiSet intersect(MultiSet that) {
        HashMap<String, Integer> resultMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry : this.map.entrySet()) {
            if(that.map.containsKey(entry.getKey())) {
                resultMap.put(entry.getKey(), Math.min(entry.getValue(), that.map.get(entry.getKey())));
            }
        }
        return new MultiSet(resultMap);
        //v2

        // HashMap<String, Integer> resultData = new HashMap<String, Integer>();
        // for (String key : data.keySet())
        // {
        //     if (other.data.containsKey(key))
        //     {
        //         resultData.put(key, Math.min(data.get(key), other.data.get(key)));
        //     }
        // }
        // return new MultiSet(resultData);
    }
}


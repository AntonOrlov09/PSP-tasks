package Task2;

import java.util.HashMap;
import java.util.Map;

public class MapSwapper {
    public Map<Integer, String> swap(Map<String, Integer> map) {
        HashMap<Integer,String> rev = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet())
            rev.put(entry.getValue(), entry.getKey());
        return rev;
    }
}

package step_1.collections_03.collection_framework.map.tree;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("us", "United States");
        map.put("in", "India");
        map.put("br", "Brazil");

        map.putIfAbsent("in", "Bharat");

        System.out.println("Value for 'us': " + map.get("us"));
        System.out.println("Value for 'cn' or default: " + map.getOrDefault("cn", "Not Found"));
        System.out.println("Contains key 'br': " + map.containsKey("br"));
        System.out.println("Size: " + map.size());

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        map.remove("br");
        System.out.println("After removing 'br': " + map);

        map.clear();
        System.out.println("After clear(), isEmpty? " + map.isEmpty());
    }
}

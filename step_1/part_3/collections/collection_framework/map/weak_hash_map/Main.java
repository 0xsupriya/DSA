package step_1.part_3.collections.collection_framework.map.weak_hash_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Object, String> map = new WeakHashMap<>();

        Object key1 = new String("one"); // Not interned
        Object key2 = new String("two");

        map.put(key1, "First");
        map.put(key2, "Second");

        System.out.println("Before GC: " + map);

        key1 = null; // Eligible for GC
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println("After GC: " + map);
    }
}

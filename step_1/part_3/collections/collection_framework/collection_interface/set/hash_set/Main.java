package step_1.part_3.collections.collection_framework.collection_interface.set.hash_set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(10); // duplicate ignored
        System.out.println(hs); // e.g., [20, 10]

    }
}

package step_1.part_3.collections.collection_framework.collection_interface.set.linked_hash_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(30);
        lhs.add(20);
        System.out.println(lhs); // [10, 30, 20]

    }
}

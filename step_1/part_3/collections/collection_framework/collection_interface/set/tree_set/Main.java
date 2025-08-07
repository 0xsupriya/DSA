package step_1.part_3.collections.collection_framework.collection_interface.set.tree_set;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(30);
        ts.add(10);
        ts.add(20);
        System.out.println(ts); // [10, 20, 30]

    }
}

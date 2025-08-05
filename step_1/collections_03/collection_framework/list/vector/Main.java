package step_1.collections_03.collection_framework.list.vector;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.addFirst(00);
        vector.addLast(00);
        System.out.println(vector);
        vector.add(0, 1);
        System.out.println(vector);
        vector.getFirst();
        System.out.println(vector);
    }
}

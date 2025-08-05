package step_1.collections_03.collection_framework.list.linked_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.add(0);
        linkedList.addLast(2);
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}

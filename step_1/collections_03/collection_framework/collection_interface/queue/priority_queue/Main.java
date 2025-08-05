package step_1.collections_03.collection_framework.collection_interface.queue.priority_queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> priority_queue = new PriorityQueue<>();
        priority_queue.add(1);
        priority_queue.add(0);
        priority_queue.add(2);
        System.out.println(priority_queue);
    }
}
